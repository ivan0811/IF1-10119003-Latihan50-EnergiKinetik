package com.ivanfaathirza.energikinetik;

/**
 *
 * @author Ivan
 * NAMA         : Ivan Faathirza
 * KELAS        : IF1
 * NIM          : 10119003
 * Deskripsi Program : program ini untuk menghitung energi kinetik dan usaha
 * berdasarkan massa dan volume menggunakan konstruktor dengan berorientasi
 * objek
 */


public class IF110119003Latihan50 {

    public static void main(String[] args) {
        EnergiKinetik energiKinetik = new EnergiKinetik(145, 25);
        System.out.println("Massa : " + energiKinetik.getMassa() + " g");
        System.out.println("Kecepatan : "+energiKinetik.getVolume() + " m/s");
        System.out.printf("Energi Kinetik : %.2f joule%n", energiKinetik.hitung());
        System.out.printf("Karena energi kinetik awalnya 0 maka usaha nya  %.2f joule%n", energiKinetik.hitung());
    }
}
