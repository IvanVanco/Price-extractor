
package extractor.tablemodel;


import extractor.model.ItemIndicators;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;


public class ColumnResizer {
    
    private TableView<ItemIndicators> tabela;
    private TableColumn kolona;

    
    public ColumnResizer(TableView<ItemIndicators> tabela, TableColumn kolona){
        this.tabela = tabela;
        this.kolona = kolona;
        resizeColumnToFitContent();
    }
    
    public ColumnResizer(TableView<ItemIndicators> tabela, TableColumn kolona, double size){
        this.tabela = tabela;
        this.kolona = kolona;
        this.kolona.setPrefWidth(size * 9);
    }

    
    private void resizeColumnToFitContent(){
        int header = kolona.getText().length();
        int prefwidth = (int) (header <=6? header: header/1.3);
        int inumber;
        double dnumber;
        for(int i=0; i < tabela.getItems().size(); i++){
            
            Object value = kolona.getCellData(i);
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
                prefwidth = 5;   //Ako je value double
                break;
            } 
        }
        kolona.setPrefWidth(prefwidth * 9);
    }
    
    
}
