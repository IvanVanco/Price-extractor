package extractor.model.basicdata;

import java.net.URISyntaxException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;



public enum EnumData {
    
        //Magic
        Ahrims_robeskirt(4714,15, "Magic", "Ahrim's robeskirt"), 
        Ahrims_robetop(4712,15, "Magic", "Ahrim's robetop"), 
        Tormented_bracelet(19544,15, "Magic", "Tormented bracelet"),
        Imbued_heart(20724,8, "Magic","Imbued heart"), 
        Eternal_boots(13235,8, "Magic", "Eternal boots"), 
        Eternal_crystal(13227,10, "Magic", "Eternal crystal"),
        Infinity_boots(6920,70, "Magic", "Infinity boots"), 
        Ring_of_suffering(19550,8,"Magic", "Ring of suffering"), 
        Mages_book(6889,15,"Magic", "Mage's book"), 
        Occult_necklace(12002,8,"Magic", "Occult necklace"),
        Staff_of_light(22296,8,"Magic", "Staff of light"),                  //NOVO
        Staff_of_the_dead(11791,8,"Magic", "Staff of the dead"),            //NOVO
        Saradomins_light(13256,5,"Magic", "Saradomin's light"),             //NOVO
        Ancient_wyvern_shield(21634,8,"Magic", "Ancient wyvern shield"),    //NOVO
        Wyvern_visage(21637,5,"Magic", "Wyvern visage"),                    //NOVO
        Arcane_spirit_shield(12825,8,"Magic", "Arcane spirit shield"),      //NOVO
        Malediction_ward(11924,8,"Magic", "Malediction ward"),              //NOVO
        
        //Raids 1
        Twisted_bow(20997,8,"Raids1","Twisted bow"),
        Kodai_wand(21006,8,"Raids1","Kodai wand"),
        Kodai_insignia(21043,8,"Raids1","Kodai insignia"),
        Master_wand(6914,70,"Raids1","Master wand"),
        Elder_maul(21003,8,"Raids1","Elder maul"),
        Dragon_claws(13652,8,"Raids1","Dragon claws"),
        Dexterous_prayer_scroll(21034,8, "Raids1", "Dexterous prayer scroll"),  //OTHER
        Arcane_prayer_scroll(21079,8, "Raids1", "Arcane prayer scroll"),        //OTHER
        Dinhs_bulwark(21015,8, "Raids1", "Dinh's bulwark"),                     //MELEE
        Ancestral_hat(21018,8,"Raids1","Ancestral hat"),
        Ancestral_robe_top(21021,8,"Raids1","Ancestral robe top"),
        Ancestral_robe_bottom(21024,8,"Raids1","Ancestral robe bottom"),
        Dragon_hunter_crossbow(21012,8,"Raids1","Dragon hunter crossbow"),
        Twisted_buckler(21000,8,"Raids1","Twisted buckler"),        
        
        //Raids 2
        Justiciar_faceguard(22326,8,"Raids2","Justiciar faceguard"), 
        Justiciar_chestguard(22327,8,"Raids2","Justiciar chestguard"),
        Justiciar_legguards(22328,8,"Raids2","Justiciar legguards"),
        Scythe_of_vitur(22486,8,"Raids2","Scythe of vitur (uncharged)"),
        Sanguinesti_staff(22481,8,"Raids2","Sanguinesti staff (uncharged)"),
        Ghrazi_rapier(22324,8,"Raids2","Ghrazi rapier"),
        Avernic_defender_hilt(22477,8,"Raids2","Avernic defender hilt"),
        
