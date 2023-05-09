package com.bilgeadam.lesson011.databaseOrnekAbstract;


import java.util.Scanner;

/*
 * Bir menu olacak
 * 1-Veri ekle
 * 2-Veri sil
 * 3-Veri Guncelle
 * 4-Verileri getir
 *
 * daha sonra bir çalıstır metodu olacak,
 * bu metotta menuden secim yapacağız, bu secime gore
 * database den bir metot calısacak.
 */
public class Manager {
    Database database;

    public Manager(Database database) {
        this.database = database;
    }

    public void menu() {
        System.out.println("1-Veri Ekle\n2-Veri Sil\n3-Veri Güncelle\n4-Verileri Getir");

    }

    public void calistir() {

        Scanner sc = new Scanner(System.in);
        int secim;
        database.login();
        do {
            menu();
            System.out.println("Seçim yapınız :");
            secim = sc.nextInt();
            sc.nextLine();
            switch (secim) {
                case 1:
                    database.ekle();
                    break;
                case 2:
                    database.sil();
                    break;
                case 3:
                    database.guncelle();
                    break;
                case 4:
                    database.verileriGetir();
                    break;
                case 0:
                    System.out.println("Çıkış yapılıyor");
                    break;
                default:
                    System.out.println("1-4 arasında seçim yapınız ");
                    break;
            }

        } while (secim != 0);
    }




}
