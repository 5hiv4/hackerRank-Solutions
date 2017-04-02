//     Author: 5hiv4
//     Github: github.com/5hiv4
// HackerRank: hackerrank.com/_hemant

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Read and Store Data */
        Scanner scan = new Scanner(System.in);
        double A = scan.nextDouble();
        double B = scan.nextDouble();
        scan.close();
        
        /* E(X^2) = lambda + lambda^2 : insert this into cost formula */
        double dailyCostA = 160 + 40*(A + (A * A));
        double dailyCostB = 128 + 40*(B + (B * B));
        
        /* Print Output upto 3 decimal */
        System.out.format("%.3f", dailyCostA);
        System.out.println();
        System.out.format("%.3f", dailyCostB);
    }
}