import java.util.Scanner;/**
 * TextAdventrue
 */

 

public class Main {





//Main Function AKA Start Function
public static void main(String[] args) throws InterruptedException {

    Scanner userInput = new Scanner(System.in);
    System.out.println( "Welcome to Space Donut!");

    System.out.println( "Type Start to begin!");

    /*xample of User Input getting processed and calling a new function ("Room")
    *START GAME
    * Uses .contains() to check if the user entered anything that has start
    * Thread.sleep() adds a timer between prints so it doenst print all at once (gets overwhelming)
    */
    String choice = userInput.nextLine();
    if(choice.contains("start")){
        System.out.println("You wake up in a sweat inside you bedroom aboard the Starship Stellar Pheonix.");
        Thread.sleep(2000);
        System.out.println("'What happened last night' You say to yourself as you try to grasp your surroundings.");
        Thread.sleep(2000);
        System.out.println("Looking around, you notice that your last donut is missing from your bed stand.");
        Thread.sleep(2000);
        System.out.println("Out of the corner of your eye you see the donut floating outside your window.");
        Thread.sleep(2000);
        System.out.println("'WHAT!' You yell out loud.");
        Thread.sleep(2000);
        System.out.println("'I need to get that donut'");
        Thread.sleep(2000);
        Rooms.Bedroom1();
    };
}

}