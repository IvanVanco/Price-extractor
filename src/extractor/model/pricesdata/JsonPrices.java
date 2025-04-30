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
    private static final String URL_RNL = "https://prices.runescape.wiki/api/v1/osrs/latest";
    private static final String BASE_URL_GE = "https://services.runescape.com/m=itemdb_oldschool/api/graph/"; 
    private DateDiff diff = new DateDiff(); 
       
  
    public int[] JsonRuneLite(int ID){
       
        int[] prices = new int[2];
        int buying=0;
        int selling=0;
        URL url;
        
        try {
            url = new URL(URL_RNL);
            HttpURLConnection request = (HttpURLConnection) url.openConnection();
            request.setRequestMethod("GET");
            request.setRequestProperty("User-Agent", "RuneLite-DataFetcher/1.0");
            request.setRequestProperty("Accept", "application/json");
            request.connect();
            
            JsonParser jp = new JsonParser(); 
            JsonElement root;
            root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
            
            JsonObject rootobj = root.getAsJsonObject();
            JsonObject data = rootobj.getAsJsonObject("data");
            JsonObject item = data.getAsJsonObject(String.valueOf(ID));

            buying = item.get("high").getAsInt();
            selling = item.get("low").getAsInt();
            prices[0] = buying;
            prices[1] = selling;
        }
        catch (MalformedURLException ex) {
            Logger.getLogger(JsonPrices.class.getName()).log(Level.SEVERE, null, ex);
        } 
        catch (IOException ex) {
            Logger.getLogger(JsonPrices.class.getName()).log(Level.SEVERE, null, ex);
        }
            return prices;
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
            
            //After some time of continuous extraction, the osrs api kicks us
            //and this condition is to return ge price 0, as an inactive price
            if(!(root.isJsonNull())){
                JsonObject rootobj = root.getAsJsonObject();
                JsonElement today = rootobj.getAsJsonObject("daily").get(String.valueOf(diff.getTodayTime()));
                JsonElement yesturday = rootobj.getAsJsonObject("daily").get(String.valueOf(diff.getYesturdayTime()));
                
                //The server is sometimes late in releasing today's results
                if(today!=null){
                    ge = today.getAsInt();
                }
                else {
                    ge = yesturday.getAsInt();
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

