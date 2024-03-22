/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fewestnotesvendingmachine;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author nayan
 */
public class FewestNotesVendingMachine {
    private static final int[] denominations = {1000, 500, 100, 50, 10, 5, 2, 1};
    
    public static void main(String[] args) {
        int change = 1234;
        
        List<Integer> notes = getFewestNotes(change);
        int count = notes.size();
        
        System.out.println("Minimum number of notes needed: " + count);
        System.out.println("Notes to be returned: " + notes);
    }
    
    public static List<Integer> getFewestNotes(int change) {
        List<Integer> result = new ArrayList<>();
        getFewestNotesHelper(change, result);
        return result;
    }
    
    private static void getFewestNotesHelper(int change, List<Integer> result) {
        if (change == 0)
            return;
        
        int denominationIndex = findLargestDenomination(change);
        int denominationValue = denominations[denominationIndex];
        int noteCount = change / denominationValue;
        
        for (int i = 0; i < noteCount; i++) {
            result.add(denominationValue);
        }
        
        int remainingChange = change % denominationValue;
        getFewestNotesHelper(remainingChange, result);
    }
    
    private static int findLargestDenomination(int change) {
        for (int i = 0; i < denominations.length; i++) {
            if (denominations[i] <= change) {
            return i;
        }
    }
    return -1;
    }
}
