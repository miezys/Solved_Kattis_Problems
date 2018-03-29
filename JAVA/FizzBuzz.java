/**
	Author Erlandas Miezys
	https://open.kattis.com/problems/fizzbuzz
*/

import java.util.Scanner;

public class ProgEx {
    static public void main(String args[]){
        Scanner reader = new Scanner(System.in);
        int x = reader.nextInt();
        int y = reader.nextInt();
        int n = reader.nextInt();
        
        
        
        for (int i=1; i<=n; i++){
            if (divisible(i,x) && !divisible(i,y)){
                System.out.println("Fizz");
            }
            else if (!divisible(i,x) && divisible(i,y)){
                System.out.println("Buzz");
            }
            else if (divisible(i,x) && divisible(i,y)){
                System.out.println("FizzBuzz");
            }
            else {
                System.out.println(i);
            }
            
        }

    }
    
     public static boolean divisible(int index, int var){
         if (index%var == 0){
             return true;
         }
         else return false;
    }
}