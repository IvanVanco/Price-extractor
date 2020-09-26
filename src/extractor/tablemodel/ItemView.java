package extractor.tablemodel;

import extractor.model.ItemIndicators;
import extractor.model.basicdata.EnumData;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;


public class ItemView {
    
    private static ObservableList<ItemIndicators> food, unfood;
    private static ObservableList<ItemIndicators> zulrah, unzulrah;
    private static ObservableList<ItemIndicators> revenants, unrevenants;
    private static ObservableList<ItemIndicators> potions, unpotions;
    private static ObservableList<ItemIndicators> resources, unresources;
    private static ObservableList<ItemIndicators> telrune, untelrune;
    private static ObservableList<ItemIndicators> ammo, unammo;
    private static ObservableList<ItemIndicators> farmherbs, unfarmherbs;
    private static ObservableList<ItemIndicators> other, unother;
    private static ObservableList<ItemIndicators> magic, unmagic;
    private static ObservableList<ItemIndicators> melee, unmelee;
    private static ObservableList<ItemIndicators> ranged, unranged;
    private static ObservableList<ItemIndicators> raids1, unraids1;
    private static ObservableList<ItemIndicators> raids2, unraids2;
    private static ObservableList<ItemIndicators> guthans, unguthans;
    private static ObservableList<ItemIndicators> dharok, undharok;
    private static ObservableList<ItemIndicators> treasuretrails, untreasuretrails;
    
    public static ObservableList<ItemIndicators> getFood() {
        return food;
    }
    public static ObservableList<ItemIndicators> getUnsortedFood() {
        return unfood;
    }

    public static ObservableList<ItemIndicators> getZulrah() {
        return zulrah;
    }
    public static ObservableList<ItemIndicators> getUnsortedZulrah() {
        return unzulrah;
    }
    
    public static ObservableList<ItemIndicators> getRevenants() {
        return revenants;
    }
    public static ObservableList<ItemIndicators> getUnsortedRevenants() {
        return unrevenants;
    }
    
    public static ObservableList<ItemIndicators> getTreasuretrails() {
        return treasuretrails;
    }
    public static ObservableList<ItemIndicators> getUnsortedTreasuretrails() {
        return untreasuretrails;
    }

    public static ObservableList<ItemIndicators> getPotions() {
        return potions;
    }  
    public static ObservableList<ItemIndicators> getUnsortedPotions() {
        return unpotions;
    }
  
    public static ObservableList<ItemIndicators> getResources() {
        return resources;
    }
    public static ObservableList<ItemIndicators> getUnsortedResources() {
        return unresources;
    }
    
    public static ObservableList<ItemIndicators> getTelrune() {
        return telrune;
    }
    public static ObservableList<ItemIndicators> getUnsortedTelrune() {
        return untelrune;
    }

    public static ObservableList<ItemIndicators> getAmmo() {
        return ammo;
    }
    public static ObservableList<ItemIndicators> getUnsortedAmmo() {
        return unammo;
    }

    public static ObservableList<ItemIndicators> getFarmherbs() {
        return farmherbs;
    }
    public static ObservableList<ItemIndicators> getUnsortedFarmherbs() {
        return unfarmherbs;
    }
    
    public static ObservableList<ItemIndicators> getOther() {
        return other;
    }
    public static ObservableList<ItemIndicators> getUnsortedOther() {
        return unother;
    }

    public static ObservableList<ItemIndicators> getMagic() {
        return magic;
    }
    public static ObservableList<ItemIndicators> getUnsortedMagic() {
        return unmagic;
    }
    
    public static ObservableList<ItemIndicators> getMelee() {
        return melee;
    }    
    public static ObservableList<ItemIndicators> getUnsortedMelee() {
        return unmelee;
    }

    public static ObservableList<ItemIndicators> getRanged() {
        return ranged;
    }
    public static ObservableList<ItemIndicators> getUnsortedRanged() {
        return unranged;
    }
    
    public static ObservableList<ItemIndicators> getRaids1() {
        return raids1;
    }
    public static ObservableList<ItemIndicators> getUnsortedRaids1() {
        return unraids1;
    }
    
