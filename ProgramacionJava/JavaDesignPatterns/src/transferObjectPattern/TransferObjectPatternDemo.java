package transferObjectPattern;

/**
 * Created by mgustran on 11/05/2016.
 */
public class TransferObjectPatternDemo {
    public static void main(String[] args) {
        StudentBO studentBusinessObject = new StudentBO();

        // PRINT ALL STUDENTS
        for (StudentVO student : studentBusinessObject.getAllStudents()){
            System.out.println("Student [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");
        }


        //UPDADE AN STUDENT
        StudentVO student = studentBusinessObject.getAllStudents().get(0);
        student.setName("Michael");
        studentBusinessObject.updateStudent(student);

        //  GET THE STUDENT
        student = studentBusinessObject.getStudent(0);
        System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " +student.getName() + " ]");

    }
}
