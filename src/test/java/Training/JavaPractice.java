package Training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class JavaPractice {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/yaseensuliman/Desktop/Maven_Automation_2021/src/main/resources/chromedriver");
        ChromeOptions options = new ChromeOptions();

        //browser will open with the following conditions
        options.addArguments("start-maximized");
        options.addArguments("incognito");


        ChromeDriver driver = new ChromeDriver(options);

        String realTitle = driver.getTitle();
        String myTitle = "Auto Loan Calulator";

        if(realTitle.equals(myTitle)){
            System.out.println("The tile is correct");
        }else{
            System.out.println("The title is incorrect");
        }

        String[] firstName = new String[]{"Mohammed","Zohira"};
        String[] lastName = new String[]{"Suliman", "Mohammed"};
        String[] address = new String[]{"15920 Serenade Ln Fontana, CA 92336", "610 E 5th Street Brooklyn NY"};
        String[] email = new String[]{"mysuliman@gmail.com","zmohammed89@gmail.com"};
        String[] phone = new String[]{"714-232-3663", "347-622-6661"};
        String[] sk = new String[] {"Android", "Art Design"};

        for(int i = 0; i < firstName.length; i++){
            driver.navigate().to("http://demo.automationtesting.in/Register.html");

            WebElement fn = driver.findElement(By.xpath("//*[@placeholder='First Name']"));
            fn.sendKeys(firstName[i]);
            WebElement ln = driver.findElement(By.xpath("//*[@placeholder='Last Name']"));
            ln.sendKeys(lastName[i]);
            WebElement ad = driver.findElement(By.xpath("//textarea[@rows='3']"));
            ad.sendKeys(address[i]);
            WebElement em = driver.findElement(By.xpath("//input[@type='email']"));
            em.sendKeys(email[i]);
            WebElement skills = driver.findElement(By.xpath("//select[@id='Skills']"));
            Select dropdown1 = new Select(skills);
            dropdown1.selectByVisibleText(sk[i]);


























        }





























    }//end of main method
}//end of java class

