package alfo.entities;


import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "cataloghi")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Catalogo {
    @Id
    @GeneratedValue
protected UUID id;
    @Column(nullable = false)

protected String titolo;
@Column(name = "anno_pubblicazione")
protected int annoPublicazione;
@Column(name = "n_pagine")
protected int numeroPagine;

    public Catalogo() {

    }

    public Catalogo( String titolo, int annoPublicazione, int numeroPagine) {

        this.titolo = titolo;
        this.annoPublicazione = annoPublicazione;
        this.numeroPagine = numeroPagine;
    }

    public UUID getId() {
        return id;
    }



    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public int getAnnoPublicazione() {
        return annoPublicazione;
    }

    public void setAnnoPublicazione(int annoPublicazione) {
        this.annoPublicazione = annoPublicazione;
    }

    public int getNumeroPagine() {
        return numeroPagine;
    }

    public void setNumeroPagine(int numeroPagine) {
        this.numeroPagine = numeroPagine;
    }

    @Override
    public String toString() {
        return "Catalogo{" +
                "id=" + id +
                ", titolo='" + titolo + '\'' +
                ", annoPublicazione=" + annoPublicazione +
                ", numeroPagine=" + numeroPagine +
                '}';
    }
}
