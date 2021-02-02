package com.example.karp.domen;

import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.UUID;

@MappedSuperclass

public class Integer1 {

    @Id
    @GeneratedValue
    protected UUID id;

    public UUID getId() {
        return id;
    }
}
