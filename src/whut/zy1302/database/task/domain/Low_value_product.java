package whut.zy1302.database.task.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by yang on 2015/12/26.
 */
@Entity
@Table(name = "low_value_product")
public class Low_value_product {
    private Integer id;
    private String name;
    private String price;
    private String storenum;
    private String time;
    private String funtion;
    private Integer badnum=0;

    public Low_value_product() {
    }

    public Low_value_product(String name, String price, String storenum, String time, String funtion) {
        this.name = name;
        this.price = price;
        this.storenum = storenum;
        this.time = time;
        this.funtion = funtion;
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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getStorenum() {
        return storenum;
    }

    public void setStorenum(String storenum) {
        this.storenum = storenum;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Integer getBadnum() {
        return badnum;
    }

    public void setBadnum(Integer badnum) {
        this.badnum = badnum;
    }

    public String getFuntion() {
        return funtion;
    }

    public void setFuntion(String funtion) {
        this.funtion = funtion;
    }
}
