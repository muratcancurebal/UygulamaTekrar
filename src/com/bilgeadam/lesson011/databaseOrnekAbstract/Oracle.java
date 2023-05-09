package com.bilgeadam.lesson011.databaseOrnekAbstract;
/*
Bir Database'i olacak.
MySql ve Oracle Class'ları oalcak.
Bir Database'e bağlanma (connect veya login) metodu olacak.
Ekle,güncelle,verileriGetir metodu olacak.
Bu yapıyı interface ve kalıtım kullanarak soyutlayınız.
 */



public class Oracle extends Database {


    @Override
    public void ekle() {
        System.out.println("Oracle veritabania veri eklendi");
    }

    @Override
    public void sil() {
        System.out.println("Oracle veritabanindan veri sildindi");
    }

    @Override
    public void verileriGetir() {
        System.out.println("Oracle veritabanindan verile getirildi");
    }

    @Override
    public void guncelle() {
        System.out.println("Oracle veri tabaninda veriler güncellendi");
    }

    @Override
    public void login() {
        System.out.println("Oracle veritabanina bağlanıldı");
    }
}
