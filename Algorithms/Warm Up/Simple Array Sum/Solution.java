//     Author: 5hiv4
//     Github: github.com/5hiv4
// HackerRank: hackerrank.com/_hemant

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Read and Save Array Element */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] array = new int[n];
        int sum = 0;
        for(int i=0; i<n; i++)
            {
            array[i] = scan.nextInt();
            sum = sum + array[i];
        }
        
        /* Print sum of Array Elements */
        System.out.println(sum);
        scan.close();
    }
}
