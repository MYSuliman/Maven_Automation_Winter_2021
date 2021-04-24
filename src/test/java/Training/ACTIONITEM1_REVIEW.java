package Training;

public class ACTIONITEM1_REVIEW {

    public static void main(String[] args) {


        //in this project we are tasked with creating a set of data (intergers) and then interating the data and printing it out

        //The first thing we need to do is declare the zip code variable
        String[] zipCode;

        //We declare the street number
        String[] Country;

        zipCode = new String[4];
        //Next we will asign a number to each zip code, staring from 1 and going to 3
        zipCode[0] = "91711";
        zipCode[1] = "92336";
        zipCode[2] = "91766";
        zipCode[3] = "11210";

        //set the array for the street number
        // her we tall java that we are recllaing the interger (streetnumber) and that there are 4

        Country = new String[4];
        Country[0] = "USA";
        Country[1] = "India";
        Country[2] = "Taco";
        Country[3] = "Burrioto";

        //Set the initilizer

        int i = 0;

        //set the gatekeeper end points for while

        while (i < zipCode.length){
            System.out.println("My Zip code is " + zipCode[i]  + " and my country is " + Country[i]);
            //set the counter
            i = i + 1;

        }























    }//End of main method

}//of of Java Class

