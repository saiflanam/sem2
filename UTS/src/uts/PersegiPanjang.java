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
public class PersegiPanjang {
    int panjang, lebar;
    
    public PersegiPanjang(int panjang, int lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    int getLuas(int panjang, int lebar){
        return panjang*lebar;
    }
    
    int getKeliling(int panjang, int lebar){
        return (panjang+lebar)*2;
    }
    public String toString(){
        return "Persegi Panjang"+"\n"+
                "Panjang  : "+panjang+"\n"+
                "Lebar    : "+lebar+"\n"+
                "Luas     : "+getLuas(panjang,lebar)+"\n"+
                "Keliling : "+getKeliling(panjang,lebar)+"\n";
    } 
}
