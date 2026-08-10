package com.example.diario.dao.objetos;

public class Usuario {
    private String  id_usuario;
    private String nombre;
    private String password_hash;
    private String foto_perfil;

    private Usuario (){}

    public Usuario(String id_usuario, String nombre, String password_hash, String foto_perfil) {
        this.id_usuario = id_usuario;
        this.nombre = nombre;
        this.password_hash = password_hash;
        this.foto_perfil = foto_perfil;
    }

    public String getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(String id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword_hash() {
        return password_hash;
    }

    public void setPassword_hash(String password_hash) {
        this.password_hash = password_hash;
    }

    public String getFoto_perfil() {
        return foto_perfil;
    }

    public void setFoto_perfil(String foto_perfil) {
        this.foto_perfil = foto_perfil;
    }
}
