/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.utilmonthlypayment;

/**
 *
 * @author nayan
 */
public class UtilMonthlyPayment {
    
    public static double monthlyPayment(double P, double Y, double R) {
        double r = R / (12 * 100);
        double n = 12 * Y;
        
        double numerator = P * r;
        double denominator = 1 - Math.pow((1 + r), - n);
        
        return numerator / denominator;
    }
    
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Usage:java util <P> <Y> <R>");
            return;
        }
        
        double P = Double.parseDouble(args[0]);
        double Y = Double.parseDouble(args[1]);
        double R = Double.parseDouble(args[2]);
        
        double payment = monthlyPayment(P, Y, R);
        System.out.println("Monthly payment: " + payment);
        
    }
        
}
