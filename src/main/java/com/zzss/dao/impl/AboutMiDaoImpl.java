package com.zzss.dao.impl;

import com.zzss.common.impl.BaseDaoImpl;
import com.zzss.dao.AboutMiDao;
import com.zzss.entity.AboutMi;

/**
 * Created by songs on 2015/10/3.
 */
public class AboutMiDaoImpl extends BaseDaoImpl<AboutMi> implements AboutMiDao {

    //    查询关于我
    public AboutMi queryAboutMi(AboutMi aboutMi) {
        return get(AboutMi.class, aboutMi.getId());
    }

    //    修改关于我
    public void updateAboutMi(AboutMi aboutMi) {
        update(aboutMi);
    }

}
