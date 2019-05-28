package kuliah;

public class Kelas {
    String nama;
    String kodeKelas;
    MataKuliah mataKuliah;
    Ruang ruang;
    String hari;
    int sesi;
    Mahasiswa Mahasiswa[];
    
    public Kelas(String nama, String kodeKelas, MataKuliah mataKuliah, Ruang ruang, String hari, int sesi, Mahasiswa Mahasiswa[]){
        this.nama = nama;
        this.kodeKelas = kodeKelas;
        this.mataKuliah = mataKuliah;
        this.ruang = ruang;
        this.hari = hari;
        this.sesi = sesi;
        this.Mahasiswa = Mahasiswa;
    }
    
    public String toString(){
        return "Kelas " + nama + " dengan kode " + kodeKelas + " berasal dari mata kuliah " + mataKuliah.nama +
                ", \ndiselenggarakan di ruang " + ruang.nama + ", hari " + hari + ", sesi " + sesi + ", dengan mahasiswa \nberjumlah " +
                Mahasiswa[1] + " orang";
    }
}
