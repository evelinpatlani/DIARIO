package com.example.diario.dao.crud;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CartaDAO {

    // Crear
    public void crear(String titulo, String contenido, int idUsuario) throws SQLException {

        String sql = "INSERT INTO carta (titulo, contenido, id_usuario) " +
                "VALUES ('" + titulo + "', '" + contenido + "', " + idUsuario + ")";

        try (Connection connection = ConexionBD.getConnection();
             Statement statement = connection.createStatement()) {

            statement.executeUpdate(sql);
        }
    }


    // Leer todas las cartas
    public void leerCartas() throws SQLException {

        String sql = "SELECT * FROM carta";

        try (Connection connection = ConexionBD.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {

            while (resultSet.next()) {

                System.out.println(
                        "ID: " + resultSet.getInt("id_carta") +
                                " | Título: " + resultSet.getString("titulo") +
                                " | Contenido: " + resultSet.getString("contenido") +
                                " | Fecha: " + resultSet.getString("fecha_creacion") +
                                " | Usuario: " + resultSet.getInt("id_usuario")
                );
            }
        }
    }


    // Leer una carta
    public void leerCarta(int idCarta) throws SQLException {

        String sql = "SELECT * FROM carta WHERE id_carta = " + idCarta;

        try (Connection connection = ConexionBD.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {

            if (resultSet.next()) {

                System.out.println(
                        "ID: " + resultSet.getInt("id_carta") +
                                " | Título: " + resultSet.getString("titulo") +
                                " | Contenido: " + resultSet.getString("contenido") +
                                " | Fecha: " + resultSet.getString("fecha_creacion") +
                                " | Usuario: " + resultSet.getInt("id_usuario")
                );

            } else {

                System.out.println("No existe una carta con ese ID.");

            }
        }
    }


    // Actualizar
    public void actualizar(int idCarta, String titulo, String contenido) throws SQLException {

        String sql = "UPDATE carta " +
                "SET titulo = '" + titulo + "', " +
                "contenido = '" + contenido + "' " +
                "WHERE id_carta = " + idCarta;

        try (Connection connection = ConexionBD.getConnection();
             Statement statement = connection.createStatement()) {

            statement.executeUpdate(sql);
        }
    }


    // Borrar
    public void borrar(int idCarta) throws SQLException {

        String sql = "DELETE FROM carta WHERE id_carta = " + idCarta;

        try (Connection connection = ConexionBD.getConnection();
             Statement statement = connection.createStatement()) {

            statement.executeUpdate(sql);
        }
    }
}