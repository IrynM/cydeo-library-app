package com.cydeo.library.apachiTest;

import com.cydeo.library.pages.LogIn;
import com.cydeo.library.utilities.ConfigurationReader;
import com.cydeo.library.utilities.Driver;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;

public class Read_fromExcel {

    LogIn logIn= new LogIn();

@Test
    public void logInWithApachePOIexcelFile () throws IOException {
    String path = "CydeoLibrary_POI.xlsx";

    File file = new File(path);

    FileInputStream fileInputStream= new FileInputStream(file);

    XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);

    XSSFSheet sheet = workbook.getSheet("Sheet1");



    Driver.getDriver().get(ConfigurationReader.getProperty("URL"));
    System.out.println("sheet.getRow(0). getCell(1) = " + sheet.getRow(0).getCell(1));
   sheet.getRow(0).getCell(1).getCellComment();
    logIn.emailInput.sendKeys();


//    int usedRows = sheet.getPhysicalNumberOfRows();
//    System.out.println(usedRows);


   // logIn.emailInput.sendKeys(sheet.getRow());




}
}
