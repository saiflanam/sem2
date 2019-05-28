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
public class MataKuliah {
    String kode, namaMataKuliah;
    int semester;
    
    public MataKuliah(String kode, String namaMataKuliah, int semester){
        this.kode = kode;
        this.namaMataKuliah = namaMataKuliah;
        this.semester = semester;
    }
    
    public String toString(){
        return ": " + kode + " dengan nama " + namaMataKuliah;
    }
}
