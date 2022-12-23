package edu.citytech.cst.finance.service.test.util;

import edu.citytech.finance.util.PairDouble;
import edu.citytech.finance.util.PairFloat;
import edu.citytech.finance.util.PairInteger;
import edu.citytech.finance.util.PairString;

public class T3_Pair {
    public static void main(String[] args) {
        PairFloat pairFloat= new PairFloat(10f,20f);
        System.out.println(pairFloat);

        PairString pairString= new PairString("33232", "Boulet");
        System.out.println(pairString);


        PairInteger pairInteger= new PairInteger(100, 200);
        System.out.println(pairInteger);

        PairDouble pairDouble= new PairDouble(100d, 200d);
        System.out.println(pairDouble);

    }
}
