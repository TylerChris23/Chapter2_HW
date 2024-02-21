package Bread;

public class Sourdough extends Bread{
    private double sourdoughStarter;

    // Default constructor
    public Sourdough() {
        super();
        this.sourdoughStarter = 1.00;  // Default amount of sourdough starter
    }

    // Constructor with all parameters
    public Sourdough(double flour, double water, double salt, double sugar, double bakingPowder, double yeast, double sourdoughStarter, String breadName, String recipe) {
        super(flour, water, salt, sugar, bakingPowder, yeast, breadName, recipe);
        this.sourdoughStarter = sourdoughStarter;
    }

    // Getter and setter for sourdoughStarter
    public double getSourdoughStarter() {
        return sourdoughStarter;
    }

    public void setSourdoughStarter(double sourdoughStarter) {
        this.sourdoughStarter = sourdoughStarter;
    }

    public String describeRecipe() {
        return "A recipe of Sourdough Bread:\n" +
                "1. Mix flour, water, salt, sugar, yeast, and ripe sourdough starter.\n" +
                "2. Make the dough\n" +
                "3. Bulk Rise\n" +
                "4. Stretch and fold the dough\n" +
                "5. Cut and shape the dough\n" +
                "6. Second rise\n" +
                "7. Preheat the oven to 450°F towards the tail end of the second rise.\n" +
                "8. Spray the loaf with lukewarm water.\n" +
                "9. Bake the bread at 400°F for 20 minutes, until deep golden brown.\n" +
                "10. Remove the bread from the oven.\n" +
                "11. Let the bread cool until good to eat.";
    }

    // Override toString method
    @Override
    public String toString() {
        return super.toString() + "Sourdough \nsourdoughStarter:" + sourdoughStarter;

    }
}
