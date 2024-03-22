/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.insertionsort;
import java.util.Scanner;
/**
 *
 * @author nayan
 */
public class InsertionSort {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the list of words separeated by space: ");
        String input = scanner.nextLine();
        String[] words = input.split("\\s+");
        
        insertionSort(words);
        
        System.out.print("Sorted List: ");
        for (String word : words) {
            System.out.println(word + " ");
        }
        System.out.println();
    }
    
    public static void insertionSort(String[] arr) {
        for (int i = 1; i < arr.length; i++) {
            String key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].compareTo(key) > 0) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}
