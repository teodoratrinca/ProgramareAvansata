import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Catalog  implements Serializable {
    private String name;
    private String path;
    private List<Document> documents = new ArrayList<>();


   // public void add(Document doc) {
      //  documents.add(doc);
    //}
   /*public Document findById(String id) {
       for (Document doc : documents) {
           if (doc.getId().equals(id)) {
               return doc;
           }
       }
       return null;
   }*/

    public void setName(String name){
        this.name=name;
    }
    public void setPath(String path){
        this.path=path;
    }
    public String getName(String name){
        return name;
    }
    public String getPath(){
        return path;
    }
    public Catalog(String name,String path){
        this.path=path;
        this.name=name;
    }
    public void add(Document doc) {
        documents.add(doc);
    }
    public Document findById(String id) {
        return documents.stream()
                .filter(d -> d.getId().equals(id)).findFirst().orElse(null);
    }
    public List<Document> getDocuments() {
        return documents;
    }

    public void setDocuments(List<Document> documents) {
        this.documents = documents;
    }
}
