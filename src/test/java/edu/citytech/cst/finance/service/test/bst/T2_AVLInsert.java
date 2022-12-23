package edu.citytech.cst.finance.service.test.bst;

import com.jbbwebsolutions.ds.facade.IList;
import com.jbbwebsolutions.ds.facade.widget.Widget;
import com.jbbwebsolutions.ds.facade.widget.WidgetRepository;
import edu.citytech.finance.array.DynamicArray;
import edu.citytech.finance.binarysearchtree.AVLTree;
import edu.citytech.finance.binarysearchtree.BinarySearchTree;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.awt.event.WindowFocusListener;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

import static edu.citytech.finance.array.SelectionSort.sort;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class T2_AVLInsert {
    @DisplayName("Insert 1 Record ")
    @Test
    public void t1(){

        var resutls = WidgetRepository.find(1,1);
        for(var w: resutls){
            System.out.println(w);
        }

        IList<Widget> widgetList = new AVLTree<>();
        Widget searchValue = new Widget();
        DynamicArray<Widget> counter = new DynamicArray<>(Widget[]::new);
        widgetList.inserts(resutls);
        widgetList.findOne(searchValue.setTransactionId(8192), counter::insert);


        var expected= 1;
        var actual= counter.size();
        assertEquals(expected,actual);
    }
    @DisplayName("Insert 3 Record ")
    @Test
    public void t2(){

        var resutls = WidgetRepository.find(7,8,9);
        for(var w: resutls){
            System.out.println(w);
        }

        IList<Widget> widgetList = new AVLTree<>();
        Widget searchValue = new Widget();
        DynamicArray<Widget> counter = new DynamicArray<>(Widget[]::new);
        widgetList.inserts(resutls);
        widgetList.findOne(searchValue.setTransactionId(8192), counter::insert);


        var expected= 1;
        var actual= counter.size();
        assertEquals(expected,actual);
    }
    @Test
    @DisplayName("widget find all")
    public void t5() {

        IList<Widget> bst   = new BinarySearchTree<Widget>();
        IList<Widget> avlTree = new AVLTree<Widget>();

        var counter = new DynamicArray<Widget>(Widget[]::new);
        var avlCounter = new DynamicArray<Widget>(Widget[]::new);

        Widget[] results = WidgetRepository.find();

        bst.inserts(results);
        avlTree.inserts(results);

        bst.findOne(new Widget().setTransactionId(2222), counter::insert);
        avlTree.findOne(new Widget().setTransactionId(2222), avlCounter::insert);

        int actual = counter.size();
        int expected = avlCounter.size();

        assertEquals(expected, actual);

    }
    @Test
    @DisplayName("height - rightRotate")
    public void t7() {
        IList<Widget> avlTree= new AVLTree<Widget>();
        Widget[] results= WidgetRepository.find(5,8,6);
        avlTree.inserts(results);

        int expected =1;
        int actual= avlTree.height();

        assertEquals(expected,actual);

    }
    @Test
    @DisplayName("insert 1,000,000 items")
    public void tg7() {
        IList<Integer> avlTree= new AVLTree<Integer>();

        var data = IntStream.rangeClosed(1,1_000_000)
                .boxed().toArray(Integer[]::new);

        avlTree.inserts(data);
        AtomicInteger ai= new AtomicInteger();

        avlTree.findOne(400, e -> {
            ai.addAndGet(1);
        });

        System.out.println(ai);


    }
}
