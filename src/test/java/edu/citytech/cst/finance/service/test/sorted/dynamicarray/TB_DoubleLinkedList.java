package edu.citytech.cst.finance.service.test.sorted.dynamicarray;

import com.jbbwebsolutions.ds.facade.IList;
import com.jbbwebsolutions.ds.facade.widget.Widget;
import com.jbbwebsolutions.ds.facade.widget.WidgetRepository;
import edu.citytech.finance.array.DoubleLinkedList;
import edu.citytech.finance.array.SingleLinkedList;
import edu.citytech.finance.binarysearchtree.BinarySearchTree;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TB_DoubleLinkedList {
    @Test
    @DisplayName("Sum of DoubleLinkedList")
    void t1_sumOfNumbersDoubleLinkedList() {
        IList<Integer> da = new DoubleLinkedList<>(Integer[]::new);
        da.inserts(5,3,6,2,4,7,8);

        double expected = 35;
        double actual = da.sum();;

        assertEquals(expected, actual);

    }   @Test
    @DisplayName("Sum of DoubleLinkedList")
    void t2_sumOfNumbersDoubleLinkedList() {
        IList<Integer> da = new DoubleLinkedList<>(Integer[]::new);
        da.inserts(8,2,7,4,7,9,4);

        double expected = 41;
        double actual = da.sum();;

        assertEquals(expected, actual);

    }
    @Test
    @DisplayName("Sum of DoubleLinkedList")
    void t3_sumOfNumbersDoubleLinkedList() {
        IList<Integer> da = new DoubleLinkedList<>(Integer[]::new);
        da.inserts(1,2,3,4,5,6,7);

        double expected = 28;
        double actual = da.sum();

        assertEquals(expected, actual);

    }
    @Test
    @DisplayName("Sum of DoubleLinkedList")
    void t4_sumOfNumbersDoubleLinkedList() {
        IList<Double> da = new DoubleLinkedList<>(Double[]::new);
        da.inserts(5.5,3.5,6.6,2.1,4.8,7.3,8.5);

        double expected = 38.3;
        double actual = da.sum();;

        assertEquals(expected, actual);

    }
    @Test
    @DisplayName("Sum of DoubleLinkedList")
    void t5_sumOfNumbersDoubleLinkedList() {
        IList<Integer> da = new DoubleLinkedList<>(Integer[]::new);
        da.inserts(10,20,30,40,50,60);

        double expected = 210;
        double actual = da.sum();;

        assertEquals(expected, actual);

    }
    @Test
    @DisplayName("Sum of DoubleLinkedList")
    void t6_sumOfNumbersDoubleLinkedList() {
        IList<Integer> da = new DoubleLinkedList<>(Integer[]::new);
        da.inserts(4,5,7,10,20);

        double expected = 46;
        double actual = da.sum();;

        assertEquals(expected, actual);

    }
    @Test
    @DisplayName("Sum of DoubleLinkedList with widget 1 to 3")
    void t7_sumOfNumbersDoubleLinkedList() {
        IList<Widget> da=new DoubleLinkedList<>(Widget[]::new);
        var results = WidgetRepository.find(1,3);
        da.inserts(results);
        var sum = da.sum();

        double expected = 182;
        double actual = sum;

        System.out.println();

        assertEquals(expected, actual);

    }
    @Test
    @DisplayName("Sum of DoubleLinkedList with widget 1 to 20")
    void t8_sumOfNumbersDoubleLinkedList() {
        IList<Widget> da=new DoubleLinkedList<>(Widget[]::new);
        var results = WidgetRepository.find(1,20);
        da.inserts(results);
        var sum = da.sum();

        double expected = 1_326;
        double actual = sum;

        System.out.println();

        assertEquals(expected, actual);

    }
    @Test
    @DisplayName("Sum of DoubleLinkedList with widget 3 to 10")
    void t9_sumOfNumbersDoubleLinkedList() {
        IList<Widget> da=new DoubleLinkedList<>(Widget[]::new);
        var results = WidgetRepository.find(3,10);
        da.inserts(results);
        var sum = da.sum();

        double expected = 531.0;
        double actual = sum;

        System.out.println();

        assertEquals(expected, actual);

    }
    @Test
    @DisplayName("Sum of DoubleLinkedList with widget 10 to 20")
    void t10_sumOfNumbersDoubleLinkedList() {
        IList<Widget> da=new DoubleLinkedList<>(Widget[]::new);
        var results = WidgetRepository.find(10,20);
        da.inserts(results);
        var sum = da.sum();

        double expected = 757.0;
        double actual = sum;

        System.out.println();

        assertEquals(expected, actual);

    }


}
