package com.bilgeadam.lesson009.bilgisayarUygulamasi;

public class Klayve extends HariciDonanim {

    private String tur;
    private String stil;

    public Klayve(String tur, String stil) {
        this.tur = tur;
        this.stil = stil;
    }

    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }

    public String getStil() {
        return stil;
    }

    public void setStil(String stil) {
        this.stil = stil;
    }

    @Override
    public String toString() {
        return "Klayve{" +
                "tur='" + tur + '\'' +
                ", stil='" + stil + '\'' +
                '}';
    }
}
