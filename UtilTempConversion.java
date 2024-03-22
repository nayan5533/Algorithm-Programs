/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.utiltempconversion;

/**
 *
 * @author nayan
 */
public class UtilTempConversion {
    
    public static double temperatureConversion(double temperature, String fromUnit, String toUnit) {
        if (fromUnit.equalsIgnoreCase("C") && toUnit.equalsIgnoreCase("F")) {
            return (temperature * 9 / 5) + 32;
        } else if (fromUnit.equalsIgnoreCase("F") && toUnit.equalsIgnoreCase("C")) {
            return (temperature - 32) * 5 / 9;
        } else {
            System.out.println("Invalid units provided.Please use 'C' for Celsius or 'F' for Fahrenheit.");
            return Double.NaN;
        }
    }
    
    public static void main(String[] args) {
        
        double tempFahrenheit = 98.6;
        double tempCelsius = temperatureConversion(tempFahrenheit, "F", "C");
        System.out.println("Temperature in Celsius: " + tempCelsius);
        
        double tempConvertedBack = temperatureConversion(tempCelsius, "C", "F");
        System.out.println("Temperature in Fahrenheit: " + tempConvertedBack);
    }
}
