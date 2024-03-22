/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.utilsqrt;

/**
 *
 * @author nayan
 */
public class UtilSqrt {
    public static double sqrt(double c) {
        if (c < 0) {
            throw new IllegalArgumentException("Input must be non-negative");
        }
        
        double epsilon = 1e-15;
        double t = c;
        
        while (Math.abs(c / t - t) > epsilon * t) {
            double tc = t;
            t = (c / t + t) / 2.0;
            
            if (Math.abs(tc - t) < 1e-15)
                break;
        }
        return t;      
    }
    
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: java util <number>");
            return;
        }
        
        double c = Double.parseDouble(args[0]);
        
        double squareRoot = sqrt(c);
        System.out.println("Square root of " + c + " is " + squareRoot);
    }
}
