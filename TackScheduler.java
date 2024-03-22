/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tackscheduler;
import java.util.*;

/**
 *
 * @author nayan
 */
public class TackScheduler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numTasks = scanner.nextInt();
        
        Task[] tasks = new Task[numTasks];
        for (int i =0; i < numTasks; i++) {
            int deadline = scanner.nextInt();
            int duration = scanner.nextInt();
            tasks[i] = new Task(deadline, duration);
        }
        
        Arrays.sort(tasks,Comparator.comparingInt(task -> task.deadline));
        
        
        int maxOvershoot = 0;
        for (int i = 0; i < numTasks; i++) {
            Task currentTask = tasks[i];
            int completionTime = currentTask.duration;
            
            for (int j = 0; j < i; j++) {
                completionTime += tasks[j].duration;
            }
            int overshoot = Math.max(0, completionTime - currentTask.deadline);
            maxOvershoot = Math.max(maxOvershoot, overshoot);
            
            System.out.println(maxOvershoot);
        }
    }
    
    static class Task {
        int deadline;
        int duration;
        
        public Task(int deadline, int duration) {
            this.deadline = deadline;
            this.duration = duration;
        }
    }
}
