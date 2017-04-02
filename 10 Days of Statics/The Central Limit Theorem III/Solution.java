//     Author: 5hiv4
//     Github: github.com/5hiv4
// HackerRank: hackerrank.com/_hemant

import java.lang.Math;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Solution {
    /* In other words, this problem is telling to calculate Confidence Interval: */
    
    private static double MarginError(double std, double zScore, double n){
        double stdErr = std/Math.sqrt(n);
        return zScore * stdErr;
    }

    public static void main(String[] args) {
        /* Read and Save */
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###.##");
        double n = scan.nextDouble();
        double mean = scan.nextDouble();
        double stdev = scan.nextDouble();
        double interval = scan.nextDouble();
        double zScore = scan.nextDouble(); // for 95% of Interval
        
        /* Calculate Confidence Interval and Print */
        System.out.println(df.format(mean - MarginError(stdev, zScore, n))); // For lowerLimit of CI
        System.out.println(df.format(mean + MarginError(stdev, zScore, n))); // For UpperLimit of CI
    }
}