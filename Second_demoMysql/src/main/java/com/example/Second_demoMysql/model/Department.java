package com.example.Second_demoMysql.model;

import javax.persistence.*;

@Entity(name = "Department")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "Department_ID")
    private Long Department_ID;

    @Column(name = "Name")
    private String Name;

    @Column(name = "Description_text")
    private String Description_text;

    @Column(name = "is_Active")
    private boolean is_Active;

    public Department() {
    }


    public long getDepartment_ID() {
        return Department_ID;
    }

    public void setDepartment_ID(Long department_ID) {
        Department_ID = department_ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription_text() {
        return Description_text;
    }

    public void setDescription_text(String description_text) {
        Description_text = description_text;
    }

    public boolean isIs_Active() {
        return is_Active;
    }

    public void setIs_Active(boolean is_Active) {
        this.is_Active = is_Active;
    }
}
