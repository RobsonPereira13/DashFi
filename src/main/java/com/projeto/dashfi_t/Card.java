/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projeto.dashfi_t;

import java.io.Serializable;
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
@Table(name = "card")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Card.findAll", query = "SELECT c FROM Card c"),
    @NamedQuery(name = "Card.findByIdCard", query = "SELECT c FROM Card c WHERE c.idCard = :idCard"),
    @NamedQuery(name = "Card.findByEtiqueta", query = "SELECT c FROM Card c WHERE c.etiqueta = :etiqueta"),
    @NamedQuery(name = "Card.findByTitulo", query = "SELECT c FROM Card c WHERE c.titulo = :titulo"),
    @NamedQuery(name = "Card.findByModelo", query = "SELECT c FROM Card c WHERE c.modelo = :modelo")})
public class Card implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_card")
    private Integer idCard;
    @Size(max = 25)
    @Column(name = "etiqueta")
    private String etiqueta;
    @Size(max = 25)
    @Column(name = "titulo")
    private String titulo;
    @Column(name = "modelo")
    private Integer modelo;

    public Card() {
    }

    public Card(Integer idCard) {
        this.idCard = idCard;
    }

    public Integer getIdCard() {
        return idCard;
    }

    public void setIdCard(Integer idCard) {
        this.idCard = idCard;
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

    public Integer getModelo() {
        return modelo;
    }

    public void setModelo(Integer modelo) {
        this.modelo = modelo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCard != null ? idCard.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Card)) {
            return false;
        }
        Card other = (Card) object;
        if ((this.idCard == null && other.idCard != null) || (this.idCard != null && !this.idCard.equals(other.idCard))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.projeto.dashfi_t.Card[ idCard=" + idCard + " ]";
    }
    
}
