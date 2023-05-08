package com.bilgeadam.lesson009.bilgisayarUygulamasi;

import java.util.ArrayList;

public class AnaKart extends DahiliDonanim {

    private int hiz;
    private ArrayList<DahiliDonanim> dahiliDonanimlar;

    public AnaKart(int hiz, ArrayList<DahiliDonanim> dahiliDonanimlar) {
        this.hiz = hiz;
        this.dahiliDonanimlar = dahiliDonanimlar;
    }

    public AnaKart(int hiz) {
        this.hiz = hiz;
    }

    public int getHiz() {
        return hiz;
    }

    public void setHiz(int hiz) {
        this.hiz = hiz;
    }

    public ArrayList<DahiliDonanim> getDahiliDonanimlar() {
        return dahiliDonanimlar;
    }

    public void setDahiliDonanimlar(ArrayList<DahiliDonanim> dahiliDonanimlar) {
        this.dahiliDonanimlar = dahiliDonanimlar;
    }

    @Override
    public String toString() {
        return "AnaKart{" +
                "hiz=" + hiz +
                ", dahiliDonanimlar=" + dahiliDonanimlar +
                '}';
    }
}
