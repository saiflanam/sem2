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
public class Motor extends KendaraanBermotor{
    
    public Motor(String platNomor, String merk, String warna,
            String transisi,int tahun, int jumlahRoda){
        super(platNomor, merk, warna, transisi, tahun, jumlahRoda);
    }
    
    void gas(){
        System.out.println("Putar stang ke arah bawah");
    }
    
    void rem(){
        System.out.println("Menekan tuas rem");
    }
    
    void sign(){
        System.out.println("geser tombol ke arah yang akan dituju");
    }
}
