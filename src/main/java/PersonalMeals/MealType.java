package PersonalMeals;

public class MealType {
    //attributes
    private String mealOfDay;
    private String composition;
    private String name;
    private double calories;
    private static double allCalories = 0;

    //constructor
    public MealType(String mealOfDay, String composition, String name, double calories) {
        this.mealOfDay = mealOfDay;
        this.composition = composition;
        this.name = name;
        this.calories = calories;
        allCalories += calories;
    }

    public static double getAllCalories() {
        return allCalories;
    }

    @Override
    public String toString() {
        return mealOfDay + "\t \t" + composition + "\t \t" + name + "\t \t" + calories + "\n";
    }
}
