package com.zzss.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by songs on 2015/10/1.
 * 学无止境实体类
 */

@Entity
@Table(name = "learn")
public class Learn implements Serializable {
    //ID
    private Integer id;

    //标题名称
    private String learnTitle;

    //作者
    private String learnName;

    //缩略图
    private String learnImager;

    //推荐文章
    private char learnRecommend;

    //提交时间
    private Date learnCommtime;

    //点击数
    private int learnClick;

    //内容
    private String learnText;

    public Learn() {
    }

    public Learn(Integer id, String learnTitle, String learnName, String learnImager, char learnRecommend, Date learnCommtime, int learnClick, String learnText) {
        this.id = id;
        this.learnTitle = learnTitle;
        this.learnName = learnName;
        this.learnImager = learnImager;
        this.learnRecommend = learnRecommend;
        this.learnCommtime = learnCommtime;
        this.learnClick = learnClick;
        this.learnText = learnText;
    }

    //getter方法
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getId() {
        return id;
    }

    public String getLearnTitle() {
        return learnTitle;
    }

    public String getLearnName() {
        return learnName;
    }

    public String getLearnImager() {
        return learnImager;
    }

    public Date getLearnCommtime() {
        return learnCommtime;
    }

    public char getLearnRecommend() {
        return learnRecommend;
    }

    public int getLearnClick() {
        return learnClick;
    }

    @Column(name = "learnText", columnDefinition = "TEXT", nullable = false)
    public String getLearnText() {
        return learnText;
    }

    //setter
    public void setId(Integer id) {
        this.id = id;
    }

    public void setLearnTitle(String learnTitle) {
        this.learnTitle = learnTitle;
    }

    public void setLearnName(String learnName) {
        this.learnName = learnName;
    }

    public void setLearnImager(String learnImager) {
        this.learnImager = learnImager;
    }

    public void setLearnCommtime(Date learnCommtime) {
        this.learnCommtime = learnCommtime;
    }

    public void setLearnClick(int learnClick) {
        this.learnClick = learnClick;
    }

    public void setLearnText(String learnText) {
        this.learnText = learnText;
    }

    public void setLearnRecommend(char learnRecommend) {
        this.learnRecommend = learnRecommend;
    }
}
