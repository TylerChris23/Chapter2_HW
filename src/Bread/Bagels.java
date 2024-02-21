package Bread;

public class Bagels extends Bread {
    private String bagelType;

    // Default constructor
    public Bagels() {
        super();
        this.bagelType = "Plain Bagel";
    }

    // Constructor with all parameters
    public Bagels(double flour, double water, double salt, double sugar, double bakingPowder, double yeast, String bagelType, String breadName, String recipe) {
        super(flour, water, salt, sugar, bakingPowder, yeast, breadName, recipe);
        this.bagelType = bagelType;
    }

    // Getter and setter for bagelType
    public String getBagelType() {
        return bagelType;
    }

    public void setBagelType(String bagelType) {
        this.bagelType = bagelType;
    }

    // Method to describe recipe
    public String describeRecipe() {
        return "A recipe of " + getBreadName() + ":\n" +
                getRecipe();
    }

    // Override toString method
    @Override
    public String toString() {
        return super.toString() + " Bagels \nbagelType: " + bagelType ;
    }
}
