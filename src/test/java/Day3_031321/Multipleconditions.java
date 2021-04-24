package Day3_031321;

public class Multipleconditions {
    public static void main(String[] args) {

        //using multiple conditional statments
        int a,b,c;
        a = 2;
        b = 3;
        c = 4;

        //verify either a+b >c, a+b < c, a+b = c
        if(a+b >c){
            System.out.println("a & b is grater than c");
        } else if(a+b < c){
            System.out.println("a & b is less than c");
        }else {//previous two conditions don't match then you can just end with else statement
            System.out.println("a & b is equal to c");
        }// end of multiple condition
    }//end of main method
}//end of java class
