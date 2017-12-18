//     Author: 5hiv4
//     Github: github.com/5hiv4
// HackerRank: hackerrank.com/_hemant

import java.lang.Math;
import java.util.Scanner;

public class ND2Solution {

    public static void main(String[] args) {
        /* Read and Store */
        Scanner scan = new Scanner(System.in);
        double mean = scan.nextDouble();
        double std = scan.nextDouble();
        double in1 = scan.nextDouble();
        double in2 = scan.nextDouble();
        scan.close();
        
        /* Calculate cumulative Distribution */
        double case1 = 1 - cumulative(mean, std, in1);
        double case2 = 1 - cumulative(mean, std, in2);
        double case3 = cumulative(mean, std, in2);
        
        /* Print output in percentage form */
        System.out.format("%.2f%n", case1*100);
        System.out.format("%.2f%n", case2*100);
        System.out.format("%.2f%n", case3*100);
        
    }
    
    /* Calculate Cumulative Distribution Function */
    private static double cumulative(double mean, double std, double x){
        double parameter = (x - mean) / (std * Math.sqrt(2));
        return (0.5) * (1 + erf(parameter));
    }
    
    /* Calculate erf */
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