    public static ObservableList<ItemIndicators> getRaids2() {
        return raids2;
    }
    public static ObservableList<ItemIndicators> getUnsortedRaids2() {
        return unraids2;
    }

    public static ObservableList<ItemIndicators> getGuthans() {
        return guthans;
    }
    public static ObservableList<ItemIndicators> getUnsortedGuthans() {
        return unguthans;
    }
    
    public static ObservableList<ItemIndicators> getDharok() {
        return dharok;
    }
    public static ObservableList<ItemIndicators> getUnsortedDharok() {
        return undharok;
    }
    
         
    public static void createFoodView(){
        food = FXCollections.observableArrayList();
        
        food.add(new ItemIndicators(EnumData.Anglerfish));
        food.add(new ItemIndicators(EnumData.Raw_anglerfish));
        food.add(new ItemIndicators(EnumData.Shark));
        food.add(new ItemIndicators(EnumData.Raw_shark));
        food.add(new ItemIndicators(EnumData.Cooked_karambwan));
        food.add(new ItemIndicators(EnumData.Raw_karambwan));
        food.add(new ItemIndicators(EnumData.Monkfish));
        food.add(new ItemIndicators(EnumData.Raw_monkfish));
        food.add(new ItemIndicators(EnumData.Swordfish));
        food.add(new ItemIndicators(EnumData.Raw_swordfish));
        food.add(new ItemIndicators(EnumData.Lobster));
        food.add(new ItemIndicators(EnumData.Raw_lobster));
        food.add(new ItemIndicators(EnumData.Manta_ray));
        food.add(new ItemIndicators(EnumData.Tuna_potato));
        food.add(new ItemIndicators(EnumData.Dark_crab));
        
        ItemView.unfood = FXCollections.observableArrayList(food);
        ItemView.food = food;
    }

    public static void createZulrahView(){
        zulrah = FXCollections.observableArrayList();
        
        zulrah.add(new ItemIndicators(EnumData.Zulrah_scales));
        zulrah.add(new ItemIndicators(EnumData.Tanzanite_fang));
        zulrah.add(new ItemIndicators(EnumData.Blowpipe));
        zulrah.add(new ItemIndicators(EnumData.Magic_fang));
        zulrah.add(new ItemIndicators(EnumData.Trident_uncharged));
        zulrah.add(new ItemIndicators(EnumData.Trident_full));
        zulrah.add(new ItemIndicators(EnumData.Serpentine_visage));
        zulrah.add(new ItemIndicators(EnumData.Serpentine_helm));
        
        ItemView.unzulrah = FXCollections.observableArrayList(zulrah);
        ItemView.zulrah = zulrah;
    }
    
    public static void createRevenantsView(){
        revenants = FXCollections.observableArrayList();
        
        revenants.add(new ItemIndicators(EnumData.Revenant_ether));
        revenants.add(new ItemIndicators(EnumData.Bracelet_of_ethereum));
        revenants.add(new ItemIndicators(EnumData.Amulet_of_avarice));
        revenants.add(new ItemIndicators(EnumData.Craws_bow));
        revenants.add(new ItemIndicators(EnumData.Thammarons_sceptre));
        revenants.add(new ItemIndicators(EnumData.Viggoras_chainmace));
        revenants.add(new ItemIndicators(EnumData.Ancient_relic));
        revenants.add(new ItemIndicators(EnumData.Ancient_effigy));
        revenants.add(new ItemIndicators(EnumData.Ancient_medallion));
        revenants.add(new ItemIndicators(EnumData.Ancient_statuette));
        revenants.add(new ItemIndicators(EnumData.Ancient_totem));
        revenants.add(new ItemIndicators(EnumData.Ancient_emblem));
        revenants.add(new ItemIndicators(EnumData.Ancient_crystal));
   
        ItemView.unrevenants = FXCollections.observableArrayList(revenants);
        ItemView.revenants = revenants;
    }
    
