package com.twt.business;

public class BodyPartsTest {

        public static void main(String[] args) {
            BodyPartService bodyParts = new BodyPartService();
            for (BodyPart current : bodyParts.parts) {
                System.out.println(current.getName());

            }
        }
}
