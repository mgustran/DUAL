package daoPattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by mgustran on 03/05/2016.
 */
public class StudentDaoImpl implements StudentDao {

    List<Student> students;

    public StudentDaoImpl() {
        students = new ArrayList<Student>();
        Student student1 = new Student("Robert",0);
        Student student2 = new Student("John",1);
        Student student3 = new Student("Keny",2);
        Student student4 = new Student("Cash",3);
        Student student5 = new Student("",4);
        Student student6 = new Student("",5);
        Student student7 = new Student("",6);
        Student student8 = new Student("",7);
        Student student9 = new Student("",8);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);
        students.add(student7);
        students.add(student8);

    }



    @Override
    public List<Student> getAllStudents() {
        return students;
    }

    @Override
    public Student getStudent(int rollNo) {
        return students.get(rollNo);
    }

    @Override
    public void updateStudent(Student student) {
        students.get(student.getRollNo()).setName(student.getName());
        System.out.println("Student: Roll No " + student.getRollNo()
                +", updated in the database");
    }

    @Override
    public void deleteStudent(Student student) {
        students.remove(student.getRollNo());
        System.out.println("Student: Roll No " + student.getRollNo()
                +", deleted from database");
    }

    public void addStudent(Student student){
        Scanner sc = new Scanner(System.in);
        String studentName = sc.nextLine();
        int studentNo = sc.nextInt();
        Student student6 = new Student(studentName,studentNo);
        students.add(student6);



    }

}
