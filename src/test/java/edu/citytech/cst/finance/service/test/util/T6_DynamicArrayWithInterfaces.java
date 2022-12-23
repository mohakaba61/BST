package edu.citytech.cst.finance.service.test.util;

import com.jbbwebsolutions.ds.facade.IList;
import edu.citytech.finance.array.DynamicArray;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;

public class T6_DynamicArrayWithInterfaces {
    @DisplayName("DynamicArray Coding with Interface")
    @Test
    public  void t1() {
        IList<Integer> da = new DynamicArray<>(Integer[]::new);

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
        IList<Integer> da = new DynamicArray(Integer[]::new);
        da.inserts(44,33,100,99,72,75,111,55,66,77);
        int expected=10;
        int actual=da.size();
        assertEquals(expected, actual);
    }
    @Test
    @DisplayName("insert data with var arg")
    public void e5(){
        IList<Integer> da = new DynamicArray(Integer[]::new);

        da.inserts(44,33,100,99,72,75,111,55,66,77);
        da.removeLastItem();
        int expected=9;
        int actual=da.size();
        System.out.println(da);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("removeAll items in the IntDynamicArray")
    public void e6(){
        IList<Integer> da = new DynamicArray(Integer[]::new);

        da.inserts(44,33,100,99,72,75,111,55,66,77);
        da.removeAll();
        int expected=0;
        int actual=da.size();
        System.out.println(da);
        assertEquals(expected, actual);

    }
    @Test
    @DisplayName("get method")
    public void e7(){

        IList<Integer> da = new DynamicArray(Integer[]::new);
        da.inserts(44,33,100,99,72,75,111,55,66,77);
        int actual= da.get(2);
        int expected=100;
        System.out.println(da);
        assertEquals(expected, actual);
    }
    @Test
    @DisplayName("get method")

    public void e8(){
        IList<Integer> da = new DynamicArray(Integer[]::new);

        da.inserts(44,33,100,99,72,75,111,55,66,77);
        int expected=77;
        int actual= da.getLastItem();
        System.out.println(da);
        assertEquals(expected, actual);

    }
   @Test void printName(){
       System.out.println("Mohamed Kaba");
   }

}
