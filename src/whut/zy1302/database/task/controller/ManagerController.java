package whut.zy1302.database.task.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import whut.zy1302.database.task.domain.Lab_equipment;
import whut.zy1302.database.task.domain.Low_value_product;
import whut.zy1302.database.task.domain.Manager;
import whut.zy1302.database.task.domain.Tea_Experiment;
import whut.zy1302.database.task.service.Lab_equipmentService;
import whut.zy1302.database.task.service.Low_value_productService;
import whut.zy1302.database.task.service.TeaExperimentService;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by yang on 2015/12/27.
 */
@Controller
@RequestMapping("/manage")
public class ManagerController {

    @Autowired
    TeaExperimentService teaExperimentService;
    @Autowired
    Low_value_productService lowValueProductService;
    @Autowired
    Lab_equipmentService lab_equipmentService;

    @RequestMapping("/verify")
    public String verify(Model model,HttpSession session){
        Manager manager=(Manager)session.getAttribute("manager");
        List<Tea_Experiment> teaExperimentList =teaExperimentService.findAll();
        model.addAttribute("teaExperimentList",teaExperimentList);
        return "frontpage/manager/manager_job_verify";
    }

    @RequestMapping("/verify/agree")
    public String agree(@RequestParam(value = "id")Integer id){
        teaExperimentService.updateIspassById(id);
        return "/frontpage/manager/manager_job_agree";
    }

    @RequestMapping("/add")
    public String b(){
        return "/frontpage/manager/manager_job_add";
    }

    @RequestMapping("/add/submit")
    public String add_subimt(@RequestParam(value = "name",required = false)String name,
                             @RequestParam(value = "price",required = false)String price,
                             @RequestParam(value = "num",required = false)String num,
                             @RequestParam(value = "time",required = false)String time,
                             @RequestParam(value = "function",required = false)String function){

        Low_value_product lowValueProduct=new Low_value_product(name,price,num,time,function);
        lowValueProductService.createLow_value_product(lowValueProduct);
        return "/frontpage/manager/submit_successful";
    }

    @RequestMapping("/repair")
    public String c(){
        return "/frontpage/manager/manager_job_repair";
    }

    @RequestMapping("/repair/submit")
    public String repair_subimt(@RequestParam(value = "name",required = false)String name,
                             @RequestParam(value = "version",required = false)String version,
                             @RequestParam(value = "point",required = false)String point,
                             @RequestParam(value = "num",required = false)String num){

        Lab_equipment labEquipment=new Lab_equipment(name,version,point,num);
        lab_equipmentService.createLab_equipment(labEquipment);
        return "/frontpage/manager/submit_successful";
    }

    @RequestMapping("/classes")
    public String d(Model model){

        List<Tea_Experiment> teaExperimentList = teaExperimentService.findExperimentByIspass(true);

        int n=0,m=0;
        String isPass;
        for (Tea_Experiment teaExperiment : teaExperimentList){

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

            model.addAttribute("experiment"+n+m, teaExperiment.getName()+"(实验老师"+teaExperiment.getTeacher()+")");
        }

        return "/frontpage/manager/manager_job_classes";
    }
    @RequestMapping("/counts")
    public String e(Model model){
        List<Low_value_product> lowValueProducts=lowValueProductService.findAll();
        model.addAttribute("lowValueProducts", lowValueProducts);

        List<Lab_equipment> lab_equipments=lab_equipmentService.findAll();
        model.addAttribute("lab_equipments",lab_equipments);
        return "/frontpage/manager/manager_job_counts";
    }



}
