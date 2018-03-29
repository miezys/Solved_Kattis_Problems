/**
	Author Erlandas Miezys
	https://open.kattis.com/problems/savingdaylight
*/

import java.util.Scanner;

public class SavingDaylight {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);



        while(reader.hasNext()){
            String input = reader.nextLine();
            String[] words = input.split(" ");
            String[] sunrise = words[3].split(":");
            String[] sunset = words[4].split(":");
            int hourSunrise = Integer.parseInt(sunrise[0]);
            int hourSunset = Integer.parseInt(sunset[0]);
            int minutesSunrise = Integer.parseInt(sunrise[1]);
            int minutesSunset = Integer.parseInt(sunset[1]);

            int hours, minutes;

            if(minutesSunrise > minutesSunset){
                hours = hourSunset-hourSunrise-1;
                minutes = 60-(minutesSunrise-minutesSunset);
            }
            else{
                hours = hourSunset-hourSunrise;
                minutes = minutesSunset-minutesSunrise;
            }

            System.out.println(words[0]+ " " + words[1] + " " + words[2] + " " + hours + " hours " + minutes + " minutes" );
        }

    }
}