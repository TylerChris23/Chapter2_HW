package Bread;

public class StrawberryShortCake extends Bread {
    private int strawberries;

    // Default constructor
    public StrawberryShortCake() {
        super();
        this.strawberries = 10;  // Default number of strawberries
    }

    // Constructor with all parameters
    public StrawberryShortCake(double flour, double water, double salt, double sugar, double bakingPowder, double yeast, int strawberries, String breadName, String recipe) {
        super(flour, water, salt, sugar, bakingPowder, yeast, breadName, recipe);
        this.strawberries = strawberries;
    }

    // Getter and setter for strawberries
    public int getStrawberries() {
        return strawberries;
    }

    public void setStrawberries(int strawberries) {
        this.strawberries = strawberries;
    }

    // Method to describe recipe
    public void describeRecipe() {
        System.out.println("A recipe of " + getBreadName() + ":\n" +
                getRecipe());
    }

    // Override toString method
    @Override
    public String toString() {
        return super.toString() + " StrawberryShortCake \nstrawberries:" + strawberries;
    }
}