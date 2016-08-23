package whut.zy1302.database.task.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import whut.zy1302.database.task.domain.Teacher;
import whut.zy1302.database.task.repository.TeacherReposity;

import java.util.List;

/**
 * Created by yang on 2015/12/26.
 */
@Service
@Transactional
public class TeacherService {

    @Autowired
    private TeacherReposity teacherReposity;

    public void createTeacher(Teacher teacher){
        teacherReposity.save(teacher);
    }

    public Teacher findoneByUsernameAndPassword(String name,String password){
        Teacher teacher=teacherReposity.findoneByUsernameAndPassword(name, password);
        return teacher;
    }

    public List<Teacher> findAll(){
        List<Teacher> teacherList=teacherReposity.findAll();
        return teacherList;
    }
}
