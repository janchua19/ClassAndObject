import com.testing.model.Student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Jan",21,'M',2015102011);
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getGender());
        System.out.println(student.getStudNum());
    }
}
