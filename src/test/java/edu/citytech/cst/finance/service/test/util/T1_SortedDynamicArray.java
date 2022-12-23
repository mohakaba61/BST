package edu.citytech.cst.finance.service.test.util;

import com.jbbwebsolutions.ds.facade.IList;
import com.jbbwebsolutions.ds.other.SearchEngine;
import edu.citytech.finance.array.DynamicArray;
import edu.citytech.finance.array.SortedDynamicArray;
import edu.citytech.finance.model.Student;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

import static junit.framework.Assert.assertEquals;

public class T1_SortedDynamicArray {
    @Test
    @DisplayName("Sorted Dynamic Array (1) test Last item ")
      void t1() {
        IList<Float> da = new SortedDynamicArray<>(7, Float[]::new);

        da.insert(55f);
        da.inserts(100f,1f,2f,3f,4f,5f,6f,7f);
        da.insert(34f);

        Float [] results = da.toArray();
        for(float r: results){
            System.out.print(r + " ");
        }

        var expected=100f;
        var actual=results[results.length -1];

        assertEquals(expected, actual);

    }

    @Test
    @DisplayName("Sorted Dynamic Array (2) test First item ")
    void t2() {
        IList<Float> da = new SortedDynamicArray<>(7, Float[]::new);

        da.insert(55f);
        da.inserts(100f,1f,2f,3f,4f,5f,6f,7f);
        da.insert(34f);

        Float [] results = da.toArray();
        for(float r: results){
            System.out.print(r + " ");
        }

        var expected=1f;
        var actual=results[0];

        assertEquals(expected, actual);

    }
    @Test
    @DisplayName("Sorted Dynamic Array (3) findAll  ")
    void t3() {
        IList<Float> da = new SortedDynamicArray<>(7, Float[]::new);

        da.insert(55f);
        da.inserts(100f,1f,2f,3f,4f,5f,6f,7f,-1f,2f,3f,77f,3f,200f);
        da.insert(34f);

        Float [] results = da.toArray();

        da.setConsumer((System.out::println));
        var foundData=da.findAll(2f);
        var expected=foundData.length> 0;

        assertEquals(expected, true);

    }
    @Test
    @DisplayName("count the number of operations  ")
    void t4() {
        IList<Float> da = new SortedDynamicArray<>(7, Float[]::new);

        da.insert(55f);
        da.inserts(100f,1f,2f,3f,4f,5f,6f,7f,-1f,2f,3f,77f,3f,200f);
        da.insert(34f);

        Float [] results = da.toArray();
        var counter= new AtomicInteger(0);

        da.setConsumer(e -> {
            counter.addAndGet(1);
        });
        var foundData=da.findAll(2f);
        var expected=da.size();
        var actual = counter.get();

        assertEquals(expected, actual);

    }
    @Test
    @DisplayName("A sorted Search (simple)")
    void t5() {
        IList<Float> da = new SortedDynamicArray<>(7, Float[]::new, SearchEngine.LINEAR_SORTED_SEARCH);

        da.insert(55f);
        da.inserts(100f,1f,2f,3f,4f,5f,6f,7f,-1f,2f,3f,77f,3f,200f);
        da.insert(34f);

        Float [] results = da.toArray();
        var counter= new AtomicInteger(0);

        da.setConsumer(e -> {
            System.out.print(" "+ e);
            counter.addAndGet(1);
        });
        var foundData=da.findAll(2f);
        var expected=3;
        var actual = counter.get();

        assertEquals(expected, actual);

    }
    @Test
    @DisplayName("A Binary Search (1)")
    void t7() {
        IList<Integer> da = new SortedDynamicArray<>(7, Integer[]::new, SearchEngine.BINARY_SEARCH_ITERATION);

       Integer [] data= IntStream.rangeClosed(1,1000).boxed().toArray(Integer[]::new);

       da.inserts(data);
        Integer [] results = da.toArray();

        var counter= new AtomicInteger(0);

        da.setConsumer(e -> {
            System.out.print(" "+ e);
            counter.addAndGet(1);
        });
        var foundData=da.findAll(500);
        var expected=9;
        var actual = counter.get();

        assertEquals(expected, actual);

    }
//
//    @Test
//    @DisplayName("Sorted Dynamic Array (4) findAll till the middle length of the list [-1 to 7]  ")
//    void t6() {
//        IList<Float> da = new SortedDynamicArray<>(7, Float[]::new);
//
//        da.insert(55f);
//        da.inserts(100f,1f,2f,3f,4f,5f,6f,7f,-1f,2f,3f,77f,3f);
//        da.insert(34f);
//
//        Float [] results = da.toArray();
//        da.setConsumer((System.out::println));
//        int mid= da.size()/2;
//        var foundData=da.findAll((float)mid);
//        var expected=foundData.length> 0;
//
//        assertEquals(expected, true);
//
//    }
//    @Test
//    @DisplayName("Sorted Dynamic Array (5) findAll  ")
//    void t7() {
//        IList<Float> da = new SortedDynamicArray<>(7, Float[]::new);
//
//        da.insert(55f);
//        da.inserts(100f,1f,2f,3f,4f,5f,6f,7f,-1f,2f,3f,77f,3f);
//        da.insert(34f);
//
//        Float [] results = da.toArray();
//
//        da.setConsumer((System.out::println));
//        var foundData=da.findAll(-1f);
//        var expected=foundData.length> 0;
//
//        assertEquals(expected, true);
//
//    }
//    @Test
//    @DisplayName("Sorted Dynamic Array (6) findAll till the last number")
//    void t8() {
//        IList<Float> da = new SortedDynamicArray<>(7, Float[]::new);
//
//        da.insert(55f);
//        da.inserts(100f,1f,2f,3f,4f,5f,6f,7f,-1f,2f,3f,77f,3f);
//        da.insert(34f);
//
//        Float [] results = da.toArray();
//
//        da.setConsumer((System.out::println));
//        var foundData=da.findAll(100f);
//        var expected=foundData.length> 0;
//
//        assertEquals(expected, true);
//
//    }
//    @Test
//    @DisplayName("Sorted Dynamic Array (7) findAll using character ")
//    void t9() {
//        IList<Character> da = new SortedDynamicArray<>(7, Character[]::new);
//
//
//        da.inserts('F','H','A','B','E','O');
//
//
//        Character [] results = da.toArray();
//
//        da.setConsumer((System.out::println));
//        var foundData=da.findAll('F');
//        var expected=foundData.length> 0;
//
//        assertEquals(expected, true);
//
//    }
//    @Test
//    @DisplayName("Sorted Dynamic Array (8) findAll   ")
//    void t10() {
//        IList<Character> da = new SortedDynamicArray<>(7, Character[]::new);
//
//        da.insert('K');
//        da.inserts('F','H','N','B','E','O');
//        da.insert('P');
//
//        Character [] results = da.toArray();
//
//        da.setConsumer((System.out::println));
//        var foundData=da.findAll('B');
//        var expected=foundData.length> 0;
//
//        assertEquals(expected, true);
//
//    }
//    @Test
//    @DisplayName("Sorted Dynamic Array (9) findAll the first character in list   ")
//    void t11() {
//        IList<Character> da = new SortedDynamicArray<>(7, Character[]::new);
//
//        da.insert('K');
//        da.inserts('F','H','N','B','E','O');
//        da.insert('P');
//
//        Character [] results = da.toArray();
//
//        da.setConsumer((System.out::println));
//        var expected='B';
//        var actual=results[0];
//
//        assertEquals(expected, actual.charValue());
//
//    }
//    @Test
//    @DisplayName("Sorted Dynamic Array (3) findAll using String ")
//    void t12() {
//        IList<String> da = new SortedDynamicArray<>(7, String[]::new);
//
//        da.insert("AA");
//        da.inserts("BA","JFNN", "ANNA"," ","ANNB", "NANA");
//
//
//        String [] results = da.toArray();
//
//        da.setConsumer((System.out::println));
//        var foundData=da.findAll("ANNB");
//        var expected=foundData.length> 0;
//
//        assertEquals(expected, true);
//
//    }
//    @Test
//    @DisplayName("Sorted Dynamic Array (3) findAll using String it will return nothing  ")
//    void t13() {
//        IList<String> da = new SortedDynamicArray<>(7, String[]::new);
//
//        da.insert("AA");
//        da.inserts("BA","JFNN", "ANNA"," ","ANNB", "NANA");
//
//
//        String [] results = da.toArray();
//
//        da.setConsumer((System.out::println));
//        var foundData=da.findAll(" ");
//        var expected=foundData.length> 0;
//
//        assertEquals(expected, true);
//
//    }

}
