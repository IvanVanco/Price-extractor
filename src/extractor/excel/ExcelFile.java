package extractor.excel;

import extractor.model.ItemIndicators;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
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
   
    private FileInputStream fajl;
    private Workbook book;
    private Sheet strana;
    private Row prvi_red;
    private FileOutputStream save;
    private static final String DEST = "D:/User files/Desktop/Runescape prices.xlsx";
    //private static final String TEMPLATE = System.getProperty("user.home") + "/Documents/Price extractor/src/extractor/excel/Template.xlsx";
    private static final String TEMPLATE = System.getProperty("user.dir") + "/src/extractor/excel/Template.xlsx";
    private int brojac = 2;
    private CellStyle pricestyle, datestyle, timestyle;
    private DataFormat format; 
    
    
    private void ucitavanjeFajla() {
        try {    
            //Ako ne postoji fajl kreira ga od template fajla na desktopu
            if(!(new File(DEST).exists())){
                fajl = new FileInputStream(new File(TEMPLATE));
            }
            else {
                fajl = new FileInputStream(new File(DEST)); //Ucitavanje fajla
            }
            
            book = new XSSFWorkbook(fajl);             //Ucitavanje booka
        }
        catch (FileNotFoundException ex) {
               //Ako postoji fajl na ovoj lokaciji, onda treba zatvoriti fajl prvo
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
    
    private void zatvaranjeFajla(){
        try {
            fajl.close();                           
            save = new FileOutputStream(new File(DEST)); 
            book.write(save); 
            save.close();
        } catch (IOException ex) {
            Logger.getLogger(ExcelFile.class.getName()).log(Level.SEVERE, null, ex);
        }     
    }
    
    
    public ExcelFile(ObservableList<ItemIndicators> lista, String sheetName, Date datum) {
        
            ucitavanjeFajla();         
            
            strana = book.getSheet(sheetName);    //Ucitavanje sheeta za menjanje     
            prvi_red = strana.createRow(strana.getLastRowNum()+ 1);
            format = book.createDataFormat();
            pricestyle = book.createCellStyle();
            datestyle = book.createCellStyle();   
            timestyle = book.createCellStyle();
            
            pricestyle.setAlignment(HorizontalAlignment.CENTER);
            datestyle.setAlignment(HorizontalAlignment.CENTER);
            timestyle.setAlignment(HorizontalAlignment.CENTER);
            
            datestyle.setDataFormat(format.getFormat("dd.MM.yyyy"));
            timestyle.setDataFormat(format.getFormat("HH:mm:ss"));      //Styles

            prvi_red.createCell(0).setCellValue(datum); //Datum
            prvi_red.createCell(1).setCellValue(datum); //Vreme
            
            prvi_red.getCell(0).setCellStyle(datestyle); 
            prvi_red.getCell(1).setCellStyle(timestyle); 
            
            pricestyle.setDataFormat(format.getFormat("#,##0;#,##0;-"));
                    
                for(int i=0; i < lista.size(); i++){
                        prvi_red.createCell(brojac).setCellValue(lista.get(i).getBuyingPrice());
                        prvi_red.getCell(brojac).setCellStyle(pricestyle);     
                        brojac++;
                        prvi_red.createCell(brojac).setCellValue(lista.get(i).getSellingPrice());
                        prvi_red.getCell(brojac).setCellStyle(pricestyle);     
                        brojac++;
                        prvi_red.createCell(brojac).setCellValue(lista.get(i).getGePrice());
                        prvi_red.getCell(brojac).setCellStyle(pricestyle);     
                        brojac++;
                }
            
            zatvaranjeFajla();      
    }
}

    


   

    

