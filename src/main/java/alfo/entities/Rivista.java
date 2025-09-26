package alfo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;

@Entity
@Table(name = "riviste")

public class Rivista extends Catalogo {


    @Enumerated(EnumType.STRING)
    private Periodicita periodicita;


    public Rivista() {
    }



    public Rivista(String titolo, int annoPublicazione, int numeroPagine, Periodicita periodicita) {
        super(titolo, annoPublicazione, numeroPagine);
        this.periodicita = periodicita;
    }


    public Periodicita getPeriodicita() {
        return periodicita;
    }

    public void setPeriodicita(Periodicita periodicita) {
        this.periodicita = periodicita;
    }

    @Override
    public String toString() {
        return "Rivista{" +
                "periodicita=" + periodicita +
                ", id=" + id +
                ", titolo='" + titolo + '\'' +
                ", annoPublicazione=" + annoPublicazione +
                ", numeroPagine=" + numeroPagine +
                '}';
    }
}
