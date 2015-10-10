package com.zzss.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by shach on 2015/9/15.
 */
@Entity
@Table(name = "user", uniqueConstraints = {@UniqueConstraint(columnNames = "username")})
public class User implements Serializable {


    //id  ����

    private Integer id;

    //��½��
    private String username;

    //����
    private String password;

    //Email��ַ
    private String email;

    //�Ա�
    private char sex;

    //����
    private int age;

    //�ֻ�
    private String phone;

    //ע��ʱ��
    private Date registerTime;

    //����½ʱ��
    private Date endTime;

    //����½IP
    private String oldIpaddress;

    //�ж����û����ǹ���
    private char judge;

    public User() {
    }

    public User(String username, String password, String email, char sex, int age, String phone, Date registerTime, Date endTime, String oldIpaddress, char judge) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.sex = sex;
        this.age = age;
        this.phone = phone;
        this.registerTime = registerTime;
        this.endTime = endTime;
        this.oldIpaddress = oldIpaddress;
        this.judge = judge;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public char getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public String getOldIpaddress() {
        return oldIpaddress;
    }

    public char getJudge() {
        return judge;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public void setOldIpaddress(String oldIpaddress) {
        this.oldIpaddress = oldIpaddress;
    }

    public void setJudge(char judge) {
        this.judge = judge;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (!username.equals(user.username)) return false;
        return password.equals(user.password);

    }

    public int hashCode() {
        int result = username.hashCode();
        result = 31 * result + password.hashCode();
        return result;
    }
}
