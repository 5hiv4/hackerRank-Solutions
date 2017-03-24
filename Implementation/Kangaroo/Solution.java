//     Author: 5hiv4
//     Github: github.com/5hiv4
// HackerRank: hackerrank.com/_hemant

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Read and Save Input */
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        int out = 0;
        
        /* Compare the conditions and Write Output */
        if (v1 == v2) 
            System.out.println("NO");               
        else if (((x1 - x2) % (v2 - v1)) == 0 && ((x1 - x2) / (v2 - v1)) > 0) {
            System.out.println("YES");
        } else
            System.out.println("NO");
        
    }
}

/*  Let y1 be the total amounts of jumps that kangaroo 1 does so we have:
            x1 + y1*v1 = S1, the distance that kangoroo 1 will get to after jumping y1 times.
            
            Similarly, x2 + y2*v2 = S2, the distance that kangoroo 2 will get to after jumping y2 times.
            
            Question: Given the starting locations and movement rates for each kangaroo, can you determine if they'll ever land at             the same location at the same time?
            
            so it means they will meet when S1 = S2 => x1 + y1*v1 = x2 + y2*v2, now we assume that both kangaroo did the same jump             then met each other at the same location so the equation now is
            x1 + y*v1 = x2 + y*v2 <=> y = (x1 - x2)/(v2 - v1) now can you guess what is the condtion for y is base on the above               equation? */