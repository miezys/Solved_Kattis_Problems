/**
	Author Erlandas Miezys
	https://open.kattis.com/problems/trik
*/

import java.util.Scanner;

public class ProgEx {
    static public void main(String args[]){
        Scanner reader = new Scanner(System.in);
        String string = reader.nextLine();
        int result = 1;
        
        for(int i = 0; i<string.length(); i++ ){
            if (Character.toString(string.charAt(i)).equals("A") && result == 1){
                result = 2;
            }
            else if (Character.toString(string.charAt(i)).equals("A") && result == 2){
                result = 1;
            }
            else if (Character.toString(string.charAt(i)).equals("B") && result == 2){
                result = 3;
            }
            else if (Character.toString(string.charAt(i)).equals("B") && result == 3){
                result = 2;
            }
            else if (Character.toString(string.charAt(i)).equals("C") && result == 1){
                result = 3;
            }
            else if (Character.toString(string.charAt(i)).equals("C") && result == 3){
                result = 1;
            }
        }
        System.out.println(result);
    }
}