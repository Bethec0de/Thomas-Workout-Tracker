package com.twt.business;

public class BodyPartsTest {

        public static void main(String[] args) {
            BodyPartService bodyParts = new BodyPartService();
            System.out.println("Workout Parts:");
            for (BodyPart current : bodyParts.workoutParts) {
                System.out.println(current.getName());
            }
            System.out.println("Measurement Parts:");
            for (BodyPart current : bodyParts.measurementparts) {
                System.out.println(current.getName());
            }
        }
}
