package edu.citytech.cst.finance.service.test.util;

import com.jbbwebsolutions.ds.facade.IList;
import edu.citytech.finance.array.SingleLinkedList;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName("SingleLinkedList.removeFirstITem by Mohamed Kaba")
public class T9_SingleLinkListRemoveFirst {
    @Test
    @DisplayName("removeAll A")
    public void t0(){
        IList<String> da= new SingleLinkedList<>(String[]::new);

//        da.inserts(" ");
        da.removeAll();
        int expected=0;
        int actual=da.size();
        var results= da.toString();

        System.out.println(results);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("removeAll A B")
    public void t1() {
        IList<String> da = new SingleLinkedList<>(String[]::new);
        da.inserts("A", "B");
        da.removeAll();
        int expected = 0;
        int actual = da.size();
        var results = da.toString();
        System.out.println(results);
        assertEquals(expected, actual);

    }
    @Test
    @DisplayName("removeAll form A B C")
    public void t3() {
        IList<String> da = new SingleLinkedList<>(String[]::new);
        da.inserts("A", "B","C");
        da.removeAll();
        int expected = 0;
        int actual = da.size();
        var results = da.toString();
        System.out.println(results);
        assertEquals(expected, actual);

    }

}
