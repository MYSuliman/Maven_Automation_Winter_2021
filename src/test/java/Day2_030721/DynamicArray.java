package Day2_030721;

public class DynamicArray {

    public static void main(String[] args) {
        //Declare countries variable
        String[] countries;
        //declare int variable
        int[] StreetNumber;

        //set the length of the array for the number of data it can store
        countries = new String[4];
        countries[0] = "USA";
        countries[1] = "Spain";
        countries[2] = "Bangladesh";
        countries[3] = "India";

        //set the length of the array for the street number
        StreetNumber = new int[4];
        StreetNumber[0] = 222;
        StreetNumber[1] = 333;

        //Print USA from countries list
        System.out.println("Country is "+ countries[0]);


    }//end of main method

}//end of Java class
