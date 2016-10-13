package com.ironyard.halloween.data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by Tom on 10/12/16.
 */
@Entity
public class Costume {

    private String name;
    private String category;
    private double cost;
    private Date date;
    private Integer count;


    // !!!****EVERY LIST NEEDS ITS OWN ANNOTATION*******!!!!!!!

    @OneToMany(cascade = CascadeType.ALL)
    private List<Props> props;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Clothing> clothing;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public List<Props> getProps() {
        return props;
    }

    public void setProps(List<Props> props) {
        this.props = props;
    }

    public List<Clothing> getClothing() {
        return clothing;
    }

    public void setClothing(List<Clothing> clothing) {
        this.clothing = clothing;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}