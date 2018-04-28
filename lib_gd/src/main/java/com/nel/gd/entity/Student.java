package com.nel.gd.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Description :
 * CreateTime : 2018/4/28 13:46
 *
 * @author ningerlei@danale.com
 * @version <v1.0>
 */

@Entity
public class Student {

    @Id
    private long id;

    private String name;

    private String num;
    private int age;
    @Generated(hash = 757792011)
    public Student(long id, String name, String num, int age) {
        this.id = id;
        this.name = name;
        this.num = num;
        this.age = age;
    }
    @Generated(hash = 1556870573)
    public Student() {
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
    public String getNum() {
        return this.num;
    }
    public void setNum(String num) {
        this.num = num;
    }
    public int getAge() {
        return this.age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
