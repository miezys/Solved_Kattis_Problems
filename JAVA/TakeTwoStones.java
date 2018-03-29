/**
	Author Erlandas Miezys
	https://open.kattis.com/problems/twostones
*/


import java.util.List;
import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        
        
        if (num % 2 != 0){
            System.out.println("Alice");
        }
        else if (num % 2 == 0){
            System.out.println("Bob");
        }
        
    }
}