package whut.zy1302.database.task.controller;


import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import whut.zy1302.database.task.domain.*;
import whut.zy1302.database.task.service.StuExperimentService;
import whut.zy1302.database.task.service.SubmitExperimentService;
import whut.zy1302.database.task.service.TeaExperimentService;
import whut.zy1302.database.task.service.TeacherService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.*;
import java.util.*;

/**
 * Created by yang on 2015/12/26.
 */
@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StuExperimentService stuExperimentService;
    @Autowired
    TeacherService teacherService;
    @Autowired
    SubmitExperimentService submitExperimentService;
    @Autowired
    TeaExperimentService teaExperimentService;

    //查看课表
    @RequestMapping("/usualclasses")
    public String usualclasses(){
        return "/frontpage/student/student_job_usualclasses";
    }

    // 查看实验课表
    @RequestMapping("/classes")
    public String a(HttpSession session,Model model){
        Student student=(Student)session.getAttribute("student");
        List<Stu_experiment> stuexperimentList = stuExperimentService.findExperimentByStudentName(student.getName());
//        for(int i=0;i<7;i++){
//            for(int j=0;i<4;j++){
//                model.addAttribute("stuexperiment"+i+j,"");
//            }
//        }



        int n=0,m=0;
        String isPass;
        for (Stu_experiment stuexperiment : stuexperimentList){

            if(stuexperiment.getIsPass().equals(false)){
                isPass="未审核";
            }else {
                isPass="已审核";
            }

            if(stuexperiment.getTime2().equals("一")){n=0;};
            if(stuexperiment.getTime2().equals("二")){n=1;};
            if(stuexperiment.getTime2().equals("三")){n=2;};
            if(stuexperiment.getTime2().equals("四")){n=3;};
            if(stuexperiment.getTime2().equals("五")){n=4;};
            if(stuexperiment.getTime2().equals("六")){n=5;};
            if(stuexperiment.getTime2().equals("日")){n=6;};

            if(stuexperiment.getTime3().equals("一二")){m=0;};
            if(stuexperiment.getTime3().equals("三四")){m=1;};
            if(stuexperiment.getTime3().equals("五六")){m=2;};
            if(stuexperiment.getTime3().equals("七八")){m=3;};

            model.addAttribute("experiment"+n+m, stuexperiment.getName()+"(实验老师"+stuexperiment.getTeacher()+isPass+")");
        }

        return "frontpage/student/student_job_classes";
    }

    //    实验项目预约页面
    @RequestMapping("/project")
    public String b(Model model){
        List<Tea_Experiment> teaExperimentList=teaExperimentService.findExperimentByIspass(true);
        model.addAttribute("teaExperimentList",teaExperimentList);
        return "frontpage/student/student_job_project";
    }

    //实验项目预约
    @RequestMapping("/project/order")
    public String g(@RequestParam(value = "id")Integer id,
                    Model model){
        Tea_Experiment teaExperiment=teaExperimentService.findExperimentById(id);
        model.addAttribute("teaExperiment",teaExperiment);
        return "/frontpage/student/student_job_project_order";
    }

//    @ResponseBody
//    @RequestMapping("/project/findteacher")
//    public Map<String,String> findteacher(@RequestParam(value = "projectname",required = true)String projectname){
//        Map map=new HashMap();
//        List<Tea_experiment> teaExperimentList=teaExperimentService.findExperimentByIspassAndProjectName(true,projectname);
//        map.put("size",teaExperimentList.size());
//
//        for(int i=0;i<teaExperimentList.size();i++){
//            System.out.println(teaExperimentList.get(i).getTeacher());
//            map.put("teaE"+i,teaExperimentList.get(i).getTeacher());
//        }
//        return map;
//    }

    //    创建实验预约项目
    @RequestMapping("/project/submit")
    public String project_submit(@RequestParam(value = "projectname",required = false)String projectname,
                                 @RequestParam(value = "time1",required = false)String time1,
                                 @RequestParam(value = "time2",required = false)String time2,
                                 @RequestParam(value = "time3",required = false)String time3,
                                 @RequestParam(value = "projectteacher",required = false)String projectteacher,
                                 HttpSession session){
        String time="第"+time1+"周"+" "+"周"+time2+" 第"+time3+"节";
        Student student=(Student)session.getAttribute("student");
        System.out.println(student.getName());
        Stu_experiment stuexperiment =new Stu_experiment(projectname,time,time1,time2,time3,projectteacher,student.getName());
        stuExperimentService.createExperiment(stuexperiment);
        return "/frontpage/student/project_successful";

    }


    //实验教学
    @RequestMapping("/teach")
    public String teach(Model model,HttpSession session){
        Student student=(Student)session.getAttribute("student");
        List<Stu_experiment> stuexperimentList =stuExperimentService.findExperimentByIspassAndStudentName(true,student.getName());
        model.addAttribute("stuexperimentList", stuexperimentList);
        return "/frontpage/student/student_job_teach";
    }

    @RequestMapping("/teach/look")
    public String lookexperiment(@RequestParam(value = "id")Integer id,
                                 Model model){
        Stu_experiment stuExperiment=stuExperimentService.findExperimentById(id);
        System.out.println(stuExperiment.getName()+" "+stuExperiment.getTeacher()+"------");
        Tea_Experiment teaExperiment=teaExperimentService.findExperimentByIspassAndTeacherAndProjectName(true, stuExperiment.getTeacher(), stuExperiment.getName());
        model.addAttribute("teaExperiment",teaExperiment);
        return "/frontpage/student/student_job_teach_real";
    }

