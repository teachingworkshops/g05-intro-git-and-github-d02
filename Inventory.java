public class Inventory {
    private boolean helmet = false;
    private static boolean jacket = false; //EXAMPLE
    private boolean pants = false;
    private boolean boots = false;
    private boolean fakeKey = false;
    private boolean realKey = false;

    // Getter methods for each item
    public boolean hasHelmet() {
        return helmet;
    }

    public static boolean hasJacket() { //EXAMPLE
        return jacket;
    }

    public boolean hasPants() {
        return pants;
    }

    public boolean hasBoots() {
        return boots;
    }

    public boolean hasFakeKey() {
        return fakeKey;
    }

    public boolean hasRealKey() {
        return realKey;
    }

    // Method to update the status of each item
    public void collectHelmet() {
        helmet = true;
    }

    public void collectJacket() {
        jacket = true;
    }

    public void collectPants() {
        pants = true;
    }

    public void collectBoots() {
        boots = true;
    }

    public void collectFakeKey() {
        fakeKey = true;
    }

    public void collectRealKey() {
        realKey = true;
    }
}

