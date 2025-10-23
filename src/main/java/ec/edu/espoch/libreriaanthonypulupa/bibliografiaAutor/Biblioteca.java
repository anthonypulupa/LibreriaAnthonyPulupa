/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.libreriaanthonypulupa.bibliografiaAutor;

import java.util.ArrayList;

/**
 *
 * @author anthony
 */
public class Biblioteca {

    private Autores[] autores; 
    private ArrayList<Libros> libros; 

    public Biblioteca() {
       
        autores = new Autores[5];
        autores[0] = new Autores("Gabriel García Márquez", "Colombiana");
        autores[1] = new Autores("Isabel Allende", "Chilena");
        autores[2] = new Autores("Jorge Luis Borges", "Argentina");
        autores[3] = new Autores("Mario Vargas Llosa", "Peruana");
        autores[4] = new Autores("Julio Cortázar", "Argentina");

        
        libros = new ArrayList<>();
    }

    public void agregarLibro(Libros libro) {
        libros.add(libro);
    }

    public void mostrarLibros() {
        if (libros.isEmpty()) {
            System.out.println("No hay libros registrados en la biblioteca.");
        } else {
            System.out.println("\n=== CATÁLOGO DE LIBROS ===");
            for (Libros libro : libros) {
                libro.mostrarLibro();
            }
        }
    }

    public Autores getAutor(int indice) {
        if (indice >= 0 && indice < autores.length) {
            return autores[indice];
        }
        return null;
    }
}
