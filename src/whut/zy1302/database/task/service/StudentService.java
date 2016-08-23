package whut.zy1302.database.task.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import whut.zy1302.database.task.domain.Student;
import whut.zy1302.database.task.repository.StudentReposity;

/**
 * Created by yang on 2015/12/26.
 */
@Service
@Transactional
public class StudentService {

    @Autowired
    private StudentReposity studentReposity;

    public void createStudent(Student student){
        studentReposity.save(student);
    }

    public Student findoneByUsernameAndPassword(String name,String password){
        Student student=studentReposity.findoneByUsernameAndPassword(name, password);
        return student;
    }
}
