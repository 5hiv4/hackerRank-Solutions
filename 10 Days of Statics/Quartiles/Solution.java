//     Author: 5hiv4
//     Github: github.com/5hiv4
// HackerRank: hackerrank.com/_hemant

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Create and store Data. */
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] elements = new int[size];
        for(int i = 0; i < size; i++){
            elements[i] = scan.nextInt();
        }
        scan.close();
        
        /* Sort array: O(n log n) runtime */
        Arrays.sort(elements);
       
		// Call quartile method to get the output value 
		System.out.println(output(elements, 0 , size/2));
        System.out.println(output(elements, 0 , size));
        if((size&1)==0){
           System.out.println(output(elements, size/2, size)); 
        } else{
            System.out.println(output(elements, size/2+1, size));
        }                
    }
    
    /* Create method to calculate quartile in a given range */
     private static int output(int[] array, int start, int end){
            int length = end - start ;
            int result = 0;
            if((length&1) == 0){
                result = (array[start + length/2] + array[start + length/2 - 1]) / 2;
            } else{
                result = array[start + length/2];
            }
            return result;
        }
}

  
        /* Calculate quartiles */
		// Don't Use this code: See the second code
		/*
        int median1 = 0;
        int median2 = 0;
        int median3 = 0;
        
        int middle = size / 2;
        
        if((size&1) == 1){
            median2 = elements[middle];
            if((middle&1) == 1){
                median1 = elements[middle/2];
                median3 = elements[middle + middle/2 + 1];
            
            } else {
                median1 = (elements[middle/2 ] + elements[middle/2 - 1]) / 2;
                median3 = (elements[middle +  middle/2 + 1] + elements[middle + middle/2]) / 2;
             }
        } 
        
        else{
            median2 = (elements[middle]+elements[middle - 1]) / 2;
            if((middle&1) == 1){
                median1 = elements[middle/2];
                median3 = elements[middle + middle/2];
            
            } else {
                median1 = (elements[middle/2 ] + elements[middle/2 - 1]) / 2;
                median3 = (elements[middle +  middle/2 - 1] + elements[middle + middle/2]) / 2;
            }
        }
        
        
        System.out.println(median1);
        System.out.println(median2);
        System.out.println(median3);
		*/