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
                
                if(Inventory.hasFakeKey() == false){
                    System.out.println("You pick up the bronze key, unsure as to what it opens");
                    Inventory.collectFakeKey();
                }else{
                    System.out.println("You already picked up the key");
                }
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
                Bedroom2();
                break;
            case "bedroom 3":
                Bedroom3();
                break;
            case "dining":
                DiningRoom();
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
 

    


    //Bed/bath2: DONE
    public static void Bedroom2() throws InterruptedException{
        Scanner userInput = new Scanner(System.in);
       System.out.println("LOCATION: Bedroom 2");
       Thread.sleep(1500);
       System.out.println("> In the bedroom, you look at your surroundings \n> You notice a few things: A door to the hall, A door to the bathroom, a bed and a dresser");
       System.out.println("SELECT: Hall, Bathroom, Bed, Dresser");

       String choice = userInput.nextLine();

       
        switch (choice) {
            case "hall": //Player chooses the hall
                Hall1();
                break;       
            case "bathroom" : //Player chooses the bathroom
                Bath2();
                break;
            case "bed" : //User chooses the bed
                System.out.println("\n > Under the bed doesn't have anything of significance ");
                Bedroom2();
                break;
            case "dresser":
                System.out.println("\n > Inside the dresser contains a sus looking spaceman plushie ");
                Thread.sleep(1500);
                Bedroom2(); //Loop back
                break;
            default: 
                System.out.println("Please make a valid choice (Case Sensitive, all lowercase)");
                Bedroom2();//Loop back
                break;
           }
           userInput.close();
        }

        public static void Bath2() throws InterruptedException{
            Scanner userInput = new Scanner(System.in);
            
            System.out.println("\nLOCATION: Bathroom 2 ");
            Thread.sleep(1500);
            System.out.println("> 'I don't really need to use the bathroom right now, I am pretty cleaned out.'");
            Thread.sleep(1500);
            System.out.println("> In the bathroom you see: A medicine cabinet above the sink, and a toilet. ");
            System.out.println("SELECT: Cabinet, Bedroom");
    
            String choice = userInput.nextLine();
            switch(choice){
                case "cabinet":
                    System.out.println("> You open the medicine cabinet and see bottles of pills");
                    Thread.sleep(1500);
                    Bath1();
                    break;
                case "bedroom":
                    Bedroom2();
                    break;
                default:
                System.out.println("Please make a valid choice (Case Sensitive, all lowercase)");
                Bath2();
                break;
            }
    
            userInput.close();
        }


    //Bed/BR3 DONE
    public static void Bedroom3() throws InterruptedException{
        Scanner userInput = new Scanner(System.in);
       System.out.println("LOCATION: Bedroom 3");
       Thread.sleep(1500);
       System.out.println("> In the bedroom, you look at your surroundings \n> You notice a few things: A door to the hall, A door to the bathroom, a bed and a dresser");
       System.out.println("SELECT: Hall, Bathroom, Bed, Dresser");

       String choice = userInput.nextLine();

       
        switch (choice) {
            case "hall": //Player chooses the hall
                Hall1();
                break;       
            case "bathroom" : //Player chooses the bathroom
                Bath3();
                break;
            case "bed" : //User chooses the bed
                System.out.println("\n > You see a pair of jeans on top of the bed ");
                Bedroom3();
                break;
            case "dresser": //Player looks in dresser
                System.out.println("\n > Inside the dresser contains a pair of space boots ");
                Thread.sleep(1500);
                Bedroom3(); //Loop back
                break;
            default: 
                System.out.println("Please make a valid choice (Case Sensitive, all lowercase)");
                Bedroom3();//Loop back
                break;
           }
           userInput.close();
        }
        public static void Bath3() throws InterruptedException{
            Scanner userInput = new Scanner(System.in);
            
            System.out.println("\nLOCATION: Bathroom 3 ");
            Thread.sleep(1500);
            System.out.println("> 'I don't really need to use the bathroom right now, I am pretty cleaned out.'");
            Thread.sleep(1500);
            System.out.println("> In the bathroom you see: A sink, and a toilet. ");
            System.out.println("SELECT: Toilet, Bedroom");
    
            String choice = userInput.nextLine();
            switch(choice){
                case "toilet":
                    System.out.println("> You reach your hands in the back of the toilet. \n You find nothing but now your hands are wet.");
                    Thread.sleep(1500);
                    Bath3();
                    break;
                case "bedroom":
                    Bedroom3();
                    break;
                default:
                System.out.println("Please make a valid choice (Case Sensitive, all lowercase)");
                Bath3();
                break;
            }
    
            userInput.close();
        }

        
    //Dining/Kitchen: DONE
    public static void DiningRoom() throws InterruptedException{
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("\nLOCATION: Dining Room ");
        Thread.sleep(1500);
        System.out.println("> In the Dining Room you see: A table, chairs, a door leading to the Kitchen and a door leading back to the hall. ");
        System.out.println("SELECT: Table, Chairs, Kitchen, Hall");

        String choice = userInput.nextLine();
        switch(choice){
            case "Table":
                System.out.println("> You see a glass of water and decide to drink it. \n 'hm tastes old. hopefully it wasn't out to long. '");
                Thread.sleep(1500);
                DiningRoom();
                break;
            case "Chairs":
                System.out.println("> You sit in a chair and decide to take a load off for a couple of minutes ");
                Thread.sleep(1500);
                DiningRoom();
                break;
            case "Kitchen":
                Kitchen();
                break;
            default:
            System.out.println("Please make a valid choice (Case Sensitive, all lowercase)");
            DiningRoom();
            break;
        }

        userInput.close();
    }
    public static void Kitchen() throws InterruptedException{
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("\nLOCATION: Kitchen ");
        Thread.sleep(1500);
        System.out.println("> In the Kitchen you see: A grill,  a stovetop, a sink, and a door leading to the Dining Hall. ");
        System.out.println("SELECT: Grill, Stovetop, Sink, Dining Room ");

        String choice = userInput.nextLine();
        switch(choice){
            case "grill":
                System.out.println("> You see that the grill is still on. 'That's a fire hazard. '");
                Thread.sleep(1500);
                Kitchen();
                break;
            case "stovetop":
                System.out.println("> You see a grilled cheese but it doesn't look appetizing. You are really craving the donut. ");
                Thread.sleep(1500);
                Kitchen();
                break;
            case "sink":
                System.out.println("> You look in the sink and find a donut, but it is soaking wet.");
                Thread.sleep(1500);
                Kitchen();
                break;
            case "dining room":
                DiningRoom();
                break;
            default:
            System.out.println("Please make a valid choice (Case Sensitive, all lowercase)");
            Kitchen();
            break;
        }

        userInput.close();
    }

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


