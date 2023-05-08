package com.bilgeadam.lesson006;

public class Kullanici {


    private int id;
    private String isim;
    private String email;
    private String sifre;
    private String telefonNO;
    private String username;

    public Kullanici() {

    }


    public Kullanici(int id, String isim, String email, String sifre, String username) {
        super();
        this.id = id;
        this.isim = isim;
        this.email = email;
        this.sifre = sifre;
        this.username = username;
    }


    public Kullanici(int id, String isim, String email, String sifre, String telefonNO, String username) {
        super();
        this.id = id;
        this.isim = isim;
        this.email = email;
        this.sifre = sifre;
        this.telefonNO = telefonNO;
        this.username = username;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public String getTelefonNO() {
        return telefonNO;
    }

    public void setTelefonNO(String telefonNO) {
        this.telefonNO = telefonNO;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "com.bilgeadam.lesson001.Kullanici [id=" + id + ", isim=" + isim + ", email=" + email + ", sifre=" + sifre + ", telefonNO="
                + telefonNO + ", username=" + username + "]";
    }


}
