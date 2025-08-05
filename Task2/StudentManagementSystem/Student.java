package StudentManagementSystem;



class Student{
    int id;
    String name;
    String department;
    int marks;
    
    public Student(){

    }
    public Student(int id, String name,int marks, String dept){
        this.id=id;
        this.name=name;
        this.marks=marks;
        this.department=dept;
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
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public int getMarks() {
        return marks;
    }
    public void setMarks(int marks) {
        this.marks = marks;
    }

}