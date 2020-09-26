package extractor;

import static extractor.tablemodel.TablesTimeStored.*;
import extractor.excel.ExcelFile;
import extractor.model.ItemIndicators;
import extractor.tablemodel.ColumnResizer;
import extractor.tablemodel.FormatFactory;
import static extractor.tablemodel.ItemView.*;
import java.net.URL;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;


public class Controller implements Initializable {

    @FXML private Button revenants, zulrah, farmingHerbs, potions, attackStyles, sets, other, treasureTrails;
    @FXML private Button refresh, save;
    @FXML private ImageView gettingData, refreshingData;
    @FXML private AnchorPane anchorBar, anchorStart, anchorTables;
    @FXML private ToggleButton revenantsBar, zulrahBar, farmingBar, potionsBar, meleeBar, rangedBar, magicBar, raids1Bar, raids2Bar,
                            foodBar, guthansBar, dharokBar, treasureBar, resBar, ammoBar, telrunsBar, otherBar;
    @FXML private TableView<ItemIndicators> tabela;
    @FXML private TableColumn<ItemIndicators, String>   ikone, naziv, altstrategies, beststrategy;
    @FXML private TableColumn<ItemIndicators, Integer>  pp1, limit, tp, margin, itemtoitem,
                                                        itemtoscales, bestpp1, besttp, buy, sell, ge; 
    @FXML private TableColumn<ItemIndicators, Double>   bestroi, roi;

   
    
    private void tablesTypeOne(){
        anchorStart.setVisible(false);
        anchorTables.setVisible(true);
                
        altstrategies.setVisible(false);
        beststrategy.setVisible(false);
        bestpp1.setVisible(false);
        besttp.setVisible(false);
        bestroi.setVisible(false);
        
        pp1.setVisible(true);
        tp.setVisible(true);
        roi.setVisible(true);
        save.setVisible(true);
        refresh.setVisible(true);
        lockScreen();
    }
        
    private void tablesTypeTwo(){
        anchorStart.setVisible(false);
        anchorTables.setVisible(true);
        
        altstrategies.setVisible(true);
        beststrategy.setVisible(true);   
        bestpp1.setVisible(true);
        besttp.setVisible(true);
        bestroi.setVisible(true);       
        save.setVisible(true);
        refresh.setVisible(true);
        
        itemtoscales.setVisible(false);
        pp1.setVisible(false);
        tp.setVisible(false);
        roi.setVisible(false);
        lockScreen();
    }
    
    private void tablesTypeThree(){
        anchorStart.setVisible(false);
        anchorTables.setVisible(true);
        
        altstrategies.setVisible(true);
        itemtoscales.setVisible(true);
        beststrategy.setVisible(true);   
        bestpp1.setVisible(true);
        besttp.setVisible(true);
        bestroi.setVisible(true);       
        save.setVisible(true);
        refresh.setVisible(true);
        
        pp1.setVisible(false);
        tp.setVisible(false);
        roi.setVisible(false);
        lockScreen();
    }
    
    private void unlockScreen(){
        refreshingData.setVisible(false);
        gettingData.setVisible(false);
        save.setDisable(false);
        refresh.setDisable(false);
        revenants.setDisable(false); 
        zulrah.setDisable(false); 
        farmingHerbs.setDisable(false); 
        potions.setDisable(false);
        attackStyles.setDisable(false); 
        sets.setDisable(false);
        other.setDisable(false);
        treasureTrails.setDisable(false);
        revenantsBar.setDisable(false);
        zulrahBar.setDisable(false); 
        farmingBar.setDisable(false); 
        potionsBar.setDisable(false); 
        meleeBar.setDisable(false); 
        rangedBar.setDisable(false); 
        magicBar.setDisable(false);
        raids1Bar.setDisable(false);
        raids2Bar.setDisable(false);
        foodBar.setDisable(false);
        guthansBar.setDisable(false); 
        dharokBar.setDisable(false);
        treasureBar.setDisable(false);
        resBar.setDisable(false);
        ammoBar.setDisable(false);
        telrunsBar.setDisable(false); 
        otherBar.setDisable(false);
    }
    
