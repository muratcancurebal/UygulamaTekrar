package com.bilgeadam.lesson007.sınavUygulamasi;

import java.util.Arrays;
import java.util.Scanner;

public class Soru {

    public int puan;
    public int siraNo;
    public String icerik;
    public String dogruCevabı;// A,B,C,D
    public String[] cevapIcerikleri;

    public void soruOlustur(String[] cevapSecenekleri) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Lütfen bir soru içeriği giriniz :");
        this.icerik = sc.nextLine();
        this.cevapIcerikleri = new String[cevapSecenekleri.length];

        for (int i = 0; i < cevapSecenekleri.length; i++) {
            System.out.println(cevapSecenekleri[i] + " şıkkının içeriğini giriniz");
            cevapIcerikleri[i] = sc.nextLine();
        }
        System.out.println("Sorunun doğru cevabını belirleyiniz ");
        this.dogruCevabı = sc.nextLine();
        System.out.println("Sorunun puanını giriniz :");
        this.puan = sc.nextInt();

    }

    @Override
    public String toString() {
        return "Soru{" +
                "puan=" + puan +
                ", siraNo=" + siraNo +
                ", icerik='" + icerik + '\'' +
                ", dogruCevabı='" + dogruCevabı + '\'' +
                ", cevapIcerikleri=" + Arrays.toString(cevapIcerikleri) +
                '}';
    }
}
