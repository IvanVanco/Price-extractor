package extractor.model.pricesdata;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JsonPrices {
    //depreciated
    //private static final String BASE_URL_OSB = "https://api.rsbuddy.com/grandExchange?a=guidePrice&i=";
    private static final String URL_OSB = "https://rsbuddy.com/exchange/summary.json";
    private static final String BASE_URL_GE = "https://services.runescape.com/m=itemdb_oldschool/api/graph/"; 
    private DateDiff diff = new DateDiff(); 
       
  
    public int[] JsonOSBuddy(int ID){
       
        int[] cene = new int[2];
        int buying=0;
        int selling=0;
        URL url;
        
        try {
            url = new URL(URL_OSB);
            HttpURLConnection request = (HttpURLConnection) url.openConnection();
            request.connect();
            
            JsonParser jp = new JsonParser(); 
            JsonElement root;
            root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
            
            //SVI ITEMI U .JSON FORMATU
            JsonObject rootobj = root.getAsJsonObject();
            //SAMO ITEM SA ID 
            JsonObject item = rootobj.getAsJsonObject(String.valueOf(ID));

            buying = item.get("buy_average").getAsInt();
            selling = item.get("sell_average").getAsInt();
            cene[0] = buying;
            cene[1] = selling;
        }
        catch (MalformedURLException ex) {
            Logger.getLogger(JsonPrices.class.getName()).log(Level.SEVERE, null, ex);
        } 
        catch (IOException ex) {
            Logger.getLogger(JsonPrices.class.getName()).log(Level.SEVERE, null, ex);
        }
            return cene;
}
    
    public int JsonGE(int ID){
        
        URL url;
        int ge=0;
        try {
            url = new URL(BASE_URL_GE+ID+".json");
            HttpURLConnection request = (HttpURLConnection) url.openConnection();
            request.connect();

            JsonParser jp = new JsonParser(); 
            JsonElement root;
            
            root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
            //root = jp.parse(new InputStreamReader(request.getInputStream()));
            
            //Posle nekog vremena neprekidnog extractovanja osrs api nas kickuje
            //i ovaj uslov je da nam vrati ge price 0,kao inactive price
            if(!(root.isJsonNull())){
                JsonObject rootobj = root.getAsJsonObject();
                JsonElement danas = rootobj.getAsJsonObject("daily").get(String.valueOf(diff.getTodayTime()));
                JsonElement juce = rootobj.getAsJsonObject("daily").get(String.valueOf(diff.getYesturdayTime()));
                
                //Server nekada kasni sa izbacivanjem rezultata za danas
                if(danas!=null){
                    ge = danas.getAsInt();
                }
                else {
                    ge = juce.getAsInt();
                }        
                }
            else {
                ge = 0;
            }
        }
        catch (MalformedURLException ex) {
            Logger.getLogger(JsonPrices.class.getName()).log(Level.SEVERE, null, ex);
        } 
        catch (IOException ex) {
            Logger.getLogger(JsonPrices.class.getName()).log(Level.SEVERE, null, ex);
        } 
            return ge;
    }
   
}

