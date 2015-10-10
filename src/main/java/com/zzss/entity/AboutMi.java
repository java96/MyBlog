package com.zzss.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by songs on 2015/10/1.
 */

@Entity
@Table(name = "aboutMi")
public class AboutMi implements Serializable {
    // id
    private Integer id = 1;
    // 网名
    private String userName;
    //我的姓名
    private String myName;
    //出生年月
    private Date birthday;
    //籍贯
    private String hometown;
    //现居住地
    private String live;
    //职业
    private String occupation;
    //最喜欢
    private String likeAll;
    //Just about me
    private String justMe;
    //About my blog
    private String aboutBlog;

    public AboutMi() {
    }

    public AboutMi(Integer id, String userName, String myName, Date birthday, String hometown, String live, String occupation, String likeAll, String justMe, String aboutBlog) {
        this.id = id;
        this.userName = userName;
        this.myName = myName;
        this.birthday = birthday;
        this.hometown = hometown;
        this.live = live;
        this.occupation = occupation;
        this.likeAll = likeAll;
        this.justMe = justMe;
        this.aboutBlog = aboutBlog;
    }

    //    getter
    @Id
    public Integer getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getMyName() {
        return myName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public String getHometown() {
        return hometown;
    }

    public String getLive() {
        return live;
    }

    public String getOccupation() {
        return occupation;
    }

    public String getLikeAll() {
        return likeAll;
    }

    @Column(name = "justMe", columnDefinition = "TEXT", nullable = false)
    public String getJustMe() {
        return justMe;
    }

    @Column(name = "aboutBlog", columnDefinition = "TEXT", nullable = false)
    public String getAboutBlog() {
        return aboutBlog;
    }


    //    setter

    public void setId(Integer id) {
        this.id = id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setMyName(String myName) {
        this.myName = myName;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public void setLive(String live) {
        this.live = live;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public void setLikeAll(String likeAll) {
        this.likeAll = likeAll;
    }


    public void setJustMe(String justMe) {
        this.justMe = justMe;
    }


    public void setAboutBlog(String aboutBlog) {
        this.aboutBlog = aboutBlog;
    }


}
