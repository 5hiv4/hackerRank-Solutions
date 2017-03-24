//     Author: 5hiv4
//     Github: github.com/5hiv4
// HackerRank: hackerrank.com/_hemant

import java.util.Scanner;

public class Solution {
    
    /* Create Function to Round the Grade */
    private static int round(int grade){
        if(grade < 38){
            return grade;
        }else{
            int i = 0;
            while(i <= 100){
                if(i > grade){
                    if((i - grade)< 3){
                       grade = i;
                        break;                        
                    }
                }
                i += 5;
            }
            return grade;
        }
    }

    public static void main(String[] args) {
        /* Read and Store */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int a0 = 0; a0 < n; a0++){
            int grade = in.nextInt();
            
            /* Print Output */
            System.out.println(round(grade));
        }
        in.close();
    }
}


/* One Line Output */
/* System.out.println(grade < 38 || (grade % 5) < 3 ? grade : grade + (5 - (grade % 5))); */