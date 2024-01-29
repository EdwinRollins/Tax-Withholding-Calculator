import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter weekly income: $");
        double income = scanner.nextDouble();
        
        double taxRate = getTaxRate(income);
        double taxWithholding = income * taxRate;
        
        System.out.println("Weekly average tax withholding: $" + taxWithholding);
        
        scanner.close();
    }
    
    private static double getTaxRate(double income) {
        if (income < 500) {
            return 0.10; // 10%
        } else if (income < 1500) {
            return 0.15; // 15%
        } else if (income < 2500) {
            return 0.20; // 20%
        } else {
            return 0.30; // 30%
        }
    }
}