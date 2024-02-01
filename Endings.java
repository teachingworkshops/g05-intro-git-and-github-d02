public class Endings {
    
    //Player decides to go back to bed
    public static void b2b() throws InterruptedException{
        System.out.println("\n> You decide that getting the donut is too much effort right now and is not worth the effort.");
        System.out.println("ENDING: Back to Bed");
        Thread.sleep(4000);
        Main.start();
    }

    
    //Player find the hidden donut
    public static void hidden() throws InterruptedException{
        System.out.println("\n> You have found a donut! It might not be THE donut but it will suffice"); 
        System.out.println("ENDING: Hidden Donut");
        Thread.sleep(4000);
        Main.start();
    }

    
    //Player completes their goal of obtaining their donut
    public static void spaceDonut() throws InterruptedException{
        System.out.println("\n> You have done it, after collecting the space suit parts you made it into space and got your donut."); 
        Thread.sleep(1500);
        System.out.println("> Was it worth all that effort? You like to tell yourself that it was");
        System.out.println("ENDING: Space Donut");
        Thread.sleep(4000);
        Main.start();
    }


    //Player decides to leave without their spacesuit
    public static void dead() throws InterruptedException{
        System.out.println("\n> Oh no.. you forgot your spacesuit. No donuts for you.... forever"); 
        System.out.println("ENDING: Deadly Donut");
        Thread.sleep(4000);
        Main.start();
    }
    
    }
