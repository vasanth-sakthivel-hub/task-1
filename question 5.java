import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking purchase amount as input
        System.out.print("Enter the purchase amount: ");
        double amount = scanner.nextDouble();

        double discount = 0;


        if (amount >= 500 && amount <= 1000) {
            discount = amount * 0.10; // 10% discount
        } else if (amount > 1000) {
            discount = amount * 0.20; // 20% discount
        }

        double finalAmount = amount - discount; // Final amount after discount

        // Displaying the final amount
        System.out.println("Discount Applied: " + discount);
        System.out.println("Final Payable Amount: " + finalAmount);

        scanner.close();
       }
}