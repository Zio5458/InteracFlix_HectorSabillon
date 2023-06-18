/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2p2_darielsevilla;

/**
 *
 * @author HP
 */
public class Palabras {
    private String palabra;
    private String sinonimo;
    private String significado;

    public Palabras() {
    }

    public Palabras(String palabra, String sinonimo, String significado) {
        this.palabra = palabra;
        this.sinonimo = sinonimo;
        this.significado = significado;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public String getSinonimo() {
        return sinonimo;
    }

    public void setSinonimo(String sinonimo) {
        this.sinonimo = sinonimo;
    }

    public String getSignificado() {
        return significado;
    }

    public void setSignificado(String significado) {
        this.significado = significado;
    }

    @Override
    public String toString() {
        return palabra;
    }
    
    
}