        //Revenants
        Revenant_ether(21820,30000,"Revenants","Revenant ether"),
        Bracelet_of_ethereum(21817,10000,"Revenants","Bracelet of ethereum (uncharged)"),
        Amulet_of_avarice(22557,8,"Revenants","Amulet of avarice"),
        Craws_bow(22547,8,"Revenants","Craw's bow (u)"),
        Thammarons_sceptre(22552,8,"Revenants","Thammaron's sceptre (u)"),
        Viggoras_chainmace(22542,8,"Revenants","Viggora's chainmace (u)"),
        Ancient_relic(22305,100,"Revenants","Ancient relic"),
        Ancient_effigy(22302,100,"Revenants","Ancient effigy"),
        Ancient_medallion(22299,100,"Revenants","Ancient medallion"),
        Ancient_statuette(21813,100,"Revenants","Ancient statuette"),
        Ancient_totem(21810,100,"Revenants","Ancient totem"),
        Ancient_emblem(21807,100,"Revenants","Ancient emblem"),
        Ancient_crystal(21804,100,"Revenants","Ancient crystal"),
        
        //Treasure Trails
        Gilded_2h_sword(20155,70,"TreasureTrails","Gilded 2h sword"),
        Gilded_spade(23282,2,"TreasureTrails","Gilded spade"),
        Gilded_axe(23279,2,"TreasureTrails","Gilded axe"),
        Gilded_pickaxe(23276,2,"TreasureTrails","Gilded pickaxe"),
        Gilded_coif(23258,2,"TreasureTrails","Gilded coif"),
        Gilded_dhide_body(23264,2,"TreasureTrails","Gilded d'hide body"),
        Gilded_dhide_chaps(23267,2,"TreasureTrails","Gilded d'hide chaps"),
        Gilded_dhide_vambs(23261,2,"TreasureTrails","Gilded d'hide vambs"),
        Dragon_defender_ornament_kit(20143,4,"TreasureTrails","Dragon defender ornament kit"),
        Tormented_ornament_kit(23348,4,"TreasureTrails","Tormented ornament kit"),
        Torture_ornament_kit(20062,4,"TreasureTrails","Torture ornament kit"),
        Anguish_ornament_kit(22246,4,"TreasureTrails","Anguish ornament kit"),
        Occult_ornament_kit(20065,4,"TreasureTrails","Occult ornament kit"),
        Fury_ornament_kit(12526,4,"TreasureTrails","Fury ornament kit"),
        Age_druidic_cloak(23345,2,"TreasureTrails","3rd age druidic cloak"),
        Age_druidic_staff(23342,2,"TreasureTrails","3rd age druidic staff"),
        Age_druidic_robe_top(23336,2,"TreasureTrails","3rd age druidic robe top"),
        Age_druidic_robe_bottoms(23339,2,"TreasureTrails","3rd age druidic robe bottoms"),
        Age_full_helmet(10350,8,"TreasureTrails","3rd age full helmet"),
        Age_platebody(10348,8,"TreasureTrails","3rd age platebody"),
        Age_platelegs(10346,8,"TreasureTrails","3rd age platelegs"),
        Age_plateskirt(23242,8,"TreasureTrails","3rd age plateskirt"),
        Age_kiteshield(10352,8,"TreasureTrails","3rd age kiteshield"),
        Age_longsword(12426,8,"TreasureTrails","3rd age longsword"),
        Age_mage_hat(10342,8,"TreasureTrails","3rd age mage hat"),
        Age_robe_top(10338,8,"TreasureTrails","3rd age robe top"),
        Age_robe(10340,8,"TreasureTrails","3rd age robe"),
        Age_amulet(10344,8,"TreasureTrails","3rd age amulet"),
        Age_wand(12422,8,"TreasureTrails","3rd age wand"),
        Age_range_coif(10334,8,"TreasureTrails","3rd age range coif"),
        Age_range_top(10330,8,"TreasureTrails","3rd age range top"),
        Age_range_legs(10332,8,"TreasureTrails","3rd age range legs"),
        Age_vambraces(10336,8,"TreasureTrails","3rd age vambraces"),
        Age_bow(12424,8,"TreasureTrails","3rd age bow"),
        Age_axe(20011,8,"TreasureTrails","3rd age axe"),
        Age_pickaxe(20014,8,"TreasureTrails","3rd age pickaxe"),
        Age_cloak(12437,8,"TreasureTrails","3rd age cloak"),
        Age_ring(23185,8,"TreasureTrails","Ring of 3rd age"),
        Rangers_tights(23249,2,"TreasureTrails","Rangers' tights"),
        Rangers_tunic(12596,4,"TreasureTrails","Rangers' tunic"),
        Ring_of_coins(20017,4,"TreasureTrails","Ring of coins"),

