//     Author: 5hiv4
//     Github: github.com/5hiv4
// HackerRank: hackerrank.com/_hemant

import java.util.stream.*;
import java.lang.Math;

public class Solution {

    public static void main(String[] args) {
        /* Store the Data */
        int n = 5;
        int[] X = {95, 85, 80, 70, 60};
        int[] Y = {85, 95, 70, 65, 70};
        int mathScore = 80;
        
        int mean_x = mean(X, n);
        int mean_y = mean(Y, n);
        
        /* Calculate b = pearson_cofficient * stdev(y) / stdev(x) */
        double b = pearson(X, Y, n) * stdev(Y, n) / stdev(X, n);
        double a = mean_y - b * mean_x;
        
        /* y = a + b.x */
        double output = a + b * 80;
        System.out.format("%.3f",output);        
    }
    
    /* Create function to calculate mean */
    private static int mean(int[] arr, int size){
        int sum = IntStream.of(arr).sum();
        return sum/size;
    }
    
    /* Create function to calculate stdev */
    private static double stdev(int[] arr, int size){
        int mean = mean(arr, size);
        int sum = 0;
        for(int i = 0; i < size; i++){
            sum += (arr[i] - mean) * (arr[i] - mean);
        }
        return Math.sqrt(sum / size);
    }
    
    /* Create function to calculate pearson coefficient */
    private static double pearson(int[] arr, int[] arr1, int size){
        int mean_x = mean(arr, size);
        int mean_y = mean(arr1, size);
        
        double stdev_x = stdev(arr, size);
        double stdev_y = stdev(arr1, size);
        
        double sum = 0;
        for(int i = 0; i < size; i++){
            sum += (arr[i] - mean_x) * (arr1[i] - mean_y);
        }
        return sum / (size * stdev_x * stdev_y);
    }
}