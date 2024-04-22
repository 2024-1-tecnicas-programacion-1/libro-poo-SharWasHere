package com.mycompany.libropoo;

public class Libro {

    private String titulo;
    private String autor;
    private String genero;
    private int anio;
    private boolean leido;

    public Libro(String titulo, String autor, int anio, String genero) {
        
     /**
     * Complejidad temporal: O(1) Tiempo constante
     */

        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.anio = anio;
        this.leido = false;

    }

     /**
     * Complejidad temporal: O(1) Tiempo constante
     */
    public String mostrarInformacion() {
        String mostrar = titulo + " " +anio + " " +genero;
        return mostrar;
    }

     /**
     * Complejidad temporal: O(1) Tiempo constante
     */
    public void marcarLeido() {
        leido = true;

    }
     /**
     * Complejidad temporal: O(1) Tiempo constante
     */
    
    public boolean esLeido(){
        return this.leido;
    }

     /**
     * Complejidad temporal: O(1) Tiempo constante
     */
    public boolean esAntiguo() {
        int diferencia = 2024 - anio;

        if (diferencia > 50) {
            return true;
        } else {
            return false;
        }
    }

}
