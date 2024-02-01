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
       System.out.println("> In your bedroom, you look at your surroundings \n> You notice a few things: A door to the hall, A door to the bathroom, Your bed and a dresser");
       System.out.println("SELECT: Hall, Bathroom, Bed, Dresser");

       String choice = userInput.nextLine();

       
        switch (choice) {
            case "hall": //Player chooses the hall
                Hall1();
                break;       
            case "bathroom" : //Player chooses the bathroom
                Bath1();
                break;
            case "bed" : //User chooses the bed
                Endings.b2b();
                break;
            case "dresser":
                System.out.println("\n Inside the dresser contains clothing that you are already wearing ");
                Thread.sleep(1500);
                Bedroom1(); //Loop back
                break;
            default: 
                System.out.println("Please make a valid choice (Case Sensitive, all lowercase)");
                Bedroom1();//Loop back
                break;
           }
           userInput.close();
              
    }

    /* Bathroom 1
     *   This room contains 1 exits
     *   EXITS: Bedroom1
    */                                                                                                                                                                    
    public static void Bath1() throws InterruptedException{
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("\nLOCATION: Your Bathroom");
        Thread.sleep(1500);
        System.out.println("> 'I don't really need to use the bathroom right now, I am pretty cleaned out.'");
        Thread.sleep(1500);
        System.out.println("> In the bathroom you see: A mirror and a weird key sitting upon the tank of the toilet");
        System.out.println("SELECT: Mirror, Key, Bedroom");

        String choice = userInput.nextLine();
        switch(choice){
            case "mirror":
                System.out.println("> You look in the mirror and see yourself, hair is a mess, some lines on your cheek from sleeping on your arms\n> 'What the hell happened last night?'");
                Thread.sleep(1500);
                Bath1();
                break;
            case "key":
                //TODO: After inventory tracking is implemented, add following code
                /*
                 * if(key = false)
                 *       System.out.println("You pick up the bronze key, unsure as to what it opens");
                 *       key = true
                 * else
                 *      System.out.println("You already picked up the key");
                 */
                System.out.println("> You pick up the bronze key, unsure as to what it opens");
                Thread.sleep(1500);
                Bath1();
                break;
            case "bedroom":
                Bedroom1();
                break;
            default:
            System.out.println("Please make a valid choice (Case Sensitive, all lowercase)");
            Bath1();
            break;
        }

        userInput.close();
    }

    /* Airlock 
     *   This room contains 2 ending, and 1 exit
     *   ENDINGS: Space Donut & Deadly Donut
     *   EXITS: Hall 1
    */
    public static void Airlock() throws InterruptedException{
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("LOCATION: The Airlock");
        Thread.sleep(1500);
        System.out.println("> You notice that the locker that typically contains your space suit part is empty. ");
        Thread.sleep(1500);
        System.out.println("> 'I must have misplace my gear last night, I can't remember much about last night I guess'");
        System.out.println("SELECT: Hall, Space");
        
        String choice = userInput.nextLine();
        switch(choice){
            case "hall":
                Hall1();
                break;
            case "space":
            //TODO: Once inventory tracking is implemented, check if spacesuit is fully assembled then determine ending
            /*
             * If fully assembled Endings.spaceDonut();
             * If not fully assembled Endings.dead();
             * 
             * Defaulting to dead for now
             */
                Endings.dead(); //TEMP FOR NOW!!
                break;
            default:
            System.out.println("Please make a valid choice (Case Sensitive, all lowercase)");
            Airlock();
            break;
        }

        userInput.close();
    }

    /*   Bedroom 1 (The Starting Room)
     *   This room contains 7 exits
     *   EXITS: Bedroom1, Bedroom2, Bedroom3, Dining Room, Hall2, Hall3, Airlock
    */
    public static void Hall1() throws InterruptedException{
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("\nLOCATION: Main Level");
        Thread.sleep(1500);
        System.out.println("> The main level hallway, this level contains many residential needs such as living and dining");
        Thread.sleep(1500);
        System.out.println("> This level also contains the airlock to go out into space and stairs to the upper and lower levels");
        System.out.println("SELECT: Bedroom 1, Bedroom 2, Bedroom 3, Dining, Airlock, Upstairs, Downstairs");
        String choice = userInput.nextLine();
        switch(choice){
            case "bedroom 1":
                Bedroom1();
                break;
            case "bedroom 2":
                //TODO: Connect to Bedroom2 once made
                break;
            case "bedroom 3":
                //TODO: Connect to Bedroom3 once made
                break;
            case "dining":
                //TODO: Connect to Dining once made
                break;
            case "airlock":
                Airlock();
                break;
            case "upstairs":
                hall2();
                break;
            case "downstairs": 
                hall3();
                break;
            default:
            System.out.println("Please make a valid choice (Case Sensitive, all lowercase)");
            Hall1();
            break;
        }

        userInput.close();
    }
 

    


    //TODO:  BED/BR2
    //TODO:  BED/BR3
    //TODO:  Dining/Kitchen

