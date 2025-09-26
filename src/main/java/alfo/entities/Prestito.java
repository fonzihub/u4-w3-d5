package alfo.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

import java.util.UUID;

@Entity
public class Prestito {
    @Id
    @GeneratedValue
    @Column(name = "id_prestito", nullable = false, unique = true)
    private UUID idPrestito;

    @Column(name = "elemento_prestato")
    private String elementoPrestato;

    @Column(name = "data_inizio_prestito")
    private LocalDate dataInizioPrestito;

    @Column(name = "data_restituzione_prevista")
    private LocalDate dataRestituzionePrevista;

    @Column(name = "data_restituzione_effettiva")
    private LocalDate dataRestituzioneEffettiva;


    @ManyToOne
    @JoinColumn(name = "id_utente")
    private Utente utente;


    @ManyToOne
    @JoinColumn(name = "id_libro_prestato")
    private Libro libro;

    @ManyToOne
    @JoinColumn(name = "id_rivista_prestata")
    private Rivista rivista;





    public Prestito() {
    }

    public Prestito(String elementoPrestato, LocalDate dataInizioPrestito, LocalDate dataRestituzionePrevista, LocalDate dataRestituzioneEffettiva) {

        this.elementoPrestato = elementoPrestato;
        this.dataInizioPrestito = dataInizioPrestito;
        this.dataRestituzionePrevista = dataRestituzionePrevista;
        this.dataRestituzioneEffettiva = dataRestituzioneEffettiva;

    }

    public UUID getIdPrestito() {
        return idPrestito;
    }


    public String getElementoPrestato() {
        return elementoPrestato;
    }

    public void setElementoPrestato(String elementoPrestato) {
        this.elementoPrestato = elementoPrestato;
    }

    public LocalDate getDataInizioPrestito() {
        return dataInizioPrestito;
    }

    public void setDataInizioPrestito(LocalDate dataInizioPrestito) {
        this.dataInizioPrestito = dataInizioPrestito;
    }

    public LocalDate getDataRestituzionePrevista() {
        return dataRestituzionePrevista;
    }

    public void setDataRestituzionePrevista(LocalDate dataRestituzionePrevista) {
        this.dataRestituzionePrevista = dataRestituzionePrevista;
    }

    public LocalDate getDataRestituzioneEffettiva() {
        return dataRestituzioneEffettiva;
    }

    public void setDataRestituzioneEffettiva(LocalDate dataRestituzioneEffettiva) {
        this.dataRestituzioneEffettiva = dataRestituzioneEffettiva;
    }





    @Override
    public String toString() {
        return "Prestito{" +
                "idPrestito=" + idPrestito +
                ", elementoPrestato='" + elementoPrestato + '\'' +
                ", dataInizioPrestito=" + dataInizioPrestito +
                ", dataRestituzionePrevista=" + dataRestituzionePrevista +
                ", dataRestituzioneEffettiva=" + dataRestituzioneEffettiva +
                '}';
    }
}
