package LMS;
import java.util.*;
public class User {
    int id;
    String name;
    List<Book> b;

    public User(){

    }

    public User(int id, String name) {
        this.id = id;
        this.name = name;
        this.b=new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getB() {
        return b;
    }

    public void setB(List<Book> b) {
        this.b = b;
    }
    
    public void addBook(Book b){
        this.b.add(b);
    }
    public void removeBook(Book b){
        this.b.remove(b);
    }
    public String toString(){
        return "Id:"+id+" Name:"+name+" Books:"+b;
    }
}
