package LMS;
import java.util.*;

public class Main {
    static List<Book> bl=new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the books that are in library");
        System.out.println("Enter number of books");
        int n=sc.nextInt();
        sc.nextLine();
        while(n-->0){
        System.out.println("Enter Book details");
        String bookdetails=sc.nextLine();
        String[] words=bookdetails.split(" ");
        Book b=new Book(Integer.parseInt(words[0]),words[1],Integer.parseInt(words[2]));
        bl.add(b);
        }


        //User code
        List<User> ul=new ArrayList<>();
        System.out.println("Enter number of users");
        int n1=sc.nextInt();
        sc.nextLine();
        while(n1-->0){
        System.out.println("enter user details and book name");
        String userdet=sc.nextLine();
        String[] userdetails=userdet.split(" ");
       User u=new User(Integer.parseInt(userdetails[0]),userdetails[1]);
       String bookname=userdetails[2];
       boolean found = false;
        for (Book b : bl) {
            if (b.getTitle().equalsIgnoreCase(bookname)) {
                u.addBook(b);
                //System.out.println("Book added to user: " + b);
                found = true;
                int count=b.reducecount(b.getCount());
                b.setCount(count);
                break;
            }
        }

        if (!found) {
            System.out.println("Book not found with title: " + bookname);
        }
        //adding user to userlist
        ul.add(u);
    }
        //Library code
        Library ll=new Library(bl,ul);
        System.out.println("After issuing the book to user");
       ll.printBooks();
       ll.printUsers();


       System.out.println("Enter the book returning details ");
       User selecteduser=null;
       System.out.println("Enter the user id");
       int id=sc.nextInt();
       for(User u:ul){
        if(u.getId()==id){
          selecteduser=u;
          break;
       }
    }
       System.out.println("Enter the book title to return");
       String bookname=sc.next();
       User updatedUser=returnBook(selecteduser,bookname);
       System.out.println("Updated user details");
       System.out.println(updatedUser);
       System.out.println("After returning the book to library");
       ll.printBooks();
       ll.printUsers();

    }
     public static User returnBook(User u,String bookname){
        boolean found = false;
        for(Book b:bl){
            if(b.getTitle().equalsIgnoreCase(bookname)){
                int count=b.increasecount(b.getCount());
                b.setCount(count);
                u.removeBook(b);
                found = true;
                //System.out.println("After removing the book to the user"+b);
                break;
            }
        }
         if (!found) {
            System.out.println("Book not found with title: " + bookname);
        }
          return u;
    }
    
}
