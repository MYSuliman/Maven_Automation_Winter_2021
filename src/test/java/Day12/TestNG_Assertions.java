package Day12;

import DAY9_040221.Reusable_Methods;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.IOException;

public class TestNG_Assertions {

    @Test
    public void assertions () throws IOException, InterruptedException {
        WebDriver driver = Reusable_Methods.defineTheDriver();
        driver.navigate().to("https://www.google.com");

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals("Google",driver.getTitle());

        //
        Reusable_Methods.sendKeysMethod(driver,"//*[@name='q'","Cars","Search");
        //
        softAssert.assertAll();






    }
















}
