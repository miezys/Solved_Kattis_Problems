/**
	Author Erlandas Miezys
	https://open.kattis.com/problems/quickbrownfox
*/

import java.util.Scanner;

public class QuickBrownFox {
    public static void main(String[]  args){
        Scanner reader = new Scanner(System.in);
        int n = Integer.parseInt(reader.nextLine());

        for(int i=0; i<n; i++){
            char[] abc = "abcdefghijklmnopqrstuvwxyz".toCharArray();
            //reader.nextLine();
            String input = reader.nextLine();
            String[] data = input.split("");

            int count = 0;
            for(int j=0; j<data.length; j++){
                for(int k=0; k<abc.length; k++){
                    if((data[j].toLowerCase().equals(Character.toString(abc[k])) ||
                            data[j].toUpperCase().equals(Character.toString(abc[k])) ||
                            data[j].equals(Character.toString(abc[k]))) && abc[k] != '0'){
                        count++;
                        abc[k] = '0';
                        //System.out.println(data[k]);
                    }

                }
            }
            if(count == 26){
                System.out.print("pangram");
            }
            if(count < 26){
                System.out.print("missing ");
                for(int j=0; j < 26; j++){
                    if(abc[j] != '0'){
                        System.out.print(abc[j]);
                    }
                }
            }
            System.out.println();
        }

    }
}