/**
	Author Erlandas Miezys
	https://open.kattis.com/problems/yinyangstones
*/

import java.util.Scanner;

public class YinandYangStones {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);

        String input = reader.nextLine();
        //String[] data = input.split("");

        int w=0, b=0;

        for(int i=0; i<input.length(); i++){
            switch(input.charAt(i)){
                case 'W' : w++; break;
                case 'B' : b++; break;
            }
        }

        if(b == w){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }

    }
}