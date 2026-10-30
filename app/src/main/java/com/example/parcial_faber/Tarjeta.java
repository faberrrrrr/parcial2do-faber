package com.example.parcial_faber;

public class Tarjeta {
    private final String titulo, descripcion;
    private final int imagenPortada, imagenCircular;

    public Tarjeta(String titulo, String descripcion, int imagenPortada, int imagenCircular) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.imagenPortada = imagenPortada;
        this.imagenCircular = imagenCircular;
    }

    public String getTitulo() { return titulo; }
    public String getDescripcion() { return descripcion; }
    public int getImagenPortada() { return imagenPortada; }
    public int getImagenCircular() { return imagenCircular; }
}