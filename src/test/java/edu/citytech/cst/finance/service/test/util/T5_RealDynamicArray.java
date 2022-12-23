package edu.citytech.cst.finance.service.test.util;

import edu.citytech.finance.model.Student;
import edu.citytech.finance.array.DynamicArray;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;

public class T5_RealDynamicArray {
    @Test
    @DisplayName("Size test of the to Array")
      void t1() {
        DynamicArray<Float> da = new DynamicArray<>(7, Float[]::new);

        da.insert(55f);
        da.inserts(1f,2f,3f,4f,5f,6f,7f);
        Float [] results = da.toArray();
        for(float r: results){
            System.out.print(r + " ");
        }

      float x= da.get(0);
        System.out.println(da);
        System.out.println("Position 0 " + x);

        int expected=8;
        int actual=results.length;

        assertEquals(expected, actual);

    }
    @Test
    @DisplayName("find value 4.0")
    void t2() {
        DynamicArray<Student> da = new DynamicArray<>(7, Student[]::new);

        da.insert(new Student("001",4.0f));
        da.inserts(new Student("002",3.0f),
                new Student("003",2.0f),
                new Student("004",1.0f),
                new Student("005",3.5f),
                 new Student("006",4.0f),
                new Student("007",2.8f),
                new Student("007",4.00f)
        );


       Integer [] positionFound= da.findAll(new Student("*", 4.0f));
        for(int p: positionFound){
            System.out.println("found in position: "+p);
        }

        int expected=3;
        int actual=positionFound.length;

        assertEquals(expected, actual);

    }
}
