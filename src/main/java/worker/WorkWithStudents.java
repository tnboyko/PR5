package worker;

import data.Student;
import data.StudentsDao;
import org.springframework.beans.factory.annotation.Autowired;

public class WorkWithStudents {
    @Autowired
    private StudentsDao studentsDao;

    public void saveStudentToDb(Student student){
        if ((student!=null)&&(student.getPib()!=null)&&(!"".equals(student.getPib()))&&(student.getCourse()>0)){
            studentsDao.addStudent(student);
            System.out.println("data.Student have been saved "+student);
        }
    }
}
