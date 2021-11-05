package no.hiof.fatemaala.oblig2.test;
import no.hiof.fatemaala.oblig2test.leapYear;
import org.junit.jupiter.api.Test;

import java.time.Year;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class leapYearTest {

    leapYear ly = new leapYear();

    
    @Test
    public void year_is_divided_by_4_is_a_LeapYear(){
        assertEquals(true, Year.isLeap(2092));
    }


    @Test
    public void year_is_divided_by_400_is_a_LeapYear(){
        assertEquals(true, Year.isLeap(2000));
    }


    @Test
    public void year_isNot_divided_by_4_isNot_a_LeapYear(){
        assertEquals(false, Year.isLeap(1700));
    }


    @Test
    public void year_isNot_divided_by_400_but_divided_by_100_is_a_LeapYear(){
        assertEquals(false, Year.isLeap(1900));

    }


}





