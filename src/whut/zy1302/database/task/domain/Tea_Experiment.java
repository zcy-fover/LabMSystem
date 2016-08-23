package whut.zy1302.database.task.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by yang on 2016/1/1.
 */
@Entity
public class Tea_Experiment {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String time;//全部时间
    private String time1;//第几周
    private String time2;//周几
    private String time3;//哪节
    private String teacher;
    private Boolean isPass=false;//默认未审核，实验室管理员审核
    private String low_value_product;
    private String lab_equipment;
    private String context;
    private String theBasicPrincipleAndDesignOfE;//实验基本原理与设计
    private String ExperimentalProcedure;//实验步骤
    private String equipment;//主要实验工具

    public Tea_Experiment() {
    }

    public Tea_Experiment(String name, String time, String time1, String time2, String time3, String teacher, String low_value_product, String lab_equipment) {
        this.name = name;
        this.time = time;
        this.time1 = time1;
        this.time2 = time2;
        this.time3 = time3;
        this.teacher = teacher;
        this.low_value_product = low_value_product;
        this.lab_equipment = lab_equipment;
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

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
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

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public Boolean getIsPass() {
        return isPass;
    }

    public void setIsPass(Boolean isPass) {
        this.isPass = isPass;
    }

    public String getLow_value_product() {
        return low_value_product;
    }

    public void setLow_value_product(String low_value_product) {
        this.low_value_product = low_value_product;
    }

    public String getLab_equipment() {
        return lab_equipment;
    }

    public void setLab_equipment(String lab_equipment) {
        this.lab_equipment = lab_equipment;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getTheBasicPrincipleAndDesignOfE() {
        return theBasicPrincipleAndDesignOfE;
    }

    public void setTheBasicPrincipleAndDesignOfE(String theBasicPrincipleAndDesignOfE) {
        this.theBasicPrincipleAndDesignOfE = theBasicPrincipleAndDesignOfE;
    }

    public String getExperimentalProcedure() {
        return ExperimentalProcedure;
    }

    public void setExperimentalProcedure(String experimentalProcedure) {
        ExperimentalProcedure = experimentalProcedure;
    }

    public String getEquipment() {
        return equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }
}
