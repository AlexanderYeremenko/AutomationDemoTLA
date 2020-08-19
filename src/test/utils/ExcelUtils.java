package utils;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

public class ExcelUtils {
    public static void main(String...args)throws IOException {
        FileInputStream fileInputStream = new FileInputStream("C:/Users/Alexander/Desktop/userData.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet  sheet = workbook.getSheet("Лист1");

//        Row row = sheet.getRow(1);
//        Cell cell = row.getCell(1);

        for(int i =0; i<2; i++ ){
            Row row = sheet.getRow(i);
            for (int j=0; j<5; j++){
                System.out.print(row.getCell(j)+ " | ");
                            }
            System.out.println();
        }
        int rowNum = sheet.getPhysicalNumberOfRows();
        for(int i =0; i<rowNum; i++ ){
            Row row = sheet.getRow(i);

            int cellCount = row.getPhysicalNumberOfCells();
            for (int j=0; j<cellCount; j++){
                System.out.print(row.getCell(j)+ " | ");

    }
}}}
//        Iterator<Row> rowIterator = sheet.iterator();

