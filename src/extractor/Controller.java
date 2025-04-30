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

    @FXML private Button revenants, zulrah, farming_herbs, potions, attack_styles, sets, other, treasure_trails;
    @FXML private Button refresh, save;
    @FXML private ImageView getting_data, refreshing_data;
    @FXML private AnchorPane anchor_bar, anchor_start, anchor_tables;
    @FXML private ToggleButton revenants_bar, zulrah_bar, farming_bar, potions_bar, melee_bar, ranged_bar, magic_bar, raids1_bar, raids2_bar,
                            food_bar, guthans_bar, dharok_bar, treasure_bar, res_bar, ammo_bar, telruns_bar, other_bar;
    @FXML private TableView<ItemIndicators> table;
    @FXML private TableColumn<ItemIndicators, String>   icons, name, alt_strategies, best_strategy;
    @FXML private TableColumn<ItemIndicators, Integer>  pp1, limit, tp, margin, item_to_item,
                                                        item_to_scales, best_pp1, best_tp, buy, sell, ge; 
    @FXML private TableColumn<ItemIndicators, Double>   best_roi, roi;

   
    
    private void tablesTypeOne(){
        anchor_start.setVisible(false);
        anchor_tables.setVisible(true);
                
        alt_strategies.setVisible(false);
        best_strategy.setVisible(false);
        best_pp1.setVisible(false);
        best_tp.setVisible(false);
        best_roi.setVisible(false);
        
        pp1.setVisible(true);
        tp.setVisible(true);
        roi.setVisible(true);
        save.setVisible(true);
        refresh.setVisible(true);
        lockScreen();
    }
        
    private void tablesTypeTwo(){
        anchor_start.setVisible(false);
        anchor_tables.setVisible(true);
        
        alt_strategies.setVisible(true);
        best_strategy.setVisible(true);   
        best_pp1.setVisible(true);
        best_tp.setVisible(true);
        best_roi.setVisible(true);       
        save.setVisible(true);
        refresh.setVisible(true);
        
        item_to_scales.setVisible(false);
        pp1.setVisible(false);
        tp.setVisible(false);
        roi.setVisible(false);
        lockScreen();
    }
    
    private void tablesTypeThree(){
        anchor_start.setVisible(false);
        anchor_tables.setVisible(true);
        
        alt_strategies.setVisible(true);
        item_to_scales.setVisible(true);
        best_strategy.setVisible(true);   
        best_pp1.setVisible(true);
        best_tp.setVisible(true);
        best_roi.setVisible(true);       
        save.setVisible(true);
        refresh.setVisible(true);
        
        pp1.setVisible(false);
        tp.setVisible(false);
        roi.setVisible(false);
        lockScreen();
    }
    
    private void unlockScreen(){
        refreshing_data.setVisible(false);
        getting_data.setVisible(false);
        save.setDisable(false);
        refresh.setDisable(false);
        revenants.setDisable(false); 
        zulrah.setDisable(false); 
        farming_herbs.setDisable(false); 
        potions.setDisable(false);
        attack_styles.setDisable(false); 
        sets.setDisable(false);
        other.setDisable(false);
        treasure_trails.setDisable(false);
        revenants_bar.setDisable(false);
        zulrah_bar.setDisable(false); 
        farming_bar.setDisable(false); 
        potions_bar.setDisable(false); 
        melee_bar.setDisable(false); 
        ranged_bar.setDisable(false); 
        magic_bar.setDisable(false);
        raids1_bar.setDisable(false);
        raids2_bar.setDisable(false);
        food_bar.setDisable(false);
        guthans_bar.setDisable(false); 
        dharok_bar.setDisable(false);
        treasure_bar.setDisable(false);
        res_bar.setDisable(false);
        ammo_bar.setDisable(false);
        telruns_bar.setDisable(false); 
        other_bar.setDisable(false);
    }
    
    private void lockScreen(){
        save.setDisable(true);
        refresh.setDisable(true);
        revenants.setDisable(true);
        zulrah.setDisable(true); 
        farming_herbs.setDisable(true); 
        potions.setDisable(true);
        attack_styles.setDisable(true); 
        sets.setDisable(true);
        other.setDisable(true);
        treasure_trails.setDisable(true);
        revenants_bar.setDisable(true);
        zulrah_bar.setDisable(true); 
        farming_bar.setDisable(true); 
        potions_bar.setDisable(true); 
        melee_bar.setDisable(true); 
        ranged_bar.setDisable(true); 
        magic_bar.setDisable(true);
        raids1_bar.setDisable(true);
        raids2_bar.setDisable(true);
        food_bar.setDisable(true);
        guthans_bar.setDisable(true); 
        dharok_bar.setDisable(true);
        treasure_bar.setDisable(true);
        res_bar.setDisable(true);
        ammo_bar.setDisable(true);
        telruns_bar.setDisable(true); 
        other_bar.setDisable(true);
    }

    private void resizeTable(){
        new ColumnResizer(table, name);
        new ColumnResizer(table, best_strategy);
        new ColumnResizer(table, pp1);
        new ColumnResizer(table, limit);
        new ColumnResizer(table, tp);
        new ColumnResizer(table, margin);
        new ColumnResizer(table, item_to_item);
        new ColumnResizer(table, item_to_scales);
        new ColumnResizer(table, best_pp1);
        new ColumnResizer(table, best_tp);
        new ColumnResizer(table, buy);
        new ColumnResizer(table, sell);
        new ColumnResizer(table, ge);
        new ColumnResizer(table, best_roi);
        new ColumnResizer(table, roi);
    }
    
    private void setFoodView(){
        tablesTypeOne();
        getting_data.setVisible(true);
        
        new Thread(() ->{
            if(getFood() == null){
                createFoodView();
                table.setItems(getFood());
                setFoodTime();
                unlockScreen();
                resizeTable();
            }
            else {
                table.setItems(getFood());
                unlockScreen();
                resizeTable();
            }      
        } ).start();
        
    }
    
    private void setTreasuretrailsView(){
        tablesTypeOne();
        getting_data.setVisible(true);
        
        new Thread(() ->{
            if(getTreasuretrails() == null){
                createTreasuretrailsView();
                table.setItems(getTreasuretrails());
                setTreasureTime();
                unlockScreen();
                resizeTable();
            }
            else {
                table.setItems(getTreasuretrails());
                unlockScreen();
                resizeTable();
            }      
        } ).start();
        
    }
    
    private void setResourcesView(){
        tablesTypeOne();
        getting_data.setVisible(true);
        
        new Thread(() ->{
            if(getResources()== null){
                createResourcesView();
                table.setItems(getResources());
                setResTime(); 
                unlockScreen();
                resizeTable();
            }
            else {
                table.setItems(getResources());
                unlockScreen();
                resizeTable();
            }      
        } ).start();
    }
    
    private void setAmmoView(){
        tablesTypeOne();
        getting_data.setVisible(true);
        
        new Thread(() ->{
            if(getAmmo() == null){
                createAmmoView();
                table.setItems(getAmmo());
                setAmmoTime();
                unlockScreen();
                resizeTable();
            }
            else {
                table.setItems(getAmmo());
                unlockScreen();
                resizeTable();
            }      
        } ).start();
    }
    
    private void setTelRuneView(){
        tablesTypeOne();
        getting_data.setVisible(true);
        
        new Thread(() ->{
            if(getTelrune() == null){
                createTelruneView();
                table.setItems(getTelrune());
                setTelrunsTime();      
                unlockScreen(); 
                resizeTable();
            }
            else {
                table.setItems(getTelrune());
                unlockScreen();
                resizeTable();
            }      
        } ).start();
    }
    
    private void setOtherView(){
        tablesTypeOne();
        getting_data.setVisible(true);
        
        new Thread(() ->{
            if(getOther() == null){
                createOtherView();
                table.setItems(getOther());
                setOtherTime();
                unlockScreen();
                resizeTable();
            }
            else {
                table.setItems(getOther());
                unlockScreen();
                resizeTable();
            }      
        } ).start();
    }
    
    private void setGuthansView(){
        tablesTypeOne();
        getting_data.setVisible(true);
        
        new Thread(() ->{
            if(getGuthans() == null){
                createGuthansView();
                table.setItems(getGuthans());
                setGuthansTime();
                unlockScreen();
                resizeTable();
            }
            else {
                table.setItems(getGuthans());
                unlockScreen();
                resizeTable();
            }      
        } ).start();
    }
    
    private void setDharokView(){
        tablesTypeOne();
        getting_data.setVisible(true);
        
        new Thread(() ->{
            if(getDharok() == null){
                createDharokView();
                table.setItems(getDharok());
                setDharokTime();
                unlockScreen();
                resizeTable();
            }
            else {
                table.setItems(getDharok());
                unlockScreen();
                resizeTable();
            }      
        } ).start();
    }
   
    private void setRevenantsView(){
        tablesTypeTwo();
        getting_data.setVisible(true);
        
        new Thread(() ->{
            if(getRevenants()== null){
                createRevenantsView();
                table.setItems(getRevenants());
                setRevenantsTime();
                unlockScreen();
                resizeTable();
            }
            else {
                table.setItems(getRevenants());
                unlockScreen();
                resizeTable();
            }      
        } ).start();
    }
    
    private void setMagicView(){
        tablesTypeTwo();
        getting_data.setVisible(true);
        
        new Thread(() ->{
            if(getMagic()== null){
                createMagicView();
                table.setItems(getMagic());
                setMagicTime();
                unlockScreen();
                resizeTable();
            }
            else {
                table.setItems(getMagic());
                unlockScreen();
                resizeTable();
            }      
        } ).start();
    }
    
    private void setRangedView(){
        tablesTypeTwo();
        getting_data.setVisible(true);
        
        new Thread(() ->{
            if(getRanged() == null){
                createRangedView();
                table.setItems(getRanged());
                setRangedTime();
                unlockScreen();
                resizeTable();
            }
            else {
                table.setItems(getRanged());
                unlockScreen();
                resizeTable();
            }      
        } ).start();
    }
    
    private void setRaids1View(){
        tablesTypeThree();
        getting_data.setVisible(true);
        
        new Thread(() ->{
            if(getRaids1()== null){
                createRaids1View();
                table.setItems(getRaids1());
                setRaids1Time();
                unlockScreen();
                resizeTable();
            }
            else {
                table.setItems(getRaids1());
                unlockScreen();
                resizeTable();
            }      
        } ).start();
    }
    
    private void setRaids2View(){
        tablesTypeOne();
        getting_data.setVisible(true);
        
        new Thread(() ->{
            if(getRaids2()== null){
                createRaids2View();
                table.setItems(getRaids2());
                setRaids2Time();
                unlockScreen();
                resizeTable();
            }
            else {
                table.setItems(getRaids2());
                unlockScreen();
                resizeTable();
            }      
        } ).start();
    }
    
    private void setMeleeView(){
        tablesTypeTwo();
        getting_data.setVisible(true);
        
        new Thread(() ->{
            if(getMelee()== null){
                createMeleeView();
                table.setItems(getMelee());
                setMeleeTime();
                unlockScreen();
                resizeTable();
            }
            else {
                table.setItems(getMelee());
                unlockScreen();
                resizeTable();
            }      
        } ).start();
    }
    
    private void setFarmHerbsView(){
        tablesTypeTwo();
        getting_data.setVisible(true);
        
        new Thread(() ->{
            if(getFarmherbs()== null){
                createFarmHerbsView();
                table.setItems(getFarmherbs());
                setFarmingTime();
                unlockScreen();
                resizeTable();
            }
            else {
                table.setItems(getFarmherbs());
                unlockScreen();
                resizeTable();
            }      
        } ).start();
    }
    
    private void setPotionView(){
        tablesTypeTwo();
        getting_data.setVisible(true);
        
        new Thread(() ->{
            if(getPotions()== null){
                createPotionsView();
                table.setItems(getPotions());
                setPotionsTime();
                unlockScreen();
                resizeTable();
            }
            else {
                table.setItems(getPotions());
                unlockScreen();
                resizeTable();
            }      
        } ).start();
    }
 
    private void setZulrahView(){
        tablesTypeThree();
        getting_data.setVisible(true);
        
        new Thread(() ->{
            if(getZulrah() == null){
                createZulrahView();
                table.setItems(getZulrah());
                setZulrahTime();
                unlockScreen();
                resizeTable();
            }
            else {
                table.setItems(getZulrah());
                unlockScreen();
                resizeTable();
            }
        } ).start();
    }

  
  
    private void refreshData(){
        refreshing_data.setVisible(true);
        lockScreen();
        
        if(revenants_bar.isSelected()){
            new Thread(() ->{
                createRevenantsView();
                table.setItems(getRevenants());
                setRevenantsTime();
                unlockScreen();} ).start();
        }
        if(zulrah_bar.isSelected()){
            new Thread(() ->{
                createZulrahView();
                table.setItems(getZulrah());
                setZulrahTime();
                unlockScreen();} ).start();
        }
        else if(potions_bar.isSelected()){
            new Thread(() ->{
                createPotionsView();
                table.setItems(getPotions());
                setPotionsTime();
                unlockScreen();} ).start();
        }
        else if(farming_bar.isSelected()){
            new Thread(() ->{
                createFarmHerbsView();
                table.setItems(getFarmherbs());
                setFarmingTime();
                unlockScreen();} ).start();
        }
        else if(melee_bar.isSelected()){
            new Thread(() ->{
                createMeleeView();
                table.setItems(getMelee());
                setMeleeTime();
                unlockScreen();} ).start();
        }
        else if(raids1_bar.isSelected()){
            new Thread(() ->{
                createRaids1View();
                table.setItems(getRaids1());
                setRaids1Time();
                unlockScreen();} ).start();
        }
        else if(raids2_bar.isSelected()){
            new Thread(() ->{
                createRaids2View();
                table.setItems(getRaids2());
                setRaids2Time();
                unlockScreen();} ).start();
        }
        else if(ranged_bar.isSelected()){
            new Thread(() ->{
                createRangedView();
                table.setItems(getRanged());
                setRangedTime();
                unlockScreen();} ).start();
        }
        else if(magic_bar.isSelected()){
            new Thread(() ->{
                createMagicView();
                table.setItems(getMagic());
                setMagicTime();
                unlockScreen();} ).start();
        }
        else if(guthans_bar.isSelected()){
            new Thread(() ->{
                createGuthansView();
                table.setItems(getGuthans());
                setGuthansTime();
                unlockScreen();} ).start();
        }
        else if(dharok_bar.isSelected()){
            new Thread(() ->{
                createDharokView();
                table.setItems(getDharok());
                setDharokTime();
                unlockScreen();} ).start();
        }
        else if(treasure_bar.isSelected()){
            new Thread(() ->{
                createTreasuretrailsView();
                table.setItems(getTreasuretrails());
                setTreasureTime();
                unlockScreen();} ).start();
        }
        else if(food_bar.isSelected()){
            new Thread(() ->{
                createFoodView();
                table.setItems(getFood());
                setFoodTime();
                unlockScreen();} ).start();
        }
        else if(res_bar.isSelected()){
            new Thread(() ->{
                createResourcesView();
                table.setItems(getResources());
                setResTime();
                unlockScreen();} ).start();
        }
        else if(ammo_bar.isSelected()){
            new Thread(() ->{
                createAmmoView();
                table.setItems(getAmmo());
                setAmmoTime();
                unlockScreen();} ).start();
        }
        else if(telruns_bar.isSelected()){
            new Thread(() ->{
                createTelruneView();
                table.setItems(getTelrune());
                setTelrunsTime();
                unlockScreen();} ).start();
        }
        else if(other_bar.isSelected()){
            new Thread(() ->{
                createOtherView();
                table.setItems(getOther());
                setOtherTime();
                unlockScreen();} ).start();
        }
                    
    }
   
    private void unhide(ToggleButton... tgbutton){
        ArrayList<ToggleButton> toggleBars = new ArrayList<>(Arrays.asList(revenants_bar, zulrah_bar, farming_bar, potions_bar, 
                     melee_bar, raids1_bar, raids2_bar, ranged_bar, magic_bar, food_bar, guthans_bar, 
                     dharok_bar, treasure_bar, res_bar, ammo_bar, telruns_bar, other_bar));
              
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
        if(revenants_bar.isSelected()){
            new ExcelFile(getUnsortedRevenants(), "Revenants", getRevenantsTime());
        }
        if(raids1_bar.isSelected()){
            new ExcelFile(getUnsortedRaids1(), "Raids1", getRaids1Time());
        }
        if(raids2_bar.isSelected()){
            new ExcelFile(getUnsortedRaids2(), "Raids2", getRaids2Time());
        }
        if(treasure_bar.isSelected()){
            new ExcelFile(getUnsortedTreasuretrails(), "Treasure", getTreasureTime());
        }
        if(zulrah_bar.isSelected()){
            new ExcelFile(getUnsortedZulrah(), "Zulrah", getZulrahTime());
        }
        else if(potions_bar.isSelected()){
            new ExcelFile(getUnsortedPotions(), "Potions", getPotionsTime());
        }
        else if(farming_bar.isSelected()){
            new ExcelFile(getUnsortedFarmherbs(), "FarmHerbs", getFarmingTime());
        }
        else if(melee_bar.isSelected()){
            new ExcelFile(getUnsortedMelee(), "Melee", getMeleeTime());
        }
        else if(ranged_bar.isSelected()){
            new ExcelFile(getUnsortedRanged(), "Ranged", getRangedTime());
        }
        else if(magic_bar.isSelected()){
           new ExcelFile(getUnsortedMagic(), "Magic", getMagicTime());
        }
        else if(guthans_bar.isSelected()){
            new ExcelFile(getUnsortedGuthans(), "Guthans", getGuthansTime());
        }
        else if(dharok_bar.isSelected()){
            new ExcelFile(getUnsortedDharok(), "Dharok", getDharokTime());
        }
        else if(food_bar.isSelected()){
            new ExcelFile(getUnsortedFood(), "Food", getFoodTime());
        }
        else if(res_bar.isSelected()){
            new ExcelFile(getUnsortedResources(), "Resources", getResTime());
        }
        else if(ammo_bar.isSelected()){
            new ExcelFile(getUnsortedAmmo(), "Ammo", getAmmoTime());
        }
        else if(telruns_bar.isSelected()){
            new ExcelFile(getUnsortedTelrune(), "TelRun", getTelrunsTime());
        }
        else if(other_bar.isSelected()){
            new ExcelFile(getUnsortedOther(), "Other", getOtherTime());
        } 
    }

    
    @Override
     public void initialize(URL url, ResourceBundle rb) {      
         //Linking columns with properties
        icons.setCellValueFactory(new PropertyValueFactory("icons"));  
        name.setCellValueFactory(new PropertyValueFactory("iconName"));
        buy.setCellValueFactory(new PropertyValueFactory("buyingPrice"));
        sell.setCellValueFactory(new PropertyValueFactory("sellingPrice"));
        ge.setCellValueFactory(new PropertyValueFactory("gePrice"));
        margin.setCellValueFactory(new PropertyValueFactory("profitperone"));
        item_to_scales.setCellValueFactory(new PropertyValueFactory("itemtoscales"));
        item_to_item.setCellValueFactory(new PropertyValueFactory("itemtoitem"));
        best_strategy.setCellValueFactory(new PropertyValueFactory("beststrategy"));
        pp1.setCellValueFactory(new PropertyValueFactory("profitperone"));
        best_pp1.setCellValueFactory(new PropertyValueFactory("bestprofitperone"));
        limit.setCellValueFactory(new PropertyValueFactory("limit"));
        tp.setCellValueFactory(new PropertyValueFactory("totalprofit"));
        best_tp.setCellValueFactory(new PropertyValueFactory("besttotalprofit"));              
        roi.setCellValueFactory(new PropertyValueFactory("roi"));
        best_roi.setCellValueFactory(new PropertyValueFactory("bestroi"));
        
        //Formating values from tables
        buy.setCellFactory(new FormatFactory<>(new DecimalFormat("#,##0"), true));
        sell.setCellFactory(new FormatFactory<>(new DecimalFormat("#,##0"), true));
        ge.setCellFactory(new FormatFactory<>(new DecimalFormat("#,##0"), true));
        margin.setCellFactory(new FormatFactory<>(new DecimalFormat("#,##0"), false));
        item_to_scales.setCellFactory(new FormatFactory<>(new DecimalFormat("#,##0"), false));
        item_to_item.setCellFactory(new FormatFactory<>(new DecimalFormat("#,##0"), false));
        pp1.setCellFactory(new FormatFactory<>(new DecimalFormat("#,##0"), false));
        best_pp1.setCellFactory(new FormatFactory<>(new DecimalFormat("#,##0"), false));
        limit.setCellFactory(new FormatFactory<>(new DecimalFormat("#,##0"), false));
        tp.setCellFactory(new FormatFactory<>(new DecimalFormat("#,##0"), false));
        best_tp.setCellFactory(new FormatFactory<>(new DecimalFormat("#,##0"), false));
        roi.setCellFactory(new FormatFactory<>(new DecimalFormat("#.##%"), false));
        best_roi.setCellFactory(new FormatFactory<>(new DecimalFormat("#.##%"), false));
        
        //Button action to unhide Toggle button(s)
        revenants.setOnAction(e -> unhide(revenants_bar));
        zulrah.setOnAction(e -> unhide(zulrah_bar));
        farming_herbs.setOnAction(e -> unhide(farming_bar));       
        potions.setOnAction(e -> unhide(potions_bar));       
        attack_styles.setOnAction(e -> unhide(melee_bar, ranged_bar, magic_bar, raids1_bar, raids2_bar));
        sets.setOnAction(e -> unhide(guthans_bar, dharok_bar));
        treasure_trails.setOnAction(e -> unhide(treasure_bar));
        other.setOnAction(e -> unhide(other_bar, ammo_bar, food_bar, res_bar, telruns_bar));     
             
        //Toggle buttons getting data
        revenants_bar.setOnAction(e -> setRevenantsView());
        zulrah_bar.setOnAction(e -> setZulrahView());
        farming_bar.setOnAction(e -> setFarmHerbsView()); 
        potions_bar.setOnAction(e -> setPotionView());
        melee_bar.setOnAction(e -> setMeleeView());
        raids1_bar.setOnAction(e -> setRaids1View());
        raids2_bar.setOnAction(e -> setRaids2View());
        ranged_bar.setOnAction(e -> setRangedView());
        magic_bar.setOnAction(e -> setMagicView());               
        guthans_bar.setOnAction(e -> setGuthansView());
        dharok_bar.setOnAction(e -> setDharokView());
        treasure_bar.setOnAction(e -> setTreasuretrailsView());
        food_bar.setOnAction(e -> setFoodView()); 
        res_bar.setOnAction(e -> setResourcesView());
        ammo_bar.setOnAction(e -> setAmmoView());
        telruns_bar.setOnAction(e -> setTelRuneView());
        other_bar.setOnAction(e -> setOtherView());

        //Save button for saving data in excel format
        save.setOnAction(e -> saveData());
        
        //Refresh button for refreshing data in jfx table
        refresh.setOnAction(e -> refreshData());
        
    }   
}

