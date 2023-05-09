package com.bilgeadam.lesson009.bilgisayarUygulamasi;

public class Ram extends DahiliDonanim {
    private int boyut;
    private int hiz;

    public Ram(int boyut, int hiz) {
        this.boyut = boyut;
        this.hiz = hiz;
    }

    public int getBoyut() {
        return boyut;
    }

    public void setBoyut(int boyut) {
        this.boyut = boyut;
    }

    public int getHiz() {
        return hiz;
    }

    public void setHiz(int hiz) {
        this.hiz = hiz;
    }

    @Override
    public String toString() {
        return "Ram{" +
                "boyut=" + boyut +
                ", hiz=" + hiz +
                "} " + super.toString();
    }
}
