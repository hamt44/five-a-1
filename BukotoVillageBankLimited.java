/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package oopexam.bukotovillagebanklimited;
import java.util.Scanner;
/**
 *
 * @author YSJ COMPUTERS
 */
public class BukotoVillageBankLimited {
public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
        System.out.print("Enter the number of members: ");
        int numberOfMembers = scanner.nextInt();
        
        double[] principalAmounts = new double[numberOfMembers];
        double[] investmentValues = new double[numberOfMembers];
        
        System.out.print("Enter the interest rate (as a percentage): ");
        double interestRate = scanner.nextDouble();
        
        System.out.print("Enter the investment period (in years): ");
        int period = scanner.nextInt();
        
        for (int i = 0; i < numberOfMembers; i++) {
            System.out.print("Enter the principal amount for member " + (i + 1) + ": ");
            principalAmounts[i] = scanner.nextDouble();
        }
        
        for (int i = 0; i < numberOfMembers; i++) {
            investmentValues[i] = principalAmounts[i] * Math.pow(1 + interestRate / 100, period);
        }
        
        System.out.println("Investment values after " + period + " years:");
        for (int i = 0; i < numberOfMembers; i++) {
            System.out.println("Member " + (i + 1) + ": " + investmentValues[i]);
        }
    }
    }
}

   