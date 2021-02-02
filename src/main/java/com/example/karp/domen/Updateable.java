package com.example.karp.domen;

/**
 * @author karpukhin
 * @version 1.0$
 */
public interface Updateable extends MutableItem {


    void dfa();

    @Override
    default Integer someMet1() {
        return null;
    }
}
