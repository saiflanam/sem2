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
public class StaffTidakTetap extends Staff {
    int honorPerJam, jumlahJamKerjaPerBulan;
    
    public StaffTidakTetap(String username, String password, String nama, String alamat,
                String idStaff, int startWork, int honorPerJam, int jumlahJamKerjaPerBulan){
        super(username, password, nama, alamat, idStaff, startWork);
        this.honorPerJam = honorPerJam;
        this.jumlahJamKerjaPerBulan = jumlahJamKerjaPerBulan;
    }
    
    int getGaji(){
        return honorPerJam*jumlahJamKerjaPerBulan;
    }
    
    public String toString(){
        return "Staff Tidak Tetap \n" + "----------------- \n" 
                + "Username       : " + username               +"\n" 
                + "Password       : " + password               +"\n"
                + "Nama           : " + nama                   +"\n"  
                + "Alamat         : " + alamat                 +"\n" 
                + "Id Staff       : " + idStaff                +"\n"
                + "Tahun Kontrak  : " + startWork              +"\n"
                + "HR per jam     : " + honorPerJam            +"\n"
                + "Jam per Bulan  : " + jumlahJamKerjaPerBulan +"\n"
                + "Gaji per Bulan : " + getGaji()              +"\n"; 
    }
    
}