    private void lockScreen(){
        save.setDisable(true);
        refresh.setDisable(true);
        revenants.setDisable(true);
        zulrah.setDisable(true); 
        farmingHerbs.setDisable(true); 
        potions.setDisable(true);
        attackStyles.setDisable(true); 
        sets.setDisable(true);
        other.setDisable(true);
        treasureTrails.setDisable(true);
        revenantsBar.setDisable(true);
        zulrahBar.setDisable(true); 
        farmingBar.setDisable(true); 
        potionsBar.setDisable(true); 
        meleeBar.setDisable(true); 
        rangedBar.setDisable(true); 
        magicBar.setDisable(true);
        raids1Bar.setDisable(true);
        raids2Bar.setDisable(true);
        foodBar.setDisable(true);
        guthansBar.setDisable(true); 
        dharokBar.setDisable(true);
        treasureBar.setDisable(true);
        resBar.setDisable(true);
        ammoBar.setDisable(true);
        telrunsBar.setDisable(true); 
        otherBar.setDisable(true);
    }

    private void resizeTable(){
        new ColumnResizer(tabela, naziv);
        new ColumnResizer(tabela, beststrategy);
        new ColumnResizer(tabela, pp1);
        new ColumnResizer(tabela, limit);
        new ColumnResizer(tabela, tp);
        new ColumnResizer(tabela, margin);
        new ColumnResizer(tabela, itemtoitem);
        new ColumnResizer(tabela, itemtoscales);
        new ColumnResizer(tabela, bestpp1);
        new ColumnResizer(tabela, besttp);
        new ColumnResizer(tabela, buy);
        new ColumnResizer(tabela, sell);
        new ColumnResizer(tabela, ge);
        new ColumnResizer(tabela, bestroi);
        new ColumnResizer(tabela, roi);
    }
    
    private void setFoodView(){
        tablesTypeOne();
        gettingData.setVisible(true);
        
        new Thread(() ->{
            if(getFood() == null){
                createFoodView();
                tabela.setItems(getFood());
                setFoodTime();
                unlockScreen();
                resizeTable();
            }
            else {
                tabela.setItems(getFood());
                unlockScreen();
                resizeTable();
            }      
        } ).start();
        
    }
    
    private void setTreasuretrailsView(){
        tablesTypeOne();
        gettingData.setVisible(true);
        
        new Thread(() ->{
            if(getTreasuretrails() == null){
                createTreasuretrailsView();
                tabela.setItems(getTreasuretrails());
                setTreasureTime();
                unlockScreen();
                resizeTable();
            }
            else {
                tabela.setItems(getTreasuretrails());
                unlockScreen();
                resizeTable();
            }      
        } ).start();
        
    }
    
    private void setResourcesView(){
        tablesTypeOne();
        gettingData.setVisible(true);
        
        new Thread(() ->{
            if(getResources()== null){
                createResourcesView();
                tabela.setItems(getResources());
                setResTime(); 
                unlockScreen();
                resizeTable();
            }
            else {
                tabela.setItems(getResources());
                unlockScreen();
                resizeTable();
            }      
        } ).start();
    }
    
    private void setAmmoView(){
        tablesTypeOne();
        gettingData.setVisible(true);
        
        new Thread(() ->{
            if(getAmmo() == null){
                createAmmoView();
                tabela.setItems(getAmmo());
                setAmmoTime();
                unlockScreen();
                resizeTable();
            }
            else {
                tabela.setItems(getAmmo());
                unlockScreen();
                resizeTable();
            }      
        } ).start();
    }
    
    private void setTelRuneView(){
        tablesTypeOne();
        gettingData.setVisible(true);
        
        new Thread(() ->{
            if(getTelrune() == null){
                createTelruneView();
                tabela.setItems(getTelrune());
                setTelrunsTime();      
                unlockScreen(); 
                resizeTable();
            }
            else {
                tabela.setItems(getTelrune());
                unlockScreen();
                resizeTable();
            }      
        } ).start();
    }
    