        //Zulrah
        Blowpipe(12924,8, "Zulrah", "Blowpipe"), 
        Tanzanite_fang(12922,5, "Zulrah", "Tanzanite fang"), 
        Serpentine_helm(12929,5, "Zulrah", "Serpentine helm"),
        Serpentine_visage(12927,5, "Zulrah", "Serpentine visage"), 
        Trident_full(12900,8, "Zulrah", "Trident full"), 
        Magic_fang(12932,5, "Zulrah", "Magic fang"),
        Trident_uncharged(11908,8, "Zulrah", "Trident uncharged"), 
        Zulrah_scales(12934,30000, "Zulrah", "Zulrah scales"),
        
        //Potions
        Prayer_potion4(2434,2000, "Potions", "Prayer potion(4)"), 
        Prayer_potion3(139,2000, "Potions", "Prayer potion(3)"), 
        Super_restore4(3024,2000, "Potions", "Super restore(4)"),
        Super_restore3(3026,2000, "Potions", "Super restore(3)"), 
        Saradomin_brew4(6685,2000, "Potions", "Saradomin brew(4)"), 
        Saradomin_brew3(6687,2000, "Potions", "Saradomin brew(3)"),
        Stamina_potion4(12625,2000, "Potions", "Stamina potion(4)"), 
        Stamina_potion3(12627,2000, "Potions", "Stamina potion(3)"), 
        Super_combat_potion4(12695,2000, "Potions", "Super combat potion(4)"),
        Super_combat_potion3(12697,2000, "Potions", "Super combat potion(3)"), 
        Super_defence4(2442,2000, "Potions", "Super defence(4)"), 
        Super_defence3(163,2000, "Potions", "Super defence(3)"),
        Super_attack4(2436,2000, "Potions", "Super attack(4)"), 
        Super_attack3(145,2000, "Potions", "Super attack(3)"), 
        Super_strength4(2440,2000, "Potions", "Super strength(4)"),
        Super_strength3(157,2000, "Potions", "Super strength(3)"), 
        Ranging_potion4(2444,2000, "Potions", "Ranging potion(4)"), 
        Ranging_potion3(169,2000, "Potions", "Ranging potion(3)"),
        Bastion_potion4(22461,2000, "Potions", "Bastion potion(4)"), //NOVO
        Bastion_potion3(22464,2000, "Potions", "Bastion potion(3)"),  //NOVO
        Battlemage_potion4(22449,2000, "Potions", "Battlemage potion(4)"), //NOVO
        Battlemage_potion3(22452,2000, "Potions", "Battlemage potion(3)"),  //NOVO
        Vial_of_blood(22446,13000, "Potions", "Vial of blood"),  //NOVO        
        Guthix_rest4(4417,2000, "Potions", "Guthix rest(4)"), 
        Sanfew_serum4(10925,2000, "Potions", "Sanfew serum(4)"), 
        Sanfew_serum3(10927,2000, "Potions", "Sanfew serum(3)"),
        Super_energy4(3016,2000, "Potions", "Super energy(4)"), 
        Super_energy3(3018,2000, "Potions", "Super energy(3)"), 
        Antifire_potion4(2452,2000, "Potions", "Antifire potion(4)"),
        Antifire_potion3(2454,2000, "Potions", "Antifire potion(3)"), 
        Super_antifire_potion4(21978,2000, "Potions", "Super antifire potion(4)"), 
        Super_antifire_potion3(21981,2000, "Potions", "Super antifire potion(3)"),
        Extended_super_antifire4(22209,2000, "Potions", "Extended super antifire(4)"), 
        Extended_super_antifire3(22212,2000, "Potions", "Extended super antifire(3)"), 
        Anti_venom4(12913,2000, "Potions", "Anti-venom+(4)"),
        Anti_venom3(12915,2000, "Potions", "Anti-venom+(3)"), 
        Antidote4(5952,2000, "Potions", "Antidote++(4)"),
                
