package com.zzss.service;

import com.zzss.entity.AboutMi;

/**
 * Created by songs on 2015/10/3.
 */
public interface AboutMiManager {

    //    ��ѯ������
    AboutMi queryAboutMi(AboutMi aboutMi);


    //    �޸Ĺ�����
    void updateAboutMi(AboutMi aboutMi);

}