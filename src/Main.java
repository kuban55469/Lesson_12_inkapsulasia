import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();

        System.out.print("Enter length: ");
        rectangle.setLength( sc.nextInt());
        System.out.println("Length is: " +rectangle.getLength());

        System.out.print("Enter width: ");
        rectangle.setWidth(sc.nextInt());
        System.out.println("Width is: " + rectangle.getWidth());

        System.out.println("Area is rectangle: " + rectangle.getArea());

        System.out.println();
        System.out.println();


        Student student = new Student();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Write the name: ");
        student.setName(scanner.nextLine());

        System.out.print("Write the surname: ");
        student.setSurname(scanner.nextLine());

        System.out.print("Write the age: ");
        student.setAge(scanner.nextInt());

        System.out.println("Write the courses: ");
        String [] courses = new String[3];
        for (int i = 0; i <= courses.length; i++) {
            courses[i] = sc.nextLine();
        }
        student.setCourses(courses);

        System.out.println("Name: " + student.getName());
        System.out.println("Surname: " + student.getSurname());
        System.out.println("Age: " + student.getAge());


        System.out.print("Courses is: ");
        for (String course : courses) {
            System.out.print(course);
            System.out.print(", ");
        }
    }
}