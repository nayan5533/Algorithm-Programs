/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.utilityclass;
import java.util.Arrays;
/**
 *
 * @author nayan
 */

public class UtilityClass {

    
    public static int binarySearch(int[] arr, int key) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == key) {
                return mid;
            }

            if (arr[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    
    public static int binarySearch(String[] arr, String key) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int compareResult = key.compareTo(arr[mid]);

            if (compareResult == 0) {
                return mid;
            }

            if (compareResult > 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

   
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
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

    
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    
    public static void bubbleSort(String[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    // swap arr[j+1] and arr[i]
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    
    public static void printArray(String[] arr) {
        for (String str : arr) {
            System.out.print(str + " ");
        }
        System.out.println();
    }

    
    public static long measureElapsedTime(Runnable method) {
        long startTime = System.nanoTime();
        method.run();
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    public static void main(String[] args) {
       
        int[] intArr = {5, 2, 8, 1, 6};
        String[] strArr = {"apple", "banana", "orange", "grape", "kiwi"};

        System.out.println("Original Integer Array:");
        printArray(intArr);
        long insertionSortTime = measureElapsedTime(() -> insertionSort(intArr));
        System.out.println("Sorted Integer Array (Insertion Sort):");
        printArray(intArr);
        System.out.println("Elapsed Time for Insertion Sort: " + insertionSortTime + " ns");

        System.out.println();

        System.out.println("Original String Array:");
        printArray(strArr);
        long bubbleSortTime = measureElapsedTime(() -> bubbleSort(strArr));
        System.out.println("Sorted String Array (Bubble Sort):");
        printArray(strArr);
        System.out.println("Elapsed Time for Bubble Sort: " + bubbleSortTime + " ns");

        int key = 8;
        System.out.println("Index of " + key + " in the Integer Array after sorting (Binary Search): " + binarySearch(intArr, key));

        String strKey = "banana";
        System.out.println("Index of " + strKey + " in the String Array after sorting (Binary Search): " + binarySearch(strArr, strKey));
    }
}




