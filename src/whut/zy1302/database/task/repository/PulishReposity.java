package whut.zy1302.database.task.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import whut.zy1302.database.task.domain.Pulish;

/**
 * Created by yang on 2016/1/1.
 */
public interface PulishReposity extends JpaRepository<Pulish,String>,JpaSpecificationExecutor<Pulish> {

    @Query("select pulish from Pulish pulish where id=(select max(p.id) from Pulish p)")
    public Pulish findLastPulish();
}
