package edu.citytech.cst.finance.service.test.other;


//import edu.citytech.cst.finance.model.MortgageOptions;
import edu.citytech.finance.model.mortgageOption;
import edu.citytech.finance.util.Counter;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Counter")
public class T6_Counter
{
    @DisplayName("abc (a - z) w consumer")
    @Test

    void t1() {
         String [] abc = Counter.abc(System.out::println);
        var expected = 26;
        var actual = abc.length;
        assertEquals(expected, actual);
    }
    @DisplayName("abc (a - z)")
    @Test

    void t1b() {
        String [] abc = Counter.abc();
        var expected = 26;
        var actual = abc.length;
        assertEquals(expected, actual);
    }
    @DisplayName("abc (a - h)")
    @Test
    void t2() {
        String [] abc = Counter.abc('h');
        var expected = 8;
        var actual = abc.length;
        assertEquals(expected, actual);
    }
    @DisplayName("abc (a - h) with a consumer")
    @Test
    void t3() {
        String [] abc = Counter.abc('h', System.out::println);
        var expected = 8;
        var actual = abc.length;
        assertEquals(expected, actual);
    }
    @DisplayName("abc (a - g)")
    @Test
    void t4() {
        String [] abc = Counter.abc('g');
        var expected = 7;
        var actual = abc.length;
        assertEquals(expected, actual);
    }
    @DisplayName("abc (a - g) with a consumer")
    @Test
    void t5() {
        String [] abc = Counter.abc('g', System.out::println);
        var expected = 7;
        var actual = abc.length;
        assertEquals(expected, actual);
    }
    @DisplayName("abc (a - a)")
    @Test
    void t6() {
        String [] abc = Counter.abc('a');
        var expected = 1;
        var actual = abc.length;
        assertEquals(expected, actual);
    }
    @DisplayName("abc (a - a) with a consumer")
    @Test
    void t7() {
        String [] abc = Counter.abc('a', System.out::println);
        var expected = 1;
        var actual = abc.length;
        assertEquals(expected, actual);
    }
    @DisplayName("abc (a - o)")
    @Test
    void t8() {
        String [] abc = Counter.abc('o');
        var expected = 15;
        var actual = abc.length;
        assertEquals(expected, actual);
    }
    @DisplayName("abc (a - o) with a consumer")
    @Test
    void t9() {
        String [] abc = Counter.abc('o', System.out::println);
        var expected = 15;
        var actual = abc.length;
        assertEquals(expected, actual);
    }
    @DisplayName("abc (a - z)")
    @Test
    void t10() {
        String [] abc = Counter.abc('y');
        var expected = 25;
        var actual = abc.length;
        assertEquals(expected, actual);
    }
    @DisplayName("abc (a - z) with a consumer")
    @Test
    void t11() {
        String [] abc = Counter.abc('y', System.out::println);
        var expected = 25;
        var actual = abc.length;
        assertEquals(expected, actual);
    }
    @DisplayName("abc (a - s)")
    @Test
    void t12() {
        String [] abc = Counter.abc('s');
        var expected = 19;
        var actual = abc.length;
        assertEquals(expected, actual);
    }
    @DisplayName("abc (a - s) with a consumer")
    @Test
    void t13() {
        String [] abc = Counter.abc('s', System.out::println);
        var expected = 19;
        var actual = abc.length;
        assertEquals(expected, actual);
    }
    @DisplayName("abc (a - 'empty char ')")
    @Test
    void t14() {
        String [] abc = Counter.abc(' ');
        var expected = 1;
        var actual = abc.length;
        assertEquals(expected, actual);
    }
    @DisplayName("abc (a - 'empty char ') with a consumer")
    @Test
    void t15() {
        String [] abc = Counter.abc(' ', System.out::println);
        var expected = 1;
        var actual = abc.length;
        assertEquals(expected, actual);
    }

}
