package com.example.karp.services;

import org.springframework.stereotype.Component;

public class TestService {
    // "  **" ---> "**", " **" ---> "**", "****" ---> "****", "**  " ---> "**  "
    public String chopOff2SpacesAtHead(String str) {
        if (str.length() <= 2)
            return str.replaceAll(" ", "");

        String head = str.substring(0, 2);
        Integer dsd = 12;

        return head.replaceAll(" ", "");
    }

    public void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    // "1234" --> false, "1212" ---> true, "12" --> true, "1" --> false
    public boolean are2CharsAtHeadAndTailEqual(String str) {
        if (str.length() <= 1)
            return false;
        if (str.length() == 2)
            return true;

        String head = str.substring(0, 2);
        String tail = str.substring(str.length() - 2);

        return head.equals(tail);
    }

}