/**
	Author Erlandas Miezys
	https://open.kattis.com/problems/sevenwonders
*/

import java.util.Arrays;
import java.util.Scanner;

public class ProgEx {
    static public void main(String args[]){
        
        Scanner reader = new Scanner(System.in);
        String input = reader.next();
        
        int counterT = 0, counterC = 0, counterG = 0;
        int result = 0;
        
        for (int i=0; i<input.length(); i++){
            if (input.charAt(i) == 'T'){
                counterT++;
            }
            if (input.charAt(i) == 'C'){
                counterC++;
            }
            if (input.charAt(i) == 'G'){
                counterG++;
            }
        }
        
        int[] intArray = new int[3];        // inserting results to an array
        intArray[0] = counterT;
        intArray[1] = counterC;
        intArray[2] = counterG;
        
        int maxValue = Arrays.stream(intArray).max().getAsInt();    // extracting max value
        int minValue = Arrays.stream(intArray).min().getAsInt();    // extracting min value
        
        
        result = (int) (Math.pow(counterT, 2) + Math.pow(counterC, 2) + Math.pow(counterG, 2)); // calculating result

        if (maxValue == minValue){          // checking wether minvalue == maxvalue
            result += maxValue*7;   
            }
        else if(maxValue != minValue && minValue != 0){
            result += minValue*7;
        }
        System.out.println(result);
    }
}