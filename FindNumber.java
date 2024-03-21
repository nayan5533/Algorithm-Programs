/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.findnumber;
import java.util.Scanner;

/**
 *
 * @author nayan
 */
public class FindNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the value of N(N should be power of 2): ");
        int N = scanner.nextInt();
        
        int questions = (int) (Math.log(N) / Math.log(2));
        
        int low = 0;
        int high = N - 1;
        
        while (low <= high) {
            int mid = (low + high) / 2;
            System.out.println("Your number between  " + low + " and " + mid + " ?");
            System.out.println("Enter true/false: ");
            boolean isBetween = scanner.nextBoolean();
            
            if (isBetween) {
                high = mid;
        } else {
                low = mid + 1;
            }
        }
        
        System.out.println("Your number is : " + low);
        
        scanner.close();
    }
}
