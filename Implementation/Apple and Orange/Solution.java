//     Author: 5hiv4
//     Github: github.com/5hiv4
// HackerRank: hackerrank.com/_hemant

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Read and Save Input */
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        
        /* Count Apple fall in Boundry of House */
        int appleCount = 0;
        int[] apple = new int[m];
        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = a + in.nextInt();
            if(apple[apple_i] >= s && apple[apple_i] <= t)
                appleCount += 1;
        }
        System.out.println(appleCount);
        
        /* Count Orange fall in Boundry of House */
        int orangeCount = 0;
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] =b + in.nextInt();
            if(orange[orange_i] >= s && orange[orange_i]<= t)
                orangeCount += 1;
        }
        System.out.println(orangeCount);        
    }
}