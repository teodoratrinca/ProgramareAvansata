package repo;
import entity.AlbumsEntity;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import java.util.List;

public class AlbumRepository {

   public EntityManagerFactory entityManagerFactory;

    public void create(AlbumsEntity album) {
        entityManagerFactory.createEntityManager().getTransaction().begin();
        entityManagerFactory.createEntityManager().persist(album);
        entityManagerFactory.createEntityManager().getTransaction().commit();
    }

    public AlbumsEntity findById(Integer artistId) {
        Query query = entityManagerFactory.createEntityManager().createQuery("select a from AlbumsEntity a  where a.artistId=:artistId");
        AlbumsEntity album= (AlbumsEntity) query.setParameter("artistId", artistId).getSingleResult();
        return album;
    }
    public List<AlbumsEntity> findByName(String name) {
        List<AlbumsEntity> albums = entityManagerFactory.createEntityManager().createNamedQuery("findAlbumsWName").setParameter("name", name ).getResultList();
        return albums;
    }
    public List<AlbumsEntity> findByArtistId(Integer artistId) {
        List<AlbumsEntity> albums =entityManagerFactory.createEntityManager().createNamedQuery("AlbumsEntity.findByArtist").setParameter("artistId", artistId).getResultList();
        return albums;
    }

}

