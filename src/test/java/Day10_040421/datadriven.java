package Day10_040421;

import DAY9_040221.Reusable_Methods;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class datadriven {

    public static void main(String[] args) throws IOException, InterruptedException, BiffException, WriteException {
        //set the driver using the resuable method
        WebDriver driver = Reusable_Methods.defineTheDriver();

        //Step 1 :locate the path for the readable file that we created in excel
        Workbook readableBook = Workbook.getWorkbook(new File("src/main/resources/Mlcalc_DataDriven.xls"));

        //Step 3: Create a writeable book  that will mimic the data from
        WritableWorkbook writableWorkbook = Workbook.createWorkbook(new File("src/main/resources/MlCalc_DataDriven.xls_Result"),readableBook);

        //read everything from writeable sheet
        WritableSheet writableSheet = writableWorkbook.getSheet(0);

        //Step 4: get the row count
        int rowcont = writableSheet.getRows();

        //This is where the loop will start
        for(int i = 1; i < rowcont; i++) {
            //columns are hard coded and the row is dynamic()
            String pPrice = writableSheet.getCell(0, i).getContents();
            String dPayment = writableSheet.getCell(1, i).getContents();
            String mTerm = writableSheet.getCell(2, i).getContents();
            String iRate = writableSheet.getCell(3, i).getContents();
            String stMonth = writableSheet.getCell(4, i).getContents();
            String stYear = writableSheet.getCell(5, i).getContents();

            //navigate to mlcalc

            driver.navigate().to("https://www.mlcalc.com/");
            Thread.sleep(3000);
            //enter the purchase price
            Reusable_Methods.sendKeysMethod(driver, "//input[@id='ma']", pPrice, "Purchase Price");
            //enter downPayment
            Reusable_Methods.sendKeysMethod(driver, "//input[@id='dp']", dPayment, "Down Payment");
            //Enter Term
            Reusable_Methods.sendKeysMethod(driver, "//input[@id='mt']", mTerm, "Mortgage Term");
            //Enter interest rate
            Reusable_Methods.sendKeysMethod(driver, "//input[@id='ir']", iRate, "Interest Rate");
            //Select Start Month
            Reusable_Methods.dropDownByText(driver, "//select[@name='sm']", stMonth, "Start Month");
            //Select Start Year
            Reusable_Methods.dropDownByText(driver, "//select[@name='sy']", stYear, "Start Year");
            //Click on Calculate
            Reusable_Methods.clickOnElement(driver, "//input[@value='Calculate']", "Calculate");

            //capture monthly payment
            String monthlyPayment = Reusable_Methods.captureText(driver,"//td[@class='big']",0, "Monthly Payment");

            //create a label so you can add it to a cell
            Label label = new Label(6,i,monthlyPayment);
            //add the label back to the sheet
            writableSheet.addCell(label);

        }// end of loop

        //outside of the cell write back to writeable workbook

        writableWorkbook.write();
        //close it
        writableWorkbook.close();









    }//end of main method
}//end of class
