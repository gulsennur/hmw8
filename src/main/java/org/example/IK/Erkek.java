package org.example.IK;
import java.util.Calendar;
import java.util.Date;

    public class Erkek extends Personel {
        private static final int EMEKLILIK_YASI = 65;

        public Erkek(String ad, String soyad, Date dogumTarihi) {
            super(ad, soyad, dogumTarihi);
        }

        @Override
        public int emeklilikYasinaKalanYil() {
            Calendar now = Calendar.getInstance();
            Calendar dob = Calendar.getInstance();
            dob.setTime(dogumTarihi);
            int age = now.get(Calendar.YEAR) - dob.get(Calendar.YEAR);
            if (now.get(Calendar.DAY_OF_YEAR) < dob.get(Calendar.DAY_OF_YEAR)){
                age--;
            }
            return EMEKLILIK_YASI - age;
        }
    }

