package Day3_031321;

public class switchcasestatement {
    public static void main(String[] args) {
        /*using switch case statement print
        if milkType is oak milk, almond milk or organic milk
        else milk type is not recognized
         */

        //declare and define the variable milkType
        String milkType = "almond milk";

        switch (milkType){
            case "oat milk":
                System.out.println("Milk type of oat milk");
                break;
            case "almond milk":
                System.out.println("Milk type of almond milk");
                break;
            case "organic milk":
                System.out.println("Milk type of organic milk");
                break;
            default:
                System.out.println("Milk type not recognized " + milkType);

        }//end of switch statement

    }//end of main method
}//end of java class

