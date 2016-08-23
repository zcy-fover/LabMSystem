package whut.zy1302.database.task.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import whut.zy1302.database.task.domain.Tea_Experiment;
import whut.zy1302.database.task.repository.TeaExperimentReposity;

import java.util.List;

/**
 * Created by yang on 2015/12/27.
 */
@Service
public class TeaExperimentService {

    @Autowired
    private TeaExperimentReposity teaExperimentReposity;

    public void createExperiment(Tea_Experiment tea_experiment){
        teaExperimentReposity.save(tea_experiment);
    }

    public List<Tea_Experiment> findExperimentByTeacher(String teacher){
        List<Tea_Experiment> teaExperimentList = teaExperimentReposity.findExperimentByTeacher(teacher);
        return teaExperimentList;
    }

    public List<Tea_Experiment> findExperimentByIspass(Boolean ispass){
        List<Tea_Experiment> teaExperimentList = teaExperimentReposity.findExperimentByIspass(ispass);
        return teaExperimentList;
    }

    public List<Tea_Experiment> findExperimentByIspassAndProjectName(Boolean ispass, String projectname){
        List<Tea_Experiment> teaExperimentList = teaExperimentReposity.findExperimentByIspassAndProjectName(ispass, projectname);
        return teaExperimentList;
    }

    public Tea_Experiment findExperimentById(Integer id){
        Tea_Experiment teaExperiment=teaExperimentReposity.findExperimentById(id);
        return teaExperiment;
    }

    public List<Tea_Experiment> findExperimentByIspassAndTeacher(Boolean ispass, String teacher){
        List<Tea_Experiment> teaExperimentList = teaExperimentReposity.findExperimentByIspassAndTeacher(ispass, teacher);
        return teaExperimentList;
    }

    public void update(String projectname,String teacher,String context,String principle,String procedure,String equipment){
        Tea_Experiment teaExperiment=teaExperimentReposity.findExperimentByIspassAndTeacherAndProjectName(true, teacher, projectname);
        teaExperiment.setContext(context);
        teaExperiment.setTheBasicPrincipleAndDesignOfE(principle);
        teaExperiment.setExperimentalProcedure(procedure);
        teaExperiment.setEquipment(equipment);
        teaExperimentReposity.saveAndFlush(teaExperiment);
    }

    public Tea_Experiment findExperimentByIspassAndTeacherAndProjectName(Boolean ispass, String teacher, String projectname){
        Tea_Experiment teaExperiment = teaExperimentReposity.findExperimentByIspassAndTeacherAndProjectName(ispass, teacher, projectname);
        return teaExperiment;
    }

    public List<Tea_Experiment> findAll(){
        List<Tea_Experiment> teaExperimentList =teaExperimentReposity.findAll();
        return teaExperimentList;
    }

    public void updateIspassById(Integer id){
        Tea_Experiment teaExperiment =teaExperimentReposity.findExperimentById(id);
        teaExperiment.setIsPass(true);
        teaExperimentReposity.saveAndFlush(teaExperiment);
    }

}
