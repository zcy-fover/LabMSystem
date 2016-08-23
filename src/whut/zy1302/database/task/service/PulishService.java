package whut.zy1302.database.task.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import whut.zy1302.database.task.domain.Pulish;
import whut.zy1302.database.task.repository.PulishReposity;

/**
 * Created by yang on 2016/1/1.
 */
@Service
public class PulishService {

    @Autowired
    PulishReposity pulishReposity;

    public void createPulish(Pulish pulish){
        pulishReposity.save(pulish);
    }

    public Pulish findPulish(){
        Pulish pulish=pulishReposity.findLastPulish();
        return pulish;
    }


}
