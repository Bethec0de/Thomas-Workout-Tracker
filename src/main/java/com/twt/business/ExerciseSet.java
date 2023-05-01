package com.twt.business;

import java.util.UUID;

public class ExerciseSet {

    private UUID id;
    private Exercise exercise;
    private int reps;
    private String note;
    private int weight;

    public ExerciseSet(UUID id, Exercise exercise, int reps, String note, int weight) {
        this.id = id;
        this.exercise = exercise;
        this.reps = reps;
        this.note = note;
        this.weight = weight;
    }

    public ExerciseSet(Exercise exercise, int reps, String note, int weight) {
        this.id = UUID.randomUUID();
        this.exercise = exercise;
        this.reps = reps;
        this.note = note;
        this.weight = weight;
    }

    public void addExercise(Exercise exercise){
        this.exercise = exercise;
    }

    public UUID getId() {
        return id;
    }

    public Exercise getExercise() {
        return exercise;
    }

    public int getReps() {
        return reps;
    }

    public String getNote() {
        return note;
    }

    public int getWeight() {
        return weight;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setExercise(Exercise exercise) {
        this.exercise = exercise;
    }

    public void setReps(int reps) {
        this.reps = reps;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
