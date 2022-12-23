package edu.citytech.cst.finance.service.test.sorted.dynamicarray;

import com.jbbwebsolutions.ds.facade.widget.WidgetRepository;
import edu.citytech.finance.array.SingleLinkedList;
import edu.citytech.finance.array.SortedDynamicArray;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class F3_CategoryA {

    @Test
    @DisplayName("Average for the price of widget of category A")
    void SortedDa3(){
        SingleLinkedList<Float> da= new SingleLinkedList<>(Float[]::new);
        var results = WidgetRepository.find();

        for(var current: results){
            if(current.getCategory()=='A'){
                da.inserts(current.getPrice());
            }
        }

        System.out.println(da.average());

    }

}
