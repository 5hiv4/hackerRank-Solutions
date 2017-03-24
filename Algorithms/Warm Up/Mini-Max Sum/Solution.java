//     Author: 5hiv4
//     Github: github.com/5hiv4
// HackerRank: hackerrank.com/_hemant

import java.util.Scanner;
import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();
        long d = in.nextLong();
        long e = in.nextLong();
        
        /* Save Sum of 4 value in array */
        long[] array = new long[5];
        array[0] = a + b + c + d;
        array[1] = b + c + d + e;
        array[2] = a + c + d + e;
        array[3] = a + b + d + e;
        array[4] = a + b + c + e;
        
        /* Sort the array and find min and max value */
        Arrays.sort(array);
        System.out.println(array[0] + " " + array[4]);
    }
}