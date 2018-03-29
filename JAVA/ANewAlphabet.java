/**
	Author Erlandas Miezys
	https://open.kattis.com/problems/anewalphabet
*/

import java.util.*;


public class AnewAlphabet {
    
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        
        HashMap<Character, String> translations = new HashMap();
        translations.put('a', "@");
        translations.put('b', "8");
        translations.put('c', "(");
        translations.put('d', "|)");
        translations.put('e', "3");
        translations.put('f', "#");
        translations.put('g', "6");
        translations.put('h', "[-]");
        translations.put('i', "|");
        translations.put('j', "_|");
        translations.put('k', "|<");
        translations.put('l', "1");
        translations.put('m', "[]\\/[]");
        translations.put('n', "[]\\[]");
        translations.put('o', "0");
        translations.put('p', "|D");
        translations.put('q', "(,)");
        translations.put('r', "|Z");
        translations.put('s', "$");
        translations.put('t', "']['");
        translations.put('u', "|_|");
        translations.put('v', "\\/");
        translations.put('w', "\\/\\/");
        translations.put('x', "}{");
        translations.put('y', "`/");
        translations.put('z', "2");
        translations.put(' ', " ");
        
        String input = reader.nextLine();
        char[] chArr = new char[input.length()];
        
        for(int i=0; i<input.length(); i++){
            chArr[i] = input.charAt(i);
        }
        
        for(int i=0; i<input.length(); i++){
            if(translations.containsKey(Character.toLowerCase(chArr[i]))){
                System.out.print(translations.get(Character.toLowerCase(chArr[i])));
            }else{
                System.out.print(chArr[i]);
            }
        }
    }
}
