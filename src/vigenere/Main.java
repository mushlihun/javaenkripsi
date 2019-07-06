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
public class Main {

    public static void main(String[] args) {

        String dataHuruf = "abcdefghijklmnopqrstuvwxyz";

        String pesan = "roni";
        String kunci = "iron";
        String chiper = "";
        
        ArrayList en = new ArrayList();
        ArrayList de = new ArrayList();

        
        Scanner s = new Scanner();
        ArrayList sP = s.scannPesan(pesan, dataHuruf);
        ArrayList sK = s.scannKuci(pesan, kunci, dataHuruf);

        System.out.println("Enkripsi");
        EnkripDekrip ed = new EnkripDekrip();
        for (int i = 0; i < pesan.length(); i++) {
            int iP = Integer.parseInt(sP.get(i).toString());
            int iK = Integer.parseInt(sK.get(i).toString());
            int gE = ed.getEnkrip(iP, iK, dataHuruf);

            en.add(gE);

        }
        System.out.println("Pesan : " + pesan);
        System.out.println("Kunci : " + kunci);
        String hEN = ed.getHasil(en, dataHuruf);
        System.out.println("Hasli Enkripsi :" + hEN);
        chiper = hEN;

        Scanner s2 = new Scanner();
        ArrayList sC = s2.scannPesan(chiper, dataHuruf);
        ArrayList sK2 = s2.scannKuci(chiper, kunci, dataHuruf);
        
        System.out.println("\nDekripsi");
        EnkripDekrip ed2 = new EnkripDekrip();
        for (int i = 0; i < pesan.length(); i++) {
            int iC = Integer.parseInt(sC.get(i).toString());
            int iK2 = Integer.parseInt(sK2.get(i).toString());
            int gDE = ed2.getDekrip(iC, iK2, dataHuruf);
            
            de.add(gDE);
        }
        System.out.println("Chiper : " + chiper);
        System.out.println("Kunci : " + kunci);
        String hDE = ed2.getHasil(de, dataHuruf);
        System.out.println("Hasli Dekripsi :" + hDE);

    }
}
