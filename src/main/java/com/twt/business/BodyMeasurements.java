package com.twt.business;

import java.util.UUID;

public class BodyMeasurements {
    private int weight;
    private int bodyFatPercentage;
    private int bodyFatMass;

    private UUID id;




    public BodyMeasurements(int weight, int bodyFatPercentage, int bodyFatMass, int leanBodyMass, double waistCircumference, double neckCircumference, double hipCircumference, double forearmCircumference, double thighCircumference, double bicepCircumference, double calfCircumference, double chestCircumference) {
        this.weight = weight;
        this.bodyFatPercentage = bodyFatPercentage;
        this.bodyFatMass = bodyFatMass;
        this.leanBodyMass = leanBodyMass;
        this.waistCircumference = waistCircumference;
        this.neckCircumference = neckCircumference;
        this.hipCircumference = hipCircumference;
        this.forearmCircumference = forearmCircumference;
        this.thighCircumference = thighCircumference;
        this.bicepCircumference = bicepCircumference;
        this.calfCircumference = calfCircumference;
        this.chestCircumference = chestCircumference;
    }


    public BodyMeasurements(){
        this.setId(UUID.randomUUID());
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

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getBodyFatPercentage() {
        return bodyFatPercentage;
    }

    public void setBodyFatPercentage(int bodyFatPercentage) {
        this.bodyFatPercentage = bodyFatPercentage;
    }

    public int getBodyFatMass() {
        return bodyFatMass;
    }

    public void setBodyFatMass(int bodyFatMass) {
        this.bodyFatMass = bodyFatMass;
    }

    public int getLeanBodyMass() {
        return leanBodyMass;
    }

    public void setLeanBodyMass(int leanBodyMass) {
        this.leanBodyMass = leanBodyMass;
    }

    public double getWaistCircumference() {
        return waistCircumference;
    }

    public void setWaistCircumference(double waistCircumference) {
        this.waistCircumference = waistCircumference;
    }

    public double getNeckCircumference() {
        return neckCircumference;
    }

    public void setNeckCircumference(double neckCircumference) {
        this.neckCircumference = neckCircumference;
    }

    public double getHipCircumference() {
        return hipCircumference;
    }

    public void setHipCircumference(double hipCircumference) {
        this.hipCircumference = hipCircumference;
    }

    public double getForearmCircumference() {
        return forearmCircumference;
    }

    public void setForearmCircumference(double forearmCircumference) {
        this.forearmCircumference = forearmCircumference;
    }

    public double getThighCircumference() {
        return thighCircumference;
    }

    public void setThighCircumference(double thighCircumference) {
        this.thighCircumference = thighCircumference;
    }

    public double getBicepCircumference() {
        return bicepCircumference;
    }

    public void setBicepCircumference(double bicepCircumference) {
        this.bicepCircumference = bicepCircumference;
    }

    public double getCalfCircumference() {
        return calfCircumference;
    }

    public void setCalfCircumference(double calfCircumference) {
        this.calfCircumference = calfCircumference;
    }

    public double getChestCircumference() {
        return chestCircumference;
    }

    public void setChestCircumference(double chestCircumference) {
        this.chestCircumference = chestCircumference;
    }

    private int leanBodyMass;
    private double waistCircumference;
    private double neckCircumference;
    private double hipCircumference;
    private double forearmCircumference;
    private double thighCircumference;
    private double bicepCircumference;
    private double calfCircumference;
    private double chestCircumference;



}
