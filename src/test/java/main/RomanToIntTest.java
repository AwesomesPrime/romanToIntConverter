package main;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by joel_thinkpad on 24.10.2017.
 */
public class RomanToIntTest {

    RomanToInt romanToInt = new RomanToInt();
    Main main = new Main();

    //Toplevel test for application
    @Test
    public void testMXCVItoInt() throws Exception {
        //given
        String romNumb= "MXCVI";
        int expectedInt = 1096;

        //when
        int generatedInt = main.romanToInt(romNumb);

        //then
        Assert.assertEquals(expectedInt, generatedInt);
    }


    //Toplevel test for application
    @Test
    public void testMDCCCLXXVIItoInt()throws Exception {
        //given
        String romNumb = "MDCCCLXXVII";
        int expectedInt = 1877;

        //when
        int generatedInt = main.romanToInt(romNumb);

        //then
        Assert.assertEquals(expectedInt, generatedInt);

    }


    //Gerüsttest für splitter logik welche in application Test benötigt wird ( kann anschließend entfernt werden,
    // wenn schnittstelle klar steht)
    @Test
    public void testStringSplit() throws Exception{
        //given
        String givenString =  "VI";
        List<String> expectedList = new ArrayList<String>();
        expectedList.add("V");
        expectedList.add("I");

        //when

        List<String> generatedList = romanToInt.splitString(givenString);

        //then
        Assert.assertEquals(expectedList, generatedList);
    }

    @Test
    public void testTranslate() throws Exception {
        //GIVEN
        List<String> givenStringList = new ArrayList<String>();
        givenStringList.add("M");
        givenStringList.add("I");
        givenStringList.add("C");
        List<Integer> integerList = new ArrayList<Integer>();
        integerList.add(1000);
        integerList.add(1);
        integerList.add(100);

        //WHEN
        List<Integer> generatedIntegerList = romanToInt.translateListToInt(givenStringList);

        //THEN
        Assert.assertEquals(integerList, generatedIntegerList);
    }

    @Test
    public void testCalculationRuleSum() throws Exception {
        //GIVEN
        List<Integer> integerList = new ArrayList<Integer>();
        integerList.add(1000);
        integerList.add(99);
        integerList.add(4);
        int sum = 1103;

        //WHEN
        int num = romanToInt.calculate(integerList);

        //
        Assert.assertEquals(sum, num);
    }

    @Test
    public void testCalculationRuleSubstraction() throws Exception {
        //GIVEN
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(10);
        integerList.add(99);
        integerList.add(100);
        int sub = 10;
        //WHEN
        int num = romanToInt.calculate(integerList);

        //THEN
        Assert.assertEquals(sub, num);
    }

}