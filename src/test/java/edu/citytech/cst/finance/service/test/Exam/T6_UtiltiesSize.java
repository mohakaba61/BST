package edu.citytech.cst.finance.service.test.Exam;

import com.jbbwebsolutions.ds.facade.IList;
import com.jbbwebsolutions.ds.facade.stock.StockRepository;
import edu.citytech.finance.binarysearchtree.BinarySearchTree;
import edu.citytech.finance.model.Stock;
import edu.citytech.finance.model.Stock5;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class T6_UtiltiesSize {
    @DisplayName("BST test by Mohamed Kaba")
    @Test
    public void t4_searchFor(){
        IList<Stock5> avlTree= new BinarySearchTree<Stock5>();
        StockRepository.process(Stock5::new)

                .forEach ( e ->{
                    if(e.getSector().equals("Utilities"))
                        avlTree.insert((Stock5) e);

                });
        System.out.println(avlTree.size());

    }
}
