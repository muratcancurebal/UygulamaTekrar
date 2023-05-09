package com.bilgeadam.lesson009.bilgisayarUygulamasi;

import java.util.ArrayList;

public class Laptop extends Bilgisayar {
    private String ekran;
    private String batarya;
    private int sarjYuzdesi;

    public Laptop(String id, String ad, AnaKart anakart, ArrayList<HariciDonanim> hariciDonanimlar, String ekran, String batarya, int sarjYuzdesi) {
        super(id, ad, anakart, hariciDonanimlar);
        this.ekran = ekran;
        this.batarya = batarya;
        this.sarjYuzdesi = sarjYuzdesi;
        setTasinabilirMi(true);

    }

    public Laptop(String id, String ad, AnaKart anakart, String ekran, String batarya, int sarjYuzdesi) {
        super(id, ad, anakart);
        this.ekran = ekran;
        this.batarya = batarya;
        this.sarjYuzdesi = sarjYuzdesi;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "ekran='" + ekran + '\'' +
                ", batarya='" + batarya + '\'' +
                ", sarjYuzdesi=" + sarjYuzdesi +
                "} " + super.toString();
    }
}
