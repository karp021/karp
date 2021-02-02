package com.example.karp;

import com.example.karp.services.TestService;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.params.provider.Arguments.arguments;

/**
 * @author karpukhin
 * @version 1.0$
 */
public class MyParameterizedTest {

    TestService testService = new TestService();

    static Stream<String> testParamString() {
        return Stream.of("1212");
    }

    static Stream<Arguments> stringIntAndListProvider() {
        return Stream.of(
                arguments(Boolean.FALSE, "1234"),
                arguments(Boolean.TRUE, "1212")
        );
    }

    @ParameterizedTest
    @MethodSource
    void testParamString(String input) {
        TestService testService = new TestService();
        assertTrue(testService.are2CharsAtHeadAndTailEqual(input));

    }

    @ParameterizedTest
    @MethodSource("stringIntAndListProvider")
    void testWithMultiArgMethodSource(Boolean boo, String str) {
        assertEquals(boo, testService.are2CharsAtHeadAndTailEqual(str));
    }

}