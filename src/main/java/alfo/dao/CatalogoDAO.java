package alfo.dao;

import alfo.entities.Catalogo;
import alfo.entities.Libro;
import alfo.entities.Rivista;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Query;

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
        System.out.println(newCatalogo.getTitolo() + " è stato salvato");

    }




    public void findElementByIdAndDelete(UUID id){
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

        Query query = entityManager.createQuery("DELETE FROM CATALOGO c WHERE c.id = :id");
        query.setParameter("id", id);

     

    }






}
