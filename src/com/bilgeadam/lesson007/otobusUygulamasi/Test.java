package com.bilgeadam.lesson007.otobusUygulamasi;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        Guzergah guzergah1 = new Guzergah(481);
        Guzergah guzergah2 = new Guzergah(203);

        Otobus otobus1 = new Otobus("1","06","Mustafa",74,guzergah1,"");
        Otobus otobus2 = new Otobus("2","06","Mert",102,guzergah1,"");
        Otobus otobus3 = new Otobus("3","06","Merve",68,guzergah2,"");
        Otobus otobus4 = new Otobus("4","06","Zeliha",74,guzergah2,"");
        Otobus otobus5 = new Otobus("5","06","Serkan",102,guzergah1,"");

        Durak durak1 = new Durak(1,"Keçiören","Ankara");
        Durak durak2 = new Durak(2,"Dışkapı","Ankara");
        Durak durak3 = new Durak(3,"Ulus","Ankara");
        Durak durak4 = new Durak(4,"Yenimahalle","Ankara");
        Durak durak5 = new Durak(5,"Kızılay","Ankara");





        Otobus[] otobusler1={otobus1,otobus2,otobus5};
        durak1.setOtobusler(otobusler1);
        Otobus[] otobusler2={otobus1,otobus2,otobus3,otobus4,otobus5};
        durak2.setOtobusler(otobusler2);
        
        durak3.setOtobusler(new Otobus[5]);
        durak3.getOtobusler()[0]=otobus1;
        durak3.getOtobusler()[1]=otobus2;
        durak3.getOtobusler()[2]=otobus3;
        durak3.getOtobusler()[3]=otobus4;
        durak3.getOtobusler()[4]=otobus5;

        /*for(Otobus otobus :durak3.getOtobusler()){
            System.out.println(otobus);*/


        guzergah1.setDuraklar(new Durak[4]);  // bunu yaparak Guzergah class'ı türünde olusturdugumuz guzergah1 adlı referansa Durak tipinde 4 boyutlu yeni bir array set etmiş oluyoruz.
        guzergah1.getDuraklar()[0]=durak1;      // burda da guzergah1' e yukarda Durak tipinde
        guzergah1.getDuraklar()[1]=durak2;
        guzergah1.getDuraklar()[2]=durak3;
        guzergah1.getDuraklar()[3]=durak5;

        // guzergah2 ye durak arrayi atamamızı 2.yoldan yapalım : önce Array olusturulur ve aynı anda elemanlar verilir. Sonra set metofu ile icine array verilir.
        Durak [] duraklar2 = {durak3,durak4,durak5};
        guzergah2.setDuraklar(duraklar2);



        Durak[] duraklar = {durak3,durak4,durak5};
        guzergah2.setDuraklar(duraklar);

        /*for(Durak durak : guzergah2.getDuraklar()){
            System.out.println(durak);*/

        System.out.println(Arrays.toString(durak1.getOtobusler()));
        }

        }



   







