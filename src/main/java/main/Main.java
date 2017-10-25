package main;

import java.util.List;

/**
 * Created by joel_thinkpad on 24.10.2017.
 */
public class Main {

    public static void main(String[] args){

    }

    public int romanToInt(String roman) throws Exception {
        int arabic =0;
        RomanToInt romanToInt= new RomanToInt();
        List<String> stringList = romanToInt.splitString(roman);
        List<Integer> integerList = romanToInt.translateListToInt(stringList);
        arabic = romanToInt.calculate(integerList);
        return arabic;
    }
}
