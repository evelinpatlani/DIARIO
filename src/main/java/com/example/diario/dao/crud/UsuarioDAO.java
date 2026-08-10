package com.example.diario.dao.crud;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UsuarioDAO {

    // Crear usuario
    public void crearUsuario(String nombre, String passwordHash, String fotoPerfil)
            throws SQLException {

        final String sql =
                "INSERT INTO usuario (nombre, password_hash, foto_perfil) " +
                        "VALUES ('" + nombre + "', '" + passwordHash + "', '" + fotoPerfil + "')";

        try (Connection connection = ConexionBD.getConnection();
             Statement statement = connection.createStatement()) {

            statement.executeUpdate(sql);
        }
    }


    // Leer todos los usuarios
    public void leerUsuarios() throws SQLException {

        final String sql = "SELECT * FROM usuario";

        try (Connection connection = ConexionBD.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {

            while (resultSet.next()) {

                System.out.println(
                        "ID: " + resultSet.getInt("id_usuario") +
                                " | Nombre: " + resultSet.getString("nombre") +
                                " | Password Hash: " + resultSet.getString("password_hash") +
                                " | Foto: " + resultSet.getString("foto_perfil")
                );
            }
        }
    }


    // Leer un usuario
    public void leerUsuario(int idUsuario) throws SQLException {

        final String sql =
                "SELECT * FROM usuario " +
                        "WHERE id_usuario = " + idUsuario;

        try (Connection connection = ConexionBD.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {

            if (resultSet.next()) {

                System.out.println(
                        "ID: " + resultSet.getInt("id_usuario") +
                                " | Nombre: " + resultSet.getString("nombre") +
                                " | Password Hash: " + resultSet.getString("password_hash") +
                                " | Foto: " + resultSet.getString("foto_perfil")
                );

            } else {

                System.out.println("No existe un usuario con ese ID.");
            }
        }
    }


    // Actualizar usuario
    public void actualizarUsuario(
            int idUsuario,
            String nombre,
            String passwordHash,
            String fotoPerfil
    ) throws SQLException {

        final String sql =
                "UPDATE usuario " +
                        "SET nombre = '" + nombre + "', " +
                        "password_hash = '" + passwordHash + "', " +
                        "foto_perfil = '" + fotoPerfil + "' " +
                        "WHERE id_usuario = " + idUsuario;

        try (Connection connection = ConexionBD.getConnection();
             Statement statement = connection.createStatement()) {

            statement.executeUpdate(sql);
        }
    }


    // Borrar usuario
    public void borrarUsuario(int idUsuario) throws SQLException {

        final String sql =
                "DELETE FROM usuario " +
                        "WHERE id_usuario = " + idUsuario;

        try (Connection connection = ConexionBD.getConnection();
             Statement statement = connection.createStatement()) {

            statement.executeUpdate(sql);
        }
    }
}