    private void setOtherView(){
        tablesTypeOne();
        gettingData.setVisible(true);
        
        new Thread(() ->{
            if(getOther() == null){
                createOtherView();
                tabela.setItems(getOther());
                setOtherTime();
                unlockScreen();
                resizeTable();
            }
            else {
                tabela.setItems(getOther());
                unlockScreen();
                resizeTable();
            }      
        } ).start();
    }
    
    private void setGuthansView(){
        tablesTypeOne();
        gettingData.setVisible(true);
        
        new Thread(() ->{
            if(getGuthans() == null){
                createGuthansView();
                tabela.setItems(getGuthans());
                setGuthansTime();
                unlockScreen();
                resizeTable();
            }
            else {
                tabela.setItems(getGuthans());
                unlockScreen();
                resizeTable();
            }      
        } ).start();
    }
    
    private void setDharokView(){
        tablesTypeOne();
        gettingData.setVisible(true);
        
        new Thread(() ->{
            if(getDharok() == null){
                createDharokView();
                tabela.setItems(getDharok());
                setDharokTime();
                unlockScreen();
                resizeTable();
            }
            else {
                tabela.setItems(getDharok());
                unlockScreen();
                resizeTable();
            }      
        } ).start();
    }
   
    private void setRevenantsView(){
        tablesTypeTwo();
        gettingData.setVisible(true);
        
        new Thread(() ->{
            if(getRevenants()== null){
                createRevenantsView();
                tabela.setItems(getRevenants());
                setRevenantsTime();
                unlockScreen();
                resizeTable();
            }
            else {
                tabela.setItems(getRevenants());
                unlockScreen();
                resizeTable();
            }      
        } ).start();
    }
    
    private void setMagicView(){
        tablesTypeTwo();
        gettingData.setVisible(true);
        
        new Thread(() ->{
            if(getMagic()== null){
                createMagicView();
                tabela.setItems(getMagic());
                setMagicTime();
                unlockScreen();
                resizeTable();
            }
            else {
                tabela.setItems(getMagic());
                unlockScreen();
                resizeTable();
            }      
        } ).start();
    }
    
    private void setRangedView(){
        tablesTypeTwo();
        gettingData.setVisible(true);
        
        new Thread(() ->{
            if(getRanged() == null){
                createRangedView();
                tabela.setItems(getRanged());
                setRangedTime();
                unlockScreen();
                resizeTable();
            }
            else {
                tabela.setItems(getRanged());
                unlockScreen();
                resizeTable();
            }      
        } ).start();
    }
    
    private void setRaids1View(){
        tablesTypeThree();
        gettingData.setVisible(true);
        
        new Thread(() ->{
            if(getRaids1()== null){
                createRaids1View();
                tabela.setItems(getRaids1());
                setRaids1Time();
                unlockScreen();
                resizeTable();
            }
            else {
                tabela.setItems(getRaids1());
                unlockScreen();
                resizeTable();
            }      
        } ).start();
    }
    
    private void setRaids2View(){
        tablesTypeOne();
        gettingData.setVisible(true);
        
        new Thread(() ->{
            if(getRaids2()== null){
                createRaids2View();
                tabela.setItems(getRaids2());
                setRaids2Time();
                unlockScreen();
                resizeTable();
            }
            else {
                tabela.setItems(getRaids2());
                unlockScreen();
                resizeTable();
            }      
        } ).start();
    }
    
    private void setMeleeView(){
        tablesTypeTwo();
        gettingData.setVisible(true);
        
        new Thread(() ->{
            if(getMelee()== null){
                createMeleeView();
                tabela.setItems(getMelee());
                setMeleeTime();
                unlockScreen();
                resizeTable();
            }
            else {
                tabela.setItems(getMelee());
                unlockScreen();
                resizeTable();
            }      
        } ).start();
    }
    
    private void setFarmHerbsView(){
        tablesTypeTwo();
        gettingData.setVisible(true);
        
        new Thread(() ->{
            if(getFarmherbs()== null){
                createFarmHerbsView();
                tabela.setItems(getFarmherbs());
                setFarmingTime();
                unlockScreen();
                resizeTable();
            }
            else {
                tabela.setItems(getFarmherbs());
                unlockScreen();
                resizeTable();
            }      
        } ).start();
    }
    
