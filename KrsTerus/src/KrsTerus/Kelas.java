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
public class Kelas {
    MataKuliah matakuliah;
    Dosen dosen;
    String hari, ruang, namaKelas;
    int sesi;
    Mahasiswa mahasiswa[] = new Mahasiswa[2];
    
    public Kelas(MataKuliah matakuliah, String namaKelas, String hari, int sesi, 
            String ruang, Dosen dosen){
        this.matakuliah = matakuliah;
        this.namaKelas = namaKelas;
        this.hari = hari;
        this.sesi = sesi;
        this.ruang = ruang;
        this.dosen = dosen;
        
    }
    
    void cetakMahasiswa(){
        System.out.println("Kelas "+matakuliah.namaMataKuliah+" "+namaKelas+
                " memiliki mahasiswa "+mahasiswa[0].namaMahasiswa+" dan "+mahasiswa[1].namaMahasiswa+"\n");
    }
    
    public String toString(){
        return ": Kelas "+matakuliah.namaMataKuliah+" "+namaKelas+", hari "+hari+", Sesi"+
                sesi+" Ruang "+ruang+", oleh Dosen "+dosen.namaDosen;
                
    }
    
    
}
