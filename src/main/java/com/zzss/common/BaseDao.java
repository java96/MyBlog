package com.zzss.common;

import java.io.Serializable;
import java.util.List;

/**
 * Created by shach on 2015/9/13.
 */

public interface BaseDao<T> {

    //    ����ID����ʵ����
    T get(Class<T> entityClazz, Serializable id);

    //    ����ʵ��
    Serializable save(T entity);

    //    ����ʵ��
    void update(T entity);

    //    ɾ��ʵ��
    void delete(T entity);

    //    ����IDɾ��ʵ��
    void delete(Class<T> entityClazz, Serializable id);

    //    ��ȡ����ʵ��
    List<T> findAll(Class<T> entityClazz);

    //    ��ȡʵ������
    long findCount(Class<T> entityClazz);
}
