package com.bilgeadam.lesson009.polimorfizm;

public class Pokemon {
    private long id;
    private String ad;
    private String tur;
    private int seviye;
    private int guc;
    private int can;
    private boolean sahibiVarmi;
    private int direncKatsayisi;

    public Pokemon(long id, String ad, String tur, int seviye, int guc, int can) {
        this.id = id;
        this.ad = ad;
        this.tur = tur;
        this.seviye = seviye;
        this.guc = guc;
        this.can = can;
    }

    public Pokemon(long id,String ad) {
        this(id, ad, "Standart", 1, 200, 100);


    }

    public Pokemon(long id, String ad, int seviye, int guc, int can) {
        this.id = id;
        this.ad = ad;
        this.seviye = seviye;
        this.guc = guc;
        this.can = can;
        this.tur = "Standart";
    }



    public void saldir(){
        System.out.println(ad +" adlı pokemon saıldırıyor");
    }

    public void kacinma(){
        System.out.println(ad+" adlı pokemon kaçınıyor");
    }
    public void pokedex(){
        System.out.println("POKEDEX");
        System.out.println("==========");
        System.out.println("id= " + id);
        System.out.println("ad= " + ad);
        System.out.println("tur= " + tur);
        System.out.println("tur= " + can);
        System.out.println("guc= " + guc);
        System.out.println("seviye= "+seviye);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public boolean isSahibiVarmi() {
        return sahibiVarmi;
    }

    public void setSahibiVarmi(boolean sahibiVarmi) {
        this.sahibiVarmi = sahibiVarmi;
    }

    public int getDirencKatsayisi() {
        return direncKatsayisi;
    }

    public void setDirencKatsayisi(int direncKatsayisi) {
        this.direncKatsayisi = direncKatsayisi;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "id=" + id +
                ", ad='" + ad + '\'' +
                ", tur='" + tur + '\'' +
                ", seviye=" + seviye +
                ", guc=" + guc +
                ", can=" + can +
                ", sahibiVarmi=" + sahibiVarmi +
                ", direncKatsayisi=" + direncKatsayisi +
                '}';
    }
}
