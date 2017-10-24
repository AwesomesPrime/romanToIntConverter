package main;

import jdk.nashorn.internal.runtime.ECMAException;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by joel_thinkpad on 24.10.2017.
 */
public class RomanToIntTest {

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

}