package com.example.karp;


import com.example.karp.services.LinkedOrArrayList;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.*;
import java.util.concurrent.TimeUnit;

public class LinkedOrArrayListProcessTest {

    static List<String> arrayList;
    static List<String> linkedList;

    @BeforeAll
    public static void setUp() {
        arrayList = new ArrayList<>();
        for(int i = 0; i < 1_000_000; i++) {
            arrayList.add("" + i);
        }
        linkedList = new LinkedList<>(arrayList);
    }

    @Test
    @Timeout(value = 5, unit = TimeUnit.MILLISECONDS)
    void removal_AL() {
        LinkedOrArrayList.remove(arrayList, "123");
    }


    @Test
    @Timeout(value = 1, unit = TimeUnit.MILLISECONDS)
    void removal_LL() {
        LinkedOrArrayList.remove(linkedList, "123");
    }

}
