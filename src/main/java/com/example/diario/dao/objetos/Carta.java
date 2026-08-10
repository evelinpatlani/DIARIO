package com.example.diario.dao.objetos;

public class Carta {
    private String id_carta;
    private String titulo;
    private String contenido;
    private String fecha;

    public Carta (){}

    public Carta(String id_carta, String titulo, String contenido, String fecha) {
        this.id_carta = id_carta;
        this.titulo = titulo;
        this.contenido = contenido;
        this.fecha = fecha;
    }

    public String getId_carta() {
        return id_carta;
    }

    public void setId_carta(String id_carta) {
        this.id_carta = id_carta;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
