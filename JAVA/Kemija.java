/**
	Author Erlandas Miezys
	https://open.kattis.com/problems/kemija08
*/

import java.util.Scanner;

public class Kemija {

    static char [] vowel = {'a','e','i','o','u'};

    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);


        String input =reader.nextLine();

        for (int i=0; i<input.length(); i++){
            if(!isVowel(input.charAt(i))){
                System.out.print(input.charAt(i));
            }
            else{
                System.out.print(input.charAt(i));
                i++;
                i++;
            }
        }

    }
    public static boolean isVowel(char a){
        boolean isVovel = false;
        for(int i=0; i<vowel.length; i++){
            if (a == vowel[i]){
                isVovel = true;
            }
        }
        return isVovel;
    }
}