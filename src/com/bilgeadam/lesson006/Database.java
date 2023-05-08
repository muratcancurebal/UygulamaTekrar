package com.bilgeadam.lesson006;

import java.util.Arrays;

public class Database {


    public static Kullanici[] kullaniciListesi = new Kullanici[6];

    public static int index;

    public static void veriTabaniBaslangicDegerleri() {

        Kullanici kullanici1 = new Kullanici(index + 1, "Ahmet", "ahmet@gmail.com", "1234", "ahmety");
        kullaniciListesi[index] = kullanici1;
        kullanici1.setIsim("Mustafa");
        index++;

        Kullanici kullanici2 = new Kullanici(index + 1, "Hakan", "hakan@gmail.com", "1234", "hakany");
        kullaniciListesi[index] = kullanici2;
        index++;

        Kullanici kullanici3 = new Kullanici(index + 1, "Fidan", "fidan@gmail.com", "1234", "fidany");
        kullaniciListesi[index] = kullanici3;
        index++;


    }

    public static boolean kullaniciVarMi(String username, String sifre) {
        for (int i = 0; i < kullaniciListesi.length - 1; i++) {
            if (kullaniciListesi[i] != null) {
                if (username.equals(kullaniciListesi[i].getUsername())
                        && sifre.equals(kullaniciListesi[i].getSifre())) {
                    return true;
                }
            }
        }
        return false;
    }


    public static void kullaniciEkle(Kullanici kullanici) {

        if (kullaniciListesi[kullaniciListesi.length - 1] != null) {
            arrayBoyurArttır();
        }
        kullaniciListesi[index] = kullanici;
        index++;

    }

    public static void arrayBoyurArttır() {
        Kullanici[] temp = Arrays.copyOf(kullaniciListesi, kullaniciListesi.length + 5);
        kullaniciListesi = temp;
    }


}