    private void setPotionView(){
        tablesTypeTwo();
        gettingData.setVisible(true);
        
        new Thread(() ->{
            if(getPotions()== null){
                createPotionsView();
                tabela.setItems(getPotions());
                setPotionsTime();
                unlockScreen();
                resizeTable();
            }
            else {
                tabela.setItems(getPotions());
                unlockScreen();
                resizeTable();
            }      
        } ).start();
    }
 
    private void setZulrahView(){
        tablesTypeThree();
        gettingData.setVisible(true);
        
        new Thread(() ->{
            if(getZulrah() == null){
                createZulrahView();
                tabela.setItems(getZulrah());
                setZulrahTime();
                unlockScreen();
                resizeTable();
            }
            else {
                tabela.setItems(getZulrah());
                unlockScreen();
                resizeTable();
            }
        } ).start();
    }

  
  

    private void refreshData(){
        refreshingData.setVisible(true);
        lockScreen();
        
        if(revenantsBar.isSelected()){
            new Thread(() ->{
                createRevenantsView();
                tabela.setItems(getRevenants());
                setRevenantsTime();
                unlockScreen();} ).start();
        }
        if(zulrahBar.isSelected()){
            new Thread(() ->{
                createZulrahView();
                tabela.setItems(getZulrah());
                setZulrahTime();
                unlockScreen();} ).start();
        }
        else if(potionsBar.isSelected()){
            new Thread(() ->{
                createPotionsView();
                tabela.setItems(getPotions());
                setPotionsTime();
                unlockScreen();} ).start();
        }
        else if(farmingBar.isSelected()){
            new Thread(() ->{
                createFarmHerbsView();
                tabela.setItems(getFarmherbs());
                setFarmingTime();
                unlockScreen();} ).start();
        }
        else if(meleeBar.isSelected()){
            new Thread(() ->{
                createMeleeView();
                tabela.setItems(getMelee());
                setMeleeTime();
                unlockScreen();} ).start();
        }
        else if(raids1Bar.isSelected()){
            new Thread(() ->{
                createRaids1View();
                tabela.setItems(getRaids1());
                setRaids1Time();
                unlockScreen();} ).start();
        }
        else if(raids2Bar.isSelected()){
            new Thread(() ->{
                createRaids2View();
                tabela.setItems(getRaids2());
                setRaids2Time();
                unlockScreen();} ).start();
        }
        else if(rangedBar.isSelected()){
            new Thread(() ->{
                createRangedView();
                tabela.setItems(getRanged());
                setRangedTime();
                unlockScreen();} ).start();
        }
        else if(magicBar.isSelected()){
            new Thread(() ->{
                createMagicView();
                tabela.setItems(getMagic());
                setMagicTime();
                unlockScreen();} ).start();
        }
        else if(guthansBar.isSelected()){
            new Thread(() ->{
                createGuthansView();
                tabela.setItems(getGuthans());
                setGuthansTime();
                unlockScreen();} ).start();
        }
        else if(dharokBar.isSelected()){
            new Thread(() ->{
                createDharokView();
                tabela.setItems(getDharok());
                setDharokTime();
                unlockScreen();} ).start();
        }
        else if(treasureBar.isSelected()){
            new Thread(() ->{
                createTreasuretrailsView();
                tabela.setItems(getTreasuretrails());
                setTreasureTime();
                unlockScreen();} ).start();
        }
        else if(foodBar.isSelected()){
            new Thread(() ->{
                createFoodView();
                tabela.setItems(getFood());
                setFoodTime();
                unlockScreen();} ).start();
        }
        else if(resBar.isSelected()){
            new Thread(() ->{
                createResourcesView();
                tabela.setItems(getResources());
                setResTime();
                unlockScreen();} ).start();
        }
        else if(ammoBar.isSelected()){
            new Thread(() ->{
                createAmmoView();
                tabela.setItems(getAmmo());
                setAmmoTime();
                unlockScreen();} ).start();
        }
        else if(telrunsBar.isSelected()){
            new Thread(() ->{
                createTelruneView();
                tabela.setItems(getTelrune());
                setTelrunsTime();
                unlockScreen();} ).start();
        }
        else if(otherBar.isSelected()){
            new Thread(() ->{
                createOtherView();
                tabela.setItems(getOther());
                setOtherTime();
                unlockScreen();} ).start();
        }
                    
    }
   
