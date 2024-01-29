import java.util.Scanner;/**
 * TextAdventrue
 */

 

public class Main {

public static void start() throws InterruptedException{
   
    String[] restart = {""};
    main(restart);
}
//Main Function AKA Start Function
public static void main(String[] args) throws InterruptedException {
    String[] restart = {""};
    Scanner userInput = new Scanner(System.in);


    System.out.println( " \n Welcome to Space Donut! \n All choices will be in lowercase");
    System.out.println( "Type Start to begin or Exit to exit");

    
    /*START GAME
    * Uses .contains() to check if the user entered anything that has start
    * Thread.sleep() adds a timer between prints so it doenst print all at once (gets overwhelming)
    */
    String choice = userInput.nextLine();
    if(choice.contains("tart")){ //User can enter Start or start
        System.out.println("> You wake up in a sweat inside you bedroom aboard the Starship Stellar Pheonix.");
        Thread.sleep(2000);
        System.out.println("> 'What happened last night' You say to yourself as you try to grasp your surroundings.");
        Thread.sleep(2000);
        System.out.println("> Looking around, you notice that your last donut is missing from your bed stand.");
        Thread.sleep(2000);
        System.out.println("> Out of the corner of your eye you see the donut floating outside your window.");
        Thread.sleep(2000);
        System.out.println("> 'WHAT!' You yell out loud.");
        Thread.sleep(2000);
        System.out.println("> 'I need to get that donut,but first I need my spacesuit' \n");
        Thread.sleep(2000);
        Rooms.Bedroom1();
    }else if(choice.contains("xit")){//user can enter Exit or exit
        System.exit(0);
    }else{ // User makes an invalid option
        System.out.println("Please enter a valid option");
        Thread.sleep(1000);
        main(restart);
    };

    userInput.close();
}

}