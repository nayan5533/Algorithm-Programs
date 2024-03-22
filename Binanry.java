/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.binanry;
import java.util.Scanner;

/**
 *
 * @author nayan
 */
public class Binanry {
    
    public static String toBinary(int decimal) {
        if (decimal < 0) {
        throw new IllegalArgumentException("Input must be a non-negative integer");
    }
        
        StringBuilder binary =new StringBuilder();
        
        
        while (decimal > 0) {
            binary.insert(0, decimal % 2);
            decimal /= 2;
        }
        
        
        while (binary.length() < 8) {
            binary.insert(0, '0');
        }
        
        return binary.toString();
    }
    
    public static int swapNibbles(int decimal) {
        return ((decimal & 0x0F) << 4 | (decimal & 0xF0) >> 4);
    }
    
    public static boolean isPowerOfTwo(int decimal) {
        return (decimal & (decimal - 1)) == 0;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int num = scanner.nextInt();
        scanner.close();
        
        String binary = toBinary(num);
        System.out.println("Binanry representation: " + binary);
        
        int swapped = swapNibbles(num);
        System.out.println("Number after swapping nibbles: " + swapped);
        
        boolean isPowerOfTwo = isPowerOfTwo(num);
        System.out.println("Is the number a power of 2?" + isPowerOfTwo);
    }
}
