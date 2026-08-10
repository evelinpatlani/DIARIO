package com.example.diario.dao.objetos;

public class Foto {
    private String id_foto;
    private String fecha;
    private String url;

    public Foto (){}

    public Foto (String id_foto, String fecha, String url){
        this.id_foto = id_foto;
        this.fecha = fecha;
        this.url = url;
    }

    public String getId_foto() {
        return id_foto;
    }

    public void setId_foto(String id_foto) {
        this.id_foto = id_foto;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
