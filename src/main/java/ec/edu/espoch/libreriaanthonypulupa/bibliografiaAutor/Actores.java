/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.libreriaanthonypulupa.bibliografiaAutor;

/**
 *
 * @author anthony
 */
    import java.util.ArrayList;

class Autores {
    private String nombre;
    private String nacionalidad;

    public Autores(String nombre, String nacionalidad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void mostrarAutor() {
        System.out.println("Autor: " + nombre + " | Nacionalidad: " + nacionalidad);
    }
}
