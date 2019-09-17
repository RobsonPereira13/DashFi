/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author robso
 */
public class Card {
    private String etiqueta,titulo;
    private int modelo,id;

    public Card() {
    }
    
    public Card(String etiqueta, String titulo, int modelo) {
        this.etiqueta = etiqueta;
        this.titulo = titulo;
        this.modelo = modelo;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Card{" + "etiqueta=" + etiqueta + ", titulo=" + titulo + ", modelo=" + modelo + '}';
    }
    
    
}
