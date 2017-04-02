//     Author: 5hiv4
//     Github: github.com/5hiv4
// HackerRank: hackerrank.com/_hemant

import java.lang.Math;
import java.util.Scanner;

public class Solution {
    
    /* Create method to calculate factorial */
    static int factorial(int n){
        if(n <= 0){
            return 1;
        } else{
            return n * factorial(n-1);
        }
    }
    
    /* Create Poission Distribution Method */
    static double poission(double lambda, int k){
        double e = 2.71828;
        return Math.pow(lambda, k) * Math.pow(e, -(lambda)) / factorial(k);
    }  
    
    
    public static void main(String[] args) {
        /* Read and Store value */
        Scanner scan = new Scanner(System.in);
        double avg = scan.nextDouble();
        int value = scan.nextInt();
        scan.close();
        
        // Calling Poission Method and Print Output
        double output = poission(avg, value);
        System.out.format("%.3f", output); 
    }
}