/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.primenumbersinrange;

/**
 *
 * @author nayan
 */
public class PrimeNumbersInRange {

    public static void main(String[] args) {
        int range = 1000;
        System.out.println("Prime numbers within the range 0 to " + range + ": ");
        printPrimeNumbers(range);
    }
    
    //Function check number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
        if (number % i == 0) {
            return false;
        }
    }
        return true;
    }
    
    // function print prime numbers within given range
    public static void printPrimeNumbers(int range) {
        for (int i = 0; i <= range; i++) {
            if (isPrime(i)) {
                System.out.println(i + " ");
            }
        }
    }
}
