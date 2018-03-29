/**
	Author Erlandas Miezys
	https://open.kattis.com/problems/convexpolygonarea
*/

import java.util.Scanner;

public class ConvexPolygonArea {
    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        
        
        for (int i=0; i<n; i++) {       
            int m = reader.nextInt();
            int[] x = new int[m];
            int[] y = new int[m];
            for(int j=0;j<m; j++) {
                x[j] = reader.nextInt();
                y[j] = reader.nextInt();
            }
                 
            int xSum = 0;
            int ySum = 0;
            
            for(int j=0; j<m; j++) {
                if(j != m-1) {
                    xSum += (x[j] * y[j+1]);
                
                } else {
                    xSum += (x[j] * y[0]);
            
                }
            }
            
            for(int j=0; j<m; j++) {
                if(j != m-1) {
                    ySum += (y[j] * x[j+1]);
                } else {
                    ySum += (y[j] * x[0]);
                }
            }

            System.out.println(0.5*Math.abs(xSum-ySum));
        }
        
    }

}