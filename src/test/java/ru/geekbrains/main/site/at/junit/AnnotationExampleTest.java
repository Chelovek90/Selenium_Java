package ru.geekbrains.main.site.at.junit;

import org.junit.jupiter.api.*;

import java.util.Random;

import static java.lang.Thread.sleep;
import static org.junit.Assert.assertTrue;

public class AnnotationExampleTest {


    @Test
    public void test01() {
        assertTrue(1 == 2);
    }

    @DisplayName("Example method 'DisplaName' ")
    @Test
    public void test02() {
        assertTrue(true);
    }


//    @RepeatedTest(20)
    @Test
    public void test03() {
        int x = new Random().nextInt(50);
        assertTrue(x > 25);
    }

    @Timeout(2)
    @Test
    public void test04() throws InterruptedException {
        sleep(1900);
        assertTrue(true);
    }

}
