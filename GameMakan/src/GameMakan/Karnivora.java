/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameMakan;

/**
 *
 * @author Anam
 */
public class Karnivora extends Hewan {

    String alatPembunuh;

    public Karnivora(String nama, String spesies, String warna, String alatPembunuh) {
        this.nama = nama;
        this.spesies = spesies;
        this.warna = warna;
        this.alatPembunuh = alatPembunuh;
    }

    /**
     *
     * @param kurangpoin method memakan herbifora
     */
    void eat(Herbivora h) {
        h.poin -= 5;
    }

    public String toString() {
        return "Hewan herbifora \n" + "--------------- \n"
                + "Nama           : " + nama + "\n"
                + "Spesies        : " + spesies + "\n"
                + "Warna          : " + warna + "\n"
                + "Alat Pembunuh  : " + alatPembunuh + "\n";
    }
}
