//     Author: 5hiv4
//     Github: github.com/5hiv4
// HackerRank: hackerrank.com/_hemant

import java.lang.Math;
import java.util.Scanner;

public class BinomialDistribution2Solution {

    public static void main(String[] args) {
        /* Store the Given Data */
        Scanner scan = new Scanner(System.in);
        
        double p = scan.nextDouble() / 100;// Probability of Success
        double q = 1 - p; // Probability of Failure
        int n = scan.nextInt(); // No of Trials
        
        /* No more than 2 rejects */
        double case1 = sum(n, 0, 2, p, q);
        System.out.format("%.3f", case1);
        System.out.println();
        
        /* Atleast 2 rejects */
        double case2 = sum(n, 2, 10, p, q);
        System.out.format("%.3f", case2);
    }
    
    /* Create Factorial Method */
    static int factorial(int n){
        if(n == 0){
            return 1;
        } else{
            return (n * factorial(n-1));
        }
    }
    
    static double sum(int n, int start, int end, double p, double q){
        double sum = 0;
        for(int x = start; x <= end; x++){
            // x = No of Success
            double temp = factorial(n) / (factorial(x) * factorial(n - x));
            sum += temp * Math.pow(p, x) * Math.pow(q, n-x);
        }
        return sum;
    }
}