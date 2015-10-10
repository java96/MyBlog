package com.zzss.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by songs on 2015/10/10.
 */
@Entity
@Table(name = "home")
public class Home implements Serializable {

    //      ����id
    private Integer id;

    //     ���±���
    private String homeTitle;

    //    ���¼�����������ר��
    private int homeLevel;

    //    ��������
    private String homeUser;

    //    �����ύʱ��
    private Date homeTime;

    //    ������ʾ����ͼ
    private String homeImager;

    //    ���µ����
    private int homeClick;

    //    ��������
    private String homeText;


    public Home() {
    }

    public Home(Integer id, String homeTitle, int homeLevel, String homeUser, Date homeTime, String homeImager, int homeClick, String homeText) {
        this.id = id;
        this.homeTitle = homeTitle;
        this.homeLevel = homeLevel;
        this.homeUser = homeUser;
        this.homeTime = homeTime;
        this.homeImager = homeImager;
        this.homeClick = homeClick;
        this.homeText = homeText;
    }

    //    getter
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getId() {
        return id;
    }

    public String getHomeTitle() {
        return homeTitle;
    }

    public int getHomeLevel() {
        return homeLevel;
    }

    public String getHomeUser() {
        return homeUser;
    }

    public Date getHomeTime() {
        return homeTime;
    }

    public String getHomeImager() {
        return homeImager;
    }

    public int getHomeClick() {
        return homeClick;
    }

    @Column(name = "homeText", columnDefinition = "TEXT", nullable = false)
    public String getHomeText() {
        return homeText;
    }

    //    setter
    public void setId(Integer id) {
        this.id = id;
    }

    public void setHomeTitle(String homeTitle) {
        this.homeTitle = homeTitle;
    }

    public void setHomeLevel(int homeLevel) {
        this.homeLevel = homeLevel;
    }

    public void setHomeUser(String homeUser) {
        this.homeUser = homeUser;
    }

    public void setHomeTime(Date homeTime) {
        this.homeTime = homeTime;
    }

    public void setHomeImager(String homeImager) {
        this.homeImager = homeImager;
    }

    public void setHomeClick(int homeClick) {
        this.homeClick = homeClick;
    }

    public void setHomeText(String homeText) {
        this.homeText = homeText;
    }
}
