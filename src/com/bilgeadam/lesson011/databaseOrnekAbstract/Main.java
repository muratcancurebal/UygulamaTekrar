package com.bilgeadam.lesson011.databaseOrnekAbstract;
/*
 * databse secim metodu olsun
 * sectiğimiz databse e göre databsedeki login metodunu ve
 * manager sınıfından calıstır metodunu calıstırsın
 * 1-Mysql
 * 2-Oracle
 *
 * kullanıcıdan databse secmesini istiyeceğiz  bu sayade sectiğimiz database
 * gore metotolar çalışacak..
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.databaseSecim();

    }

    public void databaseSecim() {
        Manager manager;
        Database database = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Seçim yapınız :");
        System.out.println("1-MySql\n2-Oracle");
        int secim = Integer.parseInt(sc.nextLine());
        switch (secim) {

            case 1:
                database = new MySql();
                break;
            case 2:
                database = new Oracle();
                break;
            default:
                System.out.println("1-2 arasında seçim yapınız");
                break;
        }

        manager = new Manager(database);
        manager.calistir();
    }


}
