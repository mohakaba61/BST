package edu.citytech.cst.finance.service.test.other;

import java.util.stream.IntStream;

public class T5_BigO_of_N {
    public static void main(String[] args) {
        int data[]= IntStream.rangeClosed(1,1000)
                .map(e-> e*5)
                .toArray();

        int o= 0;

      for(int i=0;i< data.length;i++){
        o++;
          if(data[i]==5_000_000)
              break;
      }

        System.out.println("Number of Operation: " + o);
    }
}
