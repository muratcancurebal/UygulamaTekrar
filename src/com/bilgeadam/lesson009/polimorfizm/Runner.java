package com.bilgeadam.lesson009.polimorfizm;
/*
bir metot yaratlım ve bu metot 0 - 2 arasında 2 dahil bir sayı üretisin, bu gelen sayıya göre
uygulamadaki pokemonlardan birini kullanıcının pokemonu yapsın;
her pokemonun yakalanmaya direnci olsun. elektrik pokemonunun 3, ateşin 4, suyun 2 olsun.

pokemon yakalama metodunda pokemon yakalama puanı üretilsin 1-8 arasında puan.
bu puan direnc katsayısından buyukse polemon yakalnmıstır buna göre bize polemonun yakalanıp yakalanmadığını dönsün.
 */


import java.util.ArrayList;
import java.util.Random;

public class Runner {
    public static void main(String[] args) {
        Pokemon pokemon1 = new AtesPokemonu(1, "Rayichu", 2, 1000, 350, 500);
        Pokemon pokemon2 = new ElektrikPokemonu(2, "Charziard", 3, 5000, 350, 500);
        Pokemon pokemon3 = new SuPokemonu(3, "Staryu", 1, 500, 150, 200, 3);
        Pokemon pokemon4 = new MuratPokemonu(5, "murat");
        Pokemon pokemon5 = new Pokemon(1, "poki");


        System.out.println("pokemon 4 "+pokemon4 + " tur= "+ pokemon4.getTur());
        System.out.println("pokemon 5 :"+pokemon5);

        Kullanici kullanici = new Kullanici("Mustafa");
       
        ArrayList<Pokemon> pokemonListesi = new ArrayList<>();
        pokemonListesi.add(pokemon1);
        pokemonListesi.add(pokemon2);
        pokemonListesi.add(pokemon3);
        pokemonListesi.add(pokemon4);

        for (int i = 0; i < pokemonListesi.size(); i++) {
            System.out.println(pokemonListesi.get(i).getAd());
        }
        System.out.println("-------------------------");

        Pokemon secilmisPokemon = pokemonYakala(pokemonListesi,kullanici);
        System.out.println(secilmisPokemon.getAd());

        saldir(secilmisPokemon);

    }

    private static Pokemon pokemonYakala(ArrayList<Pokemon>pokemonlar, Kullanici kullanici) {
        Random rd = new Random();
        int index = rd.nextInt(pokemonlar.size());
        Pokemon pokemon = pokemonlar.get(index);
        kullanici.getPokemonlar().add(pokemon);
        pokemon.setSahibiVarmi(true);
        return pokemon;
    }

    public static void saldir(Pokemon pokemon) {

        pokemon.saldir();
    }




}
