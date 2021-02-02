package com.example.karp;

import com.example.karp.domen.User;
import com.example.karp.services.TestService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

public class TestServiceTest {

    @BeforeAll
    public static void setUpClass() {
        System.out.println("in setUp class");
    }

    private TestService testService = new TestService();
/*
    @Test
    void testChopOff2SpacesAtHead() {
        assertEquals("**", testService.chopOff2SpacesAtHead("  **"));
    }

    @Test
    void testBoolean() {
        assertFalse(testService.are2CharsAtHeadAndTailEqual("1234"));
    }

    @Test
    void testEqualsArrays() {
        int[] arr = {4, 12, -17, 3};
        int[] expected = {-17, 3, 4, 12};
        testService.bubbleSort(arr);
        assertArrayEquals(expected, arr);
    }*/



    User user = new User("Lolya", 27);

    @BeforeEach
    public void setUp() {
        System.out.println("in setUp");
        //user.setAge(32);
    }

    @AfterEach
    public void tearDown() {
        System.out.println("in tearDown");
        user.setAge(40);
        System.out.println(user.getAge());
    }

    @Test
    public void test1() {
        System.out.println(user.getAge());
    }

    @Test
    public void test2() {
        System.out.println(user.getAge());
    }

}
