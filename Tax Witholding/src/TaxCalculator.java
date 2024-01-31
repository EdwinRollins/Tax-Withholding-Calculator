import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("To determine your tax withholding, please enter your weekly income: $");
        double income = scanner.nextDouble();
        
        double taxRate = getTaxRate(income);
        double taxWithholding = income * taxRate;
        
        System.out.println("Your Weekly tax withholding is: $" + taxWithholding);
        
        scanner.close();
    }
    
    private static double getTaxRate(double income) {
        if (income < 500) {
            return 0.10; // 10% Tax Rate
        } else if (income < 1500) {
            return 0.15; // 15% Tax Rate
        } else if (income < 2500) {
            return 0.20; // 20% Tax Rate
        } else {
            return 0.30; // 30% Tax Rate
        }
    }
}