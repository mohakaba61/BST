package edu.citytech.cst.finance.service.test.util;

import com.jbbwebsolutions.ds.facade.IList;
import edu.citytech.finance.array.SingleLinkedList;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

@DisplayName("SingleLinkedList.toString by Mohamed Kaba")
public class TD_SingleLinkListToString {
    @Test
    @DisplayName("toString(2) ")
    public void t0(){
        IList<String> da= new SingleLinkedList<>(String[]::new);
        da.inserts("D","A", "B","C","D");
        var expected=5;
        var actual= da.toArray().length;

        System.out.println(da.toString());
        assertEquals(actual,expected);
    }
    @Test
    @DisplayName("toString(2) ")
    public void t2(){
        IList<String> da= new SingleLinkedList<>(String[]::new);
        da.inserts("D","A", "B","C","D","F");
        var expected=6;
        var actual= da.toArray().length;

        System.out.println(da.toString());
        assertEquals(actual,expected);
    }
}
