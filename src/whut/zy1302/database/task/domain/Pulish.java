package whut.zy1302.database.task.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by yang on 2016/1/1.
 */
@Entity
public class Pulish {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String context;

    public Pulish() {
    }

    public Pulish(String name, String context) {
        this.name = name;
        this.context = context;
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

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }
}
