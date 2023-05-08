package com.bilgeadam.lesson008;

public class AtesPokemonu extends Pokemon{
    int yakicilikGucu;

    public AtesPokemonu(int id, String ad, int seviye, int guc, int can, int yakicilikGucu) {
        super(id, ad, seviye, guc, can);
        setTur("Ateş");
        this.yakicilikGucu = yakicilikGucu;
    }

    @Override
    public void pokedex() {
        super.pokedex();
        System.out.println("yakıcılık gücü: " + yakicilikGucu);
    }
}
