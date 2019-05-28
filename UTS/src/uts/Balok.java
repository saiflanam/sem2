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
public class Balok extends PersegiPanjang{
    int tinggi;
    
    public Balok(int panjang, int lebar, int tinggi){
        super(panjang, lebar);
        this.tinggi = tinggi;
    }
    
    int getLuas(int panjang, int lebar,int tinggi){
        return (panjang*lebar)*2+(panjang*tinggi)*2+(lebar*tinggi)*2;
    }
    
    int getKeliling(int panjang, int lebar, int tinggi){
        return (4*panjang)+(4*lebar)+(4*tinggi);
    }
    
    int getVolume(int panjang, int lebar, int tinggi){
        return panjang*lebar*tinggi;
    }
    
    public String toString(){
        return  "Balok"+"\n"+
                "Panjang  : "+panjang+"\n"+
                "Lebar    : "+lebar+"\n"+
                "Tinggi   : "+tinggi+"\n"+
                "Luas     : "+getLuas(panjang,lebar,tinggi)+"\n"+
                "Keliling : "+getKeliling(panjang,lebar,tinggi)+"\n"+
                "Volume   : "+getVolume(panjang, lebar, tinggi)+"\n";
    }
}