/*   Hall 2
  *   This room contains multiple connections
  *   Connections: Comms Room, Armory, Pilots Room, and Main Hallway
 */
public static void hall2() throws InterruptedException{
    Scanner userInput = new Scanner(System.in);
   System.out.println("LOCATION: Upper Floor Hallway");
   Thread.sleep(1500);
   System.out.println("> You enter the hallway of the upper floor");
   Thread.sleep(1500);
   System.out.println("> This hallway has multiple doors you can see: the Comms Room, the Armory, and the Pilots Room");
   Thread.sleep(1500);
   System.out.println("> You can also head downstairs to the main hallway");
   System.out.println("SELECT: Comms Room, Armory, Pilots Room, main hallway");

   String choice = userInput.nextLine();

   
    switch (choice) {
        case "comms room": //Player chooses the comms room
            comms();
            
            break;       
        case "armory" : //Player chooses the armory
            armory();
        
            break;
        case "pilots room" : //User chooses the pilots room
            pilots();
            break;
        case "main hallway" : //User chooses the main hallway
            Hall1();
            break;
        default:
            System.out.println("Please make a valid choice (Case Sensitive, all lowercase)");
            hall2();
            break;
       }

       userInput.close();
          

    
}
/*   Armory - will need to update once suit and key tracking is implemented
  *   This room contains 2 chests, 1 with a suit peice, and 1 exit
  *   Chests: Each requires different key
  *   Piece: Pants
  *   EXITS: Hall2
 */
public static void armory()throws InterruptedException{//TODO: Finish
    Scanner userInput = new Scanner(System.in);
    System.out.println("LOCATION: Armory ");
    Thread.sleep(1500);
    System.out.println("> The armory contains two chests, each seems to require a different key to unlock");
    Thread.sleep(1500);
    System.out.println("> You can try to unlock either chest or return to the hallway");
    System.out.println("SELECT: Hall, Left Chest, Right Chest");

    String choice = userInput.nextLine();

       
    switch (choice) {
        case "hall": //Player chooses to go back into the hall
            hall2();   
            break;       
        case "left chest": //Player investigates the chair
            //if player does not have correct key
            System.out.println("\n> You are unable to open this chest");
            // if player has correct key
            System.out.println("\n> You open the chest to find your pants somehow ended up inside");
            Thread.sleep(1500);
            System.out.println("\n> You put on the pants as you wonder how that happened");
            Thread.sleep(2000);
            armory(); //Loop back
            break;
        case "right chest": //Player investigates the chair
            //if player does not have correct key
            System.out.println("\n> You are unable to open this chest");
            // if player has correct key
            System.out.println("\n> You Open the chest to find nothing inside");
            System.out.println("\n> Perhaps you will have better luck with the other chest");
            Thread.sleep(2000);
            armory(); //Loop back
            break;
        default:
            System.out.println("Please make a valid choice (Case Sensitive, all lowercase)");
            armory();
            break;
        }
        userInput.close();
}


public static void pilots(){//TODO: Finish
    System.out.println("pilots Test");
}


    


/*   Cooms Room - will need to update once suit tracking is implemented
  *   This room contains 1 suit piece and 1 exit
  *   Piece: Helemt
  *   EXITS: Hall2
 */
public static void comms()throws InterruptedException{
    Scanner userInput = new Scanner(System.in);
    System.out.println("LOCATION: Comms Room ");
    Thread.sleep(1500);
    System.out.println("> the Cooms Room is pretty empty, but you notice something in one of the screens reflections");
    Thread.sleep(1500);
    System.out.println("> It seems there is something in one of the chairs, you can turn the chair or exit back to the hall");
    System.out.println("SELECT: Hall, Chair");

    String choice = userInput.nextLine();

       
    switch (choice) {
        case "hall": //Player chooses to go back into the hall
            hall2();
                
            break;       
        case "chair": //Player investigates the chair
            System.out.println("\n> You turn the chair around to find you helmet resting in the seat");
            Thread.sleep(1500);
            System.out.println("\n> You rejocing in fiding a piece of your suit and put the helment on");
            Thread.sleep(2000);
            comms(); //Loop back
            break;
        default:
            System.out.println("Please make a valid choice (Case Sensitive, all lowercase)");
            comms();
            break;
        }
        userInput.close();
              

        
    }


    //TODO: Pilots room


