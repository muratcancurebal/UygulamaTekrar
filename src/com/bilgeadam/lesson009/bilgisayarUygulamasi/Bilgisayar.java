package com.bilgeadam.lesson009.bilgisayarUygulamasi;

import java.util.ArrayList;

public class Bilgisayar {
    private String id;
    private String ad;
    private AnaKart anakart;
    private ArrayList<HariciDonanim> hariciDonanimlar;
    private boolean tasinabilirMi;

    public Bilgisayar(String id, String ad, AnaKart anakart, ArrayList<HariciDonanim> hariciDonanimlar) {
        this.id = id;
        this.ad = ad;
        this.anakart = anakart;
        this.hariciDonanimlar = hariciDonanimlar;
    }

    public Bilgisayar(String id, String ad, AnaKart anakart) {
        this.id = id;
        this.ad = ad;
        this.anakart = anakart;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public AnaKart getAnakart() {
        return anakart;
    }

    public void setAnakart(AnaKart anakart) {
        this.anakart = anakart;
    }

    public ArrayList<HariciDonanim> getHariciDonanimlar() {
        return hariciDonanimlar;
    }

    public void setHariciDonanimlar(ArrayList<HariciDonanim> hariciDonanimlar) {
        this.hariciDonanimlar = hariciDonanimlar;
    }

    public boolean isTasinabilirMi() {
        return tasinabilirMi;
    }

    public void setTasinabilirMi(boolean tasinabilirMi) {
        this.tasinabilirMi = tasinabilirMi;
    }

    @Override
    public String toString() {
        return "Bilgisayar{" +
                "id='" + id + '\'' +
                ", ad='" + ad + '\'' +
                ", anakart=" + anakart +
                ", hariciDonanimlar=" + hariciDonanimlar +
                ", tasinabilirMi=" + tasinabilirMi +
                '}';
    }
}