        //Food
        Anglerfish(13441,10000, "Food", "Anglerfish"), 
        Raw_anglerfish(13439,15000, "Food", "Raw anglerfish"), 
        Shark(385,10000, "Food", "Shark"),
        Raw_shark(383,15000, "Food", "Raw shark"), 
        Cooked_karambwan(3144,10000, "Food", "Cooked karambwan"), 
        Raw_karambwan(3142,13000, "Food", "Raw karambwan"),
        Monkfish(7946,13000, "Food", "Monkfish"), 
        Raw_monkfish(7944,13000, "Food", "Raw monkfish"), 
        Swordfish(373,6000, "Food", "Swordfish"),
        Raw_swordfish(371,15000, "Food", "Raw swordfish"), 
        Lobster(379,11000, "Food", "Lobster"), 
        Raw_lobster(377,10000, "Food", "Raw lobster"),
        Manta_ray(391,10000, "Food", "Manta ray"), 
        Tuna_potato(7060,10000, "Food", "Tuna potato"), 
        Dark_crab(11936,10000, "Food", "Dark crab"),
        
        //Resources
        Mahogany_logs(6332,11000, "Resources", "Mahogany logs"), 
        Mahogany_plank(8782,13000, "Resources", "Mahogany plank"), 
        Oak_plank(8778,13000, "Resources", "Oak plank"),
        Teak_plank(8780,13000, "Resources", "Teak plank"), 
        Magic_logs(1513,12000, "Resources", "Magic logs"), 
        Redwood_logs(19669,12000, "Resources", "Redwood logs"),
        Yew_logs(1515,12000, "Resources", "Yew logs"), 
        Dragon_bones(536,7500, "Resources", "Dragon bones"), 
        Superior_dragon_bones(22124,7500, "Resources", "Superior dragon bones"),
        Dagannoth_bones(6729,7500, "Resources", "Dagannoth bones"), 
        Wyvern_bones(6812,7500, "Resources", "Wyvern bones"), 
        Hydra_bones(22786,7500, "Resources", "Hydra bones"),              //NOVO
        Drake_bones(22783,7500, "Resources", "Drake bones"),              //NOVO
        Wyrm_bones(22780,7500, "Resources", "Wyrm bones"),                //NOVO
        Runite_bar(2363,10000, "Resources", "Runite bar"),
        Runite_ore(451,4500, "Resources", "Runite ore"), 
        Adamantite_bar(2361,10000, "Resources", "Adamantite bar"), 
        Adamantite_ore(449,4500, "Resources", "Adamantite ore"),
        Mithril_bar(2359,10000, "Resources", "Mithril bar"), 
        Coal(453,13000, "Resources", "Coal"), 
        Gold_ore(444,13000, "Resources", "Gold ore"),
        
        //Teleports and Runes
        Law_runes(563,12000, "RunesTeleports", "Law runes"), 
        Nature_runes(561,12000, "RunesTeleports", "Nature runes"), 
        Death_runes(560,10000, "RunesTeleports", "Death runes"),
        Blood_runes(565,10000, "RunesTeleports", "Blood runes"), 
        Wrath_runes(21880,10000, "RunesTeleports", "Wrath runes"), 
        Cosmic_runes(564,12000, "RunesTeleports", "Cosmic runes"),
        Astral_runes(9075,10000, "RunesTeleports", "Astral runes"), 
        Zulandra_teleport(12938,10000, "RunesTeleports", "Zul-andra teleport"),
        Revenant_cave_teleport(21802,10000, "RunesTeleports", "Revenant cave teleport"),      //NOVO
        Falador_teleport(8009,10000, "RunesTeleports", "Falador teleport"),
        Varrock_teleport(8007,10000, "RunesTeleports", "Varrock teleport"), 
        Teleport_to_house(8013,10000, "RunesTeleports", "Teleport to house"), 
        Morton_teleport(12406,1000, "RunesTeleports", "Morton teleport"),
        Digsite_teleport(12403,1000, "RunesTeleports", "Digsite teleport"), 
        Lumberyard_teleport(12642,200, "RunesTeleports", "Lumberyard teleport"), 
        Lunar_isle_teleport(12405,1000, "RunesTeleports", "Lunar isle teleport"),
        Tai_bwo_wannai_teleport(12409,1000, "RunesTeleports", "Tai bwo wannai teleport"), 
        Camelot_teleport(8010,10000, "RunesTeleports", "Camelot teleport"),
        
