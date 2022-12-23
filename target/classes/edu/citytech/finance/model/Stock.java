package edu.citytech.finance.model;

import com.jbbwebsolutions.ds.facade.INumber;
import com.jbbwebsolutions.ds.facade.KeyValuePair;
import com.jbbwebsolutions.ds.facade.stock.Asset;

public class Stock extends Asset implements Comparable<Stock>, INumber
        , KeyValuePair<String, Stock> {
    @Override
    public int compareTo(Stock o) {
        return Float.compare(this.getPrice(), o.getPrice());
//        return this.getSector().compareTo( o.getSector());
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
    public Stock getValue() {
        return this;
    }


}
