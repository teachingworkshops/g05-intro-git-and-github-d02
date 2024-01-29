import java.util.Scanner;/**
 * TextAdventrue
 */

 

public class Main {


/* Bedroom 1 (The Starting Room)
*   This room contains 1 ending, and 2 exits
*   ENDING: Go-Back-To-Bed
*   EXITS: Bathroom1 & Hall1
*/


//Main Function AKA Start Function
public static void main(String[] args) {

    Scanner userInput = new Scanner(System.in);
    System.out.println( "Welcome to Space Donut!");

    System.out.println( "Type Start to begin!");

    //Example of User Input getting processed and calling a new function ("Room")
    //START GAME
    String choice = userInput.nextLine();
    if(choice.contains("start")){
        System.out.println("");
        Rooms.Bedroom1();
    };
}

}