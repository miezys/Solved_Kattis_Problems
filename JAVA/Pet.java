/**
	Author Erlandas Miezys
	https://open.kattis.com/problems/pet
*/

import java.util.Arrays;
import java.util.Scanner;

public class ProgEx {
    static public void main(String args[]){
        
        Scanner reader = new Scanner(System.in);
        int[] intArray = new int[5];
        
        for (int i=0; i<5; i++){
            int result = 0;
            for (int j=0; j<4; j++){
                int n = reader.nextInt();
                result += n;
            }
            intArray[i] = result;
        }
        for (int i=0; i<intArray.length; i++){
            if (Arrays.stream(intArray).max().getAsInt() == intArray[i]){   // looking for index of the max valued integer in an array
                System.out.print(i+1 +" "+ intArray[i]);
            }
        }
    }
}