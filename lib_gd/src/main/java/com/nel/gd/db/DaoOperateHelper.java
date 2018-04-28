package com.nel.gd.db;

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

    void saveData(T data);

    void deleteData(T data);

    void deleteByKey(long id);

    void deleteAllData();

    void updateData(T data);

    List<T> queryAll();

    List<T> queryPaging(int pageSize, int pageNum);
}
