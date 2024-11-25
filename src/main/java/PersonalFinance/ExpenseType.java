package PersonalFinance;

import java.time.LocalDate;

public class ExpenseType {
    //attributes
    private String category;
    private double value;
    private String description;
    private LocalDate date;
    public static double totalExpenses = 0;

    //constructor
    public ExpenseType(String c, double v, String d, LocalDate date) {
        this.category = c;
        this.value = v;
        this.description = d;
        this.date = date;
    }

    public void addTotalExpense(){
        totalExpenses = totalExpenses + value;
    }

    public static double getTotalExpenses() {
        return totalExpenses;
    }

    @Override
    public String toString(){
        return date + "\t " + description + "\t " + category + "\t $" + value + "\n";
    }
}
