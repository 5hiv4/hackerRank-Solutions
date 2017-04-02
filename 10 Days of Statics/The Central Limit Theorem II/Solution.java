//     Author: 5hiv4
//     Github: github.com/5hiv4
// HackerRank: hackerrank.com/_hemant

import java.lang.Math;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Read and Store */
        Scanner scan = new Scanner(System.in);
        double maxTicket = scan.nextDouble();
        double n = scan.nextDouble();
        double mean = scan.nextDouble();
        double std = scan.nextDouble();
        scan.close();
        
        /* For large n , the distribution of sample sums  is close to normal distribution, where
		Mean = n * Mean;
		Std = sqrt(n) * std; */
        
        double sampleMean = mean * n;
        double sampleStd = std * Math.sqrt(n);
        
        System.out.format("%.4f", cumulative(sampleMean, sampleStd, maxTicket));
    }
    
    /* Calculate cumulative Probability */
    private static double cumulative(double mean, double std, double x){
        double parameter = ( x - mean) / (std * Math.sqrt(2));
        return (0.5) * (1 + erf(parameter));
    }
    
    public static double erf(double z) {
        double t = 1.0 / (1.0 + 0.5 * Math.abs(z));

        // use Horner's method
        double ans = 1 - t * Math.exp( -z*z   -   1.26551223 +
                                            t * ( 1.00002368 +
                                            t * ( 0.37409196 + 
                                            t * ( 0.09678418 + 
                                            t * (-0.18628806 + 
                                            t * ( 0.27886807 + 
                                            t * (-1.13520398 + 
                                            t * ( 1.48851587 + 
                                            t * (-0.82215223 + 
                                            t * ( 0.17087277))))))))));
        if (z >= 0) return  ans;
        else        return -ans;
    }
}