package whut.zy1302.database.task.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import whut.zy1302.database.task.domain.Lab_equipment;

/**
 * Created by yang on 2015/12/26.
 */
public interface Lab_equipmentReposity extends JpaRepository<Lab_equipment,String>,JpaSpecificationExecutor<Lab_equipment>{
}
