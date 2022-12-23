package edu.citytech.finance.util;

import java.util.function.Consumer;

public class Counter {
    public static String[] abc(Consumer<String> consumer) {

       return abc('z',consumer);
    }
    public static String[] abc() {
        return  abc('z');
    }
    private static void abc(char start, final char end, StringBuilder sb, Consumer<String> consumer){
        if(consumer!=null)
          consumer.accept(start +" " + end + " "+ sb);

        if(start > end)
            return;
        sb.append(start);
        abc(++start, end, sb, consumer);
    }
    public static String[] abc(char end) {
        return abc(end, null);
    }
    public static String[] abc(char end, Consumer<String> consumer) {
        StringBuilder sb = new StringBuilder();
        abc('a', end,sb,consumer);
        var results = sb.toString().split("");
        return results;
    }
}
