package enrollement;
import student.student;
import course.course;

public class enrollment{
    student s;
    course c;
    public enrollment(student stu,course cor){
        s=stu;
        c=cor;
    }
    public void getEnrollmentInfo(){
        s.getInfo();
        c.getCourseInfo();
    }
}