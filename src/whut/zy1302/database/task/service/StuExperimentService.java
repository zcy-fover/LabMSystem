package whut.zy1302.database.task.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import whut.zy1302.database.task.domain.Stu_experiment;
import whut.zy1302.database.task.repository.StuExperimentReposity;

import java.util.List;

/**
 * Created by yang on 2015/12/27.
 */
@Service
public class StuExperimentService {

    @Autowired
    private StuExperimentReposity stuExperimentReposity;

    public void createExperiment(Stu_experiment stuexperiment){
        stuExperimentReposity.save(stuexperiment);
    }

    public List<Stu_experiment> findExperimentByStudentName(String studentname){
        List<Stu_experiment> stuexperimentList = stuExperimentReposity.findExperimentByStudentName(studentname);
        return stuexperimentList;
    }

    public List<Stu_experiment> findExperimentByIspassAndStudentName(Boolean ispass,String student){
        List<Stu_experiment> stuexperimentList = stuExperimentReposity.findExperimentByIspassAndStudentName(ispass, student);
        return stuexperimentList;
    }

    public Stu_experiment findExperimentByIspassAndStudentNameAndProjectName(Boolean ispass,String student,String projectname){
        Stu_experiment stuexperiment = stuExperimentReposity.findExperimentByIspassAndStudentNameAndProjectName(ispass, student, projectname);
        return stuexperiment;
    }

    public Stu_experiment findExperimentById(Integer id){
        Stu_experiment stuexperiment=stuExperimentReposity.findExperimentById(id);
        return stuexperiment;
    }

    public List<Stu_experiment> findExperimentByTeacher(String teacher){
        List<Stu_experiment> stuexperimentList = stuExperimentReposity.findExperimentByTeacher(teacher);
        return stuexperimentList;
    }

    public void updateIspassById(Integer id){
        Stu_experiment stuexperiment=stuExperimentReposity.findExperimentById(id);
        stuexperiment.setIsPass(true);
        stuExperimentReposity.saveAndFlush(stuexperiment);
    }

}