    public static void createTreasuretrailsView(){
        treasuretrails = FXCollections.observableArrayList();
        
        treasuretrails.add(new ItemIndicators(EnumData.Gilded_2h_sword));
        treasuretrails.add(new ItemIndicators(EnumData.Gilded_spade));
        treasuretrails.add(new ItemIndicators(EnumData.Gilded_axe));
        treasuretrails.add(new ItemIndicators(EnumData.Gilded_pickaxe));
        treasuretrails.add(new ItemIndicators(EnumData.Gilded_coif));
        treasuretrails.add(new ItemIndicators(EnumData.Gilded_dhide_body));
        treasuretrails.add(new ItemIndicators(EnumData.Gilded_dhide_chaps));
        treasuretrails.add(new ItemIndicators(EnumData.Gilded_dhide_vambs));
        treasuretrails.add(new ItemIndicators(EnumData.Dragon_defender_ornament_kit));
        treasuretrails.add(new ItemIndicators(EnumData.Tormented_ornament_kit));
        treasuretrails.add(new ItemIndicators(EnumData.Torture_ornament_kit));
        treasuretrails.add(new ItemIndicators(EnumData.Anguish_ornament_kit));
        treasuretrails.add(new ItemIndicators(EnumData.Occult_ornament_kit));
        treasuretrails.add(new ItemIndicators(EnumData.Fury_ornament_kit));
        treasuretrails.add(new ItemIndicators(EnumData.Age_druidic_cloak));
        treasuretrails.add(new ItemIndicators(EnumData.Age_druidic_staff));
        treasuretrails.add(new ItemIndicators(EnumData.Age_druidic_robe_top));
        treasuretrails.add(new ItemIndicators(EnumData.Age_druidic_robe_bottoms));
        treasuretrails.add(new ItemIndicators(EnumData.Age_full_helmet));
        treasuretrails.add(new ItemIndicators(EnumData.Age_platebody));
        treasuretrails.add(new ItemIndicators(EnumData.Age_platelegs));
        treasuretrails.add(new ItemIndicators(EnumData.Age_plateskirt));
        treasuretrails.add(new ItemIndicators(EnumData.Age_kiteshield));
        treasuretrails.add(new ItemIndicators(EnumData.Age_longsword));
        treasuretrails.add(new ItemIndicators(EnumData.Age_mage_hat));
        treasuretrails.add(new ItemIndicators(EnumData.Age_robe_top));
        treasuretrails.add(new ItemIndicators(EnumData.Age_robe));
        treasuretrails.add(new ItemIndicators(EnumData.Age_amulet));
        treasuretrails.add(new ItemIndicators(EnumData.Age_wand));
        treasuretrails.add(new ItemIndicators(EnumData.Age_range_coif));
        treasuretrails.add(new ItemIndicators(EnumData.Age_range_top));
        treasuretrails.add(new ItemIndicators(EnumData.Age_range_legs));
        treasuretrails.add(new ItemIndicators(EnumData.Age_vambraces));
        treasuretrails.add(new ItemIndicators(EnumData.Age_bow));
        treasuretrails.add(new ItemIndicators(EnumData.Age_axe));
        treasuretrails.add(new ItemIndicators(EnumData.Age_pickaxe));
        treasuretrails.add(new ItemIndicators(EnumData.Age_cloak));
        treasuretrails.add(new ItemIndicators(EnumData.Age_ring));
        treasuretrails.add(new ItemIndicators(EnumData.Rangers_tights));
        treasuretrails.add(new ItemIndicators(EnumData.Rangers_tunic));
        treasuretrails.add(new ItemIndicators(EnumData.Ring_of_coins));
              
        ItemView.untreasuretrails = FXCollections.observableArrayList(treasuretrails);
        ItemView.treasuretrails = treasuretrails;
    }
    
