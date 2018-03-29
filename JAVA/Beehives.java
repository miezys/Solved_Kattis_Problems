/**
	Author Erlandas Miezys
	https://open.kattis.com/problems/beehives
*/

import java.util.Scanner;


public class ProgEx {}
    static public void main(String args[]){
        
            Scanner reader = new Scanner(System.in);
            
            float distance = 1;     // distance within hives will fight
            int n = 1;              // # of hives
            
            int countSour = 0, countSweet = 0;  
            
            distance = reader.nextFloat();
            n = reader.nextInt(); 
            
            while (distance != 0.0 && n != 0){
                countSour = 0; countSweet = 0;
                float[] x = new float[n];
                float[] y = new float[n];
            
                for(int i=0; i<n; i++){
                    x[i] = reader.nextFloat();
                    y[i] = reader.nextFloat();
                }
                
                for(int i=0; i<n; i++){
                    int counter = 0;
                    for(int j=0; j<n; j++){
                        if(i!=j){
                          float dist = (float) Math.sqrt(Math.pow(x[i] - x[j], 2) + Math.pow(y[i] - y[j], 2) );  
                         
                          if (dist < distance) {
                              counter++;
                                }
                            }
                        }
                    if(counter > 0){
                        countSour++;
                    }
                    else{
                        countSweet++;
                        }
                    } 
                System.out.print(countSour + " sour, " + countSweet + " sweet" + "\n");
                distance = reader.nextFloat();
      
                n = reader.nextInt();
                }
                
            }
        }
    

