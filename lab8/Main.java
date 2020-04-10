public class Main {
    public static void main(String[] args)
    {

   AlbumController albController=new AlbumController();
   ArtistController artController=new ArtistController();

   artController.create("Priku","Romania");
   artController.create("Aron Piper", "Spania");
   albController.create("Mental Pressure",1, 2018);
   albController.create("Sigo",2,2020);

   artController.findByName("Priku");
   albController.findByArtist(2);
    }
}
