package com.bilgeadam.lesson009.polimorfizm;

public class MuratPokemonu extends Pokemon {



    public MuratPokemonu(long id, String ad, int seviye, int guc, int can) {
        super(id, ad, seviye, guc, can);
        setTur("cenavar");
    }

    public MuratPokemonu(long id, String ad) {
        super(id, ad);
    }
}
