package org.example.IK;
import java.util.ArrayList;
import java.util.List;
public class Departman {

        private String isim;
        private Personel takimLideri;
        private List<Personel> personelListesi = new ArrayList<>();
        private List<String> isListesi = new ArrayList<>();

        public Departman(String isim, Personel takimLideri) {
            this.isim = isim;
            this.takimLideri = takimLideri;
            this.personelListesi.add(takimLideri);
        }

        public void takimLideriDegistir(Personel yeniTakimLideri) {
            this.takimLideri = yeniTakimLideri;
        }

        public void personelEkle(Personel personel) {
            this.personelListesi.add(personel);
        }

        public void personelCikar(Personel personel) {
            this.personelListesi.remove(personel);
        }

        public void personelDegistir(int index, Personel yeniPersonel) {
            if (index >= 0 && index < personelListesi.size()) {
                this.personelListesi.set(index, yeniPersonel);
            }
        }

        public void gorevEkle(String gorev) {
            this.isListesi.add(gorev);
        }

        public void gorevTamamla(int index) {
            if (index >= 0 && index < isListesi.size()) {
                isListesi.set(index, isListesi.get(index) + " (Tamamlandı)");
            }
        }

        public String getIsim() {
            return isim;
        }

        public void setIsim(String isim) {
            this.isim = isim;
        }

        public Personel getTakimLideri() {
            return takimLideri;
        }

        public List<Personel> getPersonelListesi() {
            return personelListesi;
        }

        public List<String> getIsListesi() {
            return isListesi;
        }
    }

