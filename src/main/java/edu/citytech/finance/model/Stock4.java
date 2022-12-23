package edu.citytech.finance.model;

import com.jbbwebsolutions.ds.facade.INumber;
import com.jbbwebsolutions.ds.facade.KeyValuePair;
import com.jbbwebsolutions.ds.facade.stock.Asset;

public class Stock4 extends Asset implements Comparable<Stock4>, INumber
        , KeyValuePair<String, Stock4> {
    @Override
    public int compareTo(Stock4 o) {
        return Float.compare(this.getPrice(), o.getPrice());
//        return this.getSymbol().compareTo( o.getSymbol());
//        return this.getName().compareTo( o.getName());
    }

    @Override
    public double getNumber() {
        return this.getPrice();
    }

    @Override
    public String getKey() {
        return this.getSymbol();
    }

    @Override
    public Stock4 getValue() {
        return this;
    }


}
