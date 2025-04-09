package student;

public class student {
    int studentID;
    String name;
    int age;
    public student(int id,String n,int a){
        studentID=id;
        name=n;
        age=a;
    }
    public void getInfo(){
        System.out.println("Student ID: "+studentID);
        System.out.println("Student Name: "+name);
        System.out.println("Student Age: "+age);
    }
}