        //Ammo
        Black_chinchompa(11959,10000, "Ammo", "Black chinchompa"), 
        Red_chinchompa(10034,7000, "Ammo", "Red chinchompa"), 
        Dragon_dart(11230,11000, "Ammo", "Dragon dart"),
        Adamant_dart(810,11000, "Ammo", "Adamant dart"), 
        Mithril_dart(809,7000, "Ammo", "Mithril dart"), 
        Dragon_arrows(11212,11000, "Ammo", "Dragon arrows"),
        Diamond_bolts_e(9243,11000, "Ammo", "Diamond bolts (e)"),
        Diamond_dragon_bolts(21969,11000, "Ammo", "Diamond dragon bolts"),      //NOVO
        Diamond_dragon_bolts_e(21946,11000, "Ammo", "Diamond dragon bolts (e)"),//NOVO
        Ruby_bolts_e(9242,11000, "Ammo", "Ruby bolts (e)"),
        Ruby_dragon_bolts(21967,11000, "Ammo", "Ruby dragon bolts"),            //NOVO
        Ruby_dragon_bolts_e(21944,11000, "Ammo", "Ruby dragon bolts (e)"),      //NOVO
        Amethyst_broad_bolts(21316,11000, "Ammo", "Amethyst broad bolts"),
        Dragon_bolts(21905,11000, "Ammo", "Dragon bolts"),                      //NOVO
        Cannonball(2,7000, "Ammo", "Cannonball"),
        Dragon_knife(22804,11000, "Ammo", "Dragon knife"),                      //NOVO
        
        //Farm and Herbs
        Snapdragon(3000,2000, "FarmHerb", "Snapdragon"),
        Snapdragon_seed(5300,200, "FarmHerb", "Snapdragon seed"), 
        Grimy_snapdragon(3051,11000, "FarmHerb", "Grimy snapdragon"),
        Grimy_ranarr_weed(207,11000, "FarmHerb", "Grimy ranarr weed"), 
        Ranarr_seed(5295,200, "FarmHerb", "Ranarr seed"), 
        Ranarr_weed(257,2000, "FarmHerb", "Ranarr weed"),
        Grimy_torstol(219,11000, "FarmHerb", "Grimy torstol"), 
        Torstol_seed(5304,200, "FarmHerb", "Torstol seed"), 
        Torstol(269,2000, "FarmHerb", "Torstol"),
        Magic_seed(5316,200, "FarmHerb", "Magic seed"), 
        Magic_sapling(5374,200, "FarmHerb", "Magic sapling"),
        Palm_tree_seed(5289,200, "FarmHerb", "Palm tree seed"),
        Palm_sapling(5502,200, "FarmHerb", "Palm sapling"), 
        Papaya_sapling(5501,400, "FarmHerb", "Papaya sapling"), 
        Papaya_tree_seed(5288,200, "FarmHerb", "Papaya tree seed"),
        Celastrus_sapling(22856,200, "FarmHerb", "Celastrus sapling"),            //NOVO
        Celastrus_seed(22869,200, "FarmHerb", "Celastrus seed"),                  //NOVO
        Redwood_sapling(22859,200, "FarmHerb", "Redwood sapling"),                //NOVO
        Redwood_tree_seed(22871,200, "FarmHerb", "Redwood tree seed"),            //NOVO
        Dragonfruit_sapling(22866,200, "FarmHerb", "Dragonfruit sapling"),        //NOVO
        Dragonfruit_tree_seed(22877,200, "FarmHerb", "Dragonfruit tree seed"),    //NOVO
        Mahogany_sapling(21480,200, "FarmHerb", "Mahogany sapling"),              //NOVO
        Mahogany_seed(21488,200, "FarmHerb", "Mahogany seed"),                    //NOVO
        Teak_sapling(21477,200, "FarmHerb", "Teak sapling"),                      //NOVO
        Teak_seed(21486,200, "FarmHerb", "Teak seed"),                            //NOVO
        White_lily_seed(22887,200, "FarmHerb", "White lily seed"),                //NOVO
        
