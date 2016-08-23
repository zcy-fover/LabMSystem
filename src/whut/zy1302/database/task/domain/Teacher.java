package whut.zy1302.database.task.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by yang on 2015/12/26.
 */
@Entity
@Table(name = "teacher")
public class Teacher {

    private Integer id;
    private String name;
    private String password;

    public Teacher() {
    }

    public Teacher(String name, String password) {
        this.name = name;
        this.password = password;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
