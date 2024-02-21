package Bread;

public class Muffins extends Bread {
    private String muffinFlavor;

    // Default constructor
    public Muffins() {
        super();
        this.muffinFlavor = "Blueberry";
    }

    // Constructor with all parameters
    public Muffins(double flour, double water, double salt, double sugar, double bakingPowder, double yeast, String muffinFlavor, String breadName, String recipe) {
        super(flour, water, salt, sugar, bakingPowder, yeast, breadName, recipe);
        this.muffinFlavor = muffinFlavor;
    }

    // Getter and setter for muffinFlavor
    public String getMuffinFlavor() {
        return muffinFlavor;
    }

    public void setMuffinFlavor(String muffinFlavor) {
        this.muffinFlavor = muffinFlavor;
    }

    // Method to describe recipe
    public void describeRecipe() {
        System.out.println("A recipe of " + getBreadName() + ":\n" +
                getRecipe());
    }

    // Override toString method
    @Override
    public String toString() {
        return super.toString() + " Muffins \nmuffinFlavor: " + muffinFlavor;
    }
}