//     Author: 5hiv4
//     Github: github.com/5hiv4
// HackerRank: hackerrank.com/_hemant

import java.io.*;
import java.util.*;
import java.lang.Math;

public class Solution {

    public static void main(String[] args) {

        /* Create and store data in Array */
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] array = new int[size];
        int sum = 0;
        for(int i = 0; i<size; i++)
            {
            array[i] = scan.nextInt();
            sum += array[i];
        }
        scan.close();

        /* Calculate Mean */
        double mean = sum / size;
        
        /* Compute the sum of square of distance from mean */
        double compute = 0;
        for(int i = 0; i<size; i++){
            compute +=  (array[i] - mean) * (array[i] - mean);
        }
        
        /* Calculate and print Standard Deviation */
        double deviation = Math.sqrt(compute/size);
        System.out.format("%.1f",deviation);
    }
}
   