package edu.citytech.cst.finance.service.test.bst;

import com.jbbwebsolutions.ds.facade.IList;
import com.jbbwebsolutions.ds.facade.widget.Widget;
import com.jbbwebsolutions.ds.facade.widget.WidgetRepository;
import edu.citytech.finance.array.DynamicArray;
import edu.citytech.finance.binarysearchtree.BinarySearchTree;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static edu.citytech.finance.array.SelectionSort.sort;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Find One")
public class T1_FindOne {

    @DisplayName("Find Record '8192'")
    @Test
    public void t0(){

        var resutls = WidgetRepository.find(1,10);
        for(var w: resutls){
            System.out.println(w);
        }

        IList<Widget> widgetList = new DynamicArray<Widget>(Widget[]::new);
        Widget searchValue = new Widget();
        DynamicArray<Widget> counter = new DynamicArray<>(Widget[]::new);
        widgetList.inserts(resutls);
       var aWidget= widgetList.findOne(searchValue.setTransactionId(8192),counter::insert );

        Integer arr[] = {64,25,12,22,11};
        sort(arr);

        var expected= 10;
        var actual= counter.size();
        assertEquals(expected,actual);
    }

    @DisplayName("count size < 10 for finding ID: 5313")
    @Test
    public void t1(){

        var resutls = WidgetRepository.find(1,1000);
        IList<Widget> widgetTree = new BinarySearchTree<>();
        for(var w: resutls){
            System.out.println(w);
            widgetTree.insert(w);
        }

        Widget searchValue = new Widget();
        DynamicArray<Widget> counter = new DynamicArray<>(Widget[]::new);

        var aWidget= widgetTree.findOne(searchValue.setTransactionId(5313),
                System.out::println );


        var expected= true;
        var actual= counter.size()<10;
        assertEquals(expected,actual);

        System.out.println("awidget......: " + aWidget);
        System.out.println("counter size.: " + counter.size());

    }
    @DisplayName("Find Record '1186'")
    @Test
    public void t2(){

        var resutls = WidgetRepository.find(1,465);
        for(var w: resutls){
            System.out.println(w);
        }

        IList<Widget> widgetList = new DynamicArray<Widget>(Widget[]::new);
        Widget searchValue = new Widget();
        DynamicArray<Widget> counter = new DynamicArray<>(Widget[]::new);
        widgetList.inserts(resutls);
        var aWidget= widgetList.findOne(searchValue.setTransactionId(1186),counter::insert );

        Integer arr[] = {64,25,12,22,11};
        sort(arr);

        var expected= 465;
        var actual= counter.size();
        assertEquals(expected,actual);
    }
    @DisplayName("Find Record '3205'")
    @Test
    public void t3(){

        var resutls = WidgetRepository.find(1,3205);
        for(var w: resutls){
            System.out.println(w);
        }

        IList<Widget> widgetList = new DynamicArray<Widget>(Widget[]::new);
        Widget searchValue = new Widget();
        DynamicArray<Widget> counter = new DynamicArray<>(Widget[]::new);
        widgetList.inserts(resutls);
        var aWidget= widgetList.findOne(searchValue.setTransactionId(3205),counter::insert );

        Integer arr[] = {64,25,12,22,11};
        sort(arr);

        var expected= 579;
        var actual= counter.size();
        assertEquals(expected,actual);
    }
    @DisplayName("Find Record '5781'")
    @Test
    public void t4(){

        var resutls = WidgetRepository.find(1,990);
        for(var w: resutls){
            System.out.println(w);
        }

        IList<Widget> widgetList = new DynamicArray<Widget>(Widget[]::new);
        Widget searchValue = new Widget();
        DynamicArray<Widget> counter = new DynamicArray<>(Widget[]::new);
        widgetList.inserts(resutls);
        var aWidget= widgetList.findOne(searchValue.setTransactionId(5781),counter::insert );

        Integer arr[] = {64,25,12,22,11};
        sort(arr);

        var expected= 990;
        var actual= counter.size();
        assertEquals(expected,actual);
    }
    @DisplayName("Find Record '8192'")
    @Test
    public void t5(){

        var resutls = WidgetRepository.find(1,10);
        for(var w: resutls){
            System.out.println(w);
        }

        IList<Widget> widgetList = new DynamicArray<Widget>(Widget[]::new);
        Widget searchValue = new Widget();
        DynamicArray<Widget> counter = new DynamicArray<>(Widget[]::new);
        widgetList.inserts(resutls);
        var aWidget= widgetList.findOne(searchValue.setTransactionId(8192),counter::insert );

        Integer arr[] = {64,25,12,22,11};
        sort(arr);

        var expected= 10;
        var actual= counter.size();
        assertEquals(expected,actual);
    }
    @DisplayName("Find Record '9228'")
    @Test
    public void t6(){

        var resutls = WidgetRepository.find(1,9228);
        for(var w: resutls){
            System.out.println(w);
        }

        IList<Widget> widgetList = new DynamicArray<Widget>(Widget[]::new);
        Widget searchValue = new Widget();
        DynamicArray<Widget> counter = new DynamicArray<>(Widget[]::new);
        widgetList.inserts(resutls);
        var aWidget= widgetList.findOne(searchValue.setTransactionId(9228),counter::insert );

        Integer arr[] = {64,25,12,22,11};
        sort(arr);

        var expected= 173;
        var actual= counter.size();
        assertEquals(expected,actual);
    }
    @DisplayName("count size < 7 for finding ID: 8192")
    @Test
    public void t7(){

        var resutls = WidgetRepository.find(1,1000);
        IList<Widget> widgetTree = new BinarySearchTree<>();
        for(var w: resutls){
            System.out.println(w);
            widgetTree.insert(w);
        }

        Widget searchValue = new Widget();
        DynamicArray<Widget> counter = new DynamicArray<>(Widget[]::new);

        var aWidget= widgetTree.findOne(searchValue.setTransactionId(8192),
                System.out::println );


        var expected= true;
        var actual= counter.size()<7;
        assertEquals(expected,actual);

        System.out.println("awidget......: " + aWidget);
        System.out.println("counter size.: " + counter.size());

    }
    @DisplayName("count size < 5 for finding ID: 1930 ")
    @Test
    public void t8(){

        var resutls = WidgetRepository.find(1,1000);
        IList<Widget> widgetTree = new BinarySearchTree<>();
        for(var w: resutls){
            System.out.println(w);
            widgetTree.insert(w);
        }

        Widget searchValue = new Widget();
        DynamicArray<Widget> counter = new DynamicArray<>(Widget[]::new);

        var aWidget= widgetTree.findOne(searchValue.setTransactionId(1930),
                System.out::println );


        var expected= true;
        var actual= counter.size()<5;
        assertEquals(expected,actual);

        System.out.println("awidget......: " + aWidget);
        System.out.println("counter size.: " + counter.size());

    }
    @DisplayName("count size < 11 for finding ID: 6060 ")
    @Test
    public void t9(){

        var resutls = WidgetRepository.find(1,1000);
        IList<Widget> widgetTree = new BinarySearchTree<>();
        for(var w: resutls){
            System.out.println(w);
            widgetTree.insert(w);
        }

        Widget searchValue = new Widget();
        DynamicArray<Widget> counter = new DynamicArray<>(Widget[]::new);

        var aWidget= widgetTree.findOne(searchValue.setTransactionId(6060),
                System.out::println );


        var expected= true;
        var actual= counter.size()<11;
        assertEquals(expected,actual);

        System.out.println("awidget......: " + aWidget);
        System.out.println("counter size.: " + counter.size());

    }
    @DisplayName("count size < 12 for finding ID: 7267 ")
    @Test
    public void t10(){

        var resutls = WidgetRepository.find(1,1000);
        IList<Widget> widgetTree = new BinarySearchTree<>();
        for(var w: resutls){
            System.out.println(w);
            widgetTree.insert(w);
        }

        Widget searchValue = new Widget();
        DynamicArray<Widget> counter = new DynamicArray<>(Widget[]::new);

        var aWidget= widgetTree.findOne(searchValue.setTransactionId(7267),
                System.out::println );


        var expected= true;
        var actual= counter.size()<12;
        assertEquals(expected,actual);

        System.out.println("awidget......: " + aWidget);
        System.out.println("counter size.: " + counter.size());

    }

}
