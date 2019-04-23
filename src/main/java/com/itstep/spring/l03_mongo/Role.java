package com.itstep.spring.l03_mongo;

import org.springframework.data.annotation.Id;

public class Role {
    public Role() {
    }

    public Role(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Id
    private String id;

    private String name;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getName();
    }
}
