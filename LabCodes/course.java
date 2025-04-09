package course;

public class course{
    int courseID;
    String courseName;
    int courseCredits;
    public course(int id,String name,int credit){
        courseID=id;
        courseName=name;
        courseCredits=credit;
    }
    public void getCourseInfo(){
        System.out.println("Course ID: "+courseID);
        System.out.println("Course Name: "+courseName);
        System.out.println("Course Credits: "+courseCredits);
    }
}