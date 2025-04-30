
package extractor.tablemodel;


import extractor.model.ItemIndicators;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;


public class ColumnResizer {
    
    private TableView<ItemIndicators> table;
    private TableColumn column;

    
    public ColumnResizer(TableView<ItemIndicators> table, TableColumn column){
        this.table = table;
        this.column = column;
        resizeColumnToFitContent();
    }
    
    public ColumnResizer(TableView<ItemIndicators> table, TableColumn column, double size){
        this.table = table;
        this.column = column;
        this.column.setPrefWidth(size * 9);
    }

    
    private void resizeColumnToFitContent(){
        int header = column.getText().length();
        int prefwidth = (int) (header <=6? header: header/1.3);
        int inumber;
        double dnumber;
        for(int i=0; i < table.getItems().size(); i++){
            
            Object value = column.getCellData(i);
            if(value instanceof String) {
               inumber = (int) ((((String) value).length())/1.3);
               if(inumber > prefwidth)
                    prefwidth = inumber;
            }
            else if(value instanceof Integer){
                inumber = Math.abs((Integer) value);
                int length = 0;
                long temp = 1;
                while(temp <= inumber){
                    length++;
                    temp *= 10;
                }
                if(length > prefwidth)
                    prefwidth = length;
            }
            else { 
                prefwidth = 5;
                break;
            } 
        }
        column.setPrefWidth(prefwidth * 9);
    }
    
    
}