    public static void createPotionsView(){
        potions = FXCollections.observableArrayList();
        
        potions.add(new ItemIndicators(EnumData.Prayer_potion4));
        potions.add(new ItemIndicators(EnumData.Prayer_potion3));
        potions.add(new ItemIndicators(EnumData.Super_restore4));
        potions.add(new ItemIndicators(EnumData.Super_restore3));
        potions.add(new ItemIndicators(EnumData.Saradomin_brew4));
        potions.add(new ItemIndicators(EnumData.Saradomin_brew3));
        potions.add(new ItemIndicators(EnumData.Stamina_potion4));
        potions.add(new ItemIndicators(EnumData.Stamina_potion3));
        potions.add(new ItemIndicators(EnumData.Super_combat_potion4));
        potions.add(new ItemIndicators(EnumData.Super_combat_potion3));
        potions.add(new ItemIndicators(EnumData.Super_defence4));
        potions.add(new ItemIndicators(EnumData.Super_defence3));
        potions.add(new ItemIndicators(EnumData.Super_attack4));
        potions.add(new ItemIndicators(EnumData.Super_attack3));
        potions.add(new ItemIndicators(EnumData.Super_strength4));
        potions.add(new ItemIndicators(EnumData.Super_strength3));
        potions.add(new ItemIndicators(EnumData.Ranging_potion4));
        potions.add(new ItemIndicators(EnumData.Ranging_potion3));
        potions.add(new ItemIndicators(EnumData.Bastion_potion4));
        potions.add(new ItemIndicators(EnumData.Bastion_potion3));
        potions.add(new ItemIndicators(EnumData.Battlemage_potion4));
        potions.add(new ItemIndicators(EnumData.Battlemage_potion3));
        potions.add(new ItemIndicators(EnumData.Vial_of_blood));
        potions.add(new ItemIndicators(EnumData.Guthix_rest4));
        potions.add(new ItemIndicators(EnumData.Sanfew_serum4));
        potions.add(new ItemIndicators(EnumData.Sanfew_serum3));
        potions.add(new ItemIndicators(EnumData.Super_energy4));
        potions.add(new ItemIndicators(EnumData.Super_energy3));
        potions.add(new ItemIndicators(EnumData.Antifire_potion4));
        potions.add(new ItemIndicators(EnumData.Antifire_potion3));
        potions.add(new ItemIndicators(EnumData.Super_antifire_potion4));
        potions.add(new ItemIndicators(EnumData.Super_antifire_potion3));
        potions.add(new ItemIndicators(EnumData.Extended_super_antifire4));
        potions.add(new ItemIndicators(EnumData.Extended_super_antifire3));
        potions.add(new ItemIndicators(EnumData.Anti_venom4));
        potions.add(new ItemIndicators(EnumData.Anti_venom3));
        potions.add(new ItemIndicators(EnumData.Antidote4));

                //Bastion_potion4(22461,2000, "Potions", "Bastion potion(4)"), //NOVO
        //Bastion_potion3(22464,2000, "Potions", "Bastion potion(3)"),  //NOVO
        //Battlemage_potion4(22449,2000, "Potions", "Battlemage potion(4)"), //NOVO
        //Battlemage_potion3(22452,2000, "Potions", "Battlemage potion(3)"),  //NOVO
        //Vial_of_blood(22446,13000, "Potions", "Vial of blood"),  //NOVO  
        
        ItemView.unpotions = FXCollections.observableArrayList(potions);
        ItemView.potions = potions;
    }
           
    public static void createResourcesView(){
        resources = FXCollections.observableArrayList();
        
        resources.add(new ItemIndicators(EnumData.Dragon_bones));
        resources.add(new ItemIndicators(EnumData.Wyvern_bones));
        resources.add(new ItemIndicators(EnumData.Hydra_bones));
        resources.add(new ItemIndicators(EnumData.Drake_bones));
        resources.add(new ItemIndicators(EnumData.Wyrm_bones));
        resources.add(new ItemIndicators(EnumData.Dagannoth_bones));
        resources.add(new ItemIndicators(EnumData.Superior_dragon_bones));
        resources.add(new ItemIndicators(EnumData.Mahogany_plank));
        resources.add(new ItemIndicators(EnumData.Teak_plank));
        resources.add(new ItemIndicators(EnumData.Oak_plank));
        resources.add(new ItemIndicators(EnumData.Magic_logs));
        resources.add(new ItemIndicators(EnumData.Redwood_logs));
        resources.add(new ItemIndicators(EnumData.Yew_logs));
        resources.add(new ItemIndicators(EnumData.Mahogany_logs));
        resources.add(new ItemIndicators(EnumData.Runite_ore));
        resources.add(new ItemIndicators(EnumData.Adamantite_ore));
        resources.add(new ItemIndicators(EnumData.Gold_ore));
        resources.add(new ItemIndicators(EnumData.Coal));
        resources.add(new ItemIndicators(EnumData.Runite_bar));
        resources.add(new ItemIndicators(EnumData.Adamantite_bar));
        resources.add(new ItemIndicators(EnumData.Mithril_bar));

        ItemView.unresources = FXCollections.observableArrayList(resources);
        ItemView.resources = resources;
    }
    
