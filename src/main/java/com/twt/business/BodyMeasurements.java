package com.twt.business;

import java.util.ArrayList;
import java.util.UUID;

public class BodyMeasurements {
    private int currentWeight;
    private int goalWeight;

    private int currentBodyFatPercentage;
    private int goalBodyFatPercentage;

    private UUID id;

    private ArrayList<BodyPart> currentBodyParts;
    private ArrayList<BodyPart> goalBodyParts;





    public BodyMeasurements(int weight, int bodyFatPercentage, int bodyFatMass, int leanBodyMass, int goalWeight, int goalBodyFatPercentage) {
        this.currentWeight = weight;
        this.currentBodyFatPercentage = bodyFatPercentage;
        this.goalWeight = goalWeight;
        this.goalBodyFatPercentage = goalBodyFatPercentage;
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


    public int getCurrentWeight() {
        return currentWeight;
    }

    public void setCurrentWeight(int currentWeight) {
        this.currentWeight = currentWeight;
    }

    public int getCurrentBodyFatPercentage() {
        return currentBodyFatPercentage;
    }

    public void setCurrentBodyFatPercentage(int currentBodyFatPercentage) {
        this.currentBodyFatPercentage = currentBodyFatPercentage;
    }

    public int getGoalWeight() {
        return goalWeight;
    }

    public void setGoalWeight(int goalWeight) {
        this.goalWeight = goalWeight;
    }

    public int getGoalBodyFatPercentage() {
        return goalBodyFatPercentage;
    }

    public void setGoalBodyFatPercentage(int goalBodyFatPercentage) {
        this.goalBodyFatPercentage = goalBodyFatPercentage;
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
