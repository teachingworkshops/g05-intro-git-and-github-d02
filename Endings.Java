public class Endings {
    
    //Player decides to go back to bed
    public static void b2b() throws InterruptedException{
        System.out.println("\n You decide that getting the donut is too much effort right now and is not worth the effort.");
        System.out.println("ENDING: Back to Bed");
        Thread.sleep(4000);
        Main.start();
    }

    
    //Player find the hidden donut
    public static void hidden() throws InterruptedException{
        System.out.println("\n "); //TODO: Fill in Ending Dialoug
        System.out.println("ENDING: Hidden Donut");
        Thread.sleep(4000);
        Main.start();
    }

    
    //Player completes their goal of obtaining their donut
    public static void spaceDonut() throws InterruptedException{
        System.out.println("\n "); //TODO: Fill in Ending Dialoug
        System.out.println("ENDING: Space Donut");
        Thread.sleep(4000);
        Main.start();
    }


    //Player decides to leave without their spacesuit
    public static void dead() throws InterruptedException{
        System.out.println("\n "); //TODO: Fill in Ending Dialougst
        System.out.println("ENDING: Deadly Donut");
        Thread.sleep(4000);
        Main.start();
    }
    
    }