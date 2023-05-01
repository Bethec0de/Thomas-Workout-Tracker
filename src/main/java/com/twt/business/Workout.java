package com.twt.business;

import java.util.ArrayList;
import java.util.UUID;
public class Workout {

    private UUID id;
    private java.sql.Date datetime;
    private ArrayList<ExerciseSet> exerciseSets;
    private String note;

    public Workout(UUID id, java.sql.Date datetime, ArrayList<ExerciseSet> exerciseSets, String note) {
        this.id = id;
        this.datetime = datetime;
        this.exerciseSets = exerciseSets;
        this.note = note;
    }

    public void addExerciseSet(ExerciseSet exerciseSet){
        exerciseSets.add(exerciseSet);
    }

    public void addExerciseToSet(ExerciseSet set, Exercise exercise){
        set.addExercise(exercise);
    }

    public UUID getId() {
        return id;
    }

    public java.sql.Date getDatetime() {
        return datetime;
    }

    public ArrayList<ExerciseSet> getExerciseSets() {
        return exerciseSets;
    }

    public String getNote() {
        return note;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setDatetime(java.sql.Date datetime) {
        this.datetime = datetime;
    }

    public void setExerciseSets(ArrayList<ExerciseSet> exerciseSets) {
        this.exerciseSets = exerciseSets;
    }

    public void setNote(String note) {
        this.note = note;
    }

}
