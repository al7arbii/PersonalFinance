package PersonalFinance;

import java.util.Scanner;

public class Expense {
    public static void main(String[] args) {
        //variables to store expense name, date, amount, category
        Scanner input = new Scanner(System.in);
        System.out.print("Description: ");
        String description1 = input.nextLine();
        System.out.print("Date: ");
        String date1 = input.nextLine();
        System.out.print("Amount: ");
        double amount1 = input.nextDouble();

        input.nextLine();  //avoid empty line
        System.out.print("Category: ");
        String category1 = input.nextLine();

        //expense 2
        System.out.println();
        System.out.print("Description: ");
        String description2 = input.nextLine();
        System.out.print("Date: ");
        String date2 = input.nextLine();
        System.out.print("Amount: ");
        double amount2 = input.nextDouble();

        input.nextLine();  //avoid empty line
        System.out.print("Category : ");
        String category2 = input.nextLine();

        //output each expense in one line
        //output total spent so far
        System.out.println(date1 + "\t" + description1 + "\t" +
                category1 + "\t$" + amount1);
        System.out.println(date2 + "\t" + description2 + "\t" +
                category2 + "\t$" + amount2);
        System.out.println("Total Spent: $" + (amount1 + amount2));
        //homework
        //System.out.format(); or a library research and fix our output
    }
}
