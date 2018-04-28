package com.nel.gd.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Description :
 * CreateTime : 2018/4/28 13:57
 *
 * @author ningerlei@danale.com
 * @version <v1.0>
 */

@Entity
public class Teacher {

    @Id
    private long id;
    private String name;
    private String course;
    private String academy;
    @Generated(hash = 364716094)
    public Teacher(long id, String name, String course, String academy) {
        this.id = id;
        this.name = name;
        this.course = course;
        this.academy = academy;
    }
    @Generated(hash = 1630413260)
    public Teacher() {
    }
    public long getId() {
        return this.id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCourse() {
        return this.course;
    }
    public void setCourse(String course) {
        this.course = course;
    }
    public String getAcademy() {
        return this.academy;
    }
    public void setAcademy(String academy) {
        this.academy = academy;
    }
}
