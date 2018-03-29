/**
	Author Erlandas Miezys
	https://open.kattis.com/problems/aboveaverage
*/


import java.text.DecimalFormat;
import java.util.Scanner;
import java.math.*;

public class AboveAverage{

     public static void main(String []args){
        Scanner reader = new Scanner(System.in);
        int c;
        int n;
        c = reader.nextInt();
        for(int i=0; i<c; i++){
            n = reader.nextInt();
            int average = 0;
            int[] digits = new int[n];
            for(int j=0; j<n; j++){
                digits[j] = reader.nextInt();
                average += digits[j];
            }
            average /= n;
            int aboveAverage = 0;
            for(int j=0; j<n; j++){
                if(digits[j] > average) aboveAverage++;
            }
            DecimalFormat df = new DecimalFormat("0.000");
            //df.setRoundingMode(RoundingMode.CEILING);
            double result = ((double)(aboveAverage*100.0) /n);
            System.out.println(df.format(result) + "%");
          
        }
     }
}