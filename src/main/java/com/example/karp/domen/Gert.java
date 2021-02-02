package com.example.karp.domen;

import com.google.common.base.Objects;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.function.*;

/**
 * @author karpukhin
 * @version $
 */
public class Gert {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gert gert = (Gert) o;
        return Objects.equal(name, gert.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }


/*    public String processFile() throws IOException {
        try(BufferedReader br = new BufferedReader(new FileReader("ds"))) {
            br.lines();
        }
*//*        catch (IOException exception) {
            System.out.println(1);
        }*//*

        return "ds"
    }*/
}
