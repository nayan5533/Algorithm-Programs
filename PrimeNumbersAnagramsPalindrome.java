/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.primenumbersanagramspalindrome;
import java.util.Arrays;

/**
 *
 * @author nayan
 */
public class PrimeNumbersAnagramsPalindrome {

    public static void main(String[] args) {
        int range = 1000;
        System.out.println("Prime numbers that are anagrams & palindromes within the range 0 to " + range + ": ");
        printPrimeAnagramsAndPalindromes(range);
    }
    
    //Function check number prime
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
    // function check number palindrome
    public static boolean isPalindrome(int number) {
        String numStr = Integer.toString(number);
        return numStr.equals(new StringBuilder(numStr).reverse().toString());
    }
    
    //Function check 2 str anagrams
    public static boolean areAnagrams(String str1, String str2) {
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        return Arrays.equals(charArray1, charArray2);
    }
    
    //Function print prime numbers annagrams & palindrome within range
    public static void printPrimeAnagramsAndPalindromes(int range) {
        for(int i = 0; i <= range; i++) {
            if (isPrime(i)) {
                String str1 = Integer.toString(i);
                if (isPalindrome(i) && isPrime(i) && areAnagrams(str1, new StringBuilder(str1).reverse().toString())) {
                    System.out.println(i + " ");
                }
            }
        }
    }
}
