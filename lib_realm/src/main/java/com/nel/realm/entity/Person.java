package com.nel.realm.entity;

import io.realm.RealmList;
import io.realm.RealmObject;

/**
 * Description :
 * CreateTime : 2018/4/28 15:18
 *
 * @author ningerlei@danale.com
 * @version <v1.0>
 */

public class Person extends RealmObject {

    private long id;
    private String name;
    private int age;

    private RealmList<Dog> dogs;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

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

    public RealmList<Dog> getDogs() {
        return dogs;
    }

    public void setDogs(RealmList<Dog> dogs) {
        this.dogs = dogs;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", dogs=" + dogs +
                '}';
    }
}
