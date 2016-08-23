package whut.zy1302.database.task.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import whut.zy1302.database.task.domain.Low_value_product;
import whut.zy1302.database.task.repository.Low_value_productReposity;

import java.util.List;

/**
 * Created by yang on 2015/12/26.
 */
@Service
@Transactional
public class Low_value_productService {

    @Autowired
    private Low_value_productReposity low_value_productReposity;

    public void createLow_value_product(Low_value_product low_value_product){
        low_value_productReposity.save(low_value_product);
    }

    public List<Low_value_product> findAll(){
        List<Low_value_product> lowValueProducts=low_value_productReposity.findAll();
        return lowValueProducts;
    }
}
