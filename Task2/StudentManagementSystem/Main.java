package StudentManagementSystem;
import java.util.*;
public class Main {
    List<Student> ll;
    public Main(List<Student> ll){
        this.ll=ll;
    }
    public void addStudent(Student s){
        ll.add(s);
    }
    public void viewStudent(){
        for(Student students:ll){
            System.out.println(students.getId()+" "+students.getName()+" "+students.getMarks()+" "+students.getDepartment());
        }
    }
   public void updateStudent(int id, String newName, int newMarks, String newDept) {
    for (Student s : ll) {
        if (s.getId() == id) {
            s.setName(newName);
            s.setMarks(newMarks);
            s.setDepartment(newDept);
            System.out.println("Student updated successfully.");
            return;
        }
    }
    System.out.println("Student with ID " + id + " not found.");
}
    public void deleteStudent(int id) {
    Student toDelete=null;
    for (Student s:ll) {
        if (s.getId()==id) {
            toDelete=s;
            break;
        }
    }
    if (toDelete!=null) {
        ll.remove(toDelete);
        System.out.println("Deleted successfully.");
    } else {
        System.out.println("Student with ID " + id + " not found.");
    }
}
public static void main(String[] args) {
         List<Student> ll=new ArrayList<>();
         Main m=new Main(ll);
         Student s1=new Student(1,"ramya",95,"CSE");
         Student s2=new Student(2,"nithya",90,"CSE");
         Student s3=new Student(3,"swat",92,"CSE");
         Student s4=new Student(4,"rekha",90,"CSE");
        m.addStudent(s1);
        m.addStudent(s2);
        m.addStudent(s3);
        m.addStudent(s4);
        System.out.println("Before Updating Viewing the students");
        m.viewStudent();
       
        System.out.println("Updating the students");
        m.updateStudent(3, "swathi", 90, "AIDS");

        System.out.println("After Updating viewing the Students");
        m.viewStudent();
        
        System.out.println("Deleting the students");
        m.deleteStudent(4);
        
        System.out.println("After deleting viewing the students");
        m.viewStudent();

    }
    
}
