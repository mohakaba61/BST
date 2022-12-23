package edu.citytech.cst.finance.service.test.Exam;

import com.jbbwebsolutions.ds.facade.IList;
import com.jbbwebsolutions.ds.facade.stock.StockRepository;
import edu.citytech.finance.binarysearchtree.BinarySearchTree;
import edu.citytech.finance.model.Stock3;
import edu.citytech.finance.model.Stock4;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class T5_StockRepositoryMin {
    @DisplayName("BST test by Mohamed Kaba")
    @Test
    public void t1_searchFor(){
        IList<Stock4> avlTree= new BinarySearchTree<Stock4>();
        StockRepository.process(Stock4::new)
                .forEach(e ->{
                    avlTree.insert((Stock4) e);
                });

        var min= avlTree.minT();


    //should be FTI
        System.out.println("max: "+min);

    }
}
