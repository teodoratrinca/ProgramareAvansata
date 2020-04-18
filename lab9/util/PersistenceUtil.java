package util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PersistenceUtil {
    private static EntityManagerFactory entityManagerFactory=null;
    public static void createEntityManagerFactory()
   {
       if(entityManagerFactory==null)
        try {
            entityManagerFactory = Persistence.createEntityManagerFactory("MusicAlbumsPU");
            System.out.println("Entity test "+ entityManagerFactory);
        } catch (Exception e)
        {
        System.out.println(e);
    }
    }
    public static EntityManagerFactory getEntityManagerFactory()

    {
        return entityManagerFactory;
    }
}
