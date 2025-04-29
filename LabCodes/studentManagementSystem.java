import student.Student;
import course.Course;
import enrollment.Enrollment;
public class studentManagementSystem {
    public static void main(String[] args) {
        Student student = new Student(101, "ABC", 20);
        Course course = new Course(408, "Java Programming", 4);
        Enrollment enrollment = new Enrollment(student, course);

        System.out.println(student.getStudentInfo());
        System.out.println(course.getCourseInfo());
        System.out.println(enrollment.getEnrollmentInfo());
    }
}