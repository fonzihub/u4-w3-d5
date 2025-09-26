package alfo;

import alfo.dao.LibroDAO;
import alfo.dao.RivistaDAO;
import alfo.entities.Libro;
import alfo.entities.Periodicita;
import alfo.entities.Rivista;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Application {
    public static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("u4w3d5pu");

    public static void main(String[] args) {
        EntityManager em = emf.createEntityManager();
        LibroDAO cd = new LibroDAO(em);
        RivistaDAO rd = new RivistaDAO(em);


        Libro libro1 = new Libro("Il Signore degli Anelli", 1954, 1178, "J.R.R. Tolkien", "Fantasy");
        Libro libro2 = new Libro("1984", 1949, 328, "George Orwell", "Distopia");
        Libro libro3 = new Libro("Harry Potter e la Pietra Filosofale", 1997, 223, "J.K. Rowling", "Fantasy");


        Rivista rivista1 = new Rivista("Focus", 2025, 100, Periodicita.MENSILE);
        Rivista rivista2 = new Rivista("National Geographic", 2025, 120, Periodicita.MENSILE);
        Rivista rivista3 = new Rivista("Time", 2025, 90, Periodicita.SETTIMANALE);


//        cd.saveL(libro3);
//       rd.saveR(rivista1);


        em.close();
        emf.close();
    }
}
