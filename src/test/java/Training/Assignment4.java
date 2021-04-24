package Training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.sql.SQLOutput;

public class Assignment4 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/yaseensuliman/Desktop/Maven_Automation_2021/src/main/resources/chromedriver");
        ChromeOptions options = new ChromeOptions();

        //Browser will open with following conditions
        options.addArguments("start-maximized");//maximize browser
        options.addArguments("incognito");//open in incognito mode

        ChromeDriver driver = new ChromeDriver(options);

        String realTitle = driver.getTitle();
        String myTitle = "Auto Loan Calulator";

        if(realTitle.equals(myTitle)){
            System.out.println("The title is correct");
        }else{
            System.out.println("The tile is incorrect");
        }


        String[] purchasePrice = new String[]{"100000", "150000", "200000"};
        String[] downPmt = new String[]{"10000", "15000", "20000"};
        String[] mortgageTerm = new String[]{"10", "15", "20"};
        String[] IntRate = new String[]{"3", "2", "1"};
        String[] pmi = new String[]{"0.40", "0.45", ".50"};
        String[] startMonth = new String[]{"Jun", "Jul", "Aug"};
        String[] startYear = new String[]{"2022", "2023", "2024"};

        for (int i = 0; i < purchasePrice.length; i++) {

            driver.navigate().to("https://www.mlcalc.com/");

            WebElement pp = driver.findElement(By.xpath("//input[@id='ma']"));
            pp.clear();
            pp.sendKeys(purchasePrice[i]);
            WebElement dp = driver.findElement(By.xpath("//input[@id='dp']"));
            dp.clear();
            dp.sendKeys(downPmt[i]);
            WebElement mt = driver.findElement(By.xpath("//input[@id='mt']"));
            mt.clear();
            mt.sendKeys(mortgageTerm[i]);
            WebElement ir = driver.findElement(By.xpath("//input[@id='ir']"));
            ir.clear();
            ir.sendKeys(IntRate[i]);
            WebElement pm = driver.findElement(By.xpath("//input[@id='mi']"));
            pm.clear();
            pm.sendKeys(pmi[i]);

            WebElement month=driver.findElement(By.xpath("//select[@name='sm']"));
            Select dropdown1=new Select(month);
            dropdown1.selectByVisibleText(startMonth[i]);

            WebElement year=driver.findElement(By.xpath("//select[@name='sy']"));
            Select dropdown2=new Select(year);
            dropdown2.selectByVisibleText(startYear[i]);

            driver.findElement(By.xpath("//input[@type='submit']")).click();

            String result=driver.findElements(By.xpath("//td[@class='big']")).get(0).getText();

            System.out.println(result);



        }//End of for loop


    }//End of main



}// end of class
