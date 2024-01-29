import java.util.Scanner;

public class TaxCalculator {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter weekly income: $");
        double income = scanner.nextDouble();

        double taxRate;
        if (income < 500){
            taxRate = 0.10; //10%
        } else if (income < 1500)   {
            taxRate = 0.15; //15%
        } else if (income < 2500)   {
            taxRate = 0.20; //20%
        } else {
            taxRate = 0.30; //30%
        }

        double taxWithholding = income*taxRate;
        System.out.println("Weekly tax witholding: $" + taxWithholding);
        }
    }