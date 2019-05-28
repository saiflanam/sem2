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
public class Matakuliah {
    String nama,kodeMk,semester;
    
    
    public Matakuliah (String nama,String kodeMk,String semester){
        this.nama=nama;
        this.kodeMk=kodeMk;
        this.semester=semester;
    }
    public String toString (){
        return "Mata kuliah "+nama+" dengan kode mata kuliah "+kodeMk+" Berada di semester"
                +semester;
        
    }
}
