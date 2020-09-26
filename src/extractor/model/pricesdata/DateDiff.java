package extractor.model.pricesdata;

import java.util.Date;
import java.util.GregorianCalendar;

public class DateDiff {
    private final Date start = new GregorianCalendar(2017, 10, 28, 00, 00).getTime();
    private Date danas = new Date();
    private long diff_sec = danas.getTime() - start.getTime();
    private long diff_day = diff_sec / (1000 * 60 * 60 * 24);                                                           
    private final long daytime_diff = 86400000L;
    private long time_sec = 1511827200000L + (daytime_diff * diff_day);
      
    public long getTodayTime(){
        return time_sec; 
     }
    
    public long getYesturdayTime(){
        return time_sec - 86400000L; 
     }     
}
