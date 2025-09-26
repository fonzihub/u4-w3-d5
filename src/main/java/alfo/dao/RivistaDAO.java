package alfo.dao;

import alfo.entities.Libro;
import alfo.entities.Rivista;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class RivistaDAO {



    private final EntityManager entityManager;


    public RivistaDAO(EntityManager entityManager){
        this.entityManager = entityManager;
    }


    public void saveR(Rivista newRivista){
        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();
        entityManager.persist(newRivista);
        transaction.commit();
        System.out.println("la rivista: " + newRivista.getTitolo() + " è stata salvata");

    }
}
