package edu.citytech.cst.finance.service.test.util;

import com.jbbwebsolutions.ds.facade.IList;
import edu.citytech.finance.array.SingleLinkedList;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

@DisplayName("SingleLinkedList.removeFirstITem by Mohamed Kaba")
public class TB_SingleLinkListRemove {
    @Test
    @DisplayName("removeAt(2) ")
    public void t0(){
        IList<String> da= new SingleLinkedList<>(String[]::new);
        da.inserts("A", "B","C","D");
        da.removeAt(2);
        boolean expected=da.size()==3 && da.getLastItem().equals("D");
        var results= da.toString();

        System.out.println(results);
        assertTrue(expected);
    }
    @Test
    @DisplayName("removeAt(0) ")
    public void t1(){
        IList<String> da= new SingleLinkedList<>(String[]::new);
        da.inserts("A", "B","C","D");
        da.removeAt(0);
        boolean expected=da.size()==3 && da.getLastItem().equals("D");
        var results= da.toString();

        System.out.println(results);
        assertTrue(expected);
    }
    @Test
    @DisplayName("removeAt(3) ")
    public void t2(){
        IList<String> da= new SingleLinkedList<>(String[]::new);
        da.inserts("A", "B","C","D");
        da.removeAt(3);
        boolean expected=da.size()==3 && da.getLastItem().equals("C");
        var results= da.toString();

        System.out.println(results);
        assertTrue(expected);
    }
    @Test
    @DisplayName("removeLast  ")
    public void t3(){
        IList<String> da= new SingleLinkedList<>(String[]::new);
        da.inserts("A");
        da.removeLastItem();
        boolean expected=da.size()==0 && da.getLastItem()==null;
        var results= da.toString();

        System.out.println(results);
        assertTrue(expected);
    }
    @Test
    @DisplayName("removeLast: empty  ")
    public void t4(){
        IList<String> da= new SingleLinkedList<>(String[]::new);
        da.removeLastItem();
        boolean expected=da.size()==0 && da.getLastItem()==null;
        var results= da.toString();

        System.out.println(results);
        assertTrue(expected);
    }
    @Test
    @DisplayName("removeAt(3) ")
    public void t5(){
        IList<String> da= new SingleLinkedList<>(String[]::new);
        da.inserts("A", "B","C","D");
        da.removeAt(3);
        da.removeAt(2);
        da.removeAt(1);
        boolean expected=da.size()==1;
        var results= da.toString();
        System.out.println(results);
        assertTrue(expected);
    }

}
