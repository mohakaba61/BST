package edu.citytech.cst.finance.service.test.util;

import com.jbbwebsolutions.ds.facade.IList;
import edu.citytech.finance.array.SingleLinkedList;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Linked In List")
public class T7_SingleLinkList {

    @DisplayName("check the size of SingleLinkedList")
    @Test
    public void t0() {
        IList<String> da = new SingleLinkedList<>(String[]::new);

        da.inserts("A");
        int expected = 1;
        int actual = da.size();
        assertEquals( expected  , actual);
    }
    @DisplayName("check the size of SingleLinkedList(4)")
    @Test
    public void t1() {
        IList<String> da = new SingleLinkedList<>(String[]::new);

        da.inserts("A","B", "C", "D");
        int expected = 4;
        int actual = da.size();
        assertEquals( expected  , actual);
    }

    @Test
    @DisplayName("get the last item ")
    public void t2() {

        IList<String> da = new SingleLinkedList<>(String[]::new);
        da.inserts("A","B", "C", "D");
        var expected = "D";
        var actual = da.getLastItem();
        assertEquals( expected  , actual);
    }

    @Test
    @DisplayName("getFirstItem(A)")
    public void t3() {

        IList<String> da = new SingleLinkedList<>(String[]::new);
        da.inserts("A","B", "C", "D");
       var firstItem=da.getFirstItem();
        var expected = "A";
        var actual = firstItem;
        assertEquals( expected  , actual);

    }
    @Test
    @DisplayName("get position 0")
    public void t4() {

        IList<String> da = new SingleLinkedList<>(String[]::new);
        da.inserts("A","B", "C", "D");
        var expected="A";
        var actual = da.get(0);
        assertEquals( expected  , actual);

    }
    @Test
    @DisplayName("get position 2")
    public void t5() {

        IList<String> da = new SingleLinkedList<>(String[]::new);
        da.inserts("A","B", "C", "D");
        var expected="C";
        var actual = da.get(2);
        assertEquals( expected  , actual);

    }
    @Test
    @DisplayName("findAll the letter D, but collection contains 0 rows")
    public void t6A() {

        IList<String> da = new SingleLinkedList<>(String[]::new);
        var expected=0;
        var actual = da.findAll("D").length;
        assertEquals( expected  , actual);
    }
    @Test
    @DisplayName("findAll size: 4")
    public void t6() {

        IList<String> da = new SingleLinkedList<>(String[]::new);
        da.inserts("D","A","B", "C", "D","D","F","D");
        var expected=4;
        var actual = da.findAll("D").length;
        assertEquals( expected  , actual);
    }

    @Test
    @DisplayName("findAll and get index of A, by Mohamed Kaba")
    public void t7() {

        IList<String> da = new SingleLinkedList<>(String[]::new);
        da.inserts("D","A","B", "C", "D","D","F","D");
        var expected=1;
        var actual = da.findAll("A")[0];
        assertEquals( expected, actual);
    }
}