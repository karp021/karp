package com.example.karp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.*;

@SpringBootApplication
@RestController
public class KarpApplication { public static void main(String[] args) {
    SpringApplication.run(KarpApplication.class, args);
    List<Integer> list = Arrays.asList(6, 5, 2, 1, 4, 5);
    int min;

}

    @RequestMapping("/")
    public String home() {
        return "Me test App";
    }

}