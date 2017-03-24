//     Author: 5hiv4
//     Github: github.com/5hiv4
// HackerRank: hackerrank.com/_hemant

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
		/* Create ans Store 2D Array */
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[][] array = new int[size][size];
        int dia11 = 0;
        int dia12 = 0;

		/* Storing Data in 2D Array */
        for(int i = 0; i<size; i++){
            for(int j = 0; j<size; j++){
                array[i][j] = scan.nextInt();              
            }
        }
		scan.close();

		/* Sum of elements of dia11 */
        for(int i=0, j=0; i<size && j<size; i++,j++){
            dia11 = dia11 + array[i][j];
        }

        /* Sum of elements of dia12 */
        for(int i=0, j = size - 1;i<size && j>=0; i++, j--)
            {
            dia12 = dia12 + array[i][j];
        }

		/* Calculate Difference and print absolute output */
        int difference = dia11 - dia12;
        System.out.println(Math.abs(difference));
    }
}