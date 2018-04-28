package com.nel.realm.entity;

import io.realm.RealmObject;

/**
 * Description :
 * CreateTime : 2018/4/28 15:16
 *
 * @author ningerlei@danale.com
 * @version <v1.0>
 */

public class Dog extends RealmObject {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
