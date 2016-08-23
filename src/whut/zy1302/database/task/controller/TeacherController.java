package whut.zy1302.database.task.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import whut.zy1302.database.task.domain.*;
import whut.zy1302.database.task.service.PulishService;
import whut.zy1302.database.task.service.StuExperimentService;
import whut.zy1302.database.task.service.SubmitExperimentService;
import whut.zy1302.database.task.service.TeaExperimentService;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by yang on 2015/12/27.
 */
@Controller
@RequestMapping("/teacher")
public class TeacherController {

    @Autowired
    StuExperimentService stuExperimentService;
    @Autowired
    PulishService pulishService;
    @Autowired
    TeaExperimentService teaExperimentService;
    @Autowired
    SubmitExperimentService submitExperimentService;

    @RequestMapping("/pulish")
    public String a(){
        return "frontpage/teacher/teacher_job_pulish";
    }

    @RequestMapping("/pulish/submit")
    public String pulishsubmit(@RequestParam(value = "name")String name,
                               @RequestParam(value = "context")String context){
        Pulish pulish=new Pulish(name,context);
        pulishService.createPulish(pulish);
       return "/frontpage/teacher/submit_successful";
    }

    @RequestMapping("/teach")
    public String teach(Model model,HttpSession session){
        Teacher teacher=(Teacher)session.getAttribute("teacher");
        List<Tea_Experiment> teaExperimentList=teaExperimentService.findExperimentByIspassAndTeacher(true, teacher.getName());
        model.addAttribute("teaExperimentList", teaExperimentList);
        return "frontpage/teacher/teacher_job_teach";
    }

    @RequestMapping("/teach/submit")
    public String teachsubmit(@RequestParam(value = "projectname")String projectname,
                              @RequestParam(value = "context")String context,
                              @RequestParam(value = "principle")String principle,
                              @RequestParam(value = "procedure")String procedure,
                              @RequestParam(value = "equipment")String equipment,
                              HttpSession session){
        Teacher teacher=(Teacher)session.getAttribute("teacher");
        teaExperimentService.update(projectname, teacher.getName(), context, principle, procedure, equipment);
        return "/frontpage/teacher/submit_successful";
    }

    @RequestMapping("/resources")
    public String c(Model model,HttpSession session){
        Teacher teacher=(Teacher)session.getAttribute("teacher");
        List<Stu_experiment> stuExperimentList=stuExperimentService.findExperimentByTeacher( teacher.getName());
        model.addAttribute("stuExperimentLis", stuExperimentList);
        return "frontpage/teacher/teacher_job_resources";
    }

    @RequestMapping("/resources/agree")
    public String agree(@RequestParam(value = "id")Integer id){
        stuExperimentService.updateIspassById(id);
        return "/frontpage/teacher/teacher_job_agree";
    }

    @RequestMapping("/arrange")
    public String d(Model model,HttpSession session){
        Teacher teacher=(Teacher)session.getAttribute("teacher");
        List<Tea_Experiment> teaExperimentList = teaExperimentService.findExperimentByTeacher(teacher.getName());

        int n=0,m=0;
        String isPass;
        for (Tea_Experiment teaExperiment : teaExperimentList){

            if(teaExperiment.getIsPass().equals(false)){
                isPass="未审核";
            }else {
                isPass="已审核";
            }

            if(teaExperiment.getTime2().equals("一")){n=0;};
            if(teaExperiment.getTime2().equals("二")){n=1;};
            if(teaExperiment.getTime2().equals("三")){n=2;};
            if(teaExperiment.getTime2().equals("四")){n=3;};
            if(teaExperiment.getTime2().equals("五")){n=4;};
            if(teaExperiment.getTime2().equals("六")){n=5;};
            if(teaExperiment.getTime2().equals("日")){n=6;};

            if(teaExperiment.getTime3().equals("一二")){m=0;};
            if(teaExperiment.getTime3().equals("三四")){m=1;};
            if(teaExperiment.getTime3().equals("五六")){m=2;};
            if(teaExperiment.getTime3().equals("七八")){m=3;};

            model.addAttribute("experiment"+n+m, teaExperiment.getName()+"(实验室管理员"+isPass+")");
        }

        return "frontpage/teacher/teacher_job_arrange";
    }

    @RequestMapping("/file")
    public String e(Model model){
        List<Submit_experiment> submitExperiments=submitExperimentService.findAll();
        model.addAttribute("submitExperiments",submitExperiments);
        return "frontpage/teacher/teacher_job_file";
    }

    @RequestMapping("/f")
    public String f(){
        return "frontpage/teacher/teacher_job_f";
    }


    @RequestMapping("/project")
    public String g(HttpSession session, Model model){
        Teacher teacher=(Teacher)session.getAttribute("teacher");
        model.addAttribute("teacher",teacher.getName());
        return "frontpage/teacher/teacher_job_project";
    }

    @RequestMapping("/project/submit")
    public String projectsubmit(@RequestParam(value = "projectname",required = false)String projectname,
                                @RequestParam(value = "time1",required = false)String time1,
                                @RequestParam(value = "time2",required = false)String time2,
                                @RequestParam(value = "time3",required = false)String time3,
                                @RequestParam(value = "projectteacher",required = false)String projectteacher,
                                @RequestParam(value = "low_value_product",required = false)String low_value_product,
                                @RequestParam(value = "lab_equipment",required = false)String lab_equipment){
        String time="第"+time1+"周"+" "+"周"+time2+" 第"+time3+"节";
        Tea_Experiment teaExperiment=new Tea_Experiment(projectname,time,time1,time2,time3,projectteacher,low_value_product,lab_equipment);
        teaExperimentService.createExperiment(teaExperiment);
        return "/frontpage/teacher/submit_successful";
    }



}
