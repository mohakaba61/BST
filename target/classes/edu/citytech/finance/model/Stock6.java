package edu.citytech.finance.model;

import com.jbbwebsolutions.ds.facade.INumber;
import com.jbbwebsolutions.ds.facade.KeyValuePair;
import com.jbbwebsolutions.ds.facade.stock.Asset;

public class Stock6 extends Asset implements Comparable<Stock6>, INumber
        , KeyValuePair<String, Stock6> {
    @Override
    public int compareTo(Stock6 o) {
        return Float.compare(this.getDividends(), o.getDividends());

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
    public Stock6 getValue() {
        return this;
    }


}
