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
public class Dosen {
    int nidn;
    String namaDosen;
    
    public Dosen(int nidn, String namaDosen){
        this.nidn = nidn;
        this.namaDosen = namaDosen;
    }
    
    public String toString(){
        return ": "+nidn+" dengan nama "+namaDosen;
    }
    
}
