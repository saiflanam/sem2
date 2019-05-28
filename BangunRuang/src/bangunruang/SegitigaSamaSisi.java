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
public class SegitigaSamaSisi extends Segitiga {
    int sisi;
    
    public SegitigaSamaSisi(int sisi){
        this.sisi = sisi;
    }
    
    double getLuas(){
        return  sisi*sisi/4*Math.sqrt(3);
    }
    
    double getKeliling(){
        return sisi*3;
    }
}
