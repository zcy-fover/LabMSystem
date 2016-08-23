package whut.zy1302.database.task.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import whut.zy1302.database.task.domain.Stu_experiment;

import java.util.List;

/**
 * Created by yang on 2015/12/27.
 */
public interface StuExperimentReposity extends JpaRepository<Stu_experiment,String>,JpaSpecificationExecutor<Stu_experiment>{

    @Query("select experiment from Stu_experiment experiment where lower(experiment.student)=lower(:student) ")
    public List<Stu_experiment> findExperimentByStudentName(@Param("student") String student);

    @Query("select experiment from Stu_experiment experiment where lower(experiment.isPass)=lower(:ispass) and lower(experiment.student)=lower(:student)")
    public List<Stu_experiment> findExperimentByIspassAndStudentName(@Param("ispass") Boolean ispass, @Param("student") String student);

    @Query("select experiment from Stu_experiment experiment where lower(experiment.isPass)=lower(:ispass) and lower(experiment.student)=lower(:student) and lower(experiment.name)=lower(:name)")
    public Stu_experiment findExperimentByIspassAndStudentNameAndProjectName(@Param("ispass") Boolean ispass, @Param("student") String student, @Param("name") String name);

    @Query("select experiment from Stu_experiment experiment where lower(experiment.id)=lower(:id) ")
    public Stu_experiment findExperimentById(@Param("id") Integer id);

    @Query("select experiment from Stu_experiment experiment where lower(experiment.teacher)=lower(:teacher)")
    public List<Stu_experiment> findExperimentByTeacher(@Param("teacher") String teacher);

}
