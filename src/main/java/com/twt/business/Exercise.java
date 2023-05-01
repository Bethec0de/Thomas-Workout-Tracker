package com.twt.business;

import java.util.UUID;

public class Exercise {
    private UUID id;
    private String name;
    private BodyPart bodyPart;

    public Exercise(UUID id, String name, BodyPart bodyPart) {
        this.id = id;
        this.name = name;
        this.bodyPart = bodyPart;
    }


    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public BodyPart getBodyPart() {
        return bodyPart;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBodyPart(BodyPart bodyPart) {
        this.bodyPart = bodyPart;
    }




}
