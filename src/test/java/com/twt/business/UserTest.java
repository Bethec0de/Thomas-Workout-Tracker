package com.twt.business;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    private User testPerson1 = new User();
    @BeforeEach
    void setUp() {
        testPerson1.setName("Ginny");
        testPerson1.setAge(44);
        testPerson1.setHeight(165);
        testPerson1.setSex(Gender.FEMALE);
        testPerson1.getCurrentBodyMeasurements().setWeight(73);
        testPerson1.getGoalBodyMeasurements().setWeight(60);
    }

    @org.junit.jupiter.api.Test
    public void testUserCreation() {
        System.out.println("user: " + testPerson1.getName());
        assertEquals(testPerson1.getAge(), 44);
        assertEquals(testPerson1.getCurrentBodyMeasurements().getWeight(), 73);
        assertEquals(testPerson1.getGoalBodyMeasurements().getWeight(), 60);
    }

}