package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by joel_thinkpad on 24.10.2017.
 */
public class RomanToInt {


    public List<String> splitString(String givenString) {
        List<String> stringList = new ArrayList<>();

        String [] parts = givenString.split("");

        stringList.addAll(Arrays.asList(parts));
        return stringList;
    }

    public List<Integer> translateListToInt(List<String> givenStringList) throws Exception {
        List<Integer> integerList = new ArrayList<>();
        for (String roman : givenStringList) {
            switch (roman) {
                case "I":
                    integerList.add(1);
                    break;
                case "V":
                    integerList.add(5);
                    break;
                case "X":
                    integerList.add(10);
                    break;
                case "L":
                    integerList.add(50);
                    break;
                case "C":
                    integerList.add(100);
                    break;
                case "D":
                    integerList.add(500);
                    break;
                case "M":
                    integerList.add(1000);
                    break;
                default:
                    throw new Exception("Wrong input data");

            }

        }
        return integerList;
    }

    //TODO refactoring!!!
    public int calculate(List<Integer> integerList) {
        int result =0;
        int listSize = integerList.size();
        for (int i=0; i < integerList.size(); i++) {

            int number = integerList.get(i);
            //check if i ist last in list
            if(i<listSize-1){
                int followNumber = integerList.get(i+1);
                if(number < followNumber){
                    result=(followNumber-number)+result;
                    i++;
                } else {
                    result+=number;
                }
            } else {
                result+=number;
            }
        }
        return result;
    }
}
