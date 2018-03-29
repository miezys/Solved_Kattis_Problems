/**
	Author Erlandas Miezys
	https://open.kattis.com/problems/eligibility
*/

import java.io.*;
import java.util.StringTokenizer;


public class Eligibility {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer;

        int n = Integer.parseInt(reader.readLine());
        for(int i=0; i<n; i++){
            tokenizer = new StringTokenizer(reader.readLine());
            String name = tokenizer.nextToken();
            String beganStudy = tokenizer.nextToken();
            String birthDay = tokenizer.nextToken();
            int courses = Integer.parseInt(tokenizer.nextToken());

            boolean eligible = false, couchMayPetition = false;

            boolean case1 = Integer.parseInt(beganStudy.substring(0,4)) >= 2010;
            boolean case2 = Integer.parseInt(birthDay.substring(0,4)) >= 1991;
            boolean case3 = courses <= 40;

            if(case1 || case2 ){
                eligible = true;
            }
            if(case3){
                couchMayPetition = true;
            }

            if(eligible){
                System.out.println(name + " eligible");
            }
            else if(couchMayPetition){
                System.out.println(name + " coach petitions");
            }
            else{
                System.out.println(name + " ineligible");
            }
        }
    }
}