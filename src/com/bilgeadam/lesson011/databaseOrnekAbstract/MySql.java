package com.bilgeadam.lesson011.databaseOrnekAbstract;



public class MySql  extends Database {


    @Override
    public void ekle() {
        System.out.println("MySql veritabanina veri eklendi");
    }

    @Override
    public void sil() {
        System.out.println("MySql veritabanindan veri silindi");
    }

    @Override
    public void verileriGetir() {
        System.out.println("MySql veritabanindan veirler getirildi");
    }

    @Override
    public void guncelle() {
        System.out.println("MySql veritabanında veriler güncellendi");
    }

    @Override
    public void login() {
        System.out.println("MySql veritabanina bağlanıldı");
    }
}
