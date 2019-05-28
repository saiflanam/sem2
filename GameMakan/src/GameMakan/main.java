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
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Herbivora ayam = new Herbivora("Koko", "unggas", "hitam");
        System.out.println(ayam);

        Karnivora elang = new Karnivora("lalang", "unggas", "hitam", "cakar");
        System.out.println(elang);

        Tumbuhan rumput = new Tumbuhan("riri", "rerumputan");
        System.out.println(rumput);

        ayam.eat(rumput);
        System.out.println(ayam);

        ayam.eat(rumput);
        System.out.println(ayam);

        elang.eat(ayam);
        System.out.println(ayam);
        
        Kucing kiki = new Kucing ("Kiki","Persia","Coklat","Taring","Panjang");
        System.out.println(kiki);
        System.out.println(kiki.bersuara());
               
    }

}
