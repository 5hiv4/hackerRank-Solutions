//     Author: 5hiv4
//     Github: github.com/5hiv4
// HackerRank: hackerrank.com/_hemant

import java.io.*;
import java.util.*;

public class Solution {
    
    /*
    One way to solve this kind of problem:

    * Store the pairs of (value, index) in an array
    * Sort the array of pairs by value
    * Build the array of ranks from the sorted array of pairs */
    
    public static int[] calculateRanks(double... arr) {
    class Pair {
        final double value;
        final int index;

        Pair(double value, int index) {
            this.value = value;
            this.index = index;
        }
    }

    Pair[] pairs = new Pair[arr.length];
    for (int index = 0; index < arr.length; ++index) {
        pairs[index] = new Pair(arr[index], index);
    }

    Arrays.sort(pairs, (o1, o2) -> -Double.compare(o1.value, o2.value));

    int[] ranks = new int[arr.length];
    int rank = 1;
    for (Pair pair : pairs) {
        ranks[pair.index] = rank++;
    }

    return ranks;
    }
    
    public static void main(String[] args) {
        /* Read and Store Input */
        Scanner scan = new Scanner(System.in);
        int size  = scan.nextInt();
        
        /* Create and save X array */
        double[] X = new double[size];
        for(int i = 0; i < size; i++)
            X[i] = scan.nextDouble();
        
        /* Create and Save Y array */
       double[] Y = new double[size];
        for(int i = 0; i < size; i++)
            Y[i] = scan.nextDouble();
        
        /* Create Rank array of X and Y */
        int[] rank_X = calculateRanks(X);
        int[] rank_Y = calculateRanks(Y);
        
        /* Save the difference of rank array elements */
        double sum = 0;
        for(int i = 0; i < size; i++){
            double temp = rank_X[i] - rank_Y[i];
            sum += temp * temp;
        }
        
        /* Calculate the Spearman's Rank Correlation Coefficient
        * r = 1 - (6 * d^2 / n * (n ^ 2 - 1))
        */
        double rank = 1 - (6 * sum / (size * (size * size -1)));
        System.out.format("%.3f", rank);
        
    }
}