/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.libreriaanthonypulupa.bibliografiaAutor;

/**
 *
 * @author anthony
 */
public class Libros {

    private String titulo;
    private Autores autor;
    private String genero;
    private double precio;

    public Libros(String titulo, Autores autor, String genero, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.precio = precio;
    }

    public void mostrarLibro() {
        System.out.println("--------------------------------------");
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor.getNombre());
        System.out.println("Género: " + genero);
        System.out.println("Precio: $" + precio);
    }
}
