package com.nel.realm.db;

import java.util.List;

/**
 * Description :
 * CreateTime : 2018/4/28 14:12
 *
 * @author ningerlei@danale.com
 * @version <v1.0>
 */

public interface DaoOperateHelper<T> {

    void insertData(T data);

    void insertDataList(List<T> dataList);

    void deleteData(T data);

    void deleteByKey(long id);

    void deleteAllData();

    void updateData(T data);

    void updateDatas(List<T> datas);

    List<T> queryAll();
}
