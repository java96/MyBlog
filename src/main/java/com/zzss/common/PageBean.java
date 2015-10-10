package com.zzss.common;

import java.util.List;

/**
 * Created by songs on 2015/10/6.
 */
public class PageBean<T> {

    private int pc;// ��ǰҳ��page code
    // private int tp;// ��ҳ��total page
    private int tr;// �ܼ�¼��total record
    private int ps;// ÿҳ��¼��page size
    private List<T> beanList;// ��ǰҳ�ļ�¼

    public PageBean() {
    }

    public PageBean(int pc, int tr, int ps) {
        this.pc = pc;
        this.tr = tr;
        this.ps = ps;
    }

    public int getPc() {
        return pc;
    }

    public void setPc(int pc) {
        this.pc = pc;
    }

    /**
     * ������ҳ��
     *
     * @return
     */
    public int getTp() {
        // ͨ���ܼ�¼����ÿҳ��¼����������ҳ��
        int tp = tr / ps;
        return tr % ps == 0 ? tp : tp + 1;
    }

    // public void setTp(int tp) {
    // this.tp = tp;
    // }

    public int getTr() {
        return tr;
    }

    public void setTr(int tr) {
        this.tr = tr;
    }

    public int getPs() {
        return ps;
    }

    public void setPs(int ps) {
        this.ps = ps;
    }

    public List<T> getBeanList() {
        return beanList;
    }

    public void setBeanList(List<T> beanList) {
        this.beanList = beanList;
    }

}
