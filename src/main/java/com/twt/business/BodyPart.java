package com.twt.business;

import java.util.UUID;

public class BodyPart {
    private String name;
    private UUID id;

    private boolean forMeasurement;


    public boolean isForMeasurement() {
        return forMeasurement;
    }

    public void setForMeasurement(boolean forMeasurement) {
        this.forMeasurement = forMeasurement;
    }

    public BodyPart(String name, UUID id) {
        this.name = name;
        this.id = id;
    }

    public BodyPart(String name, UUID id, boolean forMeasurement) {
        this.name = name;
        this.id = id;
        this.forMeasurement = forMeasurement;
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
