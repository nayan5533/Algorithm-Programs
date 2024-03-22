/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bubblesort;
import java.util.Scanner;

/**
 *
 * @author nayan
 */
public class BubbleSort {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the list of integers separetd by space: ");
        String input = scanner.nextLine();
        String[] strNumbers = input.split("\\s+");
        int[] numbers = new int[strNumbers.length];
        
        
        for(int i = 0; i < strNumbers.length; i++) {
            numbers[i] = Integer.parseInt(strNumbers[i]);
        }
        
        bubbleSort(numbers);
        
        System.out.println("Sorted List: ");
        for(int number : numbers) {
            System.out.println(number + " ");
        }
        System.out.println();
    }
    
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n -1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
