import java.sql.Connection;
import java.sql.Statement;


public class AlbumController {


    public void create(String name, int artistId, int releaseYear){
        try {
            Statement x = Database.StartBdd().createStatement();
            String y ="insert into album values ( default , \"" + name + "\" , " + artistId + " , " + releaseYear + " )";
            x.executeUpdate(y);
        } catch (Exception e) {
            System.out.println(e);

        }
    }
    public  void findByArtist(int artistId){
        try {
            Statement x =Database.StartBdd().createStatement();
            String y ="select *from album where id=" + artistId + ";" ;
            x.executeUpdate(y);
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
