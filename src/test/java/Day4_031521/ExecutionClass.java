package Day4_031521;

public class ExecutionClass {
    public static void main(String[] args) {
        //this is where you can call your reusable method to be executed
        //inside main method
        //ReusableMethods.addTwoNumbers(20,60);
        //ReusableMethods.addTwoNumbers(60,30);

        //call subtract method and store the result
        int c = ReusableMethods.subtractTwoNumbers(40,20);
        System.out.println("New result "+ (c+5));

    }//end of main method


}
