package com.bilgeadam.lesson009.polimorfizm;

import java.util.ArrayList;

public class Kullanici {

    private String isim;
    private ArrayList<Pokemon> pokemonlar;

    public Kullanici(String isim) {
        this.isim = isim;
        this.pokemonlar = new ArrayList<>();

    }

    public Kullanici(String isim, ArrayList<Pokemon> pokemonlar) {
        super();
        this.isim = isim;
        this.pokemonlar = pokemonlar;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public ArrayList<Pokemon> getPokemonlar() {
        return pokemonlar;
    }

    public void setPokemonlar(ArrayList<Pokemon> pokemonlar) {
        this.pokemonlar = pokemonlar;
    }
}
