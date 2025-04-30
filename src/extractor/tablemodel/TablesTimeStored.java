package extractor.tablemodel;

import java.sql.Timestamp;
import java.util.Date;

public class TablesTimeStored {
            
    private static Date revenants_time, zulrah_time, farming_time, potions_time, melee_time, ranged_time, magic_time, raids1_time, raids2_time,
            food_time, guthans_time, dharok_time, res_time, ammo_time, telruns_time, treasure_time, other_time;

    

    
    private static Timestamp getCurrentTime(){
        return new Timestamp(System.currentTimeMillis());    
    }
    
    public static Date getRevenantsTime() {
        return revenants_time;
    }
    
    public static void setRevenantsTime() {
        revenants_time = getCurrentTime();
    }
    
    public static Date getZulrahTime() {
        return zulrah_time;
    }

    public static void setZulrahTime() {
        zulrah_time = getCurrentTime();
    }

    public static Date getFarmingTime() {
        return farming_time;
    }

    public static void setFarmingTime() {
        farming_time = getCurrentTime();
    }

    public static Date getPotionsTime() {
        return potions_time;
    }

    public static void setPotionsTime() {
        potions_time = getCurrentTime();
    }

    public static Date getMeleeTime() {
        return melee_time;
    }

    public static void setMeleeTime() {
        melee_time = getCurrentTime();
    }

    public static Date getRaids1Time() {
        return raids1_time;
    }
    
    public static void setRaids1Time() {
        raids1_time = getCurrentTime();
    }
    
    public static Date getRaids2Time() {
        return raids2_time;
    }
    
    public static void setRaids2Time() {
        raids2_time = getCurrentTime();
    }
    
    public static Date getRangedTime() {
        return ranged_time;
    }

    public static void setRangedTime() {
        ranged_time = getCurrentTime();
    }

    public static Date getMagicTime() {
        return magic_time;
    }

    public static void setMagicTime() {
        magic_time = getCurrentTime();
    }

    public static Date getFoodTime() {
        return food_time;
    }

    public static void setFoodTime() {
        food_time = getCurrentTime();
    }

    public static Date getGuthansTime() {
        return guthans_time;
    }

    public static void setGuthansTime() {
        guthans_time = getCurrentTime();
    }

    public static Date getDharokTime() {
        return dharok_time;
    }

    public static void setDharokTime() {
        dharok_time = getCurrentTime();
    }

    public static Date getResTime() {
        return res_time;
    }

    public static void setResTime() {
        res_time = getCurrentTime();
    }

    public static Date getAmmoTime() {
        return ammo_time;
    }

    public static void setAmmoTime() {
        ammo_time = getCurrentTime();
    }

    public static Date getTelrunsTime() {
        return telruns_time;
    }

    public static void setTelrunsTime() {
        telruns_time = getCurrentTime();
    }
    
    public static Date getTreasureTime() {
        return treasure_time;
    }
    
    public static void setTreasureTime() {
        treasure_time = getCurrentTime();
    }
    
    public static Date getOtherTime() {
        return other_time;
    }

    public static void setOtherTime() {
        other_time = getCurrentTime();
    }   
    
}
