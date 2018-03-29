/**
	Author Erlandas Miezys
	https://open.kattis.com/problems/speedlimit
*/

import java.util.Scanner;

public class ProgEx {

    static public void main(String args[]){
        
        Scanner reader = new Scanner(System.in);
        int total = 0;
        int previousTime = 0;
        
        int n = reader.nextInt();           // # of inputs
        
        while (n > 0){
            
            for (int i = 0; i<n; i++){
                int s = reader.nextInt();   // speed
                int t = reader.nextInt();   // time traveled
                
                total = total + (t - previousTime) * s;
                previousTime = t;
                
            }
            System.out.println(total + " miles");
            n = reader.nextInt();           // # of inputs
            total = 0;
            previousTime = 0;
        }
    }
    
}