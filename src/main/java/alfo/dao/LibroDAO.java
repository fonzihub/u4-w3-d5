package alfo.dao;

import alfo.entities.Catalogo;
import alfo.entities.Libro;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class LibroDAO {
private final EntityManager entityManager;


public LibroDAO(EntityManager entityManager){
    this.entityManager = entityManager;
}


public void saveL(Libro newLibro){
    EntityTransaction transaction = entityManager.getTransaction();

    transaction.begin();
    entityManager.persist(newLibro);
    transaction.commit();
    System.out.println("il libro: " + newLibro.getTitolo() + " è stato salvato");

}














}
