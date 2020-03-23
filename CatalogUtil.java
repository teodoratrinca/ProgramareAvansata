import java.awt.*;
import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;

public class CatalogUtil {
    public static void save(Catalog catalog)
            throws IOException {
        try (var oos = new ObjectOutputStream(
                new FileOutputStream(catalog.getPath()))) {
            oos.writeObject(catalog);
        }
    }

    public static Catalog load(String path)
            throws IOException, ClassNotFoundException {
        FileInputStream file = new FileInputStream(path);
        ObjectInputStream catalog = new ObjectInputStream(file);
        return (Catalog) catalog.readObject();
    }

    public static void view(Document document)
            throws IOException ,URISyntaxException {
        Desktop desktop = Desktop.getDesktop();
        //… browse or open, depending of the location type
        if (document.getLocation().startsWith("http")) {
            desktop.browse(new URI(document.getLocation()));
        } else {
            desktop.open(new File(document.getLocation()));
        }
    }

}
