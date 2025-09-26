package alfo.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.UUID;
@Entity
@Table(name = "utenti")
public class Utente {
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private String Cognome;
    private LocalDate dataNascita;
    @Column(name= "n_tessera",nullable = false, unique = true)
@Id
    @GeneratedValue
    private UUID numeroTessera;

public Utente(){}
    public Utente(String nome, String cognome, LocalDate dataNascita, UUID numeroTessera) {
        this.nome = nome;
        Cognome = cognome;
        this.dataNascita = dataNascita;
        this.numeroTessera = numeroTessera;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return Cognome;
    }

    public void setCognome(String cognome) {
        Cognome = cognome;
    }

    public LocalDate getDataNascita() {
        return dataNascita;
    }

    public void setDataNascita(LocalDate dataNascita) {
        this.dataNascita = dataNascita;
    }

    public UUID getNumeroTessera() {
        return numeroTessera;
    }




    @Override
    public String toString() {
        return "Utente{" +
                "nome='" + nome + '\'' +
                ", Cognome='" + Cognome + '\'' +
                ", dataNascita=" + dataNascita +
                ", numeroTessera=" + numeroTessera +
                '}';
    }
}
