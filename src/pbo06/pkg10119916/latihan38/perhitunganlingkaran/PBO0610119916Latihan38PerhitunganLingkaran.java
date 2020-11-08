/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo06.pkg10119916.latihan38.perhitunganlingkaran;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : DIAN ARPIAN
 * NIM      : 10119916
 * KELAS    : IF10K
 * Deskripis Program : Perhitungan Lingkaran
 */

public class PBO0610119916Latihan38PerhitunganLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            double diameter, jarijari, luas, keliling;
        System.out.println ("=====Perhitungan Lingkaran=====");
        Lingkaran hitung_lingkaran = new Lingkaran();

        diameter = hitung_lingkaran.getDiameter();
        jarijari = hitung_lingkaran.getJarijari();
        luas = hitung_lingkaran.getLuas();
        keliling = hitung_lingkaran.getKeliling();
        hitung_lingkaran.hasilHitung();
    }
}