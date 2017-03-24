//     Author: 5hiv4
//     Github: github.com/5hiv4
// HackerRank: hackerrank.com/_hemant

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        /* Read and Save Array Size */
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        scan.close();
        
        /* Create 2D array and Print output */
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                if(j < size - i -1)
                    System.out.print(" ");
                else
                    System.out.print("#");
            }
            System.out.println();
        }
    }
}