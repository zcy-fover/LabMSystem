package whut.zy1302.database.task.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import whut.zy1302.database.task.domain.Submit_experiment;

/**
 * Created by yang on 2016/1/2.
 */
public interface SubmitExperimentReposity extends JpaRepository<Submit_experiment,String> {

    @Query("select submitExperiment from Submit_experiment  submitExperiment where lower(submitExperiment.id)=lower(:id) ")
    public Submit_experiment findExperimentById(@Param("id") Integer id);

    @Query("select submitExperiment from Submit_experiment  submitExperiment where lower(submitExperiment.name)=lower(:name) and lower(submitExperiment.teacher)=lower(:teacher) and lower(submitExperiment.experimenter)=lower(:experimenter)")
    public Submit_experiment findExperimentByNameAndTeacherAndExperimenter(@Param("name") String name, @Param("teacher") String teacher, @Param("experimenter") String experimenter);
}
