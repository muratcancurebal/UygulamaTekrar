package com.bilgeadam.lesson009.bilgisayarUygulamasi;

public class Monitor extends HariciDonanim {
    private int karaHizi;
    private int inch;

    public Monitor(int karaHizi, int inch) {
        this.karaHizi = karaHizi;
        this.inch = inch;
    }

    public int getKaraHizi() {
        return karaHizi;
    }

    public void setKaraHizi(int karaHizi) {
        this.karaHizi = karaHizi;
    }

    public int getInch() {
        return inch;
    }

    public void setInch(int inch) {
        this.inch = inch;
    }


    @Override
    public String toString() {
        return "Monitor{" +
                "karaHizi=" + karaHizi +
                ", inch=" + inch +
                "} " + super.toString();
    }
}
