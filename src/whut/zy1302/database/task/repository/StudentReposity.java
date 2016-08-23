package whut.zy1302.database.task.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import whut.zy1302.database.task.domain.Student;

/**
 * Created by yang on 2015/12/26.
 */
public interface StudentReposity extends JpaRepository<Student,String>,JpaSpecificationExecutor<Student>{

    @Query("select student from Student student where lower(student.name)=lower(:name) and lower(student.password)=lower(:password)")
    public Student findoneByUsernameAndPassword(@Param("name") String name, @Param("password") String password);
}
