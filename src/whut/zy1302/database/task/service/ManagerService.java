package whut.zy1302.database.task.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import whut.zy1302.database.task.domain.Manager;
import whut.zy1302.database.task.repository.ManagerReposity;

/**
 * Created by yang on 2015/12/26.
 */
@Service
@Transactional
public class ManagerService {

    @Autowired
    private ManagerReposity managerReposity;

    public void createManager(Manager manager){
        managerReposity.save(manager);
    }

    public Manager findoneByUsernameAndPassword(String name,String password){
        Manager manager=managerReposity.findoneByUsernameAndPassword(name, password);
        return manager;
    }
}
