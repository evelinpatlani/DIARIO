package com.example.diario.dao.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
    private static final String URL =   "jdbc:sqlite:src/main/java/com/example/diario/database/db/schema.db";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL);
    }

}
