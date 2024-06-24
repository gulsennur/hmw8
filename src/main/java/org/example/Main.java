package org.example;
import org.example.IK.Personel;
import org.example.IK.Erkek;
import org.example.IK.Kadin;
import org.example.IK.Departman;

import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        // Sample date for personel birth date (Year, Month, Day)
        Calendar cal = Calendar.getInstance();
        cal.set(1980, Calendar.JANUARY, 1);

        // Create team leader and some employees
        Personel takimLideri = new Erkek("Ahmet", "Yılmaz", cal.getTime());
        Personel kadinPersonel = new Kadin("Ayşe", "Kaya", cal.getTime());
        Personel erkekPersonel = new Erkek("Mehmet", "Demir", cal.getTime());

        // Create a department
        Departman departman = new Departman("IT", takimLideri);

        // Add employees to department
        departman.personelEkle(kadinPersonel);
        departman.personelEkle(erkekPersonel);

        // Add some tasks
        departman.gorevEkle("Yazılım geliştirme");
        departman.gorevEkle("Sistem bakımı");

        // Mark tasks as completed
        departman.gorevTamamla(0);

        // Print the team leader and employees
        System.out.println("Takım Lideri: " + departman.getTakimLideri().getAd() + " " + departman.getTakimLideri().getSoyad());
        for (Personel personel : departman.getPersonelListesi()) {
            System.out.println("Personel: " + personel.getAd() + " " + personel.getSoyad());
        }

        // Print the tasks
        for (String gorev : departman.getIsListesi()) {
            System.out.println("Görev: " + gorev);
        }

        // Calculate and print retirement years left for each employee
        for (Personel personel : departman.getPersonelListesi()) {
            int kalanYil = personel.emeklilikYasinaKalanYil();
            System.out.println(personel.getAd() + " " + personel.getSoyad() + " için emekliliğe kalan yıl: " + kalanYil);
        }
    }
}

