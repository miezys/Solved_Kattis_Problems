/**
	Author Erlandas Miezys
	https://open.kattis.com/problems/armystrengtheasy
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class ArmyStreght {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        int t = reader.nextInt();

        for(int i=0; i<t; i++){
            int mechaG = reader.nextInt();
            int godz = reader.nextInt();
            ArrayList<Integer> godzArmy = new ArrayList<>();
            ArrayList<Integer> mechaArmy = new ArrayList<>();
            for(int j=0; j<mechaG; j++){

                godzArmy.add(reader.nextInt());
            }
            for (int j=0; j<godz; j++){
                mechaArmy.add(reader.nextInt());

            }

            String answer = (Collections.max(godzArmy) >= Collections.max(mechaArmy)) ? "Godzilla" : "MechaGodzilla" ;
            System.out.println(answer);
        }
    }
}