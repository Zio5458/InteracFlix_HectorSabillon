/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2p2_darielsevilla;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author HP
 */
public class Lenguaje {
    private String nombre;
    private ArrayList<Creador> creadores = new ArrayList();
    private ArrayList<Palabras> palabrasReservadas = new ArrayList();
    private boolean caseSensisitve;
    private Date fecha;
    private String personas;

    public Lenguaje() {
    }

    public Lenguaje(String nombre, boolean caseSensisitve, Date fecha, String personas) {
        this.nombre = nombre;
        this.caseSensisitve = caseSensisitve;
        this.fecha = fecha;
        this.personas = personas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Creador> getCreadores() {
        return creadores;
    }

    public void setCreadores(ArrayList<Creador> creadores) {
        this.creadores = creadores;
    }

    public boolean isCaseSensisitve() {
        return caseSensisitve;
    }

    public void setCaseSensisitve(boolean caseSensisitve) {
        this.caseSensisitve = caseSensisitve;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getPersonas() {
        return personas;
    }

    public void setPersonas(String personas) {
        this.personas = personas;
    }

    public ArrayList<Palabras> getPalabrasReservadas() {
        return palabrasReservadas;
    }

    public void setPalabrasReservadas(ArrayList<Palabras> palabrasReservadas) {
        this.palabrasReservadas = palabrasReservadas;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
