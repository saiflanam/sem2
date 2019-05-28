/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunruang;

/**
 *
 * @author ASUS
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bangun2D b1 = new SegitigaSikuSiku (3, 4);
        System.out.println(b1.getLuas());
        System.out.println(b1.getKeliling());
        
        Bangun2D b2 = new SegitigaSamaSisi(10);
        System.out.println(b2.getLuas());
        System.out.println(b2.getKeliling());
    }
    
}
