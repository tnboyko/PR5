package data;

public interface StudentsDao {
    void addStudent(Student student);
    Student getStudentById(int id);
}
