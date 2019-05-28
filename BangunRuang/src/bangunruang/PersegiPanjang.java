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
public class PersegiPanjang extends Bangun2D{
    int panjang, lebar;
    
    public PersegiPanjang(int panjang, int lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    double getLuas(){
        return panjang*lebar;
    }
    
    double getKeliling(){
        return (panjang+lebar)*2;
    }
}
