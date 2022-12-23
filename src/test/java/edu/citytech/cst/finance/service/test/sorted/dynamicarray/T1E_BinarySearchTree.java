package edu.citytech.cst.finance.service.test.sorted.dynamicarray;

import com.jbbwebsolutions.ds.facade.IList;
import edu.citytech.finance.array.DoubleLinkedList;
import edu.citytech.finance.binarysearchtree.BinarySearchTree;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class T1E_BinarySearchTree {
    @Test
    @DisplayName("BinarySearchTree test for max")
    void t1_max() {

        BinarySearchTree da= new BinarySearchTree();

        da.inserts(67,12,43,54,99);

        double expected = 99;
        double actual = da.max();

        assertEquals(expected, actual);

    }
    @Test
    @DisplayName("BinarySearchTree test for min")
    void t2_min() {

        BinarySearchTree da= new BinarySearchTree();

        da.inserts(34,64,12,76);

        double expected = 12;
        double actual = da.min();

        assertEquals(expected, actual);

    }
    @Test
    @DisplayName("BinarySearchTree test for min")
    void t3_min() {

        BinarySearchTree da= new BinarySearchTree();

        da.inserts(1,23,54,65,32);

        double expected = 1;
        double actual = da.min();

        assertEquals(expected, actual);

    }
    @Test
    @DisplayName("BinarySearchTree test for average1")
    void t3_average() {

        BinarySearchTree da= new BinarySearchTree();

        da.inserts(12,34,65,87);
        double expected = 49.5;
        double actual = da.average();
        assertEquals(expected, actual);
    }
    @Test
    @DisplayName("BinarySearchTree test for average1")
    void t4_average() {

        BinarySearchTree da= new BinarySearchTree();

        da.inserts(25,100,45,31);

        double expected = 50.25;
        double actual = da.average();

        assertEquals(expected, actual);

    }
}
