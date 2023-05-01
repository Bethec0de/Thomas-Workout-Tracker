package com.twt.business;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.UUID;

/**
 * Created by TWT on 2/23/2017.
 */
public class BodyPartService {


    //FIXME: This class should be a singleton



    public ArrayList<BodyPart> workoutParts = new ArrayList<>();
    public ArrayList<BodyPart> measurementparts = new ArrayList<>();

    public static final String url = "jdbc:postgresql://localhost:5432/twt";
    public static final String user = "postgres";
    public static final String password = "bak!VQM2utj2cdg7ckv";
    
    public BodyPartService(){
        getWorkoutBodyParts();
        getMeasurementBodyParts();
    }


    public void getWorkoutBodyParts(){
        try (
            Connection con = DriverManager.getConnection(url, user, password);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM twt_objects.bodypart WHERE ForMeasurement = false")) {

            while (rs.next()) {
                workoutParts.add(new BodyPart(rs.getString("name"), rs.getObject("id", UUID.class)));
            }

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        };
    }

    public void getMeasurementBodyParts(){
        try (
            Connection con = DriverManager.getConnection(url, user, password);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM twt_objects.bodypart WHERE ForMeasurement = true")) {

            while (rs.next()) {
                measurementparts.add(new BodyPart(rs.getString("name"), rs.getObject("id", UUID.class)));
            }

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        };
    }

}

