package whut.zy1302.database.task.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by yang on 2015/12/27.
 */
@Entity
public class Stu_experiment {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String time;//全部时间
    private String time1;//第几周
    private String time2;//周几
    private String time3;//哪节
    private String teacher;
    private String student;
    private Boolean isPass=false;//默认未审核,老师审核


    public Stu_experiment() {
    }

    public Stu_experiment(String name, String time, String time1, String time2, String time3, String teacher, String student) {
        this.name = name;
        this.time = time;
        this.time1 = time1;
        this.time2 = time2;
        this.time3 = time3;
        this.teacher = teacher;
        this.student = student;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getTime1() {
        return time1;
    }

    public void setTime1(String time1) {
        this.time1 = time1;
    }

    public String getTime2() {
        return time2;
    }

    public void setTime2(String time2) {
        this.time2 = time2;
    }

    public String getTime3() {
        return time3;
    }

    public void setTime3(String time3) {
        this.time3 = time3;
    }

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public Boolean getIsPass() {
        return isPass;
    }

    public void setIsPass(Boolean isPass) {
        this.isPass = isPass;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }


}
