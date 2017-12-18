//     Author: 5hiv4
//     Github: github.com/5hiv4
// HackerRank: hackerrank.com/_hemant

import java.lang.Math;
import java.util.Scanner;

public class ND1Solution {

    public static void main(String[] args) {
        /* Read and Store input */
        Scanner scan = new Scanner(System.in);
        double mean = scan.nextDouble();
        double deviation = scan.nextDouble();
        
        /* Calculate Normal Distribution */
        double out1 = cumulative(deviation, mean, scan.nextDouble());
        double out2 = - cumulative(deviation, mean, scan.nextDouble()) + cumulative(deviation, mean, scan.nextDouble());
        
        /* Print Output */
        System.out.format("%.3f%n", out1);
        System.out.format("%.3f%n", out2);
        scan.close();
    }
    
    /* Calculate cumulative probability */
    private static double cumulative(double standard, double mean, double x){
        double parameter = (x - mean) / ( standard * Math.sqrt(2));
        return 0.5 * (1 + erf(parameter));
    }
    
    /* Calculate erf function */
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
