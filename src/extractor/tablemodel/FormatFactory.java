
package extractor.tablemodel;

import java.text.DecimalFormat;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.util.Callback;


public class FormatFactory <S, T extends Number> implements Callback<TableColumn<S, T>, TableCell<S, T>> {

    private DecimalFormat format;
    private boolean isdash = false;

    public FormatFactory(DecimalFormat format, boolean isdash) {
        super();
        this.format = format;
        this.isdash = isdash;
    }

    public boolean isIsdash() {
        return isdash;
    }
    
    public String getModifiedPrice(String price){
        String xprice;
        
        if(price.equals("0")){
           xprice = "-"; 
        }
        else
           xprice = price;
        
        return xprice;   
    }
    
 		
    @Override
    public TableCell<S, T> call(TableColumn<S, T> param) {
        return new TableCell<S, T>() {

            @Override
            protected void updateItem(T item, boolean empty) {
                if (!empty && item != null) {
                    if(isIsdash() == true){
                        setText(getModifiedPrice(format.format(item.doubleValue())));
                    }
                    else {
                        setText(format.format(item.doubleValue()));
                    }
                } 
                else {
                    setText("");
                }
            }
        };
    }
}    

