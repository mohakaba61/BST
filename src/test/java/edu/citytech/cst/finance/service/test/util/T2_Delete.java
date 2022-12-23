package edu.citytech.cst.finance.service.test.util;

import edu.citytech.finance.util.IntDynamicArray;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName("Delete from a Dynamic Array")
public class T2_Delete {
    @Test
    @DisplayName("delete data from index 3")
    public void e3(){
        IntDynamicArray da = new IntDynamicArray(12);
        da.inserts(44,33,100,99,72,75,111,55,66,77);
        da.removeAt(3);
        int expected=9;
        int actual=da.size();
        assertEquals(expected, actual);

        System.out.println(da);
    }

    @DisplayName("delete data from an invalid index -1")
    @ParameterizedTest
    @CsvSource({"-2","-3", "100"})
    public void e4(int deleteIndex){

        Exception exception =assertThrows(IllegalArgumentException.class, ()->{
            IntDynamicArray da = new IntDynamicArray(12);
            da.inserts(44,33,100,99,72,75,111,55,66,77);
            da.removeAt(deleteIndex);

        });


        String expected="Invalid";
        String actual=exception.getMessage();
        assertTrue(actual, actual.contains(expected));


    }
}