        //Other
        Dragon_axe(6739,40, "Other", "Dragon axe"),
        Dragon_pickaxe(11920,40, "Other", "Dragon pickaxe"), 
        Uncut_ruby(1619,10000, "Other", "Uncut ruby"), 
        Eclectric_impling_jar(11248,5000, "Other", "Eclectric impling jar"),
        Battlestaff(1391,11000, "Other", "Battlestaff"), 
        Fire_battlestaff(1393,3000, "Other", "Fire battlestaff"), 
        Air_battlestaff(1397,14000, "Other", "Air battlestaff"),
        Fire_orb(569,10000, "Other", "Fire orb"), 
        Air_orb(573,10000, "Other", "Air orb"),
        Bryophytas_staff(22368,8, "Other", "Bryophyta's staff (uncharged)"),     //NOVO       
        Kraken_tentacle(12004,70, "Other", "Kraken tentacle"),
        Old_school_bond(13190,40, "Other", "Old school bond"), 
        Bones_to_peaches(8015,10000, "Other", "Bones to peaches"),
        Ultracompost(21483,600, "Other", "Ultracompost"),                        //NOVO
        Bottomless_compost_bucket(22994,5, "Other", "Bottomless compost bucket"),//NOVO
        Burning_amulet(21166,10000, "Other", "Burning amulet(5)"),               //NOVO
        
        //Ranged
        Armadyl_chainskirt(11830,8, "Ranged", "Armadyl chainskirt"),
        Armadyl_chestplate(11828,8, "Ranged", "Armadyl chestplate"), 
        Pegasian_boots(13237,8, "Ranged", "Pegasian boots"), 
        Armadyl_crossbow(11785,8, "Ranged", "Armadyl crossbow"), 
        Pegasian_crystal(13229,10, "Ranged", "Pegasian crystal"), 
        Ranger_boots(2577,8, "Ranged", "Ranger boots"),
        Ranger_gloves(19994,8, "Ranged", "Ranger gloves"),               //NOVO
        Archers_ring(6733,8, "Ranged", "Archers ring"), 
        Heavy_ballista(19481,8, "Ranged", "Heavy ballista"), 
        Necklace_of_anguish(19547,8, "Ranged", "Necklace of anguish"), 
        Karils_leathertop(4736,15, "Ranged", "Karil's leathertop"),
        Odium_ward(11926,8, "Ranged", "Odium ward"),                     //NOVO
        Dragonfire_ward(22003,8, "Ranged", "Dragonfire ward"),           //NOVO
        Skeletal_visage(22006,5, "Ranged", "Skeletal visage"),           //NOVO
        Dragon_crossbow(21902,70, "Ranged", "Dragon crossbow"),          //NOVO
        Dragon_limbs(21918,10, "Ranged", "Dragon limbs"),                //NOVO
        
