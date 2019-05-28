package kuliah;

public class Ruang {
    String nama;
    String kodeRuang;
    int lantai;
    String gedung;
    int kapasitas;
    
    public Ruang(String nama, String kodeRuang, int lantai, String gedung, int kapasitas){
        this.nama = nama;
        this.kodeRuang = kodeRuang;
        this.lantai = lantai;
        this.gedung = gedung;
        this.kapasitas = kapasitas;
    }
    
    public String toString(){
        return "Ruang " + nama + " dengan kode " + kodeRuang + " berada di gedung "
                + gedung + " lantai " + lantai + " dan memiliki \nkapasitas " + kapasitas + " orang";
    }
}
