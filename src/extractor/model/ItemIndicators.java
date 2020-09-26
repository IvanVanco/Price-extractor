package extractor.model;

import extractor.tablemodel.ItemView;
import extractor.model.basicdata.EnumData;
import extractor.model.pricesdata.JsonPrices;
import javafx.collections.ObservableList;
import javafx.scene.image.ImageView;


public class ItemIndicators implements Indicators {
               
    private JsonPrices osb = new JsonPrices();    
    private String name;
    private int id;
    private int limit;
    private String iconName;
    private ImageView ikonice;
    
    private int[] cene;
    private int buyingPrice;
    private int sellingPrice;
    private int gePrice;


   public ItemIndicators(EnumData item){
       name = item.toString();
       id = item.getId();
       limit = item.getLimit();
       iconName = item.getIconname();
       ikonice = item.getIkonica();

       cene = osb.JsonOSBuddy(getID());
       buyingPrice = cene[0];       
       sellingPrice = cene[1];
       gePrice = osb.JsonGE(getID());
   }
   
   //Konstruktor za Guthans i Dharok poslednja dva reda
   public ItemIndicators(ObservableList<ItemIndicators> lista, String name){
       limit = 10;
       iconName = name;
       this.name = name;
       
       if(name.equals("TOTAL")){
            for(int i=0; i < 4; i++){
                 buyingPrice += lista.get(i).checkBuyPrice();       
                 sellingPrice += lista.get(i).checkSellPrice(); 
                 gePrice += lista.get(i).checkGePrice();        
            }
       }
       
       else if(name.equals("TOTAL TO SET")){
            buyingPrice = lista.get(4).checkBuyPrice();       
            sellingPrice = lista.get(5).checkSellPrice(); 
            gePrice = 0;        
       }     
   }

   
   public String getName(){
       return name;
   }
   
   public int getID(){
       return id;
   }
   
   public int getLimit(){
       return limit;
   }

   public String getIconName() {
        return iconName;
    }

   public ImageView getIkonice() {
        return ikonice;
    }

    public int getBuyingPrice() {
        return buyingPrice;
    }

    public int getSellingPrice() {
        return sellingPrice;
    }

    public int getGePrice() {
        return gePrice;
    }

  
   public int checkBuyPrice(){
       
        if(getSellingPrice() == 0 && getBuyingPrice() == 0 && getGePrice()==0)
            return 0;
        else if(getSellingPrice() == 0 && getBuyingPrice() == 0)
           return getGePrice(); 
        else if(getBuyingPrice()== 0)
           return getSellingPrice(); 
        else 
           return getBuyingPrice();     
   }
   
   public int checkSellPrice(){
       
        if(getSellingPrice() == 0 && getBuyingPrice() == 0 && getGePrice()==0)
            return 0;
        else if(getSellingPrice() == 0 && getBuyingPrice() == 0)
           return getGePrice(); 
        else if(getSellingPrice() == 0)
           return getBuyingPrice(); 
        else 
           return getSellingPrice();       
   }
   
   public int checkGePrice() {
       
        if(getSellingPrice() == 0 && getBuyingPrice() == 0 && getGePrice()==0)
            return 0;
        else if(getSellingPrice() == 0 && getBuyingPrice() == 0)
           return getGePrice(); 
        else if(getGePrice()== 0 && getBuyingPrice()==0)
           return getSellingPrice();
        else if(getGePrice()== 0 && getBuyingPrice()!=0)
           return getBuyingPrice();
        else 
           return getGePrice();         
   }
   
   public ItemIndicators getItemByName(ObservableList<ItemIndicators> lista, String name){
        
        ItemIndicators item = null;
        for(int i=0; i<lista.size(); i++){
            if(lista.get(i).getName().equals(name)){
                item = lista.get(i);
            }
        }
        return item;
    }
   
   public String getBeststrategy(){
       
       String strategy;
        
       if(getBestprofitperone() == getProfitperone()){
           strategy = "Buy - Sell";
       }
       else if(getBestprofitperone() == getItemtoitem()){
           strategy = "Item to item";
       }
       else {
           strategy = "Item to scales";  
       }
       return strategy;
   }
   
    @Override
   public int getProfitperone(){
       if(getBuyingPrice()==0 || getSellingPrice()==0){
           return 0;
       }
       return getBuyingPrice() - getSellingPrice();
   }
   
    @Override
   public int getBestprofitperone() {
        
        return Math.max(getProfitperone(), Math.max(getItemtoitem(), getItemtoscales()));
    }
   
    @Override
   public int getTotalprofit(){
       
       return getProfitperone() * getLimit();
   }
   
