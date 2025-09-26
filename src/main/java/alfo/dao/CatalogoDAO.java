package alfo.dao;

import alfo.entities.Catalogo;
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


    public void save(Catalogo newCatalogo){
        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();
        entityManager.persist(newCatalogo);
        transaction.commit();
        System.out.println("la rivista: " + newCatalogo.getTitolo() + " è stata salvata");

    }




    public void findElementByIdAndDelete(UUID id){
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

    }






}
