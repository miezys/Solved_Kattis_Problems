/**
	Author Erlandas Miezys
	https://open.kattis.com/problems/reversebinary
*/

import java.util.Scanner;

public class ProgEx {
    static public void main(String args[]){
        
        Scanner reader = new Scanner(System.in);
        
        int n = reader.nextInt();           // read integer
        int result = 0;                     // result
        while (n != 0){
              result = result << 1;         // left shift ( * 2)
              result = result | ( n & 1);   // result bitwise or ( n and 1)
              n = n >> 1;                   // right shift (/ 2)
            }
        System.out.println(result);       
    }
}