/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projeto.dashfi_t;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author robso
 */
@Entity
@Table(name = "valor")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Valor.findAll", query = "SELECT v FROM Valor v"),
    @NamedQuery(name = "Valor.findByIdValor", query = "SELECT v FROM Valor v WHERE v.idValor = :idValor"),
    @NamedQuery(name = "Valor.findByValor", query = "SELECT v FROM Valor v WHERE v.valor = :valor"),
    @NamedQuery(name = "Valor.findByTitulo", query = "SELECT v FROM Valor v WHERE v.titulo = :titulo"),
    @NamedQuery(name = "Valor.findByEtiqueta", query = "SELECT v FROM Valor v WHERE v.etiqueta = :etiqueta"),
    @NamedQuery(name = "Valor.findByObservacao", query = "SELECT v FROM Valor v WHERE v.observacao = :observacao")})
public class Valor implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_valor")
    private Integer idValor;
    @Column(name = "valor")
    private BigInteger valor;
    @Size(max = 25)
    @Column(name = "titulo")
    private String titulo;
    @Size(max = 25)
    @Column(name = "etiqueta")
    private String etiqueta;
    @Size(max = 25)
    @Column(name = "observacao")
    private String observacao;

    public Valor() {
    }

    public Valor(Integer idValor) {
        this.idValor = idValor;
    }

    public Integer getIdValor() {
        return idValor;
    }

    public void setIdValor(Integer idValor) {
        this.idValor = idValor;
    }

    public BigInteger getValor() {
        return valor;
    }

    public void setValor(BigInteger valor) {
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
    public int hashCode() {
        int hash = 0;
        hash += (idValor != null ? idValor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Valor)) {
            return false;
        }
        Valor other = (Valor) object;
        if ((this.idValor == null && other.idValor != null) || (this.idValor != null && !this.idValor.equals(other.idValor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.projeto.dashfi_t.Valor[ idValor=" + idValor + " ]";
    }
    
}
