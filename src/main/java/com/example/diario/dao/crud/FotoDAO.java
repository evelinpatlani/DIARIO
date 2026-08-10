package com.example.diario.dao.crud;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class FotoDAO {

    // Crear
    public void crearFoto(String url, int idCarta) throws SQLException {

        final String sql = "INSERT INTO foto (url, id_carta) " + "VALUES ('" + url + "', " + idCarta + ")";

        try (Connection connection = ConexionBD.getConnection();
             Statement statement = connection.createStatement()) {

            statement.executeUpdate(sql);
        }
    }


    // Actualizar
    public void actualizarFoto(int idFoto, String url) throws SQLException {

        final String sql = "UPDATE foto " + "SET url = '" + url + "' " + "WHERE id_foto = " + idFoto;

        try (Connection connection = ConexionBD.getConnection();
             Statement statement = connection.createStatement()) {

            statement.executeUpdate(sql);
        }
    }


    // Borrar
    public void borrarFoto(int idFoto) throws SQLException {

        final String sql = "DELETE FROM foto " + "WHERE id_foto = " + idFoto;

        try (Connection connection = ConexionBD.getConnection();
             Statement statement = connection.createStatement()) {

            statement.executeUpdate(sql);
        }
    }
}
/*
CREATE TABLE foto (
    id_foto INTEGER PRIMARY KEY,
    fecha TEXT NOT NULL,
    url TEXT NOT NULL,
    id_carta INTEGER NOT NULL,

    FOREIGN KEY (id_carta)
        REFERENCES carta(id_carta)
        ON DELETE CASCADE
);

 */
