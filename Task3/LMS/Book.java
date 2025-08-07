package LMS;
public class Book {
    int id;
    String title;
    int count;
    public Book(){}
    public Book(int id, String title, int count) {
        this.id = id;
        this.title = title;
        this.count = count;
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }
    public int reducecount(int count){
        int newcount=count-1;
        return newcount;
    }
    public int increasecount(int count){
        int newcount=count+1;
        return newcount;
    }

    public String toString(){
        return "ID:"+id+" Title:"+title+" Count:"+count;
    }
}
