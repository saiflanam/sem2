package hiduppns;

/**
 *
 * @author Alfarel Zaki
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Staff st0 = new Staff("username00", "password00", "namaStaff00", "alamatStaff00", "staff00", 2012);
        System.out.println(st0);
        
        StaffTetap st1 = new StaffTetap("username01", "password01", "namaStaff01", "alamatStaff01", "staff01", 2015, 1500000, 2);
        System.out.println(st1);
        
        StaffTetap st2 = new StaffTetap("username02", "password02", "namaStaff02", "alamatStaff02", "staff02", 2015, 1500000, 3);
        System.out.println(st2);
        
        StaffTidakTetap st3 = new StaffTidakTetap("username03", "password03", "namaStaff03", "alamatStaff03", "staff03", 2016, 25000, 10);
        System.out.println(st3);
        
        StaffTidakTetap st4 = new StaffTidakTetap("username04", "password04", "namaStaff04", "alamatStaff04", "staff04", 2017, 20000, 15);
        System.out.println(st4);
        
        Tamu tm1 = new Tamu("username05", "password05", "namaTamu01", "alamatTamu01","emailTamu01@gmail.com", "institusiTamu01");
        System.out.println(tm1);
        
        Tamu tm2 = new Tamu("username06", "password06", "namaTamu02", "alamatTamu02","emailTamu02@gmail.com", "institusiTamu02");
        System.out.println(tm2);
    }
}
