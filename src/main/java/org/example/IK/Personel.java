package org.example.IK;
import java.util.Date;

public abstract class Personel {
    protected String ad;
    protected String soyad;
    protected Date dogumTarihi;

    public Personel(String ad, String soyad, Date dogumTarihi) {
        this.ad = ad;
        this.soyad = soyad;
        this.dogumTarihi = dogumTarihi;
    }

    public abstract int emeklilikYasinaKalanYil();

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public Date getDogumTarihi() {
        return dogumTarihi;
    }

    public void setDogumTarihi(Date dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }
}
