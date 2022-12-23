package edu.citytech.cst.finance.service.test.dIl;

import com.jbbwebsolutions.ds.facade.IList;
import edu.citytech.finance.array.DoubleLinkedList;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

@DisplayName("DoubleLinkedList.insert by Mohamed Kaba")
public class T1_DoubleLinkedList_insert {
    @Test
    @DisplayName("insert(1) ")
    public void t0(){
        IList<String> da= new DoubleLinkedList<>(String[]::new);
        da.inserts("A", "B","C","D","E","F");
        var expected= 6;
        var actual= da.size();
        System.out.println(da.toString());
        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("remove last Item ")
    public void t1(){
        IList<String> da= new DoubleLinkedList<>(String[]::new);
        da.inserts("A", "B","C","D","E","F");
        da.setConsumer(System.out::println);
        da.removeLastItem();
        var expected= 5;
        var actual= da.size();
        System.out.println(da.toString());
        assertEquals(expected,actual);
    }
}
