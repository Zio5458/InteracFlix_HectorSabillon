/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2p2_darielsevilla;

/**
 *
 * @author HP
 */
public class Creador {
    private String nombre;
    private String nacionalidad;
    private String profesion;

    public Creador() {
    }

    public Creador(String nombre, String nacionalidad, String profesion) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.profesion = profesion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
