package edu.citytech.cst.finance.service.test.sorted.dynamicarray;

import com.jbbwebsolutions.ds.facade.widget.WidgetRepository;
import edu.citytech.finance.array.SingleLinkedList;
import edu.citytech.finance.array.SortedDynamicArray;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class F1_CategoryA {
    @Test
    @DisplayName("maximum price of widget of category A")
    void SortedDa1(){

        SortedDynamicArray<Float> da= new SortedDynamicArray<>(Float[]::new);
        var results = WidgetRepository.find();

        for(var current: results){
            if(current.getCategory()=='A'){
                da.inserts(current.getPrice());
            }

        }

        System.out.println(da.max());

    }
}