    @Override
   public int getBesttotalprofit(){
       
       return getBestprofitperone() * getLimit();
   }
   
    @Override
   public double getRoi(){
       try {
           return ((double)getProfitperone()) / checkSellPrice();
           }
       catch(ArithmeticException e){
           return 0;
           }        
   }

   @Override
   public double getBestroi(){
       try {
           return ((double)getBestprofitperone()) / checkSellPrice();
           }
       catch(ArithmeticException e){
           return 0;
           }        
   }
   
    @Override
   public int getItemtoitem() {               
        switch(getName()){
            case "Wyvern_visage":
                return getItemByName(ItemView.getMagic(), "Ancient_wyvern_shield").checkBuyPrice() 
                     - getItemByName(ItemView.getMagic(), "Wyvern_visage").checkSellPrice(); 
            case "Staff_of_the_dead":
                return getItemByName(ItemView.getMagic(), "Staff_of_light").checkBuyPrice() 
                     - getItemByName(ItemView.getMagic(), "Staff_of_the_dead").checkSellPrice() 
                     - getItemByName(ItemView.getMagic(), "Saradomins_light").checkSellPrice();   
            case "Eternal_crystal":
                return getItemByName(ItemView.getMagic(), "Eternal_boots").checkBuyPrice() 
                     - getItemByName(ItemView.getMagic(), "Eternal_crystal").checkSellPrice() 
                     - getItemByName(ItemView.getMagic(), "Infinity_boots").checkSellPrice();   
            case "Pegasian_crystal":
                return getItemByName(ItemView.getRanged(), "Pegasian_boots").checkBuyPrice() 
                     - getItemByName(ItemView.getRanged(), "Pegasian_crystal").checkSellPrice() 
                     - getItemByName(ItemView.getRanged(), "Ranger_boots").checkSellPrice();
            case "Skeletal_visage":
                return getItemByName(ItemView.getRanged(), "Dragonfire_ward").checkBuyPrice() 
                     - getItemByName(ItemView.getRanged(), "Skeletal_visage").checkSellPrice();
            case "Dragon_limbs":
                return getItemByName(ItemView.getRanged(), "Dragon_crossbow").checkBuyPrice() 
                     - getItemByName(ItemView.getRanged(), "Dragon_limbs").checkSellPrice(); 
            case "Primordial_crystal":
                return getItemByName(ItemView.getMelee(), "Primordial_boots").checkBuyPrice() 
                     - getItemByName(ItemView.getMelee(), "Primordial_crystal").checkSellPrice() 
                     - getItemByName(ItemView.getMelee(), "Dragon_boots").checkSellPrice();
            case "Black_tourmaline_core":
                return getItemByName(ItemView.getMelee(), "Guardian_boots").checkBuyPrice() 
                     - getItemByName(ItemView.getMelee(), "Black_tourmaline_core").checkSellPrice() 
                     - getItemByName(ItemView.getMelee(), "Bandos_boots").checkSellPrice();    
            case "Zamorakian_spear":
                return getItemByName(ItemView.getMelee(), "Zamorakian_hasta").checkBuyPrice() 
                     - getItemByName(ItemView.getMelee(), "Zamorakian_spear").checkSellPrice()
                     - 150000;
            case "Zamorakian_hasta":
                return getItemByName(ItemView.getMelee(), "Dragon_hunter_lance").checkBuyPrice() 
                     - getItemByName(ItemView.getMelee(), "Zamorakian_hasta").checkSellPrice() 
                     - getItemByName(ItemView.getMelee(), "Hydras_claw").checkSellPrice();
            case "Draconic_visage":
                return getItemByName(ItemView.getMelee(), "Dragonfire_shield").checkBuyPrice() 
                     - getItemByName(ItemView.getMelee(), "Draconic_visage").checkSellPrice();     
            case "Kodai_insignia":
                return getItemByName(ItemView.getRaids1(), "Kodai_wand").checkBuyPrice() 
                     - getItemByName(ItemView.getRaids1(), "Kodai_insignia").checkSellPrice() 
                     - getItemByName(ItemView.getRaids1(), "Master_wand").checkSellPrice();
            case "Bracelet_of_ethereum":
                return getItemByName(ItemView.getRevenants(), "Revenant_ether").checkBuyPrice()*250 
                     - getItemByName(ItemView.getRevenants(), "Bracelet_of_ethereum").checkSellPrice();     
            case "Magic_seed":
                 return getItemByName(ItemView.getFarmherbs(), "Magic_sapling").checkBuyPrice() 
                      - getItemByName(ItemView.getFarmherbs(), "Magic_seed").checkSellPrice();
            case "Papaya_tree_seed":
                 return getItemByName(ItemView.getFarmherbs(), "Papaya_sapling").checkBuyPrice() 
                      - getItemByName(ItemView.getFarmherbs(), "Papaya_tree_seed").checkSellPrice();
            case "Palm_tree_seed":
                 return getItemByName(ItemView.getFarmherbs(), "Palm_sapling").checkBuyPrice() 
                      - getItemByName(ItemView.getFarmherbs(), "Palm_tree_seed").checkSellPrice();
            case "Teak_seed":
                 return getItemByName(ItemView.getFarmherbs(), "Teak_sapling").checkBuyPrice() 
                      - getItemByName(ItemView.getFarmherbs(), "Teak_seed").checkSellPrice();
            case "Mahogany_seed":
                 return getItemByName(ItemView.getFarmherbs(), "Mahogany_sapling").checkBuyPrice() 
                      - getItemByName(ItemView.getFarmherbs(), "Mahogany_seed").checkSellPrice();
            case "Dragonfruit_tree_seed":
                 return getItemByName(ItemView.getFarmherbs(), "Dragonfruit_sapling").checkBuyPrice() 
                      - getItemByName(ItemView.getFarmherbs(), "Dragonfruit_tree_seed").checkSellPrice();
            case "Redwood_tree_seed":
                 return getItemByName(ItemView.getFarmherbs(), "Redwood_sapling").checkBuyPrice() 
                      - getItemByName(ItemView.getFarmherbs(), "Redwood_tree_seed").checkSellPrice();
            case "Celastrus_seed":
                 return getItemByName(ItemView.getFarmherbs(), "Celastrus_sapling").checkBuyPrice() 
                      - getItemByName(ItemView.getFarmherbs(), "Celastrus_seed").checkSellPrice();    
            case "Tanzanite_fang":
                 return getItemByName(ItemView.getZulrah(), "Blowpipe").checkBuyPrice() 
                      - getItemByName(ItemView.getZulrah(), "Tanzanite_fang").checkSellPrice();
            case "Serpentine_visage":
                 return getItemByName(ItemView.getZulrah(), "Serpentine_helm").checkBuyPrice() 
                      - getItemByName(ItemView.getZulrah(), "Serpentine_visage").checkSellPrice();
            case "Magic_fang":
                 return getItemByName(ItemView.getZulrah(), "Trident_full").checkBuyPrice() 
                      - getItemByName(ItemView.getZulrah(), "Magic_fang").checkSellPrice()
                      - getItemByName(ItemView.getZulrah(), "Trident_uncharged").checkSellPrice();
            default: //Za Herblore 
                if (getName().matches(".*3.*")) {                         
                  return (int)(getItemByName(ItemView.getPotions(),getName().replace('3', '4')).checkBuyPrice()
                         -(((double)getItemByName(ItemView.getPotions(), getName()).checkSellPrice())/3) * 4);                      
                }
            return 0;
        }

    }
     
   
    @Override
   public int getItemtoscales() {
        
        switch(getName()){  
            case "Tanzanite_fang":
                 return (getItemByName(ItemView.getZulrah(), "Zulrah_scales").checkBuyPrice())*20000  
                      - getItemByName(ItemView.getZulrah(), "Tanzanite_fang").checkSellPrice();
            case "Blowpipe":
                 return (getItemByName(ItemView.getZulrah(), "Zulrah_scales").checkBuyPrice())*20000  
                      - getItemByName(ItemView.getZulrah(), "Blowpipe").checkSellPrice();
            case "Magic_fang":
                 return (getItemByName(ItemView.getZulrah(), "Zulrah_scales").checkBuyPrice())*20000  
                      - getItemByName(ItemView.getZulrah(), "Magic_fang").checkSellPrice();
            case "Trident_full":
                 return (getItemByName(ItemView.getZulrah(), "Zulrah_scales").checkBuyPrice())*20000  
                      - getItemByName(ItemView.getZulrah(), "Trident_full").checkSellPrice();
            case "Serpentine_visage":
                 return (getItemByName(ItemView.getZulrah(), "Zulrah_scales").checkBuyPrice())*20000 
                      - getItemByName(ItemView.getZulrah(), "Serpentine_visage").checkSellPrice();
            case "Serpentine_helm":
                 return (getItemByName(ItemView.getZulrah(), "Zulrah_scales").checkBuyPrice())*20000  
                      - getItemByName(ItemView.getZulrah(), "Serpentine_helm").checkSellPrice();   
            default:
                 return 0;
        }
              
    }

   
}
    
    