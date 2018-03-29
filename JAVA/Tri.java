/**
	Author Erlandas Miezys
	https://open.kattis.com/problems/tri
*/

import java.util.Scanner;
public class ProgEx {

    
    static public void main(String args[]){
        
           Scanner reader = new Scanner(System.in);
            
           int x = reader.nextInt();
           int y = reader.nextInt();
           int z = reader.nextInt();
           
           if (x + y == z){
               System.out.println(x + "+" + y + "=" + z);
           }
           else if(x == y + z){
               System.out.println(x + "=" + y + "+" + z);
           }
           else if(x - y == z){
               System.out.println(x + "-" + y + "=" + z);
           }
           else if(x == y - z){
               System.out.println(x + "=" + y + "-" + z);
           }
           else if(x / y == z){
               System.out.println(x + "/" + y + "=" + z);
           }
           else if(x == y / z){
               System.out.println(x + "=" + y + "/" + z);
           }
           else if(x * y == z){
               System.out.println(x + "*" + y + "=" + z);
           }
           else if(x == y * z){
               System.out.println(x + "=" + y + "*" + z);
           }
           
           }
        }