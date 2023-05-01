package com.twt.business;

import java.util.UUID;

public class BodyPart {
    private String name;
    private UUID id;

    public BodyPart(String name, UUID id) {
        this.name = name;
        this.id = id;
    }

    public BodyPart(String name) {
        this.name = name;
        this.id = UUID.randomUUID();
    }

    public String getName() {
        return name;
    }

    public UUID getId() {
        return id;
    }

}
