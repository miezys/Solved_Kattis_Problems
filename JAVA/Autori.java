/**
	Author Erlandas Miezys
	https://open.kattis.com/problems/autori
*/


import java.util.Scanner;

public class Autori {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        String input = reader.nextLine();
        String [] words = input.split("-");

        for(int i=0; i<words.length; i++){
            System.out.print(words[i].charAt(0));
        }
    }
}