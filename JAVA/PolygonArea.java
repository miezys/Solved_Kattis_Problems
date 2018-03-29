/**
	Author Erlandas Miezys
	https://open.kattis.com/problems/polygonarea
*/

import java.text.DecimalFormat;
import java.util.Scanner;

public class PolygonArea {
    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        
        int n = reader.nextInt();
        while(n != 0) {
            
            int[] x = new int[n];
            int[] y = new int[n];
            
            for(int i=0; i<n; i++) {
                x[i] = reader.nextInt();
                y[i] = reader.nextInt();
            }
            
            int sum = 0;
            
            for(int i=0; i<n; i++) {
                if (i != n-1) {
                    sum = sum + ((x[i] * y[i+1]) - (y[i] * x[i+1]));
                } else {
                    sum = sum + ((x[i] * y[0]) - (y[i] * x[0]));
                }
            }
            
            DecimalFormat df = new DecimalFormat("0.0");
            
            String output = (sum < 0) ? "CW " + df.format(0.5*(-1*sum)) : "CCW " + df.format(0.5*sum);
            System.out.println(output);
            
            n = reader.nextInt();
        }
    }

}