    public static void createTelruneView(){
        telrune = FXCollections.observableArrayList();
        
        telrune.add(new ItemIndicators(EnumData.Zulandra_teleport));
        telrune.add(new ItemIndicators(EnumData.Revenant_cave_teleport));
        telrune.add(new ItemIndicators(EnumData.Teleport_to_house));
        telrune.add(new ItemIndicators(EnumData.Varrock_teleport));
        telrune.add(new ItemIndicators(EnumData.Falador_teleport));
        telrune.add(new ItemIndicators(EnumData.Camelot_teleport));
        telrune.add(new ItemIndicators(EnumData.Lumberyard_teleport));
        telrune.add(new ItemIndicators(EnumData.Morton_teleport));
        telrune.add(new ItemIndicators(EnumData.Digsite_teleport));
        telrune.add(new ItemIndicators(EnumData.Lunar_isle_teleport));
        telrune.add(new ItemIndicators(EnumData.Tai_bwo_wannai_teleport));
        telrune.add(new ItemIndicators(EnumData.Death_runes));
        telrune.add(new ItemIndicators(EnumData.Blood_runes));
        telrune.add(new ItemIndicators(EnumData.Wrath_runes));
        telrune.add(new ItemIndicators(EnumData.Nature_runes));
        telrune.add(new ItemIndicators(EnumData.Astral_runes));
        telrune.add(new ItemIndicators(EnumData.Cosmic_runes));
        telrune.add(new ItemIndicators(EnumData.Law_runes));
        
        ItemView.untelrune = FXCollections.observableArrayList(telrune);
        ItemView.telrune = telrune;
    }
    
    public static void createAmmoView(){
        ammo = FXCollections.observableArrayList();
        
        ammo.add(new ItemIndicators(EnumData.Black_chinchompa));
        ammo.add(new ItemIndicators(EnumData.Red_chinchompa));
        ammo.add(new ItemIndicators(EnumData.Dragon_dart));
        ammo.add(new ItemIndicators(EnumData.Adamant_dart));
        ammo.add(new ItemIndicators(EnumData.Mithril_dart));
        ammo.add(new ItemIndicators(EnumData.Dragon_arrows));
        ammo.add(new ItemIndicators(EnumData.Diamond_bolts_e));
        ammo.add(new ItemIndicators(EnumData.Diamond_dragon_bolts));
        ammo.add(new ItemIndicators(EnumData.Diamond_dragon_bolts_e));
        ammo.add(new ItemIndicators(EnumData.Ruby_bolts_e));
        ammo.add(new ItemIndicators(EnumData.Ruby_dragon_bolts));
        ammo.add(new ItemIndicators(EnumData.Ruby_dragon_bolts_e));
        ammo.add(new ItemIndicators(EnumData.Amethyst_broad_bolts));
        ammo.add(new ItemIndicators(EnumData.Cannonball));
        ammo.add(new ItemIndicators(EnumData.Dragon_knife));
        
        ItemView.unammo = FXCollections.observableArrayList(ammo);
        ItemView.ammo = ammo;
    }
   
