package edu.citytech.cst.finance.service.test.util;

import com.jbbwebsolutions.ds.facade.IList;
import edu.citytech.finance.array.SingleLinkedList;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("SingleLiskedList. query")
public class T8_SingleLinkListQuery {

    @DisplayName("check the size of SingleLinkedList")
    @Test
    public void t0() {
        IList<String> da = new SingleLinkedList<>(String[]::new);
//        IList<Integer> da = new DynamicArray<>(Integer[]::new);
        da.inserts("A");
        var results= da.query(e-> e.equals("A"));
        int expected = 1;
        int actual = results.length;
        assertEquals( expected  , actual);
    }
    @DisplayName("check the size of SingleLinkedList(2)")
    @Test
    public void t1() {
        IList<String> da = new SingleLinkedList<>(String[]::new);
//        IList<String> da = new DynamicArray<>(String[]::new);
        da.inserts("A","B", "C", "D");
        var results= da.query(e->e.equals("A") || e.equals("D"));
        int expected = 2;
        int actual = results.length;
        assertEquals( expected  , actual);
    }

    @Test
    @DisplayName("get the last item ")
    public void t2() {

        IList<Integer> da = new SingleLinkedList<>(Integer[]::new);
        for(int x=1;x<=100;x++)
            da.insert(x);
        var results= da.query(e -> e< 51);


        var expected = 50;
        var actual = results.length;
        assertEquals( expected  , actual);
    }

    @Test
    @DisplayName("check for D using query method")
    public void t3() {

        IList<String> da = new SingleLinkedList<>(String[]::new);
        da.inserts("D","A","B", "C", "D");
       var firstItem=da.query(e -> e.equals("D"));
        var expected = true;
        var actual = firstItem.length==2
                && firstItem[1].getValue().equals("D");
        assertEquals( expected  , actual);
        assertTrue(actual);

    }
    @Test
    @DisplayName("query with the limit parameter, limit 3 ")

    public void t4() {

        IList<Integer> da = new SingleLinkedList<>(Integer[]::new);
        for(int x=1;x<=100;x++)
            da.insert(x);

        var results= da.query(e -> e< 51, 3);

        var expected = 3;
        var actual = results.length;
        assertEquals( expected  , actual);
    }
    @Test
    @DisplayName("query with the limit parameter, limit 10 ")

    public void t5() {

        IList<Integer> da = new SingleLinkedList<>(Integer[]::new);
        for(int x=1;x<=100;x++)
            da.insert(x);

        var results= da.query(e -> e< 51, 10);

        var expected = 10;
        var actual = results.length;
        assertEquals( expected  , actual);
    }

}