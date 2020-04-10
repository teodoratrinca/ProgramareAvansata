import java.sql.Connection;
import java.sql.Statement;

public class ArtistController {


    public void create(String name, String country) {
        try {
            Statement x = Database.StartBdd().createStatement();
            String y = "insert into artist values(0,'" + name + "','" + country + "');";
            x.executeUpdate(y);
        } catch (Exception e) {
            System.out.println(e);

        }
    }

    public void findByName(String name) {
        try {
            Statement x = Database.StartBdd().createStatement();
            String y = "select *from artists where name=" + name + ";" ;
            x.executeUpdate(y);
        } catch (Exception e) {
            System.out.println(e);

        }

        }
    }
