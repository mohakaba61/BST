package edu.citytech.cst.finance.service.test.map;

import com.jbbwebsolutions.ds.facade.widget.Widget;
import com.jbbwebsolutions.ds.facade.widget.WidgetRepository;
import edu.citytech.finance.map.DictionaryModel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Dictionary;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class T2_Dictionary {

    @Test
    @DisplayName("TestWidgets by Kaba, Mohamed")
    public void testWidget(){
        var dictionary = new DictionaryModel<Integer, Widget>(500);

        Widget[] widgets  = WidgetRepository.find();
        for (Widget current: widgets){
             dictionary.put (current);
        }

        var searchFor   = new Widget().setTransactionId (99999);
        Optional<Widget> results = dictionary.get (searchFor, System.out::println);
        assertNotNull (dictionary);
        assertEquals ( 1000, dictionary.size());
        System.out.println(results);
        System.out.println("collision count: " + dictionary.getCollisionCount());

    }
}
