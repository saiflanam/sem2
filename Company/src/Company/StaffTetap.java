/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Company;

/**
 *
 * @author ASUS
 */
public class StaffTetap extends Staff{
    int gajiPokok;
    int jumlahAnak;
    
    public StaffTetap(String username, String password, String nama, String alamat,
                String idStaff, int startWork, int gajiPokok, int jumlahAnak){
        super(username, password, nama, alamat, idStaff, startWork);
        this.gajiPokok = gajiPokok;
        this.jumlahAnak = jumlahAnak;
    }
    
    int getGaji(int jumlahAnak){
        return jumlahAnak*100000;
    }
    
    public String toString(){
        return "Staff Tetap \n" + "----------- \n" 
                + "Username       : " + username   +"\n" 
                + "Password       : " + password   +"\n"
                + "Nama           : " + nama       +"\n"  
                + "Alamat         : " + alamat     +"\n" 
                + "Id Staff       : " + idStaff    +"\n"
                + "Tahun Kontrak  : " + startWork  +"\n"
                + "Gaji Pokok     : " + gajiPokok  +"\n"
                + "Jumlah Anak    : " + jumlahAnak +"\n"
                + "Gaji per Bulan : " + getGaji(jumlahAnak)  +"\n"; 
    }
    
    
}
