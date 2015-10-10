package com.zzss.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by songs on 2015/10/1.
 */
@Entity
@Table(name = "chat")
public class Chat implements Serializable {
    //Id
    private Integer id;

    //提交时间
    private Date chatCommTime;

    //内容
    private String chatText;

    //文章点击数
    private int chatClick;

    public Chat() {
    }

    public Chat(Integer id, Date chatCommTime, String chatText, int chatClick) {
        this.id = id;
        this.chatCommTime = chatCommTime;
        this.chatText = chatText;
        this.chatClick = chatClick;
    }

    //    getter
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getId() {
        return id;
    }

    public Date getChatCommTime() {
        return chatCommTime;
    }

    @Column(name = "chatText", columnDefinition = "TEXT", nullable = false)
    public String getChatText() {
        return chatText;
    }

    public int getChatClick() {
        return chatClick;
    }


    //    setter
    public void setId(Integer id) {
        this.id = id;
    }

    public void setChatCommTime(Date chatCommTime) {
        this.chatCommTime = chatCommTime;
    }

    public void setChatText(String chatText) {
        this.chatText = chatText;
    }

    public void setChatClick(int chatClick) {
        this.chatClick = chatClick;
    }
}
