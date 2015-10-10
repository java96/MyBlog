package com.zzss.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by 立鹏 on 2015/9/28.
 */
@Entity
@Table(name = "journal")
public class Journal implements Serializable {

    // 日志ID
    private Integer id;

    // 日志标题
    private String journalTitle;

    //设置推荐
    private char journalRecommend;

    //日志作者
    private String journalUser;

    // 日志缩略图
    private String journalImager;

    //日志提交时间
    private Date journalDate;

    //日志内容
    private String journalText;

    //日志点击数
    private int journaClick;

    public Journal() {
    }

    public Journal(Integer id, String journalTitle, char journalRecommend, String journalUser, String journalImager, Date journalDate, String journalText, int journaClick) {
        this.id = id;
        this.journalTitle = journalTitle;
        this.journalRecommend = journalRecommend;
        this.journalUser = journalUser;
        this.journalImager = journalImager;
        this.journalDate = journalDate;
        this.journalText = journalText;
        this.journaClick = journaClick;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getId() {
        return id;
    }

    public String getJournalTitle() {
        return journalTitle;
    }

    public String getJournalUser() {
        return journalUser;
    }

    public String getJournalImager() {
        return journalImager;
    }

    public Date getJournalDate() {
        return journalDate;
    }

    public int getJournaClick() {
        return journaClick;
    }

    public char getJournalRecommend() {
        return journalRecommend;
    }

    @Column(name = "journalText", columnDefinition = "TEXT", nullable = false)
    public String getJournalText() {
        return journalText;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setJournalTitle(String journalTitle) {
        this.journalTitle = journalTitle;
    }

    public void setJournalUser(String journalUser) {
        this.journalUser = journalUser;
    }

    public void setJournalImager(String journalImager) {
        this.journalImager = journalImager;
    }

    public void setJournalDate(Date journalDate) {
        this.journalDate = journalDate;
    }

    public void setJournaClick(int journaClick) {
        this.journaClick = journaClick;
    }

    public void setJournalText(String journalText) {
        this.journalText = journalText;
    }

    public void setJournalRecommend(char journalRecommend) {
        this.journalRecommend = journalRecommend;
    }
}
