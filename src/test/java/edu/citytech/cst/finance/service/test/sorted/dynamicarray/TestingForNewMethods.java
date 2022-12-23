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

public class TestingForNewMethods {
    @Test
    @DisplayName("BinarySearchTree sum with number")
    void t1_1_sumOfNumbersSingleLinkedList() {
        BinarySearchTree data= new BinarySearchTree();
        data.inserts(5,3,6,2,4,7,8);
        var results=data.sum();

        System.out.println(results);

    }
    @Test
    @DisplayName("BinarySearchTree sum with widget")
    void t1_2_sumOfNumbersSingleLinkedList() {

        IList<Widget> da = new BinarySearchTree<>();

        var results = WidgetRepository.find(1,20);
        da.inserts(results);
        var sum = da.sum();

        double expected = 1_326;
        double actual = sum;

        System.out.println();


        assertEquals(expected, actual);

    }
    @Test
    @DisplayName("BinarySearchTree sum with widget")
    void t1_3_max() {

        IList<Widget> da = new BinarySearchTree<>();

        var results = WidgetRepository.find(1,4);
        da.inserts(results);
        var max = da.max();
        System.out.println(max);



    }
    @Test
    @DisplayName("BinarySearchTree max with widget")
    void t1_4_min() {

        BinarySearchTree data= new BinarySearchTree();
        data.inserts(5,3,6,2,4,7,8,20);
        var max = data.max();

        System.out.println(max);



    }

//
//    /**
//     * I HAVE TO MOVE THIS TO A DIFFERENT CLASS
//     */
//    @Test
//    @DisplayName("Sum of 4 numbers")
//    void t1_sumOfNumbersDoubleLinkedList() {
//
//        IList<Integer> da = new DoubleLinkedList<>(Integer[]::new);
//
//        da.inserts(100,300,300,400);
//        var sum = da.sum();
//
//        double expected = 1100;
//        double actual = sum;
//
//        assertEquals(expected, actual);
//
//    }
//    @Test
//    @DisplayName("Sum of 4 numbers")
//    void t1_1_sumOfNumbersSingleLinkedList() {
//
//        IList<Integer> da = new SingleLinkedList<>(Integer[]::new);
//
//        da.inserts(100,200,300,400);
//        var sum = da.sum();
//
//        double expected = 1000;
//        double actual = sum;
//
//        assertEquals(expected, actual);
//
//    }

}
