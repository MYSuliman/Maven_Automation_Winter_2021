package Day4_031521;

import org.openqa.selenium.WebDriver;

public class ReusableMethods {

    //create a reusable method which will add up two numbers and print out the statement
    public static void addTwoNumbers(int number1, int number2){
        System.out.println("My result is " + (number1+number2));
    }//end of method

    //create a return method which will subtract two numbers and print as well
    //return result
    public static int subtractTwoNumbers(int number1, int number2){
        int result = number1-number2;
        System.out.println("My result is "+ result);
        return result;
    }//end of method

    public static void defineTheDriver() {
    };

    public static void sendKeysMethod(WebDriver driver, String s, String cars, String search_field) {
    }

    public static void clickOnElement(WebDriver driver, String s, String google_search) {
    }
}//end of java class

