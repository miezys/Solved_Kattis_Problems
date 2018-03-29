/**
	Author Erlandas Miezys
	https://open.kattis.com/problems/modulo
*/


import java.util.Scanner;
public class ProgEx {

    static public void main(String args[]){
        
            Scanner reader = new Scanner(System.in);
            int[] intArray = new int[10];
            int counter = 0, result = 1;
            
            for (int i=0; i<10; i++){
                intArray[i] = reader.nextInt() % 42;    // save results of % 42
            }
        
            for (int i=0; i<9; i++){
            counter = 0;
                for (int j=i+1; j<10; j++){
                    if(intArray[i] == intArray[j]){
                    counter++;
                        }
                    }
                if (counter == 0){
                    result++;
                }
            }
            System.out.println(result);
    }
    
}