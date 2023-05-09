package com.bilgeadam.lesson009.polimorfizm;

public class ElektrikPokemonu extends Pokemon {

    int voltajSeviyesi;


    public ElektrikPokemonu(long id, String ad, int seviye, int guc, int can, int voltajSeviyesi) {
        super(id, ad, seviye, guc, can);
        setTur("Elektrik");
        this.voltajSeviyesi = voltajSeviyesi;
    }

    @Override
    public void pokedex() {
        System.out.println("süperden önce");
        super.pokedex();
        System.out.println("voltaj seviyesi= " + voltajSeviyesi);
        System.out.println("==================");

    }

    @Override
    public void saldir() {
        System.out.println(getAd()+" adlı pokemon elektrik saldırısı yapıyor");
    }
}


