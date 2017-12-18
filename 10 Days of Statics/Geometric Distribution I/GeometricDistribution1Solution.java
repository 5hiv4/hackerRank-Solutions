//     Author: 5hiv4
//     Github: github.com/5hiv4
// HackerRank: hackerrank.com/_hemant

import java.lang.Math;
import java.util.Scanner;

public class GeometricDistribution1Solution {

    public static void main(String[] args) {
        /* Read and Store values. */
        Scanner scan = new Scanner(System.in);
        double p = scan.nextDouble() / scan.nextDouble(); //Probability of Success
        double q = 1 - p; // Probability of Failure
        double n = scan.nextDouble(); // No of Trials
        
        /* Calcution of Geometic Distribution */
        /* g(n,p) = q^(n-1) * p */
        
        double gDistribution = Math.pow(q, n-1) * p;
        System.out.format("%.3f", gDistribution);
        
    }
}