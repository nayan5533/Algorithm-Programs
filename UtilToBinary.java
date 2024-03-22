/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.utiltobinary;

/**
 *
 * @author nayan
 */
public class UtilToBinary {
    
    public static String toBinary(int decimal) {
        if (decimal < 0) {
            throw new IllegalArgumentException("Input must be a non-negative integer");
        }
        
        StringBuilder binary = new StringBuilder();
        
        int power = 1;
        while (power <= decimal / 2) {
            power *= 2;
        }
        
        while (power > 0) {
            if (decimal >= power) {
                binary.append('1');
                decimal -= power;
            } else {
                binary.append('0');
            }
            power /= 2;
        }
        
        while (binary.length() % 8 != 0) {
            binary.insert(0, '0');
        }
        
        return binary.toString();
        
    }
    
    public static void main(String[] args) {
        if (args.length < 1){
            System.out.println("Usage: Java Util <decimal>");
            return;
        }
        
        int decimal = Integer.parseInt(args[0]);
        
        String binary = toBinary(decimal);
        System.out.println("Binanry representation of " + decimal + " is " + binary);
    }
}
