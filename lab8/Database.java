import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    private static Database databaseCon =null;
    private static Connection connection = null;
    private String Login;
    private String MotDePasse;
    private boolean Logged = false;

    public static Connection StartBdd(){
        if (connection==null)
            try {
                //String driverName = "com.mysql.jdbc.Driver";
                //Class.forName(driverName); // here is the ClassNotFoundException

                String serverName = "localhost";
                String mydatabase = "musicalbums";
                String url = "jdbc:mysql://" + serverName + "/" + mydatabase;

                String username = "root";
                String password = "2991104teodora";
                connection = DriverManager.getConnection(url, username, password);
            } catch (SQLException  e) {
                System.err.println("Cannot connect to DB: " + e);
            }
        return connection;
    }

    public Database getInstance() {
        if (databaseCon == null) {
            try {
               // String driverName = "com.mysql.jdbc.Driver";
               // Class.forName(driverName); // here is the ClassNotFoundException

                String serverName = "localhost";
                String mydatabase = "musicalbums";
                String url = "jdbc:mysql://" + serverName + "/" + mydatabase;

                String username = "root";
                String password = "2991104teodora";
                databaseCon = new Database();
                connection = DriverManager.getConnection(url, username, password);
            } catch (SQLException  e) {
                System.err.println("Cannot connect to DB: " + e);
            }
        }
        return databaseCon;
    }
}
