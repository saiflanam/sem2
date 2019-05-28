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
public class SegitigaSikuSiku extends Segitiga {
    int alas, tinggi;
    
    public SegitigaSikuSiku(int alas, int tinggi){
       this.alas = alas;
       this.tinggi = tinggi;
    }
    
    double getLuas(){
        return alas*tinggi/2;
    }
    
    double getKeliling(){
        double sisiMiring = Math.sqrt(alas*alas+tinggi*tinggi);
        return sisiMiring+alas+tinggi;
    }
}
