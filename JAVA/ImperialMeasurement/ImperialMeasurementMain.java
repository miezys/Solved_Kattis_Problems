/**
	Author Erlandas Miezys
	https://open.kattis.com/problems/measurement
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ImperialMeasurementMain {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        List<ImperialMeasurement> measuresList = new ArrayList<>();
        measuresList.add(new ImperialMeasurement("thou","th",0));
        measuresList.add(new ImperialMeasurement("inch","in",1000));
        measuresList.add(new ImperialMeasurement("foot","ft",12));
        measuresList.add(new ImperialMeasurement("yard","yd",3));
        measuresList.add(new ImperialMeasurement("chain","ch",22));
        measuresList.add(new ImperialMeasurement("furlong","fur",10));
        measuresList.add(new ImperialMeasurement("mile","mi",8));
        measuresList.add(new ImperialMeasurement("league","lea",3));

        while(reader.hasNext()){
            String input = reader.nextLine();
            String[] words = input.split(" ");


            int sourceIndex = 99;
            int targetIndex = 99;

            for(ImperialMeasurement source : measuresList){
                for(ImperialMeasurement target : measuresList){
                    if((words[1].equals(source.getUnit()) || words[1].equals(source.getUnitShort())) &&
                            (words[3].equals(target.getUnit()) || words[3].equals(target.getUnitShort()))){
                        sourceIndex = measuresList.indexOf(source);
                        targetIndex = measuresList.indexOf(target);
                        break;
                    }
                }
            }
            double result = 0;
            double tmp = 0;
            if(sourceIndex < targetIndex){
                tmp = Integer.parseInt(words[0]);
                for(int i=sourceIndex; i<targetIndex; i++){
                    result = (tmp/measuresList.get(i+1).getValue());
                    tmp = result;
                }
                System.out.println(tmp);

            }

            else if (sourceIndex > targetIndex){
                tmp = Integer.parseInt(words[0]);
                for(int i=sourceIndex; i>targetIndex; i--){
                    result = (tmp*measuresList.get(i).getValue());
                    tmp = result;
                }
                System.out.println(tmp);
            }

            else if(sourceIndex == targetIndex){
                System.out.println(words[0]);
            }
        }

    }
}