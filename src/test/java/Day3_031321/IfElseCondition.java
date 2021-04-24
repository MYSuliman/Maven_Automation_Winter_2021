package Day3_031321;

public class IfElseCondition {
    public static void main(String[] args) {
        //declare the integer variable
        int a,b;
        a = 3;
        b = 3;

        //using if condition, verify that a is less than b
        if(a < b ) {
            System.out.println("a is less than b");

        }//end of if condition

            //using if else condition, verify is a is less than b, else it is greater or equal to b
            if(a < b){
                System.out.println("a is less than b");
            }else {
                System.out.println("a is either greater than or equal to b");

            }// end of if else

        //using the <= operator verify if a is less than b or equal to b
        if(a <= b){
            System.out.println("a is less than b or equal to b");

        }//end of if condition

    }// end of main method

}//End of java Class
