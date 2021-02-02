package com.example.karp.domen;

/**
 * @author karpukhin
 * @version 1.0$
 */
public interface MutableItem {

    static Integer someMet() {
        return 31;
    }

    default Integer someMet1() {
        return 31;
    }
}
