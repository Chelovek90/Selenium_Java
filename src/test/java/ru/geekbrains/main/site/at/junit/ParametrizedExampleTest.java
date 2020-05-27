package ru.geekbrains.main.site.at.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ParametrizedExampleTest {

    @ParameterizedTest
//    @ValueSource(strings = {"Courses", "Test"})
    @MethodSource("stringGenerator")
    public void test01(String title) {
        assertNotNull(title);
    }

    public static Stream<String> stringGenerator() {
        return Stream.of("Courses", "Test");
    }

    @ParameterizedTest
    @MethodSource("argumentsStream")
    public void test02(int a, int b, int result) {
        Assertions.assertEquals(result, a + b);
    }

    public static Stream<Arguments> argumentsStream() {
        return Stream.of(
                Arguments.of(-100, 100, 0)
        );
    }
}
