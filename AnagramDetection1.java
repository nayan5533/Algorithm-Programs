/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.anagramdetection1;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author nayan
 */
public class AnagramDetection1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        //Input 2 str
        System.out.println("Enter the first string: ");
        String str1 = scanner.nextLine();
        
        System.out.println("Enter the second string: ");
        String str2 = scanner.nextLine();
        
        //Check Str anagrams
        if (areAnagrams(str1, str2)) {
            System.out.println("The two strings are anagrams.");
        } else {
            System.out.println("The two strings are not anagrams.");
        }
        
        scanner.close();
    }
    
    //Function check 2 str anagrams
    public static boolean areAnagrams(String str1, String str2) {
        // Remove spaces & convert str lowercase
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();
        
        //Check lengths equal
        if (str1.length() != str2.length()) {
            return false;
        }
        
        //Convert str char arrays & sort
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        
        //Compare sort arratys
        return Arrays.equals(charArray1, charArray2);
    }
}
