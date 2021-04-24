package Training;

public class Assignment2 {
    public static void main(String[] args) {
        //in this program will use the case statement to print out a reaction to grades received

        //declare grade received
        String gradeReceived = "U";

        switch (gradeReceived){
            case "A":
                System.out.println("Excellent!!!");
                break;
            case "B":
                System.out.println("Well Done!");
                break;
            case "C":
                System.out.println("Satisfactory");
                break;
            case "D":
                System.out.println("Passed");
                break;
            case "F":
                System.out.println("Fail:(");
                break;
            default:
                System.out.println("Invalid Grade");

        }//End of grade
    }//end of main

}//end of java
