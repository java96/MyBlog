package com.zzss.service.impl;

import com.zzss.dao.AboutMiDao;
import com.zzss.entity.AboutMi;
import com.zzss.service.AboutMiManager;

/**
 * Created by songs on 2015/10/3.
 */
public class AboutMiManagerImpl implements AboutMiManager {

    private AboutMiDao aboutMiDao;

    public void setAboutMiDao(AboutMiDao aboutMiDao) {
        this.aboutMiDao = aboutMiDao;
    }

    //    ��ѯ������
    public AboutMi queryAboutMi(AboutMi aboutMi) {
        return aboutMiDao.queryAboutMi(aboutMi);
    }

    //    �޸Ĺ�����
    public void updateAboutMi(AboutMi aboutMi) {
        aboutMiDao.updateAboutMi(aboutMi);
    }
}
