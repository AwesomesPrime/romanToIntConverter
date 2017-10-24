package main;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by joel_thinkpad on 24.10.2017.
 */
public class RomanToInt {


    public List<String> splitString(String givenString) {
        List<String> stringList = new ArrayList<String>();

        String [] parts = givenString.split("");

        for (String part : parts){
            stringList.add(part);
        }
        System.out.println(stringList.toString());
        return stringList;
    }
}