    private void unhide(ToggleButton... tgbutton){
        ArrayList<ToggleButton> toggleBars = new ArrayList<>(Arrays.asList(revenantsBar, zulrahBar, farmingBar, potionsBar, 
                     meleeBar, raids1Bar, raids2Bar, rangedBar, magicBar, foodBar, guthansBar, 
                     dharokBar, treasureBar, resBar, ammoBar, telrunsBar, otherBar));
              
        for(int j=0;j<tgbutton.length;j++){   
            for(int i=0; i<toggleBars.size(); i++) {
                if(toggleBars.get(i).equals(tgbutton[j])){
                    tgbutton[j].setVisible(true); 
                    toggleBars.remove(i);
                    i--;
                }
                else{
                    toggleBars.get(i).setVisible(false);
                }
            }
        }
    } 

    private void saveData(){
        if(revenantsBar.isSelected()){
            new ExcelFile(getUnsortedRevenants(), "Revenants", getRevenantsTime());
        }
        if(raids1Bar.isSelected()){
            new ExcelFile(getUnsortedRaids1(), "Raids1", getRaids1Time());
        }
        if(raids2Bar.isSelected()){
            new ExcelFile(getUnsortedRaids2(), "Raids2", getRaids2Time());
        }
        if(treasureBar.isSelected()){
            new ExcelFile(getUnsortedTreasuretrails(), "Treasure", getTreasureTime());
        }
        if(zulrahBar.isSelected()){
            new ExcelFile(getUnsortedZulrah(), "Zulrah", getZulrahTime());
        }
        else if(potionsBar.isSelected()){
            new ExcelFile(getUnsortedPotions(), "Potions", getPotionsTime());
        }
        else if(farmingBar.isSelected()){
            new ExcelFile(getUnsortedFarmherbs(), "FarmHerbs", getFarmingTime());
        }
        else if(meleeBar.isSelected()){
            new ExcelFile(getUnsortedMelee(), "Melee", getMeleeTime());
        }
        else if(rangedBar.isSelected()){
            new ExcelFile(getUnsortedRanged(), "Ranged", getRangedTime());
        }
        else if(magicBar.isSelected()){
           new ExcelFile(getUnsortedMagic(), "Magic", getMagicTime());
        }
        else if(guthansBar.isSelected()){
            new ExcelFile(getUnsortedGuthans(), "Guthans", getGuthansTime());
        }
        else if(dharokBar.isSelected()){
            new ExcelFile(getUnsortedDharok(), "Dharok", getDharokTime());
        }
        else if(foodBar.isSelected()){
            new ExcelFile(getUnsortedFood(), "Food", getFoodTime());
        }
        else if(resBar.isSelected()){
            new ExcelFile(getUnsortedResources(), "Resources", getResTime());
        }
        else if(ammoBar.isSelected()){
            new ExcelFile(getUnsortedAmmo(), "Ammo", getAmmoTime());
        }
        else if(telrunsBar.isSelected()){
            new ExcelFile(getUnsortedTelrune(), "TelRun", getTelrunsTime());
        }
        else if(otherBar.isSelected()){
            new ExcelFile(getUnsortedOther(), "Other", getOtherTime());
        } 
    }

    
    @Override
     public void initialize(URL url, ResourceBundle rb) {      
         //Linkovanje kolona sa propertijima
        ikone.setCellValueFactory(new PropertyValueFactory("ikonice"));  
        naziv.setCellValueFactory(new PropertyValueFactory("iconName"));
        buy.setCellValueFactory(new PropertyValueFactory("buyingPrice"));
        sell.setCellValueFactory(new PropertyValueFactory("sellingPrice"));
        ge.setCellValueFactory(new PropertyValueFactory("gePrice"));
        margin.setCellValueFactory(new PropertyValueFactory("profitperone"));
        itemtoscales.setCellValueFactory(new PropertyValueFactory("itemtoscales"));
        itemtoitem.setCellValueFactory(new PropertyValueFactory("itemtoitem"));
        beststrategy.setCellValueFactory(new PropertyValueFactory("beststrategy"));
        pp1.setCellValueFactory(new PropertyValueFactory("profitperone"));
        bestpp1.setCellValueFactory(new PropertyValueFactory("bestprofitperone"));
        limit.setCellValueFactory(new PropertyValueFactory("limit"));
        tp.setCellValueFactory(new PropertyValueFactory("totalprofit"));
        besttp.setCellValueFactory(new PropertyValueFactory("besttotalprofit"));              
        roi.setCellValueFactory(new PropertyValueFactory("roi"));
        bestroi.setCellValueFactory(new PropertyValueFactory("bestroi"));
        
        //Formatiranje vrednosti iz tabele
        buy.setCellFactory(new FormatFactory<>(new DecimalFormat("#,##0"), true));
        sell.setCellFactory(new FormatFactory<>(new DecimalFormat("#,##0"), true));
        ge.setCellFactory(new FormatFactory<>(new DecimalFormat("#,##0"), true));
        margin.setCellFactory(new FormatFactory<>(new DecimalFormat("#,##0"), false));
        itemtoscales.setCellFactory(new FormatFactory<>(new DecimalFormat("#,##0"), false));
        itemtoitem.setCellFactory(new FormatFactory<>(new DecimalFormat("#,##0"), false));
        pp1.setCellFactory(new FormatFactory<>(new DecimalFormat("#,##0"), false));
        bestpp1.setCellFactory(new FormatFactory<>(new DecimalFormat("#,##0"), false));
        limit.setCellFactory(new FormatFactory<>(new DecimalFormat("#,##0"), false));
        tp.setCellFactory(new FormatFactory<>(new DecimalFormat("#,##0"), false));
        besttp.setCellFactory(new FormatFactory<>(new DecimalFormat("#,##0"), false));
        roi.setCellFactory(new FormatFactory<>(new DecimalFormat("#.##%"), false));
        bestroi.setCellFactory(new FormatFactory<>(new DecimalFormat("#.##%"), false));
        
        //Button action to unhide Toggle button(s)
        revenants.setOnAction(e -> unhide(revenantsBar));
        zulrah.setOnAction(e -> unhide(zulrahBar));
        farmingHerbs.setOnAction(e -> unhide(farmingBar));       
        potions.setOnAction(e -> unhide(potionsBar));       
        attackStyles.setOnAction(e -> unhide(meleeBar, rangedBar, magicBar, raids1Bar, raids2Bar));
        sets.setOnAction(e -> unhide(guthansBar, dharokBar));
        treasureTrails.setOnAction(e -> unhide(treasureBar));
        other.setOnAction(e -> unhide(otherBar, ammoBar, foodBar, resBar, telrunsBar));     
             
        //Toggle buttons getting data
        revenantsBar.setOnAction(e -> setRevenantsView());
        zulrahBar.setOnAction(e -> setZulrahView());
        farmingBar.setOnAction(e -> setFarmHerbsView()); 
        potionsBar.setOnAction(e -> setPotionView());
        meleeBar.setOnAction(e -> setMeleeView());
        raids1Bar.setOnAction(e -> setRaids1View());
        raids2Bar.setOnAction(e -> setRaids2View());
        rangedBar.setOnAction(e -> setRangedView());
        magicBar.setOnAction(e -> setMagicView());               
        guthansBar.setOnAction(e -> setGuthansView());
        dharokBar.setOnAction(e -> setDharokView());
        treasureBar.setOnAction(e -> setTreasuretrailsView());
        foodBar.setOnAction(e -> setFoodView()); 
        resBar.setOnAction(e -> setResourcesView());
        ammoBar.setOnAction(e -> setAmmoView());
        telrunsBar.setOnAction(e -> setTelRuneView());
        otherBar.setOnAction(e -> setOtherView());

        //Save button for saving data in excel format
        save.setOnAction(e -> saveData());
        
        //Refresh button for refreshing data in jfx table
        refresh.setOnAction(e -> refreshData());
        
    }   
}

