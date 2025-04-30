package extractor.excel;

import extractor.model.ItemIndicators;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.ObservableList;
import javax.swing.JOptionPane;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;


public class ExcelFile {
   
    private FileInputStream file;
    private Workbook book;
    private Sheet sheet;
    private Row first_row;
    private FileOutputStream save;
    private static final Path DEST_PATH = Paths.get(System.getProperty("user.home"), "Desktop", "Runescape prices.xlsx");
    private static final String DEST = DEST_PATH.toString();
    private static final String TEMPLATE = System.getProperty("user.dir") + "/src/extractor/excel/Template.xlsx";
    private int counter = 2;
    private CellStyle pricestyle, datestyle, timestyle;
    private DataFormat format;
    
    
    private void loadFile() {
        try {    
            //If the file does not exist, it creates it from the template file on the desktop
            if(!(new File(DEST).exists())){
                file = new FileInputStream(new File(TEMPLATE));
            }
            else {
                file = new FileInputStream(new File(DEST));
            }
            
            book = new XSSFWorkbook(file);
        }
        catch (FileNotFoundException ex) {
               //If there is a file in this location, then you should close the file first
               if(new File(DEST).exists()) {
                  JOptionPane.showMessageDialog(null, "File named: "+new File(DEST).getName()
                          +" need to be closed in order to save data."
                          + "\nClose it and try again.","WARNING",JOptionPane.WARNING_MESSAGE);
               }
        } 
        catch (IOException ex) {
            Logger.getLogger(ExcelFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void closeFile(){
        try {
            file.close();                           
            save = new FileOutputStream(new File(DEST)); 
            book.write(save); 
            save.close();
        } catch (IOException ex) {
            Logger.getLogger(ExcelFile.class.getName()).log(Level.SEVERE, null, ex);
        }     
    }
    
    
    public ExcelFile(ObservableList<ItemIndicators> lista, String sheetName, Date datum) {
        
            loadFile();         
            
            sheet = book.getSheet(sheetName);     
            first_row = sheet.createRow(sheet.getLastRowNum()+ 1);
            format = book.createDataFormat();
            pricestyle = book.createCellStyle();
            datestyle = book.createCellStyle();   
            timestyle = book.createCellStyle();
            
            pricestyle.setAlignment(HorizontalAlignment.CENTER);
            datestyle.setAlignment(HorizontalAlignment.CENTER);
            timestyle.setAlignment(HorizontalAlignment.CENTER);
            
            datestyle.setDataFormat(format.getFormat("dd.MM.yyyy"));
            timestyle.setDataFormat(format.getFormat("HH:mm:ss"));

            first_row.createCell(0).setCellValue(datum);
            first_row.createCell(1).setCellValue(datum);
            
            first_row.getCell(0).setCellStyle(datestyle); 
            first_row.getCell(1).setCellStyle(timestyle); 
            
            pricestyle.setDataFormat(format.getFormat("#,##0;#,##0;-"));
                    
                for(int i=0; i < lista.size(); i++){
                        first_row.createCell(counter).setCellValue(lista.get(i).getBuyingPrice());
                        first_row.getCell(counter).setCellStyle(pricestyle);     
                        counter++;
                        first_row.createCell(counter).setCellValue(lista.get(i).getSellingPrice());
                        first_row.getCell(counter).setCellStyle(pricestyle);     
                        counter++;
                        first_row.createCell(counter).setCellValue(lista.get(i).getGePrice());
                        first_row.getCell(counter).setCellStyle(pricestyle);     
                        counter++;
                }
            
            closeFile();      
    }
}

    


   

    

