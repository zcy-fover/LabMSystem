package whut.zy1302.database.task.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import whut.zy1302.database.task.domain.Lab_equipment;
import whut.zy1302.database.task.repository.Lab_equipmentReposity;

import java.util.List;

/**
 * Created by yang on 2015/12/26.
 */
@Service
@Transactional
public class Lab_equipmentService {

    @Autowired
    private Lab_equipmentReposity lab_equipmentReposity;

    public void createLab_equipment(Lab_equipment lab_equipment){
        lab_equipmentReposity.save(lab_equipment);
    }

    public List<Lab_equipment> findAll(){
        List<Lab_equipment> lab_equipments=lab_equipmentReposity.findAll();
        return lab_equipments;
    }
}
