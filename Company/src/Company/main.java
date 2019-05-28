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
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Staff st0 = new Staff
                ("usename00","password00","namaStaf00",
                "alamatStaff00","staf00",2012);
        System.out.println(st0);
        
        StaffTetap st1 = new StaffTetap
                ("usename01","password01","namaStaf01",
                "alamatStaff01","staf01",2015,1500000,2);
        System.out.println(st1);
        
        StaffTetap st2 = new StaffTetap
                ("usename02","password02","namaStaf02",
                "alamatStaff02","staf02",2015,1500000,3);
        System.out.println(st2);
        
        StaffTidakTetap st3 = new StaffTidakTetap
                ("usename03","password03","namaStaf03",
                "alamatStaff03","staf03",2016,25000,10);
        System.out.println(st3);
        
        StaffTidakTetap st4 = new StaffTidakTetap
                ("usename04","password04","namaStaf04",
                "alamatStaff04","staf04",2017,20000,15);
        System.out.println(st4);
        
        Guest tm1 = new Guest 
                ("username05","password05","namaTamu01","alamatTamu01",
                "emailTamu01@gmail.com","institusiTamu01");
        System.out.println(tm1);
        
        Guest tm2 = new Guest
                ("username06","password06","namaTamu02","alamatTamu02",
                "emailTamu02@gmail.com","institusiTamu02");
        System.out.println(tm2);
    }
    
}
