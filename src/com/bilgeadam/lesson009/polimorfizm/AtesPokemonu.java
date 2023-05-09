package com.bilgeadam.lesson009.polimorfizm;

public class AtesPokemonu extends Pokemon {
    int yakicilikGucu;


    public AtesPokemonu(long id, String ad, int seviye, int guc, int can, int yakicilikGucu) {
        super(id, ad, seviye, guc, can);
        this.yakicilikGucu = yakicilikGucu;
        setTur("Ateş");
    }

    @Override
    public void pokedex() {
        super.pokedex();
        System.out.println("Yakıcılık gücü :" + yakicilikGucu);
    }

    @Override
    public void saldir() {
        System.out.println(getAd() + " adlı pokemon ateş saldırısı yapıyor.");
    }
}
