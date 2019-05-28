/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kampus;

/**
 *
 * @author praktikan
 */
public class Kelas {
    String nama,kodeKelas,hari;
    int sesi;
    Matakuliah matakuliah;
    Ruang ruang;
    Mahasiswa mahasiswa[];
    
    public Kelas (String nama,String kodeKelas,Matakuliah matakuliah,
                   Ruang ruang,String hari,int sesi,Mahasiswa mahasiswa[]){
        this.nama=nama;
        this.kodeKelas=kodeKelas;
        this.hari=hari;
        this.matakuliah=matakuliah;
        this.ruang=ruang;
        this.mahasiswa = mahasiswa;
        
    }
    public String toString(){
        return "Kelas "+nama+" dengan kode"+kodeKelas+" berasal dari mata kuliah "+
                matakuliah.nama+",diselenggarakan di ruang "+ruang.nama +", hari "+ hari +","
                +"dengan mahasiswa berjumlah"+mahasiswa.length+"orang";
                
                
    }
    
    
    
    
}
