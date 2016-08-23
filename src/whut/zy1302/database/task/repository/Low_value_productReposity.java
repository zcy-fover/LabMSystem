package whut.zy1302.database.task.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import whut.zy1302.database.task.domain.Low_value_product;

/**
 * Created by yang on 2015/12/26.
 */
public interface Low_value_productReposity extends JpaRepository<Low_value_product,String>,JpaSpecificationExecutor<Low_value_product>{
}
