package com.bilgeadam.lesson008;

public class SuPokemonu extends Pokemon {
    int suBasincGucu;
    int yuzmeHizi;

    public SuPokemonu(int id, String ad, int seviye, int guc, int can, int suBasincGucu, int yuzmeHizi) {
        super(id, ad, seviye, guc, can);
        setTur("Su");
        this.suBasincGucu = suBasincGucu;
        this.yuzmeHizi = yuzmeHizi;
    }

    @Override
    public void pokedex() {
        super.pokedex();
        System.out.println("Su basınç gücü :" + suBasincGucu);
        System.out.println("Yüzme Hızı :"+yuzmeHizi);
    }
}
