package alfo.entities;


import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


@Entity
@DiscriminatorValue("Libro")
@Table (name = "libri")
public class Libro extends Catalogo {

    @Column(nullable = false)

    private String autore;
    private String genere;





    public Libro() {
    }



    public Libro(String titolo, int annoPublicazione, int numeroPagine, String autore, String genere) {
        super(titolo, annoPublicazione, numeroPagine);
        this.autore = autore;
        this.genere = genere;
    }


    public String getAutore() {
        return autore;
    }


    public String getGenere() {
        return genere;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "autore='" + autore + '\'' +
                ", genere='" + genere + '\'' +
                ", id=" + id +
                ", titolo='" + titolo + '\'' +
                ", annoPublicazione=" + annoPublicazione +
                ", numeroPagine=" + numeroPagine +
                '}';
    }
}
