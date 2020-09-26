package extractor.tablemodel;

import java.sql.Timestamp;
import java.util.Date;

public class TablesTimeStored {
            
    private static Date revenantsTime, zulrahTime, farmingTime, potionsTime, meleeTime, rangedTime, magicTime, raids1Time, raids2Time,
            foodTime, guthansTime, dharokTime, resTime, ammoTime, telrunsTime, treasureTime, otherTime;

    

    
    private static Timestamp getCurrentTime(){
        return new Timestamp(System.currentTimeMillis());    
    }
    
    public static Date getRevenantsTime() {
        return revenantsTime;
    }
    
    public static void setRevenantsTime() {
        revenantsTime = getCurrentTime();
    }
    
    public static Date getZulrahTime() {
        return zulrahTime;
    }

    public static void setZulrahTime() {
        zulrahTime = getCurrentTime();
    }

    public static Date getFarmingTime() {
        return farmingTime;
    }

    public static void setFarmingTime() {
        farmingTime = getCurrentTime();
    }

    public static Date getPotionsTime() {
        return potionsTime;
    }

    public static void setPotionsTime() {
        potionsTime = getCurrentTime();
    }

    public static Date getMeleeTime() {
        return meleeTime;
    }

    public static void setMeleeTime() {
        meleeTime = getCurrentTime();
    }

    public static Date getRaids1Time() {
        return raids1Time;
    }
    
    public static void setRaids1Time() {
        raids1Time = getCurrentTime();
    }
    
    public static Date getRaids2Time() {
        return raids2Time;
    }
    
    public static void setRaids2Time() {
        raids2Time = getCurrentTime();
    }
    
    public static Date getRangedTime() {
        return rangedTime;
    }

    public static void setRangedTime() {
        rangedTime = getCurrentTime();
    }

    public static Date getMagicTime() {
        return magicTime;
    }

    public static void setMagicTime() {
        magicTime = getCurrentTime();
    }

    public static Date getFoodTime() {
        return foodTime;
    }

    public static void setFoodTime() {
        foodTime = getCurrentTime();
    }

    public static Date getGuthansTime() {
        return guthansTime;
    }

    public static void setGuthansTime() {
        guthansTime = getCurrentTime();
    }

    public static Date getDharokTime() {
        return dharokTime;
    }

    public static void setDharokTime() {
        dharokTime = getCurrentTime();
    }

    public static Date getResTime() {
        return resTime;
    }

    public static void setResTime() {
        resTime = getCurrentTime();
    }

    public static Date getAmmoTime() {
        return ammoTime;
    }

    public static void setAmmoTime() {
        ammoTime = getCurrentTime();
    }

    public static Date getTelrunsTime() {
        return telrunsTime;
    }

    public static void setTelrunsTime() {
        telrunsTime = getCurrentTime();
    }
    
    public static Date getTreasureTime() {
        return treasureTime;
    }
    
    public static void setTreasureTime() {
        treasureTime = getCurrentTime();
    }
    
    public static Date getOtherTime() {
        return otherTime;
    }

    public static void setOtherTime() {
        otherTime = getCurrentTime();
    }   
    
}