    public static void createFarmHerbsView(){
        farmherbs = FXCollections.observableArrayList();
        
        farmherbs.add(new ItemIndicators(EnumData.Grimy_torstol));
        farmherbs.add(new ItemIndicators(EnumData.Torstol));
        farmherbs.add(new ItemIndicators(EnumData.Torstol_seed));
        farmherbs.add(new ItemIndicators(EnumData.Grimy_snapdragon));
        farmherbs.add(new ItemIndicators(EnumData.Snapdragon));
        farmherbs.add(new ItemIndicators(EnumData.Snapdragon_seed));
        farmherbs.add(new ItemIndicators(EnumData.Grimy_ranarr_weed));
        farmherbs.add(new ItemIndicators(EnumData.Ranarr_weed));
        farmherbs.add(new ItemIndicators(EnumData.Ranarr_seed));
        farmherbs.add(new ItemIndicators(EnumData.Magic_seed));
        farmherbs.add(new ItemIndicators(EnumData.Magic_sapling));
        farmherbs.add(new ItemIndicators(EnumData.Palm_tree_seed));
        farmherbs.add(new ItemIndicators(EnumData.Palm_sapling));
        farmherbs.add(new ItemIndicators(EnumData.Papaya_tree_seed));
        farmherbs.add(new ItemIndicators(EnumData.Papaya_sapling));
        farmherbs.add(new ItemIndicators(EnumData.Celastrus_seed));
        farmherbs.add(new ItemIndicators(EnumData.Celastrus_sapling));
        farmherbs.add(new ItemIndicators(EnumData.Redwood_tree_seed));
        farmherbs.add(new ItemIndicators(EnumData.Redwood_sapling));
        farmherbs.add(new ItemIndicators(EnumData.Dragonfruit_tree_seed));
        farmherbs.add(new ItemIndicators(EnumData.Dragonfruit_sapling));
        farmherbs.add(new ItemIndicators(EnumData.Mahogany_seed));
        farmherbs.add(new ItemIndicators(EnumData.Mahogany_sapling));
        farmherbs.add(new ItemIndicators(EnumData.Teak_seed));
        farmherbs.add(new ItemIndicators(EnumData.Teak_sapling));
        farmherbs.add(new ItemIndicators(EnumData.White_lily_seed));
       
        ItemView.unfarmherbs = FXCollections.observableArrayList(farmherbs);
        ItemView.farmherbs = farmherbs;
    }
    
    public static void createOtherView(){
        other = FXCollections.observableArrayList();
        
        other.add(new ItemIndicators(EnumData.Kraken_tentacle));
        other.add(new ItemIndicators(EnumData.Bryophytas_staff));
        other.add(new ItemIndicators(EnumData.Dragon_pickaxe));
        other.add(new ItemIndicators(EnumData.Dragon_axe)); 
        other.add(new ItemIndicators(EnumData.Old_school_bond));
        other.add(new ItemIndicators(EnumData.Battlestaff));
        other.add(new ItemIndicators(EnumData.Air_battlestaff));
        other.add(new ItemIndicators(EnumData.Fire_battlestaff));
        other.add(new ItemIndicators(EnumData.Air_orb));
        other.add(new ItemIndicators(EnumData.Fire_orb));
        other.add(new ItemIndicators(EnumData.Eclectric_impling_jar));
        other.add(new ItemIndicators(EnumData.Uncut_ruby));
        other.add(new ItemIndicators(EnumData.Bones_to_peaches));
        other.add(new ItemIndicators(EnumData.Ultracompost));
        other.add(new ItemIndicators(EnumData.Bottomless_compost_bucket));
        other.add(new ItemIndicators(EnumData.Burning_amulet));

        ItemView.unother = FXCollections.observableArrayList(other);
        ItemView.other = other;
    }
    
    public static void createMagicView(){
        magic = FXCollections.observableArrayList();
        
        magic.add(new ItemIndicators(EnumData.Ahrims_robetop));
        magic.add(new ItemIndicators(EnumData.Ahrims_robeskirt));
        magic.add(new ItemIndicators(EnumData.Eternal_boots));
        magic.add(new ItemIndicators(EnumData.Eternal_crystal));
        magic.add(new ItemIndicators(EnumData.Infinity_boots));
        magic.add(new ItemIndicators(EnumData.Staff_of_light));
        magic.add(new ItemIndicators(EnumData.Staff_of_the_dead));
        magic.add(new ItemIndicators(EnumData.Saradomins_light));
        magic.add(new ItemIndicators(EnumData.Ancient_wyvern_shield));
        magic.add(new ItemIndicators(EnumData.Wyvern_visage));
        magic.add(new ItemIndicators(EnumData.Mages_book));
        magic.add(new ItemIndicators(EnumData.Occult_necklace));
        magic.add(new ItemIndicators(EnumData.Ring_of_suffering));
        magic.add(new ItemIndicators(EnumData.Tormented_bracelet));
        magic.add(new ItemIndicators(EnumData.Imbued_heart));
        magic.add(new ItemIndicators(EnumData.Arcane_spirit_shield));
        magic.add(new ItemIndicators(EnumData.Malediction_ward));
              
        ItemView.unmagic = FXCollections.observableArrayList(magic);
        ItemView.magic = magic;
    }
    
