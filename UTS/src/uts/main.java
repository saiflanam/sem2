/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts;

/**
 *
 * @author praktikan
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersegiPanjang pp1 = new PersegiPanjang(5, 3);
        System.out.println(pp1); //output1

        PersegiPanjang pp2 = new PersegiPanjang(10, 4);
        System.out.println(pp2); //output2

        Balok b1 = new Balok(4, 3, 2);
        System.out.println(b1); //output3

        Balok b2 = new Balok(7, 6, 5);
        System.out.println(b2); //output4

    }

}
