package edu.citytech.cst.finance.service.test.sorted.dynamicarray;

import com.jbbwebsolutions.ds.facade.IList;
import edu.citytech.finance.array.DynamicArray;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class T1A_dynamicArray {
    @Test
    @DisplayName("Dynamic Array test for max")
    void t1_max() {

        IList<Integer> da = new DynamicArray<>(Integer[]::new);

        da.inserts(100,200,300,400);

        double expected = 400;
        double actual = da.max();

        assertEquals(expected, actual);

    }
    @Test
    @DisplayName("Dynamic Array test for min")
    void t2_min() {

        IList<Integer> da = new DynamicArray<>(Integer[]::new);
        da.inserts(100,200,300,400);
        double expected = 100;
        double actual = da.min();

        assertEquals(expected, actual);

    }
    @Test
    @DisplayName("Dynamic Array test for average1")
    void t3_average() {

        IList<Integer> da = new DynamicArray<>(Integer[]::new);

        da.inserts(100,200,300,400);

        double expected = 250;
        double actual = da.average();

        assertEquals(expected, actual);

    }
    @Test
    @DisplayName("Dynamic Array test for average2")
    void t4_average() {
        IList<Integer> da = new DynamicArray<>(Integer[]::new);

        da.inserts(50,100,45,31);

        double expected = 56.5;
        double actual = da.average();

        assertEquals(expected, actual);

    }
}
