package Day2_030721;

public class ForLoop {
    public static void main(String[] args) {
        String[] cities, houseAddress;

        cities = new String[4];
        cities[0] = "Brooklyn";
        cities[1] = "Queens";
        cities[2] = "Manhattan";
        cities[3] = "Bronx";

        houseAddress = new String[4];
        houseAddress[0] = "222";
        houseAddress[1] = "345";
        houseAddress[2] = "633";
        houseAddress[3] = "545";

        //set your iteration to loop through all the values from the cities
        for(int i = 0;i < cities.length; i++){
            //print out all the values for the print statement
            System.out.println("My City is "+ cities[i] + " house address is " + houseAddress[i]);

        }//End of our loop

    }//end of main method
}//end of Java Class