//    @ResponseBody
//    @RequestMapping("/teach/findAll")
//    public Map<String,String> findAll(@RequestParam(value = "projectname",required = true)String projectname,
//                                      @RequestParam(value = "teacher",required = true)String teacher){
//        Map map=new HashMap();
//        teaExperimentService.
//
//    }

    //    实验实践
    @RequestMapping("/practice")
    public String c(Model model,HttpSession session){

        Student student=(Student)session.getAttribute("student");
        model.addAttribute("student", student.getName());

        //      查找那些已通过审核的实验项目
        List<Stu_experiment> stuexperimentList = stuExperimentService.findExperimentByIspassAndStudentName(true,student.getName());
        model.addAttribute("stuexperimentList", stuexperimentList);
        return "frontpage/student/student_job_practice";
    }

    @ResponseBody
    @RequestMapping("/practice/findtimeandteacher")
    public Map<String,String> findTimeAndTeacherAtPractice(@RequestParam(value = "projectname",required = true)String projectname,
                                                           HttpSession session){
        Map map=new HashMap();
        Student student=(Student)session.getAttribute("student");
        //      查找那些已通过审核的实验项目
        Stu_experiment stuexperiment = stuExperimentService.findExperimentByIspassAndStudentNameAndProjectName(true, student.getName(), projectname);
        map.put("time", stuexperiment.getTime());
        map.put("teacher", stuexperiment.getTeacher());
        return map;
    }

    //    实验实践提交
    @RequestMapping("/submit/practice")
    public String submitExperimentToTeacher(@RequestParam(value = "name",required = false)String name,
                                            @RequestParam(value = "experimenter",required = false)String experimenter,
                                            @RequestParam(value = "teacher",required = false)String teacher,
                                            @RequestParam(value = "experimenttime",required = false)String experimenttime,
                                            @RequestParam(value = "context",required = false)String context,
                                            @RequestParam(value = "principle",required = false)String principle,
                                            @RequestParam(value = "procedure",required = false)String procedure,
                                            @RequestParam(value = "equipment",required = false)String equipment,
                                            @RequestParam(value = "debug",required = false)String debug,
                                            @RequestParam(value = "resultofexperiment",required = false)String resultofexperiment,
                                            @RequestParam(value = "summary",required = false)String summary,
                                            Model model){
        System.out.println(name+" "+experimenter+teacher+experimenttime+context+principle+procedure+equipment+debug+resultofexperiment+summary);
        Submit_experiment submitExperiment=new Submit_experiment(name,experimenter,teacher,experimenttime,context,principle,procedure,equipment,debug,resultofexperiment,summary);
        submitExperimentService.createExperiment(submitExperiment);
        model.addAttribute("teacher", teacher);
        return "/frontpage/student/practice_submit_successful";
    }
    //    数据提交页面
    @RequestMapping("/number")
    public String d(Model model,HttpSession session){
        Student student=(Student)session.getAttribute("student");
        model.addAttribute("student", student.getName());

        //      查找那些已通过审核的实验项目
        List<Stu_experiment> stuexperimentList = stuExperimentService.findExperimentByIspassAndStudentName(true,student.getName());
        model.addAttribute("stuexperimentList", stuexperimentList);
        return "frontpage/student/student_job_number";
    }

    //    实验数据提交,使用springmvc集成的多文件上传，不使用字节流方式
    @RequestMapping("/submit/numberfile")
    public String e(@RequestParam(value = "experimentName",required = false)String experimentName,
                    @RequestParam(value = "teacher",required = false)String teacher,
                    Model model,HttpSession session,
                    HttpServletRequest request,HttpServletResponse response)throws IOException,IllegalStateException{

        Student student=(Student)session.getAttribute("student");
        Submit_experiment submitExperiment=submitExperimentService.findExperimentByNameAndTeacherAndExperimenter(experimentName,teacher,student.getName());

        String[] pic=new String[]{"---","---","---"};
        int i=0;

        //创建一个通用的多部分解析器
        CommonsMultipartResolver multipartResolver=new CommonsMultipartResolver(request.getSession().getServletContext());
        //判断request是否有文件上传，即多部分请求
        if (multipartResolver.isMultipart(request)){
            //转换成多部分request
            MultipartHttpServletRequest multiRequest=(MultipartHttpServletRequest)(request);
            //取得request中的所有文件名
            Iterator<String> iterator=multiRequest.getFileNames();


            while (iterator.hasNext()){
                //记录上传过程起始时的时间，用来计算上传时间
                int pre=(int)System.currentTimeMillis();

                //取得上传文件
                MultipartFile file=multiRequest.getFile(iterator.next());

                if (file!=null){
                    //取得当前上传文件的文件名称
                    String myFileName=file.getOriginalFilename();
                    //如果名称不为"" ,说明该文件存在，否则说明该文件不存在
                    if (myFileName.trim()!=""){
                        System.out.println(myFileName);
                        //重命名上传后的文件名
                        String fileName="/uploadfiles/student/"+submitExperiment.getId()+"/"+file.getOriginalFilename();
                        //定义上传路径
                        String path=request.getSession().getServletContext().getRealPath(fileName);
//                        String path = "D:/" + fileName;
                        pic[i]=fileName;
                        System.out.println(pic[i]+" "+i);
                        File localFile=new File(path);

                        FileUtils.copyInputStreamToFile(file.getInputStream(), localFile);//这个方法写入可以①
//                        file.transferTo(localFile);//②这个方法也对，原因已找出来，throw错误不全，刚才只throw IOException,还有IllegalStateException
                    }
                }
                i=i+1;
                //记录上传该文件后的时间
                int finaltime=(int)System.currentTimeMillis();
                System.out.println(finaltime-pre);
            }
        }
        submitExperimentService.update(experimentName,teacher,student.getName(),pic[0],pic[1],pic[2]);

        System.out.println(submitExperiment.getName()+"+++++");
        //这个对耶
//        List<Submit_experiment> submitExperiments=submitExperimentService.findAll();
//        for (Submit_experiment submitExperiment:submitExperiments){
//            System.out.println(submitExperiment.getName());
//        }
        model.addAttribute("teacher", teacher);
        return "/frontpage/student/submit_number";
    }






    //    实验数据提交,使用使用字节流方式
    @RequestMapping("/submit/numberfile2")
    public String f(@RequestParam(value = "experimentName",required = false)String experimentName,
                    @RequestParam(value = "teacher",required = false)String teacher,
                    @RequestParam(value = "file")CommonsMultipartFile[] files,
                    Model model,HttpSession session,
                    HttpServletRequest request,HttpServletResponse response){

        Student student=(Student)session.getAttribute("student");
//        SubmitExperiment submitExperiment=submitExperimentService.findSubmitExperimentByExperimentNameAndTeacherAndExperimenter(experimentName, teacher, student.getName());

        for (int i=0;i<files.length;i++){
            System.out.println("fileName-------->"+files[i].getOriginalFilename());

            if(!files[i].isEmpty()){
                int pre=(int)System.currentTimeMillis();

                try {
                    //拿到输出流，同时重命名上传的文件
                    FileOutputStream os=new FileOutputStream("D:/"+new Date().getTime()+files[i].getOriginalFilename());
                    //拿到上传文件的输入流
                    InputStream in=files[i].getInputStream();
//                    FileInputStream in1=(FileInputStream)files[i].getInputStream();//这个方式是错误的，inputStream不能强制转为FileInputStream，不过可以直接把InputStream的赋给FileOutputStream

                    // 写的方式① ，以写字节的方式写文件,直接写
                    int b=0;
                    while ((b=in.read())!=-1){
                        os.write(b);
                    }
                    //写的方式② 分开写
                    byte[] bytes=new byte[8192];//每次读8K字节
                    int count=0;
                    while ((count=in.read(bytes))>0){
                        os.write(bytes,0,count);
                    }


                    os.flush();
                    os.close();
                    in.close();
                    int finaltime=(int)System.currentTimeMillis();
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println("上传出错");
                }
                //记录上传该文件后的时间
                int finaltime=(int)System.currentTimeMillis();
                System.out.println(finaltime-pre);
            }
        }
        model.addAttribute("teacher", teacher);
        return "/frontpage/student/submit_number";
    }
}
