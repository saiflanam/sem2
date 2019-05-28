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
public class Ruang {
    String nama,kodeRuang,gedung;
    int lantai,kapasitas;
    
    public Ruang (String nama,String kodeRuang,int lantai,String gedung,
            int kapasitas){
        this.nama=nama;
        this.kodeRuang=kodeRuang;
        this.lantai=lantai;
        this.gedung=gedung;
        this.kapasitas=kapasitas;
    }
    public String toString(){
        return "Ruang "+nama+" dengan kode "+kodeRuang+" berada di gedung "+gedung+
                " lantai "+lantai+ "d an memiliki kapasitas "+kapasitas+" orang";
    }
    
}
