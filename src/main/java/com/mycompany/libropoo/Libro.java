package com.mycompany.libropoo;

public class Libro {

    private String titulo;
    private String autor;
    private String genero;
    private int anio;
    private boolean leido;

    public Libro(String titulo, String autor, int anio, String genero) {

        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.anio = anio;
        this.leido = false;

    }

    public String mostrarInformacion() {
        String mostrar = titulo + " " +anio + " " +genero;
        return mostrar;
    }

    public void marcarLeido() {
        leido = true;

    }
    
    public boolean esLeido(){
        return this.leido;
    }

    public boolean esAntiguo() {
        int diferencia = 2024 - anio;

        if (diferencia > 50) {
            return true;
        } else {
            return false;
        }
    }

}
