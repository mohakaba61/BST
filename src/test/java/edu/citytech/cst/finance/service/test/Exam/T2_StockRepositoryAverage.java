package edu.citytech.cst.finance.service.test.Exam;

import com.jbbwebsolutions.ds.facade.IList;
import com.jbbwebsolutions.ds.facade.stock.StockRepository;
import edu.citytech.finance.binarysearchtree.BinarySearchTree;
import edu.citytech.finance.model.Stock1;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class T2_StockRepositoryAverage {
    @DisplayName("BST test by Mohamed Kaba")
    @Test
    public void t1_searchFor(){
        IList<Stock1> avlTree= new BinarySearchTree<Stock1>();
        StockRepository.process(Stock1::new)
                .forEach(e ->{
                    avlTree.insert((Stock1
                            ) e);
                });

        var average= avlTree.average();


        System.out.println("average: "+average);


    }
}
