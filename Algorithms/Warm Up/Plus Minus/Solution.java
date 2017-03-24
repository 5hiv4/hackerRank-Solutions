//     Author: 5hiv4
//     Github: github.com/5hiv4
// HackerRank: hackerrank.com/_hemant

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Read and Store Values */
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] array = new int[size];
        for(int i = 0; i < size; i++){
            array[i] = scan.nextInt();
        }
        scan.close();
        
        /* Count positive, negative and zero values */
        int positive=0, negative=0, zero=0;
        for(int i= 0; i < size; i++){
            if(array[i] > 0)
                positive += 1;
            else if(array[i] < 0)
                negative += 1;
            else
                zero += 1;
        }
        
        /* print fraction of Positive, Negative, zero */
        System.out.println((double)positive/size);
        System.out.println((double)negative/size);
        System.out.println((double)zero/size);
    }
}