/*   Hall 3
  *   This room contains multiple connections
  *   Connections: Engine Room, Boiler Room, Main Hallway
 */
public static void hall3() throws InterruptedException{
    Scanner userInput = new Scanner(System.in);
   System.out.println("LOCATION: Lower Floor Hallway");
   Thread.sleep(1500);
   System.out.println("> You enter the hallway of the lower floor");
   Thread.sleep(1500);
   System.out.println("> This hallway has two doors you can see: the Engine Room and the Boiler Room");
   Thread.sleep(1500);
   System.out.println("> You can also head upstairs to the main hallway");
   System.out.println("SELECT: Engine Room, Boiler Room, main hallway");

   String choice = userInput.nextLine();

   
    switch (choice) {
        case "engine room": //Player chooses the engine room
            engine();
            
            break;       
        case "boiler room" : //Player chooses the boiler room
            boiler();
        
            break;
        case "main hallway" : //User chooses the main hallway
            Hall1();
            break;
        default:
            System.out.println("Please make a valid choice (Case Sensitive, all lowercase)");
            hall3();
            break;
       }

       userInput.close();
          

    
}
/*   Engine Room
  *   This room contains 1 exit
  *   EXITS: Hall3
 */
public static void engine() throws InterruptedException{//TODO: Finish
    Scanner userInput = new Scanner(System.in);
    System.out.println("LOCATION: Engine Room");
    Thread.sleep(1500);
    System.out.println("> You enter the engine room");
    Thread.sleep(1500);
    System.out.println("> Engines, controls, and wires surround you, better watch your step");
    Thread.sleep(1500);
    System.out.println("> You see a slightly open control panel on one of the walls");
    System.out.println("SELECT: Lower Floor Hallway,  Control Panel");

    String choice = userInput.nextLine();

    
    switch (choice) {
        case "lower floor hallway": //Player chooses to go back into the hall
            hall3();
                
            break;       
        case "control panel" : //Player chooses to walk up to the control panel
            System.out.println("> You open the control panel door completely and find a key inside");
            Thread.sleep(1500);
            System.out.println("lowe> This looks like it unlocks one of the chests in the armory");
            Thread.sleep(2000);
            engine(); //Loop back
            break;
        default:
            System.out.println("Please make a valid choice (Case Sensitive, all lowercase)");
            engine();
            break;
    }

    userInput.close();

    }

/*   Boiler Room
  *   This room contains 1 suit piece, 1 ending, and 1 exit
  *   PIECES: Jacket
  *   ENDINGS: Hidden Donut
  *   EXITS: Hall3
 */
public static void boiler() throws InterruptedException{//TODO: Finish
    Scanner userInput = new Scanner(System.in);
    System.out.println("LOCATION: Boiler Room");
    Thread.sleep(1500);
    System.out.println("> You enter the boiler room");
    Thread.sleep(1500);
    System.out.println("> This place is full of pipes, pumps, water tanks, and an interesting looking bucket in one corner");
    Thread.sleep(1500);
    System.out.println("> You notice a jacket hanging on one of the walls");
    System.out.println("SELECT: Lower Floor Hallway,  Jacket");

    String choice = userInput.nextLine();

    
    switch (choice) {
        case "lower floor hallway": //Player chooses to go back into the hall
            hall3();
                
            break;       
        case "jacket" : //Player chooses the jacket
            System.out.println("> You take the jacket off the wall and realize it's built for space travel!");
            Thread.sleep(1500);
            System.out.println("> You put the jacket on and think to yourself, 'Oh yeah, I look cool'");
            Thread.sleep(2000);
            boiler(); //Loop back
            break;
        case "bucket" : //Player chooses to check the secret bucket
            System.out.println("\n> You investigate the mysterious bucket and find a tasty treat inside!");
            Thread.sleep(2000);
            Endings.hidden(); //Load hidden ending
            break;
        default:
            System.out.println("Please make a valid choice (Case Sensitive, all lowercase)");
            boiler();
            break;
    }

     userInput.close();
    }
    

}
