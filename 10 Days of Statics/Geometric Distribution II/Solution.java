//     Author: 5hiv4
//     Github: github.com/5hiv4
// HackerRank: hackerrank.com/_hemant

import java.lang.Math;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Read and Store Data */
        Scanner scan = new Scanner(System.in);
        double success = scan.nextDouble() / scan.nextDouble();
        double failure = 1 - success;
        int n = scan.nextInt();
        scan.close();
        
        double gDistribution = 0;
        // Geometric Distribution for cases 1,2,3,4,5
        /* p(1) + p(2) + p(3) + p(4) + p(5) */
        for(int i = 1; i <= n; i++){
            gDistribution += Math.pow(failure, i-1) * success;
        }
        
        System.out.format("%.3f", gDistribution);
    }
}