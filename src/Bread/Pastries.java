package Bread;

public class Pastries extends Bread {
    private String pastryType;

    // Default constructor
    public Pastries() {
        super();
        this.pastryType = "Danish";
    }

    // Constructor with all parameters
    public Pastries(double flour, double water, double salt, double sugar, double bakingPowder, double yeast, String pastryType, String breadName, String recipe) {
        super(flour, water, salt, sugar, bakingPowder, yeast, breadName, recipe);
        this.pastryType = pastryType;
    }

    // Getter and setter for pastryType
    public String getPastryType() {
        return pastryType;
    }

    public void setPastryType(String pastryType) {
        this.pastryType = pastryType;
    }

    // Method to describe recipe
    public void describeRecipe() {
        System.out.println("A recipe of " + getBreadName() + ":\n" +
                getRecipe());
    }

    @Override
    public String toString() {
        return "Pastries \npastryType: " + pastryType;
    }
}


