public class Inventory {
    private static boolean helmet = false;
    private static boolean jacket = false; //EXAMPLE
    private static boolean pants = false;
    private static boolean boots = false;
    private static boolean fakeKey = false;
    private static boolean realKey = false;
    private static boolean emptyChest = false;

    // Getter methods for each item
    public static boolean hasHelmet() {
        return helmet;
    }

    public static boolean hasJacket() { //EXAMPLE
        return jacket;
    }

    public static boolean hasPants() {
        return pants;
    }

    public static boolean hasBoots() {
        return boots;
    }

    public static boolean hasFakeKey() {
        return fakeKey;
    }

    public static boolean hasRealKey() {
        return realKey;
    }

    public static boolean emptyChestOpen() {
        return emptyChest;
    }

    // Method to update the status of each item
    public static void collectHelmet() {
        helmet = true;
    }

    public static void collectJacket() {
        jacket = true;
    }

    public static void collectPants() {
        pants = true;
    }

    public static void collectBoots() {
        boots = true;
    }

    public static void collectFakeKey() {
        fakeKey = true;
    }

    public static void collectRealKey() {
        realKey = true;
    }

    public static void openEmptyChest() {
        emptyChest = true;
    }
}

