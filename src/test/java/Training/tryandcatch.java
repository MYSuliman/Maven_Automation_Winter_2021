package Training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;

public class tryandcatch {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/yaseensuliman/Desktop/Maven_Automation_2021/src/main/resources/chromedriver");
        ChromeOptions options = new ChromeOptions();

        ChromeDriver driver = new ChromeDriver(options);

        //kill all chrome instances that are opened
        //Runtime.getRuntime().exec("taskkill /F /IM chromedriver /T");
        //set the path to the driver
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        //define the chromeoptions arguments
        ChromeOptions options1 = new ChromeOptions();
        //maximize my driver
        options.addArguments("start-maximized");
        //set the driver to incognito(private)
        options.addArguments("incognito");
        //set it to headless
        //options.addArguments("headless");
        //define the webdriver
        WebDriver driver1 = new ChromeDriver(options);

        //navigate to bing home page
        try {
            driver.navigate().to("https://www.bing.com");
        } catch (Exception e) {
            System.out.println("Unable to navigate to bing. " + e);
        }//end of navigate exception

        Thread.sleep(2500);

        //enter a keyword on search field
        try{
            driver.findElement(By.xpath("//*[@name='q']")).sendKeys("Cars");
        } catch (Exception e) {
            System.out.println("Unable to enter keyword on Search field. " + e);
        }//end of search exception

        //click on search icon
        try{
            driver.findElement(By.xpath("//*[@for='sb_form_go']")).click();
        } catch (Exception e) {
            System.out.println("Unable to click on search icon. " + e);
        }//end of search icon exception
    }



}
