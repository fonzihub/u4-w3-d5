package alfo.dao;

import alfo.entities.Libro;
import alfo.entities.Rivista;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

import java.util.UUID;

public class CatalogoDAO {
    private final EntityManager entityManager;



    public CatalogoDAO(EntityManager entityManager){
        this.entityManager = entityManager;
    }


    public void saveR(Rivista newRivista){
        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();
        entityManager.persist(newRivista);
        transaction.commit();
        System.out.println("la rivista: " + newRivista.getTitolo() + " è stata salvata");

    }

    public void saveL(Libro newLibro){
        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();
        entityManager.persist(newLibro);
        transaction.commit();
        System.out.println("il libro: " + newLibro.getTitolo() + " è stato salvato");

    }


    public void findElementByIdAndDelete(UUID id){
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        
    }






}
