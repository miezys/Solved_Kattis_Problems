/**
	Author Erlandas Miezys
	https://open.kattis.com/problems/wordsfornumbers
*/

import java.util.*;

public class WordsForNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);


        while(reader.hasNext()) {

            String text = reader.nextLine();
            int stringLenght = text.length();

            for (int i = 0; i < stringLenght; i++) {

                boolean printUpperCase = false;
                boolean currentCharIsDigit = Character.isDigit(text.charAt(i));


                if(i==0){printUpperCase = true;}
                else if(i > 1 && text.charAt(i-2) == '.'){printUpperCase = true;}
                else {printUpperCase = false;}

                // last character
                if(i+1 == stringLenght){

                    int currentInteger = Character.getNumericValue(text.charAt(i));

                    if(!currentCharIsDigit){
                        System.out.print(text.charAt(i));
                    }
                    else if(currentCharIsDigit && printUpperCase){
                        System.out.print(makeUpperCase(getOnesString(currentInteger)));
                    }
                    else if(currentCharIsDigit && !printUpperCase){
                        System.out.print(getOnesString(currentInteger));
                    }
                }
                // not last character
                else{
                    boolean nextCharIsDigit = Character.isDigit(text.charAt(i+1));
                    int currentInteger = Character.getNumericValue(text.charAt(i));
                    int nextInteger = Character.getNumericValue(text.charAt(i+1));

                    // not a digit
                    if(!currentCharIsDigit){
                        System.out.print(text.charAt(i));
                    }

                    // prints 0
                    else if(currentCharIsDigit && !printUpperCase && currentInteger == 0){
                        System.out.print("zero");
                    }
                    else if(currentCharIsDigit && printUpperCase && currentInteger == 0){
                        System.out.print("Zero");
                    }

                    // prints 1-9
                    else if(currentCharIsDigit && !printUpperCase && !nextCharIsDigit){
                        System.out.print(getOnesString(currentInteger));
                    }
                    else if(currentCharIsDigit && printUpperCase && !nextCharIsDigit){
                        System.out.print(makeUpperCase(getOnesString(currentInteger)));
                    }

                    // prints 10 - 19
                    else if(currentCharIsDigit && !printUpperCase && currentInteger == 1 && nextCharIsDigit){
                        System.out.print(getEleven(nextInteger));
                        i++;
                    }
                    else if(currentCharIsDigit && printUpperCase && currentInteger == 1 && nextCharIsDigit){
                        System.out.print(makeUpperCase(getEleven(nextInteger)));
                        i++;
                    }

                    // prints 10, 20, 30
                    else if(currentCharIsDigit && nextCharIsDigit && !printUpperCase && currentInteger != 0 && nextInteger == 0){
                        System.out.print(getTensString(currentInteger));
                        i++;
                    }
                    else if(currentCharIsDigit && nextCharIsDigit && printUpperCase && currentInteger != 0 && nextInteger == 0){
                        System.out.print(makeUpperCase(getTensString(currentInteger)));
                        i++;
                    }

                    // prints  23, 34, .. 99

                    else if(currentCharIsDigit && nextCharIsDigit && !printUpperCase && currentInteger > 1){
                        System.out.print(getTensString(currentInteger) + "-" + getOnesString(nextInteger));
                        i++;
                    }
                    else if(currentCharIsDigit && nextCharIsDigit && printUpperCase && currentInteger > 1){
                        System.out.print(makeUpperCase(getTensString(currentInteger)) + "-" + getOnesString(nextInteger));
                        i++;
                    }
                }
            }
            System.out.println();
        }

    }
    
    public static String getEleven(int integer){
        String ret =null;
        if(integer == 0)  ret = "ten";
        else if(integer == 1) ret = "eleven";
        else if(integer == 2) ret = "twelve";
        else if(integer == 3) ret = "thirteen";
        else if(integer == 4) ret = "fourteen";
        else if(integer == 5) ret = "fifteen";
        else if(integer == 6) ret = "sixteen";
        else if(integer == 7) ret = "seventeen";
        else if(integer == 8) ret = "eighteen";
        else if(integer == 9) ret = "nineteen";

        return ret;
    }

    public static String getTensString(int integer){
        String ret=null;
        if(integer == 0)  ret = "zero";
        else if(integer == 1) ret = "ten";
        else if(integer == 2) ret = "twenty";
        else if(integer == 3) ret = "thirty";
        else if(integer == 4) ret = "forty";
        else if(integer == 5) ret = "fifty";
        else if(integer == 6) ret = "sixty";
        else if(integer == 7) ret = "seventy";
        else if(integer == 8) ret = "eighty";
        else if(integer == 9) ret = "ninety";

        return ret;
    }

    public static String getOnesString(int integer){
        String ret=null;
        if(integer == 0)  ret = "zero";
        else if(integer == 1) ret = "one";
        else if(integer == 2) ret = "two";
        else if(integer == 3) ret = "three";
        else if(integer == 4) ret = "four";
        else if(integer == 5) ret = "five";
        else if(integer == 6) ret = "six";
        else if(integer == 7) ret = "seven";
        else if(integer == 8) ret = "eight";
        else if(integer == 9) ret = "nine";

        return ret;
    }

    public static String makeUpperCase(String str){
        String capitalized = str.substring(0, 1).toUpperCase() + str.substring(1);
        return capitalized;
    }


}