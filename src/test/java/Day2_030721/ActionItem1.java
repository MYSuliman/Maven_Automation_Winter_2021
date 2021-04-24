package Day2_030721;

public class ActionItem1 {
    public static void main(String[] args) {


        //Declare the zip code variable
        String[] zipCode;

        //Declare the street number
        int[] StreetNumber;

        zipCode = new String[4];
        zipCode[0] = "91711";
        zipCode[1] = "91786";
        zipCode[2] = "92336";
        zipCode[3] = "90210";

        //Set the array for the street number
        StreetNumber = new int[4];
        StreetNumber[0] = 665;
        StreetNumber[1] = 2077;
        StreetNumber[2] = 2100;
        StreetNumber[3] = 8599;

        //set the initializer i
        int i = 0;

        //set the gatekeeper end points for while
        while (i< zipCode.length){
            System.out.println("My Zip code is " + zipCode[i]  + " and my street number is " + StreetNumber[i]);

            //set the counter

            i = i + 1;
        }//End of While


    }//End of Main

}//End of Java Class

