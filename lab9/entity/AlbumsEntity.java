package entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "albums", schema = "musicalbum", catalog = "")
@org.hibernate.annotations.NamedQuery( name = "AlbumsEntity.findByArtist",
        query = "select a from AlbumsEntity a where a.artistId = :artistId")

public class AlbumsEntity {
    private int id;
    private String name;
    private int artistId;
    private Integer releaseYear;
    private Integer relaseYear;

    @Id
    @Column(name = "id")

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "artist_id")
    public int getArtistId() {
        return artistId;
    }

    public void setArtistId(int artistId) {
        this.artistId = artistId;
    }

    @Basic
    @Column(name = "relase_year")
    public Integer getRelaseYear() {
        return releaseYear;
    }

    public void setRelaseYear(Integer relaseYear) {
        this.relaseYear = relaseYear;
    }

    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AlbumsEntity that = (AlbumsEntity) o;
        return id == that.id &&
                artistId == that.artistId &&
                Objects.equals(name, that.name) &&
                Objects.equals(releaseYear, that.releaseYear);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, artistId, releaseYear);
    }
}
