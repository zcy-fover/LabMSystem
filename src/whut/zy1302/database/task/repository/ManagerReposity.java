package whut.zy1302.database.task.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import whut.zy1302.database.task.domain.Manager;


/**
 * Created by yang on 2015/12/26.
 */
public interface ManagerReposity extends JpaRepository<Manager,String>,JpaSpecificationExecutor<Manager>{

    @Query("select manager from Manager manager where lower(manager.name)=lower(:name) and lower(manager.password)=lower(:password)")
    public Manager findoneByUsernameAndPassword(@Param("name") String name, @Param("password") String password);
}

