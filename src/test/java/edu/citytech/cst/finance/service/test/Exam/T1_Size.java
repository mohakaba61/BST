package edu.citytech.cst.finance.service.test.Exam;

import com.jbbwebsolutions.ds.facade.IList;
import com.jbbwebsolutions.ds.facade.stock.StockRepository;
import edu.citytech.finance.binarysearchtree.BinarySearchTree;
import edu.citytech.finance.model.Stock;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class T1_Size {
    @DisplayName("Size")
    @Test
    public void t1_searchFor(){
        IList<Stock> avlTree= new BinarySearchTree<Stock>();
        StockRepository.process(Stock::new)
                .forEach(e ->{
                    avlTree.insert((Stock) e);
                });



        System.out.println("size: "+avlTree.size());
//

    }
}