    public static void createRangedView(){
        ranged = FXCollections.observableArrayList();
        
        ranged.add(new ItemIndicators(EnumData.Heavy_ballista));
        ranged.add(new ItemIndicators(EnumData.Archers_ring));
        ranged.add(new ItemIndicators(EnumData.Karils_leathertop));
        ranged.add(new ItemIndicators(EnumData.Armadyl_crossbow));
        ranged.add(new ItemIndicators(EnumData.Armadyl_chestplate));
        ranged.add(new ItemIndicators(EnumData.Armadyl_chainskirt));
        ranged.add(new ItemIndicators(EnumData.Pegasian_boots));
        ranged.add(new ItemIndicators(EnumData.Pegasian_crystal));
        ranged.add(new ItemIndicators(EnumData.Ranger_boots));
        ranged.add(new ItemIndicators(EnumData.Ranger_gloves));
        ranged.add(new ItemIndicators(EnumData.Necklace_of_anguish));
        ranged.add(new ItemIndicators(EnumData.Odium_ward));     
        ranged.add(new ItemIndicators(EnumData.Dragonfire_ward));
        ranged.add(new ItemIndicators(EnumData.Skeletal_visage));
        ranged.add(new ItemIndicators(EnumData.Dragon_crossbow));
        ranged.add(new ItemIndicators(EnumData.Dragon_limbs));

        ItemView.unranged = FXCollections.observableArrayList(ranged);
        ItemView.ranged = ranged;
    }
    
    public static void createRaids1View(){
        raids1 = FXCollections.observableArrayList();
        
        raids1.add(new ItemIndicators(EnumData.Twisted_bow));
        raids1.add(new ItemIndicators(EnumData.Kodai_wand));
        raids1.add(new ItemIndicators(EnumData.Kodai_insignia));
        raids1.add(new ItemIndicators(EnumData.Master_wand));
        raids1.add(new ItemIndicators(EnumData.Elder_maul));
        raids1.add(new ItemIndicators(EnumData.Dragon_claws));
        raids1.add(new ItemIndicators(EnumData.Dexterous_prayer_scroll));
        raids1.add(new ItemIndicators(EnumData.Arcane_prayer_scroll));
        raids1.add(new ItemIndicators(EnumData.Dinhs_bulwark));
        raids1.add(new ItemIndicators(EnumData.Ancestral_hat));
        raids1.add(new ItemIndicators(EnumData.Ancestral_robe_top));
        raids1.add(new ItemIndicators(EnumData.Ancestral_robe_bottom));     
        raids1.add(new ItemIndicators(EnumData.Dragon_hunter_crossbow));
        raids1.add(new ItemIndicators(EnumData.Twisted_buckler));

        ItemView.unraids1 = FXCollections.observableArrayList(raids1);
        ItemView.raids1 = raids1;
    }
    
    public static void createRaids2View(){
        raids2 = FXCollections.observableArrayList();
        
        raids2.add(new ItemIndicators(EnumData.Justiciar_faceguard));
        raids2.add(new ItemIndicators(EnumData.Justiciar_chestguard));
        raids2.add(new ItemIndicators(EnumData.Justiciar_legguards));
        raids2.add(new ItemIndicators(EnumData.Scythe_of_vitur));
        raids2.add(new ItemIndicators(EnumData.Sanguinesti_staff));
        raids2.add(new ItemIndicators(EnumData.Ghrazi_rapier));
        raids2.add(new ItemIndicators(EnumData.Avernic_defender_hilt));

        ItemView.unraids2 = FXCollections.observableArrayList(raids2);
        ItemView.raids2 = raids2;
    }
    
