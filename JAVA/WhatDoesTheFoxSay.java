/**
	Author Erlandas Miezys
	https://open.kattis.com/problems/whatdoesthefoxsay
*/

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class WhatDoesTheFoxSay {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);

        int t = Integer.parseInt(reader.nextLine());

        for(int i=0; i<t; i++){
            String allSays = reader.nextLine();
            String[] allwords = allSays.split(" ");
            Set<String> oneAnimalSays = new HashSet<>();
            String input = reader.nextLine();
            while(!input.equals("what does the fox say?")){
                oneAnimalSays.add(input.substring(input.lastIndexOf(" ") + 1, input.length()));
                input = reader.nextLine();
            }


            for(int j=0; j<allwords.length; j++){
                if(!oneAnimalSays.contains(allwords[j])){
                    System.out.print(allwords[j] + " ");
                }
            }
            System.out.println();
        }
    }
}