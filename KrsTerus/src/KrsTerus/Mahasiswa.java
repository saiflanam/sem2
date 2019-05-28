/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KrsTerus;

/**
 *
 * @author ASUS
 */
public class Mahasiswa {
    NIM nim;
    String namaMahasiswa;
    
    public Mahasiswa(NIM nim, String namaMahasiswa){
        this.nim = nim;
        this.namaMahasiswa = namaMahasiswa;
    }
    
    public String toString(){
        return ": " +nim.angkatan+"/"+nim.niu+"/"+nim.fakultas+"/"+nim.nif+" dengan nama "+namaMahasiswa;
    }
}
