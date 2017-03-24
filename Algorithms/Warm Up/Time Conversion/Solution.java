//     Author: 5hiv4
//     Github: github.com/5hiv4
// HackerRank: hackerrank.com/_hemant

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Read and Save the String */
        Scanner scan = new Scanner(System.in);
        String time = scan.next();
        scan.close();
        
        /* Split the String to get Desired Values */
        String[] s1 = time.split(":");
        //String[] s2 = s1[2].split("(?<=\\d)(?=\\D)");
        /* \d for digit \D for non-digit */
        
        /* Convert the hour in 24 hour format */
        int hour = Integer.parseInt(s1[0]); 
        int minute = Integer.parseInt(s1[1]);
        int second = Integer.parseInt(s1[2].substring(0,2));
        String amPm = s1[2].substring(2,4);
        
        if(amPm.equals("AM") && hour == 12){
           hour = 0;
           
        }else if(amPm.equals("PM") && hour < 12){
            hour += 12;
        }
        
        /* Print the required Time Format */
        System.out.format("%02d:%02d:%02d",hour,minute,second);
        
    }
}