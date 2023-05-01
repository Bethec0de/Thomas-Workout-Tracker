package com.twt.business;

import java.util.ArrayList;

public class WorkoutTemplate {

    private String name;
    private ArrayList<BodyPartService> bodyParts;
    private String[] exercises;

        public WorkoutTemplate(String name, ArrayList<BodyPartService> bodyParts, String[] exercises) {
        this.name = name;
        this.bodyParts = bodyParts;
        this.exercises = exercises;
    }

    public String getName() {
        return name;
    }

    public ArrayList<BodyPartService> getBodyParts() {
        return bodyParts;
    }

    public String[] getExercises() {
        return exercises;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(ArrayList<BodyPartService> bodyParts ) {
        this.bodyParts = bodyParts;
    }

    public void setExercises(String[] exercises) {
        this.exercises = exercises;
    }

}
