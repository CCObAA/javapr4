package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.*;
import java.sql.Date;

@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotEmpty(message = "Поле не должно быть пустым")
    @Size(min = 4,max = 30,message = "От 4 до 30 символов")
    private String  namepost;
    @NotNull
    @Min(value = 0, message = "Значение не должно быть меньше 0")
    @Max(value = 300000, message = "Значение не должно быть больше 300")
    private float salary;
    @NotNull
    private double maxsalary;
    private boolean paid;
    @NotNull
    private int countemploey;
    @NotNull
    private int views;

    public Post(double maxsalary, float salary, boolean paid, String namepost, int countemploey) {
        this.maxsalary = maxsalary;
        this.paid = paid;
        this.namepost = namepost;
        this.salary = salary;
        this.countemploey = countemploey;
    }

    public Post() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getMaxsalary() {
        return maxsalary;
    }

    public void setMaxsalary(double maxsalary) {
        this.maxsalary = maxsalary;
    }

    public boolean getPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public String getNamepost() {return namepost;}

    public void setNamepost(String namepost) {this.namepost = namepost;}

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public int getCountemploey() {
        return countemploey;
    }

    public void setCountemploey(int countemploey) {
        this.countemploey = countemploey;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }


}