        //Melee
        Bandos_chestplate(11832,8, "Melee", "Bandos chestplate"), 
        Abyssal_whip(4151,70, "Melee", "Abyssal whip"), 
        Abyssal_bludgeon(13263,8, "Melee", "Abyssal bludgeon"), 
        Abyssal_dagger(13265,8, "Melee", "Abyssal dagger"),                 //NOVO
        Bandos_godsword(11804,8, "Melee", "Bandos godsword"), 
        Bandos_tassets(11834,8, "Melee", "Bandos tassets"), 
        Amulet_of_fury(6585,8, "Melee", "Amulet of fury"), 
        Amulet_of_torture(19553,8, "Melee", "Amulet of torture"), 
        Dragon_boots(11840,70, "Melee", "Dragon boots"), 
        Primordial_boots(13239,8, "Melee", "Primordial boots"), 
        Primordial_crystal(13231,10, "Melee", "Primordial crystal"),
        Guardian_boots(21733,8, "Melee", "Guardian boots"),                  //NOVO
        Bandos_boots(11836,8, "Melee", "Bandos boots"),                      //NOVO
        Black_tourmaline_core(21730,5, "Melee", "Black tourmaline core"),    //NOVO
        Zamorakian_hasta(11889,8, "Melee", "Zamorakian hasta"), 
        Zamorakian_spear(11824,8, "Melee", "Zamorakian spear"),
        Dragon_hunter_lance(22978,8, "Melee", "Dragon hunter lance"),  //NOVO
        Hydras_claw(22966,15, "Melee", "Hydra's claw"),                //NOVO
        Brimstone_ring(22975,8, "Melee", "Brimstone ring"),            //NOVO
        Hydra_leather(22983,15, "Melee", "Hydra leather"),             //NOVO
        Granite_hammer(21742,8, "Melee", "Granite hammer"),            //NOVO
        Granite_boots(21643,70, "Melee", "Granite boots"),             //NOVO
        Saradomin_godsword(11806,8, "Melee", "Saradomin godsword"), 
        Armadyl_godsword(11802,8, "Melee", "Armadyl godsword"), 
        Dragon_warhammer(13576,8, "Melee", "Dragon warhammer"), 
        Berserker_ring(6737,8, "Melee", "Berserker ring"), 
        Dragonfire_shield(11284,8, "Melee", "Dragonfire shield"),
        Draconic_visage(11286,5, "Melee", "Draconic visage"),                //NOVO
        Spectral_spirit_shield(12821,8, "Melee", "Spectral spirit shield"), //NOVO
        Elysian_spirit_shield(12817,8, "Melee", "Elysian spirit shield"),   //NOVO
        Black_mask(8901,70, "Melee", "Black mask (10)"),                     //NOVO
        
        
        //Guthans
        Guthans_platebody(4728,10, "Guthans", "Guthan's platebody"),
        Guthans_warspear(4726,10, "Guthans", "Guthan's warspear"),
        Guthans_helm(4724,10, "Guthans", "Guthan's helm"),
        Guthans_chainskirt(4730,10, "Guthans", "Guthan's chainskirt"),
        Guthans_set(12873,8, "Guthans", "Guthan's armour set"),       
        
        //Dharok
        Dharoks_platebody(4720,10, "Dharok", "Dharok's platebody"), 
        Dharoks_greataxe(4718,10, "Dharok", "Dharok's greataxe"), 
        Dharoks_helm(4716,10, "Dharok", "Dharok's helm"),
        Dharoks_platelegs(4722,10, "Dharok", "Dharok's platelegs"), 
        Dharoks_armour_set(12877,8, "Dharok", "Dharok's armour set");

        
        private final int id;
        private final int limit;
        private final String folder;
        private final String iconname;
        private final ImageView ikonica;
        
   
        EnumData(int id, int limit, String folder, String iconname) {
            this.id = id;
            this.limit = limit;
            this.folder = folder;
            this.iconname = iconname;
            
            ImageView tempikonica = null;
            
            try {
                URL url = getClass().getResource("/extractor/slike/"+ folder +"/"+ iconname+ ".png");
                tempikonica = new ImageView(new Image(url.toURI().toString()));            
            } 
            catch (URISyntaxException ex) {
                Logger.getLogger(EnumData.class.getName()).log(Level.SEVERE, null, ex);
            }
            ikonica = tempikonica;
        }

        
        public int getId() {
            return id;
        }

        public int getLimit() {
            return limit;
        }

        public String getFolder() {
            return folder;
        }

        public String getIconname() {
            return iconname;
        }

        public ImageView getIkonica() {
            return ikonica;
        }

        
        
}

