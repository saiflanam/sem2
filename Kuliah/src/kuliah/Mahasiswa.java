package kuliah;

public class Mahasiswa {
    String nama;
    int niu;
    int nif;
    String fakultas;
    int angkatan;
    
    public Mahasiswa(String nama, int niu, int nif, String fakultas, int angkatan){
        this.nama = nama;
        this.niu = niu;
        this.nif = nif;
        this.fakultas = fakultas;
        this.angkatan = angkatan;
    }
    @Override
    public String toString(){
        return "Mahasiswa " + nama + " memiliki NIM " + angkatan + "/" + niu + "/" + fakultas + "/" + nif;
    }
}
