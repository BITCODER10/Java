package com.logicalnil;

import java.sql.*;

public class EstablishConnection {
    Connection connection;
    PreparedStatement prstmnt;

    void getConnection() throws SQLException {
        String dbPath = "jdbc:mysql://localhost:3306/***********";
        String username = "****";
        String password = "***********";
         this.connection = DriverManager.getConnection(dbPath, username, password);
    }
    void prepare() throws SQLException {
        this.prstmnt = connection.prepareStatement("INSERT INTO Employee (id, name, email, fullTime) VALUES (?, ?, ?, ?)");

    }

    void insert(int id, String name, String email, boolean fullTime) throws SQLException {

        prstmnt.setInt(1, id);
        prstmnt.setString(2, name);
        prstmnt.setString(3, email);
        prstmnt.setBoolean(4, fullTime);
        prstmnt.execute();

    }
}
