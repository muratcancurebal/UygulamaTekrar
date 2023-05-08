package com.bilgeadam.lesson006;

import java.util.Scanner;

public class Uygulama {

    /*    System.out.println("1-Kayıt Ol");
                System.out.println("2-Giriş Yap");
                System.out.println("3-Kullanıcıları göster");
                System.out.println("4-Çıkış");
                1-menumuzu olusturacagız
                2-secim yapan bir metot yazacagız
                3-uygulama metodu olacak buradaki işlemlere göre bir metot sececeğiz
                4-kayıt ol metodu yazacagız  ==> dısardan aldıgımız verilerle bir kullanıcı olıstırup kullanıcı listesine ekleyelim

                */
    static Scanner sc = new Scanner(System.in);


    public void menu() {
        System.out.println("1-Kayıt ol");
        System.out.println("2-Giriş yap");
        System.out.println("3-Kullanıcıları göster");
        System.out.println("4-Çıkış");
    }

    public int secimYap() {
        System.out.println("Seçim yapınız :");
        int secim = sc.nextInt();
        sc.nextLine();
        return secim;
    }

    public  void kayitOl() {
        System.out.print("Kullanıcı ismini giriniz :");
        String isim = sc.nextLine();
        System.out.print("Kullanıcı mailini giriniz :");
        String email = sc.nextLine();
        System.out.print("Kullanıcı şifresini giriniz :");
        String sifre = sc.nextLine();
        System.out.print("Username girisi yapınız :");
        String username = sc.nextLine();
        Kullanici kullanici = new Kullanici(Database.index + 1, isim, email, sifre, username);
        Database.kullaniciEkle(kullanici);


    }

    public void kullanicilariListele() {

        for (Kullanici kullanici : Database.kullaniciListesi) {
            if (kullanici != null) {
                System.out.println(kullanici);
            }
        }

    }

    public void girisYap() {
        System.out.println("Kullanıcı adınızı giriniz :");
        String username = sc.nextLine();
        System.out.println("Şifrenizi giriniz :");
        String sifre = sc.nextLine();
        boolean kontrol = Database.kullaniciVarMi(username, sifre);
        if (kontrol)
            System.out.println("giriş başarılı");
        else
            System.out.println("kullanıcı bulunamadı");
    }

    public void uygulamayiBaslat() {
        int kontrol = 0;
        do {
            menu();
            kontrol = secimYap();
            switch (kontrol) {
                case 1:
                    kayitOl();
                    break;
                case 2:
                    girisYap();
                    break;
                case 3:
                    kullanicilariListele();
                    break;
                case 4:
                    System.out.println("cıkıs yapıldı");
                    break;
                default:
                    System.out.println("lütfen belirtilen aralıkta sayı girşi yapınız :1-4");
                    break;

            }


        } while (kontrol != 4);

    }


}
