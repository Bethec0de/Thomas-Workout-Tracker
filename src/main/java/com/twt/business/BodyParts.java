package com.twt.business;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Created by TWT on 2/23/2017.
 */
public class BodyParts {

    public static ArrayList<String> parts = new ArrayList<>();
    public static final String url = "jdbc:postgresql://localhost:5432/twt";
    public static final String user = "postgres";
    public static final String password = "bak!VQM2utj2cdg7ckv";
    
    public BodyParts(){

    try (Connection con = DriverManager.getConnection(url, user, password);
    Statement st = con.createStatement();
    ResultSet rs = st.executeQuery("SELECT * FROM twt_objects.bodypart")) {

        while (rs.next()) {
            parts.add(rs.getString("name"));
        }

    } catch (SQLException ex) {
        System.err.println(ex.getMessage());
    }
}

}
