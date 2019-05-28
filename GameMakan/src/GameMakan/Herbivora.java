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
public class Herbivora extends Hewan {

    int poin = 0;

    public Herbivora(String nama, String spesies, String warna) {
        this.nama = nama;
        this.spesies = spesies;
        this.warna = warna;
        /*poin = 0;*/
    }

    /**
     *
     * @param tambahpoin method memakan tumbuhan
     */
    void eat(Tumbuhan t) {
        poin += 3;
    }

    public String toString() {
        return "Hewan herbifora \n" + "--------------- \n"
                + "Nama    : " + nama + "\n"
                + "Spesies : " + spesies + "\n"
                + "Warna   : " + warna + "\n"
                + "Poin    : " + poin + "\n";
    }

}
