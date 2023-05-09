package com.bilgeadam.lesson009.bilgisayarUygulamasi;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {

        Ram ram = new Ram(16, 3200);
        HardDisk hardDisk = new HardDisk(512, 3000, 3000);
        Islemci islemci = new Islemci(4, 3, "7.nesil");
        ArrayList<DahiliDonanim> dahiliDonanimlar = new ArrayList<>();
        dahiliDonanimlar.add(islemci);
        dahiliDonanimlar.add(hardDisk);
        dahiliDonanimlar.add(ram);


        AnaKart anaKart = new AnaKart(0, dahiliDonanimlar);
        ArrayList<HariciDonanim> hariciDonanimlar = new ArrayList<>();
        Mouse mouse = new Mouse(0);
        Klayve klayve = new Klayve("Mekanik", "Q");
        hariciDonanimlar.add(mouse);
        hariciDonanimlar.add(klayve);
        Laptop laptop = new Laptop("1", "Monster", anaKart, hariciDonanimlar, "", "", 60);
        System.out.println(laptop);

    }
}
