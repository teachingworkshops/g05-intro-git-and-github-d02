import java.util.Scanner;/**
 * TextAdventrue
 */
public class TextAdventrue {

public static void test(){
    System.out.println("Works");

}
public static void main(String[] args) {

    Scanner userInput = new Scanner(System.in);
    System.out.println( "Welcome to Space Donut!");

    System.out.println( "Type Start to begin!");

    //Example of User Input getting processed and calling a new function ("Room")
    String choice = userInput.nextLine();
    if(choice.contains("start")){
        test();
    };
}

}