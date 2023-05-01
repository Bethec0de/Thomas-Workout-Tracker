package com.twt.business;

import java.util.ArrayList;
import java.util.UUID;

public class BodyMeasurements {
    private int weight;

    private int bodyFatPercentage;

    private UUID id;

    private ArrayList<BodyPart> currentBodyParts;
    private ArrayList<BodyPart> goalBodyParts;





    public BodyMeasurements(int weight, int bodyFatPercentage, int bodyFatMass, int leanBodyMass, int goalWeight, int goalBodyFatPercentage) {
        this.weight = weight;
        this.bodyFatPercentage = bodyFatPercentage;
        this.currentBodyParts = new ArrayList<BodyPart>();
        this.goalBodyParts = new ArrayList<BodyPart>();
    }

    public BodyMeasurements(){
        this.setId(UUID.randomUUID());
        this.currentBodyParts = new ArrayList<BodyPart>();
        this.goalBodyParts = new ArrayList<BodyPart>();
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }


    public int getWeight() {
        return weight;
    }

    public void setWeight(int currentWeight) {
        this.weight = currentWeight;
    }

    public int getBodyFatPercentage() {
        return bodyFatPercentage;
    }

    public void setBodyFatPercentage(int bodyFatPercentage) {
        this.bodyFatPercentage = bodyFatPercentage;
    }


    public ArrayList<BodyPart> getCurrentBodyParts() {
        return currentBodyParts;
    }

    public void setCurrentBodyParts(ArrayList<BodyPart> currentBodyParts) {
        this.currentBodyParts = currentBodyParts;
    }

    public ArrayList<BodyPart> getGoalBodyParts() {
        return goalBodyParts;
    }

    public void setGoalBodyParts(ArrayList<BodyPart> goalBodyParts) {
        this.goalBodyParts = goalBodyParts;
    }

}
