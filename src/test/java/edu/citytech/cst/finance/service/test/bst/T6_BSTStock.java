package edu.citytech.cst.finance.service.test.bst;

import com.jbbwebsolutions.ds.facade.IList;
import com.jbbwebsolutions.ds.facade.KeyValuePair;
import com.jbbwebsolutions.ds.facade.stock.StockRepository;
import edu.citytech.finance.binarysearchtree.BinarySearchTree;
import edu.citytech.finance.map.DictionaryModel;
import edu.citytech.finance.model.Stock;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class T6_BSTStock {
    @DisplayName("BST test by Mohamed Kaba")
    @Test
    public void t1_searchFor() {
        IList<Stock> avlTree = new BinarySearchTree<Stock>();
        StockRepository.process(Stock::new)
                .forEach(e -> {
                    avlTree.insert((Stock) e);
                });

        var max = avlTree.maxT();
//        var min= avlTree.minT();
//        var average = avlTree.average();


        System.out.println("max: " + max);
//        System.out.println("min: "+min);
//        System.out.println("average: "+average);

    }

    @DisplayName("Dictionary")
    @Test
    public void t2_searchFor() {

        var stocks = new DictionaryModel<String, Stock>();
        StockRepository.process(Stock::new)
                .forEach(e -> {
                    stocks.put((KeyValuePair<String, Stock>) e);
                });


        var max = stocks.max();
        var min = stocks.minT();
        var average = stocks.average();

        System.out.println(stocks.sum());

        System.out.println("max: "+max);
        System.out.println("min: "+min);
        System.out.println("average: "+average); //0(n)
        System.out.println("collision: "+ stocks.getCollisionCount());
//
//        var stock = new Stock();
//        stock.setSymbol("MSFT");
//
//       var resutl= stocks.get(stock);
//        System.out.println(resutl);
//
//        System.out.println(stocks.sum());
    }
}

