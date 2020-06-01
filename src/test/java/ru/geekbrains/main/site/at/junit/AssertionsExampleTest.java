package ru.geekbrains.main.site.at.junit;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import static java.lang.Thread.sleep;
import static org.junit.jupiter.api.Assertions.*;

public class AssertionsExampleTest {

    @Test
    public void test01 () {
       assertEquals(1, 2, "Message");
    }

    @Test
    public void test02 () {
        int[] a = {1};
        int[] b = {1};
       assertArrayEquals(a, b);
    }

    @Test
    public void test03 () {
        List<Integer> list = Arrays.asList(1,2);
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            list.get(4);
        });
    }
    @Test
    public void test04 () {
        assertTimeout(Duration.ofMillis(300), () -> {
            sleep(200);
        });
    }
}
