/**
	Author Erlandas Miezys
	https://open.kattis.com/problems/everywhere
*/

import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by Erlandas on 18/04/2017.
 */
public class ProgEx {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        int testCases = reader.nextInt();
        HashSet visitedCities = new HashSet();

        for(int i=0; i<testCases; i++){
            int trips = reader.nextInt();
            for(int j=0; j<trips; j++){
                visitedCities.add(reader.next());
            }
            System.out.println(visitedCities.size());
            visitedCities.clear();
        }
    }
}