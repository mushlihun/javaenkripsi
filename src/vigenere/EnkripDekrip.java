/*
 *  Dengan menyebut Nama ALLAH yang Maha Pengasih dan Maha Penyayang
 *  Dengan JAVA kita akan mencerdaskan bangsa
 *  Dengan JAVA kita akan mengubah dunia
 *  
 *  imam.sahroni35@gmail.com
 */
package vigenere;

import java.util.ArrayList;

/**
 *
 * @author Administrator 
 */
public class EnkripDekrip {

    private int chiper;
    private int pesan;
    private String hasil = "";

    public int getEnkrip(int pesan, int kunci, String dataHuruf) {

        int c = pesan + kunci;

        if (c < dataHuruf.length()) {
            chiper = c;
        } else {
            chiper = c - dataHuruf.length();
        }

        return chiper;
    }

    public int getDekrip(int chiper, int kunci, String dataHuruf) {
        int p = chiper - kunci;
        if (p >= 0) {
            pesan = p;
        } else {
            pesan = p + dataHuruf.length();
        }
        return pesan;
    }

    public String getHasil(ArrayList intEnkrip, String dataHuruf) {

        for (int i = 0; i < intEnkrip.size(); i++) {
            int a = Integer.parseInt(intEnkrip.get(i).toString());
            char z = dataHuruf.charAt(a);
            hasil += z;
        }

        return hasil;
    }
}
