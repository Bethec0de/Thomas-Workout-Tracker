package com.twt.business;

import java.util.ArrayList;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class WorkoutTest {

    private BodyPartService bodyPartService = new BodyPartService();
    private Exercise exercise = new Exercise(UUID.randomUUID(), "Bench Press", bodyPartService.workoutParts.get(0));
    private ExerciseSet exerciseSet = new ExerciseSet(exercise, 6, "First Set",60);
    private ArrayList<ExerciseSet> exerciseSets = new ArrayList<ExerciseSet>();

    private void setUp(){
        exerciseSets.add(
                new ExerciseSet(UUID.randomUUID(),
                        new Exercise(UUID.randomUUID(), "Incline Bench Press",bodyPartService.workoutParts.get(0)),
                    8, "First Set", 40));
    }



    @org.junit.jupiter.api.Test
    void addExerciseSet() {
        setUp();
        Workout workout = new Workout(UUID.randomUUID(), new java.sql.Date(System.currentTimeMillis()), exerciseSets, "Test Workout");
        workout.addExerciseSet(exerciseSet);
        for (ExerciseSet set : workout.getExerciseSets()){
            Exercise exercise = set.getExercise();
            System.out.println(exercise.getName() + " " + exercise.getBodyPart().getName() + " " + set.getReps() + " " + set.getWeight());
        }
        System.out.println("Note: " + workout.getNote());
        System.out.println("Date: " + workout.getDatetime());
        assertEquals(2, workout.getExerciseSets().size());
    }

}