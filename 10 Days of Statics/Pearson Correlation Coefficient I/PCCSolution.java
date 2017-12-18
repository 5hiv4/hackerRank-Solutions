//     Author: 5hiv4
//     Github: github.com/5hiv4
// HackerRank: hackerrank.com/_hemant

import java.lang.Math;
import java.util.Scanner;

public class PCCSolution {

    public static void main(String[] args) {
        /* Read and Save Values */
        Scanner scan = new Scanner(System.in);
        int size  = scan.nextInt();
        double[] X = new double[size];
        double[] Y = new double[size];
        
        /* Save data in X variable */
        double sum_x = 0;
        for(int i = 0; i < size; i++){
            X[i] = scan.nextDouble();
            sum_x += X[i];
        }
        
        /* Save data in Y variable */
        double sum_y = 0;
        for(int i = 0; i < size; i++){
            Y[i] = scan.nextDouble();
            sum_y += Y[i];
        }
        
        /* Calculate Mean of X and Y */
        double mean_x = sum_x / size;
        double mean_y = sum_y / size;
        
        /* Standard Deviation of X and Y */
        double stdev_x = stdev(X, mean_x, size);
        double stdev_y = stdev(Y, mean_y, size);
        
        /* Calculate covarience */
        double covarience = 0;
        for(int i = 0; i < size; i++){
            covarience += ((X[i] - mean_x) * (Y[i] - mean_y)) / size;
        }
        
        /* Calculate and print Personal Correlation Coeffiecient */
        double PSCoefficient = covarience / (stdev_x * stdev_y);
        System.out.format("%.3f",PSCoefficient);
        
    }
    
    /* Crete stdev method to calculate standard deviation */
    private static double stdev(double[] variable, double mean, int size){
        double temp = 0;
        for(int i = 0; i < size; i++){
            temp += (variable[i] - mean) * (variable[i] - mean);
        }
        return Math.sqrt(temp / size);
    }
}