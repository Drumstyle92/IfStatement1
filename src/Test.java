/**
 * @author Drumstyle92
 * class that contains the program.
 */
public class Test {
    /**
     * @param args main parameter.
     * main method which contains a string and an if.
     */
    public static void main(String[] args) {

        String myName = "Dino";
        // Is the number of letters in the name odd or even?
        System.out.println("------------------------------------------------------");
        if(myName.length() % 2 == 0){
            System.out.println("The total number of letters in your name is even.");
        }else {
            System.out.println("The total number of letters in your name is odd.");
        }
    }
}
