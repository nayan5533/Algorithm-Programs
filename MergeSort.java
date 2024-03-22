/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mergesort;

/**
 *
 * @author nayan
 */
public class MergeSort {
    
    public static void mergeSort(String[] array) {
        if (array == null || array.length <= 1)
            return;
        
        String[] temp = new String[array.length];
        mergeSort(array, temp, 0, array.length - 1);
    }
    
    private static void mergeSort(String[] array, String[] temp, int low, int high) {
        if ( low < high) {
            int mid = low + (high - low) / 2;
            mergeSort(array, temp, low, mid);
            mergeSort(array,temp, mid + 1, high);
            merge(array, temp, low, mid, high);
        }
    }
    
    private static void merge(String[] array, String[] temp, int low, int mid, int high) {
        for (int i = low; i <= high; i++) {
            temp[i] = array[i];
    }
    
    
    int i = low;
    int j = mid + 1;
    int k = low;
    
    while (i <= mid && j <= high){
        if(temp[i].compareTo(temp[j]) <= 0) {
            array[k] = temp[i];
            i++;
        } else {
            array[k] = temp[j];
            j++;
        }
        k++;  
}
    
    while (i <= mid) {
    array[k] = temp[i];
    k++;
    i++;
}
}
    public static void main(String[] args) {
        String[] array = { "Banan", "Apple", "Orange", "Grape", "Pinapple"};
        
        System.out.println("Original array: ");
        printArray(array);
        
        mergeSort(array);
        
        System.out.println("\nSorted array: ");
        printArray(array);

}
    private static void printArray(String[] array) {
        for (String element : array) {
            System.out.println(element + " ");
        }
        System.out.println();
    }
}
