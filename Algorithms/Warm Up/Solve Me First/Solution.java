//     Author: 5hiv4
//     Github: github.com/5hiv4
// HackerRank: hackerrank.com/_hemant

import java.util.Scanner;

public class Solution {

	/* Create Method to add two Integer */
    static int solveMeFirst(int a, int b) {
         return a+b;
   }
   
 public static void main(String[] args) {
	 /* Read and Store */
        Scanner in = new Scanner(System.in);
        int a;
        a = in.nextInt();
        int b;
        b = in.nextInt();
        int sum;
        
      /* Call solveMeFirst() method and print the answer */
        sum = solveMeFirst(a, b);
        System.out.println(sum);
   }
}
