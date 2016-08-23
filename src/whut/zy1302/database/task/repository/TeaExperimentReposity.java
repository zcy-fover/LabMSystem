package whut.zy1302.database.task.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import whut.zy1302.database.task.domain.Tea_Experiment;

import java.util.List;

/**
 * Created by yang on 2015/12/27.
 */
public interface TeaExperimentReposity extends JpaRepository<Tea_Experiment,String>,JpaSpecificationExecutor<Tea_Experiment>{

    @Query("select teaexperiment from Tea_Experiment teaexperiment where lower(teaexperiment.teacher)=lower(:teacher) ")
    public List<Tea_Experiment> findExperimentByTeacher(@Param("teacher") String teacher);

    @Query("select teaexperiment from Tea_Experiment teaexperiment where lower(teaexperiment.isPass)=lower(:ispass)")
    public List<Tea_Experiment> findExperimentByIspass(@Param("ispass") Boolean ispass);

    @Query("select teaexperiment from Tea_Experiment teaexperiment where lower(teaexperiment.isPass)=lower(:ispass) and lower(teaexperiment.name)=lower(:name)")
    public List<Tea_Experiment> findExperimentByIspassAndProjectName(@Param("ispass") Boolean ispass, @Param("name") String name);

    @Query("select teaexperiment from Tea_Experiment teaexperiment where lower(teaexperiment.id)=lower(:id) ")
    public Tea_Experiment findExperimentById(@Param("id") Integer id);

    @Query("select teaexperiment from Tea_Experiment teaexperiment where lower(teaexperiment.isPass)=lower(:ispass) and lower(teaexperiment.teacher)=lower(:teacher) ")
    public List<Tea_Experiment> findExperimentByIspassAndTeacher(@Param("ispass") Boolean ispass, @Param("teacher") String teacher);

    @Query("select teaexperiment from Tea_Experiment teaexperiment where lower(teaexperiment.isPass)=lower(:ispass) and lower(teaexperiment.teacher)=lower(:teacher) and lower(teaexperiment.name)=lower(:name)")
    public Tea_Experiment findExperimentByIspassAndTeacherAndProjectName(@Param("ispass") Boolean ispass, @Param("teacher") String teacher, @Param("name") String name);

}
