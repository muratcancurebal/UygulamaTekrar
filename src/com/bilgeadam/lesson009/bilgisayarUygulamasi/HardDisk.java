package com.bilgeadam.lesson009.bilgisayarUygulamasi;

public class HardDisk extends DahiliDonanim {
    private int kapasite;
    private int yazmaHizi;
    private int okumaHizi;

    public HardDisk(int kapasite, int yazmaHizi, int okumaHizi) {
        this.kapasite = kapasite;
        this.yazmaHizi = yazmaHizi;
        this.okumaHizi = okumaHizi;
    }

    public int getKapasite() {
        return kapasite;
    }

    public void setKapasite(int kapasite) {
        this.kapasite = kapasite;
    }

    public int getYazmaHizi() {
        return yazmaHizi;
    }

    public void setYazmaHizi(int yazmaHizi) {
        this.yazmaHizi = yazmaHizi;
    }

    public int getOkumaHizi() {
        return okumaHizi;
    }

    public void setOkumaHizi(int okumaHizi) {
        this.okumaHizi = okumaHizi;
    }
}
