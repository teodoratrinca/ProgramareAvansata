package app;

import entity.AlbumsEntity;
import entity.ArtistsEntity;
import repo.AlbumRepository;
import repo.ArtistRepository;
import util.PersistenceUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.List;

public class AlbumManager {
    public static void main(String[] args)
    {
        EntityManagerFactory entityManagerFactory = PersistenceUtil.getEntityManagerFactory();
        EntityManager entityManagerFactory2 = entityManagerFactory.createEntityManager();

        AlbumRepository albumRepository = new AlbumRepository();
        ArtistRepository artistRepository = new ArtistRepository();
        entityManagerFactory2.getTransaction().begin();
        ArtistsEntity artist = new ArtistsEntity();

        AlbumsEntity album = new AlbumsEntity();
        album.setArtistId(1);
        album.setName("Sidepoint");
        album.setReleaseYear(2017);
        albumRepository.create(album);

        AlbumsEntity album2 =new AlbumsEntity();
        album2.setArtistId(2);
        album2.setReleaseYear(2016);
        album2.setName("Celesitial");
        albumRepository.create(album2);

        artist.setName("Vlad Caia");
        artist.setCountry("Romania");
        artistRepository.create(artist);

        ArtistsEntity artist1 = artistRepository.findById(1);

        List<AlbumsEntity> albumeName;
        albumeName = albumRepository.findByName("Celestial");

        List<AlbumsEntity> albumeId;
        albumeId = albumRepository.findByArtistId(2);

    }


}
