package daoPattern;

import java.util.List;

/**
 * Created by mgustran on 03/05/2016.
 */
public interface StudentDao {
    public List<Student> getAllStudents();

    public Student getStudent(int rollNo);

    public void updateStudent(Student student);

    public void deleteStudent(Student student);

    public void addStudent(Student student);


}
