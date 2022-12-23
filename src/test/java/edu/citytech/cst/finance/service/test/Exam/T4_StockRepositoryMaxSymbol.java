package edu.citytech.cst.finance.service.test.Exam;

import com.jbbwebsolutions.ds.facade.IList;
import com.jbbwebsolutions.ds.facade.stock.StockRepository;
import edu.citytech.finance.binarysearchtree.BinarySearchTree;
import edu.citytech.finance.model.Stock2;
import edu.citytech.finance.model.Stock3;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class T4_StockRepositoryMaxSymbol {

    @DisplayName("BST test by Mohamed Kaba")
    @Test
    public void t1_searchFor(){
        IList<Stock3> avlTree= new BinarySearchTree<Stock3>();
        StockRepository.process(Stock3::new)
                .forEach(e ->{
                    avlTree.insert((Stock3) e);
                });

        var max= avlTree.maxT();



        System.out.println("max: "+max);

    }
}
