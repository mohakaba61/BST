package edu.citytech.cst.finance.service.test.other;

import java.util.stream.IntStream;

public class T4_BigO_of1 {
    public static void main(String[] args) {
        int data[]= IntStream.rangeClosed(1,1000)
                .map(e-> e*5)
                .toArray();

        int value =data[50];

        System.out.println(value);
    }
}
