/**
	Author Erlandas Miezys
	https://open.kattis.com/problems/armystrengthhard
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class ArmyStreght {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int numTests = Integer.parseInt(reader.readLine());
        for (int t = 0; t < numTests; t++) {
            reader.readLine();

            String sizes = reader.readLine();
            st = new StringTokenizer(sizes);
            int godzillaSize = Integer.parseInt(st.nextToken());
            int mechaSize = Integer.parseInt(st.nextToken());

            int[] godzillaArmy = new int[godzillaSize];
            int[] mechaArmy = new int[mechaSize];
            st = new StringTokenizer(reader.readLine());
            for (int i = 0; st.hasMoreTokens(); i++){
                godzillaArmy[i] = Integer.parseInt(st.nextToken());
            }

            st = new StringTokenizer(reader.readLine());
            for (int i = 0; st.hasMoreTokens(); i++){
                mechaArmy[i] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(godzillaArmy);
            Arrays.sort(mechaArmy);

            System.out.println(mechaArmy[mechaSize-1] > godzillaArmy[godzillaSize-1] ? "MechaGodzilla" : "Godzilla");
        }

    }
}