//     Author: 5hiv4
//     Github: github.com/5hiv4
// HackerRank: hackerrank.com/_hemant

import java.lang.Math;

public class Solution {

    public static void main(String[] args) {
        
        /* Store the Data */
        double p = 1.09/2.09; // Probability of Success
        double q = 1 - p; // Probability of Failure
        int n = 6; // Number of Trials
        double sum = 0;
        
        /* Calculate binomial distribution for x = 3,4,5,6 */
        /* Binomial Distribution b(x,n,p) = n!/(x! * (n - x)!) * p^x * q^(n-x) */
        
        for( int x = 3; x <= 6; x++){ // x = Number of Success
            
            double temp = factorial(n) / (factorial(x) * factorial(n-x));
            sum += temp * Math.pow(p,x) * Math.pow(q, n -x) ;
        }
        
        /* Print output upto 3 decimal */
        System.out.format("%.3f", sum);
    }
    
    /* Create method to Calculate Factorial */
    static int factorial(int n){
        if(n == 0){
            return 1;
        } else{
            return(n * factorial(n-1));
        }
    }
}