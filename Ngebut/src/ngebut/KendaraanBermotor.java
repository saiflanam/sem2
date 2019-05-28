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
public abstract class KendaraanBermotor {
    String platNomor, merk, warna, transisi;
    int tahun, jumlahRoda;
    
    public KendaraanBermotor(String platNomor, String merk, String warna,
            String transisi,int tahun, int jumlahRoda){
        this.platNomor = platNomor;
        this.merk = merk;
        this.warna = warna;
        this.transisi = transisi;
        this.tahun = tahun;
        this.jumlahRoda = jumlahRoda;
    }
    
    public String toString(){
        return "Plat Nomor  : " + platNomor + "\n"+
               "Merk        : " + merk + "\n"+
               "Warna       : " + warna + "\n"+
               "Transisi    : " + transisi + "\n"+
               "Tahun       : " + tahun + "\n"+
               "Jumlah Roda : " + jumlahRoda + "\n";
    }
    
    abstract void gas();
    abstract void rem();
    abstract void sign();
    
    
}