    public static void createMeleeView(){
        melee = FXCollections.observableArrayList();
        
        melee.add(new ItemIndicators(EnumData.Abyssal_whip));
        melee.add(new ItemIndicators(EnumData.Bandos_godsword));
        melee.add(new ItemIndicators(EnumData.Saradomin_godsword));
        melee.add(new ItemIndicators(EnumData.Armadyl_godsword));
        melee.add(new ItemIndicators(EnumData.Dragon_hunter_lance));
        melee.add(new ItemIndicators(EnumData.Hydras_claw));
        melee.add(new ItemIndicators(EnumData.Zamorakian_hasta));
        melee.add(new ItemIndicators(EnumData.Zamorakian_spear));
        melee.add(new ItemIndicators(EnumData.Amulet_of_fury));
        melee.add(new ItemIndicators(EnumData.Bandos_chestplate));
        melee.add(new ItemIndicators(EnumData.Bandos_tassets));
        melee.add(new ItemIndicators(EnumData.Berserker_ring));
        melee.add(new ItemIndicators(EnumData.Primordial_boots));
        melee.add(new ItemIndicators(EnumData.Primordial_crystal));
        melee.add(new ItemIndicators(EnumData.Dragon_boots));
        melee.add(new ItemIndicators(EnumData.Guardian_boots));
        melee.add(new ItemIndicators(EnumData.Black_tourmaline_core));
        melee.add(new ItemIndicators(EnumData.Bandos_boots));
        melee.add(new ItemIndicators(EnumData.Amulet_of_torture));
        melee.add(new ItemIndicators(EnumData.Dragon_warhammer));
        melee.add(new ItemIndicators(EnumData.Dragonfire_shield));
        melee.add(new ItemIndicators(EnumData.Draconic_visage));
        melee.add(new ItemIndicators(EnumData.Abyssal_bludgeon));
        melee.add(new ItemIndicators(EnumData.Abyssal_dagger));
        melee.add(new ItemIndicators(EnumData.Brimstone_ring));
        melee.add(new ItemIndicators(EnumData.Hydra_leather));
        melee.add(new ItemIndicators(EnumData.Granite_hammer));
        melee.add(new ItemIndicators(EnumData.Granite_boots));
        melee.add(new ItemIndicators(EnumData.Black_mask));
        melee.add(new ItemIndicators(EnumData.Spectral_spirit_shield));
        melee.add(new ItemIndicators(EnumData.Elysian_spirit_shield));
                        
        ItemView.unmelee = FXCollections.observableArrayList(melee);
        ItemView.melee = melee;
    }
    
    public static void  createGuthansView(){
        guthans = FXCollections.observableArrayList();
        
        guthans.add(new ItemIndicators(EnumData.Guthans_helm));
        guthans.add(new ItemIndicators(EnumData.Guthans_warspear));
        guthans.add(new ItemIndicators(EnumData.Guthans_platebody));
        guthans.add(new ItemIndicators(EnumData.Guthans_chainskirt));
        guthans.add(new ItemIndicators(EnumData.Guthans_set));
        guthans.add(new ItemIndicators(getGuthans(),"TOTAL"));
        guthans.add(new ItemIndicators(getGuthans(),"TOTAL TO SET"));
        
        ItemView.unguthans = FXCollections.observableArrayList(guthans);
        ItemView.guthans = guthans;
    }
    
    public static void  createDharokView(){
        dharok = FXCollections.observableArrayList();
        
        dharok.add(new ItemIndicators(EnumData.Dharoks_helm));
        dharok.add(new ItemIndicators(EnumData.Dharoks_greataxe));
        dharok.add(new ItemIndicators(EnumData.Dharoks_platebody));
        dharok.add(new ItemIndicators(EnumData.Dharoks_platelegs));
        dharok.add(new ItemIndicators(EnumData.Dharoks_armour_set));
        dharok.add(new ItemIndicators(getDharok(),"TOTAL"));
        dharok.add(new ItemIndicators(getDharok(),"TOTAL TO SET"));
        
        ItemView.undharok = FXCollections.observableArrayList(dharok);
        ItemView.dharok = dharok;
    }


}
