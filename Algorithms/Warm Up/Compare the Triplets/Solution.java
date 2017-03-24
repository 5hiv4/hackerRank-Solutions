//     Author: 5hiv4
//     Github: github.com/5hiv4
// HackerRank: hackerrank.com/_hemant

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
		/* Read and Store */
        Scanner in = new Scanner(System.in);
        int[] a = new int[3];
        int[] b = new int[3];
        for(int i=0; i<3; i++){
            a[i] = in.nextInt();
        }
        for(int i=0; i<3; i++){
            b[i] = in.nextInt();
        }
		scan.close();

		/* Compare Array a with Array b */
        int count_a = 0;
        int count_b = 0;
        for(int i = 0; i<3; i++)
            {
            if(a[i] > b[i])
                {
                count_a = count_a + 1;
            }
            else if(a[i] < b[i])
                {
                count_b = count_b + 1;
            }
        }

		/* Print the Output */
        System.out.println(count_a + " " + count_b);
    }
}
