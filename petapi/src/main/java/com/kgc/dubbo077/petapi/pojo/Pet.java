package com.kgc.dubbo077.petapi.pojo;

import java.io.Serializable;
import java.util.Date;

public class Pet implements Serializable {
    private Integer petId;

    private String petName;

    private String petBread;

    private String petSex;

    private Date birthday;

    private String description;

    public Integer getPetId() {
        return petId;
    }

    public void setPetId(Integer petId) {
        this.petId = petId;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName == null ? null : petName.trim();
    }

    public String getPetBread() {
        return petBread;
    }

    public void setPetBread(String petBread) {
        this.petBread = petBread == null ? null : petBread.trim();
    }

    public String getPetSex() {
        return petSex;
    }

    public void setPetSex(String petSex) {
        this.petSex = petSex == null ? null : petSex.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}