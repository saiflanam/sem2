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
public class Guest extends User {
    String alamatEmail, asalInstansi;
    
    public Guest(String username, String password, String nama, String alamat,
                String alamatEmail, String asalInstansi){
        this.username = username;
        this.password = password;
        this.nama = nama;
        this.alamat = alamat;
        this.alamatEmail = alamatEmail;
        this.asalInstansi = asalInstansi;
    }
    
    public String toString() {
        return "Guest \n" + "----- \n" 
                + "Username      : " + username     +"\n" 
                + "Password      : " + password     +"\n"
                + "Nama          : " + nama         +"\n"  
                + "Alamat        : " + alamat       +"\n" 
                + "Id Staff      : " + alamatEmail  +"\n"
                + "Tahun Kontrak : " + asalInstansi +"\n";
    }
    
}
