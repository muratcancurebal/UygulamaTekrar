package com.bilgeadam.lesson007.sınavUygulamasi;

public class Test {

    public static void main(String[] args) {
        Sinav sinav = new Sinav();
        sinav.sinavOlustur();

        for (Soru soru : sinav.sorular) {
            System.out.println(soru);
        }
        for (Soru soru : sinav.sorular) {
            System.out.println(soru);
        }
    }
}
