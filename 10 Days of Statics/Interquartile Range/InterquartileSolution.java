//     Author: 5hiv4
//     Github: github.com/5hiv4
// HackerRank: hackerrank.com/_hemant

import java.io.*;
import java.util.*;

public class InterquartileSolution {

    public static void main(String[] args) {
        /* Create and Store data in ArrayList */
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] X = new int[size];
        ArrayList<Integer> array = new ArrayList<Integer>();
        for(int i = 0; i < size; i++){
            X[i] = scan.nextInt();
        }
        for(int i = 0; i< size; i++){
            int k = scan.nextInt();
            for(int j = 0; j < k; j++){
                array.add(X[i]);
            }
        }
		scan.close();
        /* Sorting ArrayList() */
        Collections.sort(array);

		/* Calling output Method and Calculating the quartile */
        double q1 = output(array, 0 , array.size()/2 - 1);
        double q2;
        if((array.size()&1) == 0){
            q2 = output(array, array.size()/2, array.size() - 1);
        } else{
            q2 = output(array, array.size()/2 + 1, array.size() - 1);
        }
        
        //System.out.println(Arrays.toString(array.toArray()));

		/* Calculating and printing the quartileRange with upto 1 decimal format */
        System.out.format("%.1f", q2-q1);
        
    }
    
	/* Creating Method to Calculte quartile */
    private static double output(ArrayList<Integer> list, int start, int end){
        int length = end - start + 1;
        double result = 0;
        if((list.size()&1) == 0)
			{// For Even Number of Elements :
            result = ((list.get(start + length/2) + list.get(start + length/2 - 1)) / 2);
        } else{
			// For Odd Number of Elements :
            result = list.get(start + length/2);
        }
        return result;
    }

}