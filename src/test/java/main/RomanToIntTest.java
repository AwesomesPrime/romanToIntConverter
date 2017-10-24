package main;

import jdk.nashorn.internal.runtime.ECMAException;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by joel_thinkpad on 24.10.2017.
 */
public class RomanToIntTest {

    RomanToInt romanToInt = new RomanToInt();

    //Toplevel test for application
    @Test
    public void testMXCVItoInt() throws Exception {
        //given
        String romNumb= "MXCVI";
        int expectedInt = 1096;

        //when

        //then

    }


    //Toplevel test for application
    @Test
    public void testMDCCCLXXVIItoInt()throws Exception {
        //given
        String romNumb = "MDCCCLXXVII";
        int expectedInt = 1877;

        //when

        //then

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

}