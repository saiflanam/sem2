package hiduppns;

/**
 *
 * @author Alfarel Zaki
 */
public class StaffTidakTetap extends Staff{
    int honorPerJam, jumlahJamKerjaPerBulan;
    
    public StaffTidakTetap(String username, String password, String nama, String alamat, String idStaff, int tahunMulaiKontrak, int honorPerJam, int jumlahJamKerjaPerBulan){
        super(username, password, nama, alamat, idStaff, tahunMulaiKontrak);
        this.honorPerJam = honorPerJam;
        this.jumlahJamKerjaPerBulan = jumlahJamKerjaPerBulan;
    }
    
    public int getGaji(){
        return honorPerJam*jumlahJamKerjaPerBulan;
    }
    
    public String toString(){
        return "Staff Tidak Tetap\n" + "------\n" +
               "Username       : " + username + "\n" +
               "Password       : " + password + "\n" +
               "Nama           : " + nama + "\n" +
               "Alamat         : " + alamat + "\n" +
               "Id Staff       : " + idStaff + "\n" +
               "Tahun Kontrak  : " + tahunMulaiKontrak + "\n" +
               "HR per Jam     : " + honorPerJam + "\n" +
               "Jam per Bulan  : " + jumlahJamKerjaPerBulan + "\n" +
               "Gaji per Bulan : " + getGaji() + "\n";
    }
}
