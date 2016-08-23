package whut.zy1302.database.task.test;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import whut.zy1302.database.task.domain.Submit_experiment;
import whut.zy1302.database.task.service.SubmitExperimentService;

/**
 * Created by yang on 2015/12/25.
 */
public class maintest {

    @BeforeClass
    public static void setUpBeforeClass(){

    }

    @Test
    public void test(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("classpath:/applicationContext.xml");
        applicationContext.getBean("dataSource");
        System.out.println(applicationContext);
    }

    @Test
    public void findSubmitExperiment(){
        SubmitExperimentService submitExperimentService=new SubmitExperimentService();
//        SubmitExperiment submitExperiment=submitExperimentService.findSubmitExperimentByExperimentNameAndTeacherAndExperimenter("大学物理实验", "yang","yang");
//        Submit_experiment submitExperiment=submitExperimentService.findExperimentById(0);
//        List<Submit_experiment> submitExperiments=submitExperimentService.findAll();
//       System.out.println(submitExperiments.size());
        //报错，不知为什么
        Submit_experiment submitExperiment=new Submit_experiment("yang","yang","yang","yang","yang","yang","yang","yang","yang","yang","yang");

        submitExperimentService.createExperiment(submitExperiment);


    }
}
