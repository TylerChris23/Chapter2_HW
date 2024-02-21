package Bread;
public class Bread {
    private double flour;
    private double water;
    private double salt;
    private double sugar;
    private double bakingPowder;
    private double yeast;
    private String breadName;
    private String state;
    private String recipe;

    // Default constructor with general ingredients and recipe
    public Bread() {
        this.flour = 5.00;
        this.water = 1.50;
        this.salt = 1.50;
        this.sugar = 1.0;
        this.bakingPowder = 0.0;
        this.yeast = 1.00;
        this.breadName = "Baguette";
        this.state = "not baked";
        this.recipe = " ";
    }

    // Constructor with all parameters
    public Bread(double flour, double water, double salt, double sugar, double bakingPowder, double yeast, String breadName, String recipe) {
        this.flour = flour;
        this.water = water;
        this.salt = salt;
        this.sugar = sugar;
        this.bakingPowder = bakingPowder;
        this.yeast = yeast;
        this.breadName = breadName;
        this.state = "not baked";
        this.recipe = recipe;
    }

    // Getters and setters for all instance variables
    public double getFlour() {
        return flour;
    }

    public void setFlour(double flour) {
        this.flour = flour;
    }

    public double getWater() {
        return water;
    }

    public void setWater(double water) {
        this.water = water;
    }

    public double getSalt() {
        return salt;
    }

    public void setSalt(double salt) {
        this.salt = salt;
    }

    public double getSugar() {
        return sugar;
    }

    public void setSugar(double sugar) {
        this.sugar = sugar;
    }

    public double getBakingPowder() {
        return bakingPowder;
    }

    public void setBakingPowder(double bakingPowder) {
        this.bakingPowder = bakingPowder;
    }

    public double getYeast() {
        return yeast;
    }

    public void setYeast(double yeast) {
        this.yeast = yeast;
    }

    public String getBreadName() {
        return breadName;
    }

    public void setBreadName(String breadName) {
        this.breadName = breadName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getRecipe() {
        return recipe;
    }

    public void setRecipe(String recipe) {
        this.recipe = recipe;
    }

    // Method to bake the bread
    public void bake() {
        state = "baked";
    }

    // Method to get the ingredients
    public String getIngredients() {
        return "Ingredients of " + breadName + " are:\n" +
                flour + " cups of flour\n" +
                water + " cups of water\n" +
                salt + " tsps of salt\n" +
                sugar + " cups of sugar\n" +
                bakingPowder + " tsps of baking powder\n" +
                yeast + " tsps of yeast\n";
    }

    // String method to show type of bread
    @Override
    public String toString() {
        return "Bread \nflour: " + flour + "\nwater: " + water + "\nsalt: " + salt +
                "\nsugar: " + sugar + "\nbakingPowder: " + bakingPowder +
                "\nyeast: " + yeast + "\nbreadName: " + breadName +
                "\nstate: " + state + "\nrecipe: " + recipe;
    }
}
