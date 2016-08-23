package whut.zy1302.database.task.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by yang on 2016/1/2.
 */
@Entity
public class Submit_experiment {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String experimenter;
    private String teacher;
    private String experimenttime;
    private String context;
    private String theBasicPrincipleAndDesignOfE;//实验基本原理与设计
    private String experimentalProcedure;//实验步骤
    private String equipment;
    private String debug;
    private String resultofexperiment;
    private String summaryOfExperiment;
    private String path1;
    private String path2;
    private String path3;

    public Submit_experiment() {
    }

    public Submit_experiment(String name, String experimenter, String teacher, String experimenttime, String context, String theBasicPrincipleAndDesignOfE, String experimentalProcedure, String equipment, String debug, String resultofexperiment, String summaryOfExperiment) {
        this.name = name;
        this.experimenter = experimenter;
        this.teacher = teacher;
        this.experimenttime = experimenttime;
        this.context = context;
        this.theBasicPrincipleAndDesignOfE = theBasicPrincipleAndDesignOfE;
        this.experimentalProcedure = experimentalProcedure;
        this.equipment = equipment;
        this.debug = debug;
        this.resultofexperiment = resultofexperiment;
        this.summaryOfExperiment = summaryOfExperiment;
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

    public String getExperimenter() {
        return experimenter;
    }

    public void setExperimenter(String experimenter) {
        this.experimenter = experimenter;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getExperimenttime() {
        return experimenttime;
    }

    public void setExperimenttime(String experimenttime) {
        this.experimenttime = experimenttime;
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
        return experimentalProcedure;
    }

    public void setExperimentalProcedure(String experimentalProcedure) {
        this.experimentalProcedure = experimentalProcedure;
    }

    public String getEquipment() {
        return equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    public String getDebug() {
        return debug;
    }

    public void setDebug(String debug) {
        this.debug = debug;
    }

    public String getResultofexperiment() {
        return resultofexperiment;
    }

    public void setResultofexperiment(String resultofexperiment) {
        this.resultofexperiment = resultofexperiment;
    }

    public String getSummaryOfExperiment() {
        return summaryOfExperiment;
    }

    public void setSummaryOfExperiment(String summaryOfExperiment) {
        this.summaryOfExperiment = summaryOfExperiment;
    }

    public String getPath1() {
        return path1;
    }

    public void setPath1(String path1) {
        this.path1 = path1;
    }

    public String getPath2() {
        return path2;
    }

    public void setPath2(String path2) {
        this.path2 = path2;
    }

    public String getPath3() {
        return path3;
    }

    public void setPath3(String path3) {
        this.path3 = path3;
    }
}
