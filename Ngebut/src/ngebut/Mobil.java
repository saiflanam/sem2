/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ngebut;

/**
 *
 * @author ASUS
 */
public class Mobil extends KendaraanBermotor{
    int jumlahPintu;
    public Mobil(String platNomor, String merk, String warna,
            String transisi,int tahun, int jumlahRoda, int jumlahPintu){
        super(platNomor, merk, warna, transisi, tahun, jumlahRoda);
        this.jumlahPintu = jumlahPintu;
    }
    
    public String toString(){
        return super.toString() + "jumlahPintu : " + jumlahPintu + "\n";
    }
    
    void gas(){
        System.out.println("injak pedal gas");
    }
    
    void rem(){
        System.out.println("injak pedal rem");
    }
    
    void sign(){
        System.out.println("gerakkan tuas ke atas untuk arah kiri "
                + "dan ke bawah untuk arah kanan");
    }
}
