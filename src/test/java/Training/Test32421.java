package Training;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test32421 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/yaseensuliman/Desktop/Maven_Automation_2021/src/main/resources/chromedriver");


        ChromeOptions options = new ChromeOptions();

        options.addArguments("start-maximized");//maximize browser
        options.addArguments("incognito");//open in incognito mode

        ChromeDriver driver = new ChromeDriver(options);

        String[] mystring = new String[3];
        mystring[0] = "Mohammed";
        mystring[1] = "Zohira";
        mystring[2] = "Ali";

        for (int i = 0; i < mystring.length; i++) {


            driver.navigate().to("http://demo.automationtesting.in/Register.html");
            driver.findElement(By.xpath("//*[@placeholder= 'First Name']")).sendKeys(mystring[i]);
            driver.findElement(By.xpath("//*[@placeholder= 'Last Name']")).sendKeys("Suliman");
            driver.findElement(By.xpath("//input[@type= 'email']")).sendKeys("mysuliman@gmail.com");
            driver.findElement(By.xpath("//textarea[@rows= '3']")).sendKeys("15290 Serenade ln Fontana, CA");
            driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("714-232-3673");
            driver.findElement(By.xpath("//input[@type='tel']")).clear();
            Thread.sleep(3000);





            driver.close();


        }

        }//end of main

    }//End of Java


