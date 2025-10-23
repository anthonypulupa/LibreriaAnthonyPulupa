/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espoch.libreriaanthonypulupa;

import ec.edu.espoch.libreriaanthonypulupa.bibliografiaAutor.Biblioteca;
import ec.edu.espoch.libreriaanthonypulupa.bibliografiaAutor.Libros;

/**
 *
 * @author anthony
 */
public class LibreriaAnthonyPulupa {
    public static void main(String[] args) {
       
        Biblioteca biblioteca = new Biblioteca();

        biblioteca.agregarLibro(new Libros("Cien años de soledad", biblioteca.getAutor(0), "Realismo mágico", 25.5));
        biblioteca.agregarLibro(new Libros("La casa de los espíritus", biblioteca.getAutor(1), "Drama", 20.0));
        biblioteca.agregarLibro(new Libros("Ficciones", biblioteca.getAutor(2), "Fantasía", 18.75));
        biblioteca.agregarLibro(new Libros("La ciudad y los perros", biblioteca.getAutor(3), "Novela", 22.0));
        biblioteca.agregarLibro(new Libros("Rayuela", biblioteca.getAutor(4), "Experimental", 24.0));
        biblioteca.mostrarLibros();
    }
}
