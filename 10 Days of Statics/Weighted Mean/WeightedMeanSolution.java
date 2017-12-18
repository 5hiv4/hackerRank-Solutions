//     Author: 5hiv4
//     Github: github.com/5hiv4
// HackerRank: hackerrank.com/_hemant

import java.io.*;
import java.util.*;

public class WeightedMeanSolution {

    public static void main(String[] args) {
        /* Read Input: Create and Fill an Array */
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        int[] array = new int[length];
        int[] weightArray = new int[length];
        
        for(int i=0; i<length; i++){
            array[i] = scan.nextInt();
        }
        
        for(int i=0; i<length; i++){
            weightArray[i] = scan.nextInt();
        }
        
        scan.close();
        
        /* Calculate the weighted mean of Given Elements  */
        double arraySum = 0;
        double sumWeightArray = 0;
        for(int i = 0; i < length; i++){
            arraySum = arraySum + array[i] * weightArray[i];
            sumWeightArray = sumWeightArray + weightArray[i];
        }
        
        double mean = arraySum / sumWeightArray;
        
        /* print the weighted mean of Given Elements */
        System.out.format("%.1f", mean);
        
    }
}