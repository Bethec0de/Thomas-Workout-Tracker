package com.twt.business;

import java.util.UUID;

public class User {
    private UUID id;
    private String name;
    private int height;
    private int age;
    private Gender sex;

    public UUID getId() {
        return id;
    }

    public User(UUID id, String name, int height, int age, Gender sex, BodyMeasurements currentBodyMeasurements, BodyMeasurements goalBodyMeasurements) {
        this.id = id;
        this.name = name;
        this.height = height;
        this.age = age;
        this.sex = sex;
        this.currentBodyMeasurements = currentBodyMeasurements;
        this.goalBodyMeasurements = goalBodyMeasurements;
    }

    public User() {
        this.id = UUID.randomUUID();
        this.currentBodyMeasurements = new BodyMeasurements();
        this.goalBodyMeasurements = new BodyMeasurements();
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getSex() {
        return sex;
    }

    public void setSex(Gender sex) {
        this.sex = sex;
    }

    public BodyMeasurements getCurrentBodyMeasurements() {
        return currentBodyMeasurements;
    }

    public void setCurrentBodyMeasurements(BodyMeasurements currentBodyMeasurements) {
        this.currentBodyMeasurements = currentBodyMeasurements;
    }

    public BodyMeasurements getGoalBodyMeasurements() {
        return goalBodyMeasurements;
    }

    public void setGoalBodyMeasurements(BodyMeasurements goalBodyMeasurements) {
        this.goalBodyMeasurements = goalBodyMeasurements;
    }

    private BodyMeasurements currentBodyMeasurements;
    private BodyMeasurements goalBodyMeasurements;


}
