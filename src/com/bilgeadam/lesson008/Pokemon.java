package com.bilgeadam.lesson008;

public class Pokemon {
    private int id;
    private String ad;
    private String tur;
    private int seviye;
    private int guc;
    private int can;

    public Pokemon() {
        this.id = id;
        this.ad = ad;
        this.tur = tur;
        this.seviye = seviye;
        this.guc = guc;
        this.can = can;
    }

    public Pokemon(int id, String ad) {
        this.id = id;
        this.ad = ad;
    }

    public Pokemon(int id, String ad, String tur, int seviye, int guc, int can) {
        this.id = id;
        this.ad = ad;
        this.tur = tur;
        this.seviye = seviye;
        this.guc = guc;
        this.can = can;
    }

    public Pokemon(int id, String ad, int seviye, int guc, int can) {
        this.id = id;
        this.ad = ad;
        this.seviye = seviye;
        this.guc = guc;
        this.can = can;
    }

    public void saldir() {
        System.out.println(ad + " adlı pokeman saldırıyor");
    }

    public void kacinma() {
        System.out.println(ad + " adlı pokeman kaçınıyor");
    }

    public void pokedex() {
        System.out.println("POKEDEX");
        System.out.println("========");
        System.out.println("id :" + id);
        System.out.println("ad :" + ad);
        System.out.println("tür :" + tur);
        System.out.println("can :" + can);
        System.out.println("güç :" + guc);
        System.out.println("seviye :"+seviye);
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }

    public int getSeviye() {
        return seviye;
    }

    public void setSeviye(int seviye) {
        this.seviye = seviye;
    }

    public int getGuc() {
        return guc;
    }

    public void setGuc(int guc) {
        this.guc = guc;
    }

    public int getCan() {
        return can;
    }

    public void setCan(int can) {
        this.can = can;
    }
}
