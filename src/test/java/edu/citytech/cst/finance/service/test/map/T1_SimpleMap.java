package edu.citytech.cst.finance.service.test.map;

import com.jbbwebsolutions.ds.facade.widget.Widget;
import com.jbbwebsolutions.ds.facade.widget.WidgetRepository;
import edu.citytech.finance.map.MyMap;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class T1_SimpleMap {
    @Test
    public void testMyMap() {
        MyMap<String, String> myMap = new MyMap<>();
        myMap.put("USA", "Washington DC");
        myMap.put("Nepal", "Kathmandu");
        myMap.put("India", "New Delhi");
        myMap.put("Australia", "Sydney");

        assertNotNull(myMap);
        assertEquals(4, myMap.size());
        assertEquals("Kathmandu", myMap.get("Nepal"));
        assertEquals("Sydney", myMap.get("Australia"));

    }
    @Test
    @DisplayName("TestWidgets by Kaba, Mohamed")
    public void testWidget(){
        MyMap<Integer, Widget> myMap= new MyMap<>(10_000);

        var widgets = WidgetRepository.find();
        for(var current: widgets){
            myMap.put(current.getTransactionId(),current);
        }

        assertNotNull(myMap);
        assertEquals(1000,myMap.size());


        System.out.println("collision count: " + myMap.getCollisionCount());
    }

}
