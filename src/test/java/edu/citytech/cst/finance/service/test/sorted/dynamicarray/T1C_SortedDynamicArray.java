package edu.citytech.cst.finance.service.test.sorted.dynamicarray;

import com.jbbwebsolutions.ds.facade.IList;
import edu.citytech.finance.array.DynamicArray;
import edu.citytech.finance.array.SortedDynamicArray;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class T1C_SortedDynamicArray {
    @Test
    @DisplayName("SortedDynamicArray test for max")
    void t1_max() {

        IList<Integer> da = new SortedDynamicArray<>(Integer[]::new);

        da.inserts(32,15,83,98);

        double expected = 98;
        double actual = da.max();

        assertEquals(expected, actual);

    }
    @Test
    @DisplayName("SortedDynamicArray test for min")
    void t2_min() {

        IList<Integer> da = new SortedDynamicArray<>(Integer[]::new);

        da.inserts(32,15,83,98);

        double expected = 15;
        double actual = da.min();

        assertEquals(expected, actual);

    }
    @Test
    @DisplayName("SortedDynamicArray test for average1")
    void t3_average() {

        IList<Integer> da = new SortedDynamicArray<>(Integer[]::new);

        da.inserts(10,50,213,12);

        double expected = 71.25;
        double actual = da.average();

        assertEquals(expected, actual);

    }
    @Test
    @DisplayName("SortedDynamicArray test for average2")
    void t4_average() {

        IList<Integer> da = new SortedDynamicArray<>(Integer[]::new);

        da.inserts(50,100,45,31);

        double expected = 56.5;
        double actual = da.average();

        assertEquals(expected, actual);

    }
}
