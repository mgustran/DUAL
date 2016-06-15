package daoPattern;

/**
 * Created by mgustran on 03/05/2016.
 */
public class DaoPatternDemo {
    public static void main(String[] args) {
        StudentDao studentDao = new StudentDaoImpl();

        for (Student student : studentDao.getAllStudents()) {
            System.out.println("Student: [RollNo : "
                    + student.getRollNo() + ", Name : " + student.getName() + " ]");
        }

        Student student = studentDao.getAllStudents().get(5);
        student.setName("Mijkhbkjhg");
        studentDao.updateStudent(student);

        studentDao.getStudent(4);
        System.out.println("Student: [RollNo : "
                + student.getRollNo() + ", Name : " + student.getName() + " ]");


    }



}

