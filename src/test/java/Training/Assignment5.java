package Training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;

public class Assignment5 {
    public static void main(String[] args) throws InterruptedException {
        //kill all chrome instances that are opened
        //for windows
        //Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
        //for mac
        //Runtime.getRuntime().exec("killall -KILL chromedriver");
        Thread.sleep(1000);
        //set the path to the driver
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        //define the chromeoptions arguments
        ChromeOptions options = new ChromeOptions();
        //maximize my driver
        options.addArguments("start-maximized");
        //set the driver to incognito(private)
        options.addArguments("incognito");
        //set it to headless
        //options.addArguments("headless");
        //define the webdriver
        WebDriver driver = new ChromeDriver(options);
        Actions mouseaction = new Actions(driver);


        // First thing we need to do is create an array list

        ArrayList<String> locatioinbyZip = new ArrayList<>();
        locatioinbyZip.add("92336");
        locatioinbyZip.add("91711");
        locatioinbyZip.add("91786");

        ArrayList<String> locationtype = new ArrayList<>();
        locationtype.add("Collection Boxes");
        locationtype.add("Self-Service Kiosks");
        locationtype.add("National Retailer");

        ArrayList<String> locationMiles = new ArrayList<>();
        locationMiles.add("20 Miles");
        locationMiles.add("25 Miles");
        locationMiles.add("10 Miles");

        for (int i = 0; i < locatioinbyZip.size(); i++) {

            //navigate to usps and verify title
            driver.navigate().to("https://www.usps.com/");
            String actualTitle = driver.getTitle();

            if (actualTitle.equals("Welcome | USPS")) {
                System.out.println("The titles match!");
            } else {
                System.out.println("The titles do not match");
            }

            //hover to send tab
            WebElement send = driver.findElement(By.xpath("//a[@id='mail-ship-width']"));
            mouseaction.moveToElement(send).perform();

            //click on find USPS locations. this is correct
            WebElement findusps = driver.findElement(By.xpath("//a[contains(text(),'Find USPS Locations')]"));
            mouseaction.moveToElement(findusps).click().perform();

            //enter location zip code. this is correct
            WebElement location = driver.findElement(By.id("city-state-input"));
            mouseaction.moveToElement(location).click().sendKeys(locatioinbyZip.get(i)).perform();


            // enter location type

            WebElement locType = driver.findElement(By.id("post-offices-select"));
            mouseaction.moveToElement(locType).click().perform();

            WebElement loclalist = driver.findElement(By.xpath("//*[text()='" + locationtype.get(i) + "']"));
            mouseaction.moveToElement(loclalist).click().perform();

            //miles

            WebElement miles = driver.findElement(By.id("within-select"));
            mouseaction.moveToElement(miles).click().perform();

            WebElement withinlist = driver.findElement(By.xpath("//*[text()='" + locationMiles.get(i) + "']"));
            mouseaction.moveToElement(withinlist).click().perform();

            //click search button
            WebElement seachButton = driver.findElement(By.id("searchLocations"));
            mouseaction.moveToElement(seachButton).click().perform();

            //creating an array list for the results and loping them

            try{


            ArrayList<WebElement> links = new ArrayList<>(driver.findElements(By.xpath("//div[@class='list-item-location popover-trigger']")));

            if (i==0){
                links.get(0).click();

            }else if (i==1) {
                links.get(1).click();}

            else if (i == 2){
                links.get(2).click();}}
            catch (Exception z){
                System.out.println("Error:"+ z);

            }

            try {
                String address = driver.findElement(By.xpath("//div[@class='address-wrapper']")).getText();
                System.out.println("For zip code " + locatioinbyZip.get(i) + ", The address is" + address);}
            catch ( Exception aa){
                System.out.println("Error"+ aa);
            }

            try {
                String hours = driver.findElement(By.xpath("//div[@class='hours-flex-section']")).getText();
                System.out.println(hours); }
            catch (Exception bb){
                System.out.println("Error"+ bb);
            }


        }//End of loop


    }//end of main method

}//end of java class
