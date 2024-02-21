package Bread;

public class Main {
    public static void main(String[] args) {
        // Create instances of Bread and its subclasses
        Bread bread = new Bread();
        Sourdough sourdough = new Sourdough(5, 1.5, 2.5, 1, 0, 1, 1, "Sourdough Bread", "Instructions...");
        Pastries pastries = new Pastries(2, 1, 0.5, 1.5, 0.5, 0.5, "Croissant", "Croissant Pastry", "Instructions...");
        Bagels bagels = new Bagels(3, 1, 1, 1, 0.5, 1, "Plain Bagel", "Bagel", "Instructions...");
        Muffins muffins = new Muffins(2, 1, 0.5, 0.5, 0.25, 1, "Blueberry", "Blueberry Muffins", "Instructions...");
        StrawberryShortCake strawberryShortCake = new StrawberryShortCake(2.5, 1, 0.5, 1, 0.5, 1, 10, "Strawberry Shortcake", "Instructions...");

        // Display recipes and methods of all classes
        System.out.println("Bread class testing");
        System.out.println(bread.getIngredients());
        System.out.println("A recipe of " + bread.getBreadName() + ":");
        System.out.println(bread.getRecipe());
        bread.bake();
        System.out.println();

        System.out.println("SourdoughBread class testing");
        System.out.println(sourdough.getIngredients());
        sourdough.describeRecipe();
        sourdough.bake();
        System.out.println();

        System.out.println("Pastry class testing");
        System.out.println(pastries.getIngredients());
        pastries.describeRecipe();
        pastries.bake();
        System.out.println();

        System.out.println("Bagels class testing");
        System.out.println(bagels.getIngredients());
        bagels.describeRecipe();
        bagels.bake();
        System.out.println();

        System.out.println("Muffins class testing");
        System.out.println(muffins.getIngredients());
        muffins.describeRecipe();
        muffins.bake();
        System.out.println();

        System.out.println("StrawberryShortCake class testing");
        System.out.println(strawberryShortCake.getIngredients());
        strawberryShortCake.describeRecipe();
        strawberryShortCake.bake();
    }
}
