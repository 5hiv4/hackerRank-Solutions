//     Author: 5hiv4
//     Github: github.com/5hiv4
// HackerRank: hackerrank.com/_hemant

import java.io.*;
import java.util.*;
import java.util.stream.*;

public class MMMSolution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] array = new int[n];
        double mean=0, median = 0;
        
        /* Calculate and Print Mean */
        for(int i = 0; i<n; i++){
            array[i] = scan.nextInt();
            mean= mean+array[i];
        }        
        System.out.format("%.1f%n",mean / n);
        
        /* Sorting Array : O(n) time complexity */
        Arrays.sort(array);
        
        /* Calculate and Print Median */
        if( n%2 != 0){
            median = array[n/2];
        }
        else {
            double sum = array[n/2]+ array[n/2 - 1];
            median = sum / 2;
        }
        System.out.println(median);
        
        /* Calculate and print Mode */
        int max = 0, count = 0;
        int mode = array[0];
        for(int i = 0; i < n-1; i++)
            {
                if(array[i] == array[i+1]){
                    count++;
                    if(max < count){
                        max = count;
                        mode = array[i];
                    }
                    
                }else {
                    count = 0;
                }
        }
        System.out.println(mode);
    }
}