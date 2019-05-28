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
public class Staff extends User {
    String idStaff;
    int startWork;
    
    public Staff(String username, String password, String nama, String alamat,
                String idStaff, int startWork){
        this.username = username;
        this.password = password;
        this.nama = nama;
        this.alamat = alamat;
        this.idStaff = idStaff;
        this.startWork = startWork;
    }
    
    
    int getGaji(Staff s){
       return  0;
    }

    public String toString() {
        Staff s = null;
        return "Staff \n" + "------ \n" 
                + "Username      : " + username  +"\n" 
                + "Password      : " + password  +"\n"
                + "Nama          : " + nama      +"\n"  
                + "Alamat        : " + alamat    +"\n" 
                + "Id Staff      : " + idStaff   +"\n"
                + "Tahun Kontrak : " + startWork +"\n"
                + "Gaji          : " + getGaji(s) +"\n";
    }
}
