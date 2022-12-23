package edu.citytech.cst.finance.service.test.other;
import edu.citytech.finance.util.Counter;
import edu.citytech.finance.util.Counter1;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Enumerator Test for Mortgage Options")
public class T6_1_Counter
{
    @DisplayName("abc (a - z) w consumer")
    @Test
    void t1() {
        String [] abc = Counter1.abc(System.out::println);
        var expected = 26;
        var actual = abc.length;
        assertEquals(expected, actual);
    }
    @DisplayName("abc (a - z)")
    @Test
    void t1b() {
        String [] abc = Counter1.abc();
        var expected = 26;
        var actual = abc.length;
        assertEquals(expected, actual);
    }
    @DisplayName("abc (a - h)")
    @Test
    void t2() {
        String [] abc = Counter1.abc('h');
        var expected = 8;
        var actual = abc.length;
        assertEquals(expected, actual);
    }
    @DisplayName("abc (a - h) with a consumer")
    @Test
    void t3() {
        String [] abc = Counter1.abc('h', System.out::println);
        var expected = 8;
        var actual = abc.length;
        assertEquals(expected, actual);
    }

    @DisplayName("1 to 3")
    @Test
    void t4() {
        Integer [] abc = Counter1.n123(1,3);
        var expected = 3;
        var actual = abc.length;
        assertEquals(expected, actual);
    }
    @DisplayName("3 to 1")
    @Test
    void t5() {
        Integer [] abc = Counter1.n321(3,1);
        var expected = 2;
        var actual = abc.length;
        assertEquals(expected, actual);
    }
    @DisplayName("cba (c - a) with a consumer")
    @Test
    void t6() {
        String [] cba = Counter1.cba('c',System.out::println);
        var expected = 3;
        var actual = cba.length;
        assertEquals(expected, actual);
    }
    @DisplayName("abc (a - a) with a consumer")
    @Test
    void t7() {
        String [] abc = Counter1.cba('a', System.out::println);
        var expected = 1;
        var actual = abc.length;
        assertEquals(expected, actual);
    }
    @DisplayName("abc (O - a)")
    @Test
    void t8() {
        String [] abc = Counter1.cba('o');
        var expected = 15;
        var actual = abc.length;
        assertEquals(expected, actual);
    }
    @DisplayName("abc (O - a) with a consumer")
    @Test
    void t9() {
        String [] abc = Counter1.cba('o', System.out::println);
        var expected = 15;
        var actual = abc.length;
        assertEquals(expected, actual);
    }
    @DisplayName("abc (z - a)")
    @Test
    void t10() {
        String [] abc = Counter1.cba('y');
        var expected = 25;
        var actual = abc.length;
        assertEquals(expected, actual);
    }
    @DisplayName("abc (z - a) with a consumer")
    @Test
    void t11() {
        String [] abc = Counter1.cba('y', System.out::println);
        var expected = 25;
        var actual = abc.length;
        assertEquals(expected, actual);
    }
    @DisplayName("abc (s - a)")
    @Test
    void t12() {
        String [] abc = Counter1.cba('s');
        var expected = 19;
        var actual = abc.length;
        assertEquals(expected, actual);
    }
    @DisplayName("abc (s - a) with a consumer")
    @Test
    void t13() {
        String [] abc = Counter1.cba('s', System.out::println);
        var expected = 19;
        var actual = abc.length;
        assertEquals(expected, actual);
    }
    @DisplayName("abc ('empty char ' - a )")
    @Test
    void t14() {
        String [] abc = Counter1.cba(' ');
        var expected = 1;
        var actual = abc.length;
        assertEquals(expected, actual);
    }
    @DisplayName("abc ('empty char ' - a) with a consumer")
    @Test
    void t15() {
        String [] abc = Counter1.cba(' ', System.out::println);
        var expected = 1;
        var actual = abc.length;
        assertEquals(expected, actual);
    }
    @DisplayName("10 to 5")
    @Test
    void t16() {
        Integer [] abc = Counter1.n321(10,5);
        var expected = 5;
        var actual = abc.length;
        assertEquals(expected, actual);
    }
    @DisplayName("40 to 18")
    @Test
    void t17() {
        Integer [] abc = Counter1.n321(40,18);
        var expected = 22;
        var actual = abc.length;
        assertEquals(expected, actual);
    }
    @DisplayName("4 to 9")
    @Test
    void t18() {
        Integer [] abc = Counter1.n123(4,9);
        var expected = 6;
        var actual = abc.length;
        assertEquals(expected, actual);
    }
    @DisplayName("6 to 13")
    @Test
    void t19() {
        Integer [] abc = Counter1.n123(6,13);
        var expected = 8;
        var actual = abc.length;
        assertEquals(expected, actual);
    }
    @DisplayName("4 to 10")
    @Test
    void t20() {
        Integer [] abc = Counter1.n123(4,10);
        var expected = 7;
        var actual = abc.length;
        assertEquals(expected, actual);
    }
}
