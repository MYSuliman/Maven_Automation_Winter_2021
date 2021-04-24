package Training;

import DAY9_040221.Reusable_Methods;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;

public class Express_Actionitem {
    public static void main(String[] args) throws IOException, InterruptedException, BiffException {

        //set the driver using the resuable method
        WebDriver driver = Reusable_Methods.defineTheDriver();

        //Step 1 :locate the path for the readable file that we created in excel
        Workbook readableBook = Workbook.getWorkbook(new File("src/main/resources/Mlcalc_DataDriven.xls"));

        //Step 3: Create a writeable book  that will mimic the data from
        WritableWorkbook writableWorkbook = Workbook.createWorkbook(new File("src/main/resources/Express_DataDriven.xls_Result"),readableBook);;

        //read everything from writeable sheet
        WritableSheet writableSheet = writableWorkbook.getSheet(0);

        //Step 4: get the row count
        int rowcont = writableSheet.getRows();

        //This is where the loop will start
        for(int i = 1; i < rowcont; i++){
            String cSize = writableSheet.getCell(0, i).getContents();
            String qty = writableSheet.getCell(1, i).getContents();
            String fName = writableSheet.getCell(2, i).getContents();
            String lName = writableSheet.getCell(3, i).getContents();
            String eMail = writableSheet.getCell(4, i).getContents();
            String phoneNum = writableSheet.getCell(5, i).getContents();
            String stAddress = writableSheet.getCell(6, i).getContents();
            String zCode = writableSheet.getCell(7, i).getContents();
            String city = writableSheet.getCell(8, i).getContents();
            String state = writableSheet.getCell(9, i).getContents();
            String ccNumber = writableSheet.getCell(10, i).getContents();
            String expMonth = writableSheet.getCell(11, i).getContents();
            String expYear = writableSheet.getCell(12,i).getContents();

            //Navigate to Express.com
            driver.navigate().to("https://www.express.com/");
            Thread.sleep(3000);

            //Close the pop up
            Reusable_Methods.clickOnElement(driver, "//button[@id='closeModal']", "Close");













        }




    }
}
