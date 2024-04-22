package com.mycompany.libropoo;

import java.util.Scanner;

public class Principal {
    
    /**
     * Método inicial que es ejecutado
     * @param args
     *
     * Complejidad temporal: O(1) Tiempo constante
     */

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.println("indique el titulo");
        String tituloUsuario = lector.nextLine();

        System.out.println("indique el autor");
        String autorUsuario = lector.nextLine();

        System.out.println("indique el genero del autor");
        String generoUsuario = lector.nextLine();

        System.out.println("indique el año de publicación");
        int anioUsuario = lector.nextInt();

        
        Libro usuarioLibro = new Libro(tituloUsuario, autorUsuario, anioUsuario, generoUsuario);
        
        System.out.println(usuarioLibro.mostrarInformacion());
        
        usuarioLibro.marcarLeido();
        
        if(usuarioLibro.esLeido()){
            System.out.println("Ya fue leídoi");
            
        }else{
            System.out.println("No fue leído");
        }
        
        if(usuarioLibro.esAntiguo()){
            System.out.println("El libro es antiguo");
        }else{
            System.out.println("El libro no es antiguo");
        }
    }

    

}
