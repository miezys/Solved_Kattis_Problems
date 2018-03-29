/**
	Author Erlandas Miezys
	https://open.kattis.com/problems/conundrum
*/

import java.util.Scanner;
public class ProgEx {

    static public void main(String args[]){
        
           Scanner reader = new Scanner(System.in);    
           String str = reader.nextLine();
           int counter = 0;
           for(int i=0; i<str.length(); i+=3){
               if(str.charAt(i) != 'P'){
                   counter++;
               }
               if(str.charAt(i+1) != 'E'){
                   counter++;
               }
               if(str.charAt(i+2) != 'R'){
                   counter++;
               }
               
           }
           System.out.println(counter);
           
           }
    }
   