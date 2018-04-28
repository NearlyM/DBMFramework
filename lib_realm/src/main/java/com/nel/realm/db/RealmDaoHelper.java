package com.nel.realm.db;

import com.nel.realm.entity.Person;

import java.util.List;

import io.realm.RealmResults;

/**
 * Description :
 * CreateTime : 2018/4/28 15:26
 *
 * @author ningerlei@danale.com
 * @version <v1.0>
 */

public class RealmDaoHelper implements DaoOperateHelper<Person> {

    @Override
    public void insertData(Person data) {
        DbManager.getInstance().getRealm().insert(data);
    }

    @Override
    public void insertDataList(List<Person> dataList) {
        DbManager.getInstance().getRealm().insert(dataList);
    }

    @Override
    public void deleteData(Person data) {
        DbManager.getInstance().getRealm().delete(Person.class);
    }

    @Override
    public void deleteByKey(long id) {
//        DbManager.getInstance().getRealm().delete()
    }

    @Override
    public void deleteAllData() {
        DbManager.getInstance().getRealm().deleteAll();
    }

    @Override
    public void updateData(Person data) {
        DbManager.getInstance().getRealm().insertOrUpdate(data);
    }

    @Override
    public void updateDatas(List<Person> datas) {
        DbManager.getInstance().getRealm().insertOrUpdate(datas);
    }

    @Override
    public List<Person> queryAll() {
        RealmResults<Person> realmResults = DbManager.getInstance().getRealm().where(Person.class).findAll();
        List<Person> people = DbManager.getInstance().getRealm().copyFromRealm(realmResults);
        return people;
    }
}
