package com.designpatterns.Singleton;

import lombok.Getter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Singleton is a creational design pattern that lets you ensure that a class has
 * only one instance, while providing a global access point to this instance.
 *
 * The most common reason for controlling the number of instances a class can have
 * is control access to some shared resources. E.g. Database or a file.
 *
 * The Database class defines the getInstance() method which is the only way to get
 * an instance of this class.
 *
 * Use Singleton pattern when a class in your program should have a single instance
 * available to all clients; E.g. a single database object that is shared by different
 * parts of the program.
 *
 * Use Singleton patter when you want stricter control over global variables.
 * */
@Getter
public class DatabaseConnection {
    private static DatabaseConnection instance;
    private final Connection connection;

    // the singleton constructor should always be private to prevent direct construction
    // calls with the `new` keyword.
    private DatabaseConnection() throws SQLException {
        // some initialization code such as actual connection to the DB server.
        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String user = "root";
        String password = "password";
        connection = DriverManager.getConnection(url, user, password);
    }
    public static DatabaseConnection getInstance() throws SQLException {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }
}
