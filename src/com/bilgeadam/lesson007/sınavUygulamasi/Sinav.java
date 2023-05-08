package com.bilgeadam.lesson007.sınavUygulamasi;


import java.util.Scanner;

public class Sinav {

    public String ders;
    public String konu;
    public int soruSayisi;
    public long sure;
    public Soru[] sorular;
    public String[] cevaplar;
    public String[] cevapSecenekleri = {"A", "B", "C", "D"};

    public void sinavOlustur() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Dersin adını giriniz :");
        String ders = sc.nextLine();
        System.out.println("Soru sayısını giriniz :");
        soruSayisi = sc.nextInt();
        sorular = new Soru[soruSayisi];
        for (int i = 0; i < soruSayisi; i++) {
            Soru soru = new Soru();
        }
    }
}
