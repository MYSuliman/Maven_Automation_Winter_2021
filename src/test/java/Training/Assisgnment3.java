package Training;

public class Assisgnment3 {
    public static void main(String[] args) {
        //in this assignment we will only print out the city when it is either Brooklyn or Manhattan

        String[] cities = new String[4];
        cities[0] = "Brooklyn";
        cities[1] = "Queens";
        cities[2] = "Manhattan";
        cities[3] = "Staten Island";


        for(int i =0;i < cities.length; i++){
            if (cities[i] == "Brooklyn"){
                System.out.println( "The best city in New York is " + cities[i]);
            }else if (cities[i] == "Manhattan"){
                System.out.println("The best city in New York is " + cities[i]);
            }//end of conditional look
        }//end of for loop
    }//end of main
}//end of java class
