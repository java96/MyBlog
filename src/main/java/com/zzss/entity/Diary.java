package com.zzss.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by songs on 2015/10/1.
 */
@Entity
@Table(name = "diary")
public class Diary implements Serializable {

    //日记ID
    private Integer id;

    //日记标题
    private String diaryTitle;

    //推荐日记
    private char diaryRecommend;

    //日记作者
    private String diaryUser;

    //日记缩略图
    private String diaryImager;

    //日记提交时间
    private Date diaryTime;

    //日记点击数
    private int diaryClick;

    //日记内容
    private String diaryText;

    public Diary() {
    }

    public Diary(Integer id, String diaryTitle, char diaryRecommend, String diaryUser, String diaryImager, Date diaryTime, int diaryClick, String diaryText) {
        this.id = id;
        this.diaryTitle = diaryTitle;
        this.diaryRecommend = diaryRecommend;
        this.diaryUser = diaryUser;
        this.diaryImager = diaryImager;
        this.diaryTime = diaryTime;
        this.diaryClick = diaryClick;
        this.diaryText = diaryText;
    }

    //getterg方法
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getId() {
        return id;
    }

    public String getDiaryTitle() {
        return diaryTitle;
    }

    public char getDiaryRecommend() {
        return diaryRecommend;
    }

    public String getDiaryUser() {
        return diaryUser;
    }

    public String getDiaryImager() {
        return diaryImager;
    }

    public Date getDiaryTime() {
        return diaryTime;
    }

    public int getDiaryClick() {
        return diaryClick;
    }

    @Column(name = "diaryText", columnDefinition = "TEXT", nullable = false)
    public String getDiaryText() {
        return diaryText;
    }

    //setter方法

    public void setId(Integer id) {
        this.id = id;
    }

    public void setDiaryTitle(String diaryTitle) {
        this.diaryTitle = diaryTitle;
    }

    public void setDiaryRecommend(char diaryRecommend) {
        this.diaryRecommend = diaryRecommend;
    }

    public void setDiaryUser(String diaryUser) {
        this.diaryUser = diaryUser;
    }

    public void setDiaryImager(String diaryImager) {
        this.diaryImager = diaryImager;
    }

    public void setDiaryTime(Date diaryTime) {
        this.diaryTime = diaryTime;
    }

    public void setDiaryClick(int diaryClick) {
        this.diaryClick = diaryClick;
    }

    public void setDiaryText(String diaryText) {
        this.diaryText = diaryText;
    }
}
