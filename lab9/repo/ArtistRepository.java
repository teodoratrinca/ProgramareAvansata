package repo;
import entity.ArtistsEntity;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import java.util.List;

public class ArtistRepository {

    public EntityManagerFactory entityManagerFactory;

    public void create(ArtistsEntity artist) {
        entityManagerFactory.createEntityManager().getTransaction().begin();
        entityManagerFactory.createEntityManager().persist(artist);
        entityManagerFactory.createEntityManager().getTransaction().commit();
    }

    public List<ArtistsEntity> findByName(String name) {
        List<ArtistsEntity> artists = entityManagerFactory.createEntityManager().createNamedQuery("findArtistsWName").setParameter("name", name).getResultList();
        return artists;
    }

    public ArtistsEntity findById(Integer artistId) {
        Query query = entityManagerFactory.createEntityManager().createQuery("select a from ArtistsEntity a where a.id=:artistId");
        ArtistsEntity artist = (ArtistsEntity) query.setParameter("artistId", artistId).getSingleResult();
        return artist;
    }

}
