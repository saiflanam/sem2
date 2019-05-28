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
public class KelasPraktikum extends Kelas {
    Mahasiswa asisten;
    
    public KelasPraktikum(MataKuliah matakuliah, String namaKelas, String hari, int sesi,
                String ruang, Dosen dosen, Mahasiswa asisten){
        super(matakuliah, namaKelas, hari, sesi, ruang, dosen);
        this.asisten = asisten;
    }
    
    public String toString(){
        return super.toString() + ", dan asisten "+asisten.namaMahasiswa;
     
    }
}
