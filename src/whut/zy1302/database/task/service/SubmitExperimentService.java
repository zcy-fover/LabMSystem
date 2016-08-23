package whut.zy1302.database.task.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import whut.zy1302.database.task.domain.Submit_experiment;
import whut.zy1302.database.task.repository.SubmitExperimentReposity;

import java.util.List;

/**
 * Created by yang on 2016/1/2.
 */
@Service
public class SubmitExperimentService {

    @Autowired
    SubmitExperimentReposity submitExperimentReposity;

    public void createExperiment(Submit_experiment submitExperiment){
      submitExperimentReposity.save(submitExperiment);
    }

    public Submit_experiment findExperimentById(Integer id){
        Submit_experiment submitExperiment=submitExperimentReposity.findExperimentById(id);
        return submitExperiment;
    }

    public List<Submit_experiment> findAll(){
        List<Submit_experiment> submitExperiments=submitExperimentReposity.findAll();
        return submitExperiments;
    }

    public Submit_experiment findExperimentByNameAndTeacherAndExperimenter(String name,String teacher,String experimenter){
        Submit_experiment submitExperiment=submitExperimentReposity.findExperimentByNameAndTeacherAndExperimenter(name, teacher, experimenter);
        return submitExperiment;
    }

    public void update(String name,String teacher,String experimenter,String path1,String path2,String path3){
        Submit_experiment submitExperiment=submitExperimentReposity.findExperimentByNameAndTeacherAndExperimenter(name, teacher, experimenter);
        submitExperiment.setPath1(path1);
        submitExperiment.setPath2(path2);
        submitExperiment.setPath3(path3);
        submitExperimentReposity.saveAndFlush(submitExperiment);
    }
}
