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
public class Mahasiswa {
    String nama,fakultas;
    int niu,nif,angkatan;
    
    public Mahasiswa (String nama,int niu,int nif,String fakultas,int angkatan){
        this.nama = nama;
        this.niu= niu;
        this.nif =nif;
        this.fakultas=fakultas;
        this.angkatan=angkatan;
    }
    public String toString (){
        return "Mahasiswa" + nama +"Memiliki NIM" + angkatan +"/"+ niu + "/"+ fakultas +
                "/"+nif;
        
    }
}
    
