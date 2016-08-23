package whut.zy1302.database.task.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by yang on 2015/12/26.
 */
@Entity
@Table(name = "lab_equipment")
public class Lab_equipment {
    private Integer id;
    private String name;
    private String version;
    private String point;
    private String num;

    public Lab_equipment() {
    }

    public Lab_equipment(String name, String version, String point, String num) {
        this.name = name;
        this.version = version;
        this.point = point;
        this.num = num;
    }

    @Id
    @GeneratedValue
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

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getPoint() {
        return point;
    }

    public void setPoint(String point) {
        this.point = point;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }
}
