/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.wordsearch;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import static java.util.Arrays.binarySearch;
import java.util.Scanner;

/**
 *
 * @author nayan
 */
public class WordSearch {

    public static void main(String[] args) {
        String[] words = readWordsFromFile("word.txt");
        if (words == null) {
            System.out.println("Error reading file.");
            return;
        }
        
        Arrays.sort(words);
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the word to search: ");
        String wordToSearch = scanner.next();
        
        int index = binarySearch(words, wordToSearch);
        
        if (index != -1) {
        System.out.println("Word found at index " + index);
        } else {
            System.out.println("Word not found.");
            }
    }
    public static String[] readWordsFromFile(String fileName) {
        try{
            Scanner scanner = new Scanner(new File(fileName));
            String content = scanner.useDelimiter("\\Z").next();
            return content.split(",");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public static int binanrySearch(String[] arr, String wprd) {
        int low = 0;
        int high = arr.length - 1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int compareResult = word.compareTo(arr[mid]);
            
            if (compareResult == 0) {
                return mid;
            } else if (compareResult < 0) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        
        return - 1;
    }
}
