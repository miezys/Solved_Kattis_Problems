/**
	Author Erlandas Miezys
	https://open.kattis.com/problems/oddities
*/

import java.util.Scanner;

public class ProgEx {
    static public void main(String args[]){
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
          
        for (int i=0; i<n; i++){
            int values = reader.nextInt();
            if (values%2 == 0){
                System.out.println(values + " is even");
            }
            else {
                System.out.println(values + " is odd");
            }
            
        }
        

    }
}