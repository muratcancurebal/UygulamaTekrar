package com.bilgeadam.lesson009.polimorfizm;

public class SuPokemonu extends Pokemon {
    int suBasincGucu;
    int yuzmeHizi;

    public SuPokemonu(long id, String ad, int seviye, int guc, int can, int suBasincGucu, int yuzmeHizi) {
        super(id, ad, seviye, guc, can);
        this.suBasincGucu = suBasincGucu;
        this.yuzmeHizi = yuzmeHizi;
        setTur("Su");
    }

    @Override
    public void pokedex() {
        super.pokedex();
        System.out.println("basınc gucu :" + suBasincGucu);
        System.out.println("yuzme hızı :"+ yuzmeHizi);
    }

    @Override
    public void saldir() {
        System.out.println(getAd()+" adlı pokemon su saldırısı yapıyor");
    }
}
