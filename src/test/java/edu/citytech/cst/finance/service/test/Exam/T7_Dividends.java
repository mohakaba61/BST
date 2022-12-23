package edu.citytech.cst.finance.service.test.Exam;

import com.jbbwebsolutions.ds.facade.IList;
import com.jbbwebsolutions.ds.facade.stock.StockRepository;
import edu.citytech.finance.binarysearchtree.BinarySearchTree;
import edu.citytech.finance.model.Stock;
import edu.citytech.finance.model.Stock6;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class T7_Dividends {
    @DisplayName("BST test by Mohamed Kaba")
    @Test
    public void t1_searchFor(){
        IList<Stock6> avlTree= new BinarySearchTree<Stock6>();
        StockRepository.process(Stock6::new)
                .forEach(e ->{
                    avlTree.insert((Stock6) e);
                });

        var max= avlTree.maxT();


        System.out.println("max: "+max);


    }
}
