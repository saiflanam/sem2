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
public class Balok extends PersegiPanjang {
    int tinggi;
    
    public Balok(int panjang, int lebar, int tinggi){
        super(panjang, lebar);
        this.tinggi = tinggi;
    }
    
    double getLuas(){
        return (panjang*lebar)*2+(panjang*tinggi)*2+(lebar*tinggi)*2;
    }
    
    double getKeliling(){
        return (4*panjang)+(4*lebar)+(4*tinggi);
    }
    
    double getVolume(){
        return panjang*lebar*tinggi;
    }
}
