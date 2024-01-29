import java.util.Scanner;

public class Rooms {
    
 /*   Bedroom 1 (The Starting Room)
  *   This room contains 1 ending, and 2 exits
  *   ENDING: Go-Back-To-Bed
  *   EXITS: Bathroom1 & Hall1
 */
    public static void Bedroom1() throws InterruptedException{
        Scanner userInput = new Scanner(System.in);
       System.out.println("LOCATION: Your Bedroom");
       Thread.sleep(1500);
       System.out.println("> In your bedroom, you look at your surroundings");
       System.out.println("> You notice a few things: A door to the hall, A door to the bathroom, Your bed and a dresser");
       System.out.println("SELECT: Hall, Bathroom, Bed, Dresser");

       String choice = userInput.nextLine();

       
        switch (choice) {
            case "hall": //Player chooses the hall
                hall1();
                
                break;       
            case "bathroom" : //Player chooses the bathroom
                bath1();
            
                break;
            case "bed" : //User chooses the bed
                Endings.b2b();
                break;
            case "dresser":
                System.out.println("\n Inside the dresser contains clothing that you are already wearing ");
                Thread.sleep(2000);
                Bedroom1(); //Loop back
                break;
            default:
                System.out.println("Please make a valid choice (Case Sensitive, all lowercase)");
                Bedroom1();
                break;
           }
           userInput.close();
              

        
    }
    public static void hall1(){//TODO: Finish (Dustin)
        System.out.println("Hall Test");
    }
    //Bathroom 1 (Connecte to starting room)
    public static void bath1(){//TODO: Finish (Dustin)
        System.out.println("Bath Test");
    }

    public static void airlock(){//TODO: Finish (Dustin)
        System.out.println("Airlock Test");
    }



    //TODO:  BED/BR2
    //TODO:  BED/BR3
    //TODO:  Dining/Kitchen

    //TODO:  Hall2
    //TODO: Comms Room
    //TODO: Armory
    //TODO: Pilots room


    //TODO: Hall3
    //TODO: Engine Roon
    //TODO: Boiler Room
    

}
