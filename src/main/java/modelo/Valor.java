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
public class Valor {
    private int id;
     private double valor;
    private String titulo,etiqueta,observacao;

    public Valor() {
    }

    public Valor(double valor, String titulo, String etiqueta, String observacao) {
        this.valor = valor;
        this.titulo = titulo;
        this.etiqueta = etiqueta;
        this.observacao = observacao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

  

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    @Override
    public String toString() {
        return "Valor{" + "id=" + id + ", valor=" + valor + ", titulo=" + titulo + ", etiqueta=" + etiqueta + ", observacao=" + observacao + '}';
    }


    
}
