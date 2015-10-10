package com.zzss.dao;

import com.zzss.entity.AboutMi;

/**
 * Created by songs on 2015/10/3.
 */
public interface AboutMiDao {
    //    查询关于我
    AboutMi queryAboutMi(AboutMi aboutMi);


    //    修改关于我
    void updateAboutMi(AboutMi aboutMi);

}
