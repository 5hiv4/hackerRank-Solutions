//     Author: 5hiv4
//     Github: github.com/5hiv4
// HackerRank: hackerrank.com/_hemant

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
		/* Read and Store Input */
        Scanner scan = new Scanner(System.in);
        long sum = 0;
        int size = scan.nextInt();
        int[] array = new int[size];
        for(int i=0; i<size; i++){
            array[i] = scan.nextInt();
            sum = sum + array[i];
        }

		/* Print Output */
        System.out.println(sum);
		scan.close();
    }
}
