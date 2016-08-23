package whut.zy1302.database.task.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import whut.zy1302.database.task.domain.Teacher;

/**
 * Created by yang on 2015/12/26.
 */
public interface TeacherReposity extends JpaRepository<Teacher,String>,JpaSpecificationExecutor<Teacher>{

    @Query("select teacher from Teacher teacher where lower(teacher.name)=lower(:name) and lower(teacher.password)=lower(:password)")
    public Teacher findoneByUsernameAndPassword(@Param("name") String name, @Param("password") String password);
}