public static void pilots() throws InterruptedException{
    Scanner userInput = new Scanner(System.in);
    
    System.out.println("\nLOCATION: Pilot's room ");
    Thread.sleep(1500);
    System.out.println("> In the Pilot's room you see 2 seats, a control panel, instruments and doorway to Hall2. ");
    System.out.println("SELECT: Seat, Control Panel, Instruments, Hall2");

    String choice = userInput.nextLine();
    switch(choice){
        case "seat":
            System.out.println("> You take a seat ");
            Thread.sleep(1500);
            pilots();
            break;
        case "control panel":
            System.out.println("> You push a button on the control panel but nothing happens. ");
            Thread.sleep(1500);
            pilots();
            break;
        case "instruments":
            System.out.println("> You try to move the instruments but they are locked in place. ");
            Thread.sleep(1500);
            pilots();
            break;
        case "Hall2":
            hall2();
            break;
        default:
        System.out.println("Please make a valid choice (Case Sensitive, all lowercase)");
        pilots();
        break;
    }

    userInput.close();
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
            if(Inventory.hasHelmet() == true){
                System.out.println("> You sit proudly in the chair");
                Thread.sleep(2000);
                comms(); //Loop back
                break;
            }
            else{
                System.out.println("\n> You turn the chair around to find you helmet resting in the seat");
                Thread.sleep(1500);
                System.out.println("\n> You rejocing in fiding a piece of your suit and put the helment on");
                Thread.sleep(2000);
                Inventory.collectHelmet();
                comms(); //Loop back
                break;
            }
        default:
            System.out.println("Please make a valid choice (Case Sensitive, all lowercase)");
            comms();
            break;
        }
        userInput.close();
              

        
    }


    



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
            if(Inventory.hasRealKey() == true){
                System.out.println("> This panel is completely unfunctional! Someone should get that checked out");
                Thread.sleep(2000);
                boiler(); //Loop back
                break;
            }
            else{
                System.out.println("> You open the control panel door completely and find a key inside");
                Thread.sleep(1500);
                System.out.println("lowe> This looks like it unlocks one of the chests in the armory");
                Thread.sleep(2000);
                Inventory.collectRealKey();
                engine(); //Loop back
                break;
            }
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
            if (Inventory.hasJacket() == true){
                System.out.println("> You admire your jacket once more, 'I look incredible in this!'");
                Thread.sleep(2000);
                boiler(); //Loop back
                break;
            }
            else{
                System.out.println("> You take the jacket off the wall and realize it's built for space travel!");
                Thread.sleep(1500);
                System.out.println("> You put the jacket on and think to yourself, 'Oh yeah, I look cool'");
                Thread.sleep(2000);
                Inventory.collectJacket();
                boiler(); //Loop back
                break;
            }
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
