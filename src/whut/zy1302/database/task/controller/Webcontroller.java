package whut.zy1302.database.task.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import whut.zy1302.database.task.domain.Manager;
import whut.zy1302.database.task.domain.Pulish;
import whut.zy1302.database.task.domain.Student;
import whut.zy1302.database.task.domain.Teacher;
import whut.zy1302.database.task.service.ManagerService;
import whut.zy1302.database.task.service.PulishService;
import whut.zy1302.database.task.service.StudentService;
import whut.zy1302.database.task.service.TeacherService;

import javax.servlet.http.HttpSession;

/**
 * Created by yang on 2015/12/26.
 */
@Controller
public class Webcontroller {

    @Autowired
    StudentService studentService;
    @Autowired
    TeacherService teacherService;
    @Autowired
    ManagerService managerService;
    @Autowired
    PulishService pulishService;

    @RequestMapping("/")
    public String index(){
        return "/frontpage/index";
    }

    @RequestMapping("/frontpage/index")
    public String frontpageIndex(){
        return "/frontpage/index";
    }

    @RequestMapping("/frontpage/register")
    public String frontpageregister(){
        return "/frontpage/register";
    }

    @RequestMapping("/background/register")
    public String backgroundregister(@RequestParam(value = "category",required = false)String category,
                                   @RequestParam(value = "username",required = false)String username,
                                   @RequestParam(value = "password",required = false)String password,
                                   Model model){
        System.out.println(category+" "+username+" "+password);
        if (category.equals("学生")){
            Student student=new Student(username,password);

            studentService.createStudent(student);
        }
        else if(category.equals("教师")){
            Teacher teacher=new Teacher(username,password);
            teacherService.createTeacher(teacher);
        }
        else if(category.equals("实验室管理员")){
            Manager manager=new Manager(username,password);
            managerService.createManager(manager);
        }
        return "/frontpage/successful_register";
    }




    @RequestMapping("/login")
    public String login(@RequestParam(value = "category",required = false)String category,
                        @RequestParam(value = "username",required = false)String username,
                        @RequestParam(value = "password",required = false)String password,
                        Model model,HttpSession session){
        System.out.println(category+" "+username+" "+password);

//        三者都不为空
        if (category!=null&&!"".equals(category)&&username!=null&&!"".equals(username)&&password!=null&&!"".equals(password)){
            if (category.equals("学生")){
                Student student=studentService.findoneByUsernameAndPassword(username, password);
                if (student!=null&&!"".equals(student)){
                    Pulish pulish=pulishService.findPulish();
                    System.out.println(pulish.getName()+"--------------");

                    model.addAttribute("pulish",pulish);
                    model.addAttribute("student",student);
                    session.setAttribute("student", student);
                    return "frontpage/student/student_job";
                }else {
                    return "/frontpage/login_error";
                }
            }
            else if(category.equals("教师")){
                Teacher teacher=teacherService.findoneByUsernameAndPassword(username,password);
                if (teacher!=null&&!"".equals(teacher)){
                    session.setAttribute("teacher", teacher);
                    model.addAttribute("teacher",teacher);
                    return "frontpage/teacher/teacher_job";
                }else {
                    return "/frontpage/login_error";
                }
            }
            else if(category.equals("实验室管理员")){
                Manager manager=managerService.findoneByUsernameAndPassword(username,password);
                if (manager!=null&&!"".equals(manager)){
                    session.setAttribute("manager", manager);
                    model.addAttribute("manager",manager);
                    return "frontpage/manager/manager_job";
                }else {
                    return "/frontpage/login_error";
                }
            }

        }else {
//            三个中至少有一个为空
            return "redirect:";
        }

        return null;
    }


}
