package LMS;
import java.util.*;
public class Library {

    List<Book> books;
    List<User> users;

    public Library(){
    }

    public Library(List<Book> books, List<User> users) {
        this.books = books;
        this.users = users;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
    public void printBooks(){
        if(books.isEmpty())
          System.out.println("No Books in the library");
        else{
            System.out.println("Books present in the Library:");
            for(Book b:books){
                System.out.println(b);
            }
        }
    }
     public void printUsers(){
        if(users.isEmpty())
          System.out.println("No Users in the library");
        else{
            System.out.println("Users Present in the Library:");
            for(User u:users){
                System.out.println(u);
            }
        }
    }
}
