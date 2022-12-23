package edu.citytech.cst.finance.service.test.util;
import edu.citytech.finance.util.IntDynamicArray;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static junit.framework.Assert.assertEquals;
public class T1_DynamicArray {
    @DisplayName("Checks the size of the array")
    @ParameterizedTest
    @CsvSource({"2","3","4","5", "100","0"})
    public  void t1(int size) {
        IntDynamicArray da = new IntDynamicArray(size);
        da.insert(50);
        da.insert(60);
        da.insert(70);
        da.removeLastItem();
        da.removeLastItem();
        da.getLastItem();
        System.out.println(da);

            int expected =1;
            int actual =da.size();
//            assertEquals(expected, actual);
    }
    @Test
    @DisplayName("insert data with var arg")
    public void e3(){
        IntDynamicArray da = new IntDynamicArray(5);
        da.inserts(44,33,100,99,72,75,111,55,66,77);
        int expected=10;
        int actual=da.size();
        assertEquals(expected, actual);
    }
   @Test void printName(){
       System.out.println("Mohamed Kaba");
   }

}
