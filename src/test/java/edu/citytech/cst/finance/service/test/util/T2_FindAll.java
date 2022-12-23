package edu.citytech.cst.finance.service.test.util;

import edu.citytech.finance.util.IntDynamicArray;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName("Find the index by value")
public class T2_FindAll {

    @Test
    @DisplayName("find value 100")
    public void e3(){

        IntDynamicArray da = new IntDynamicArray(12);
        da.inserts(44,33,100,99,72,75,111,55,66,77,100);
        int searchValue=100;
        int [] positionFound=da.findAll(100);
        int expected=2;
        int actual=positionFound.length;
        assertEquals(expected, actual);

        System.out.println(da);
    }

    @DisplayName("search for values")
    @ParameterizedTest
    @CsvSource(
            {"2, 0"
                    ,"100, 2"
                    , "77, 1"})

    public void e4(int searchValue, int expected){
        IntDynamicArray da = new IntDynamicArray(12);
        da.inserts(44,33,100,99,72,75,111,55,66,77,100);

        int actual=da.findAll(searchValue).length;
        assertEquals(expected, actual);

        System.out.println(da);
    }
}
