package hiduppns;

/**
 *
 * @author Alfarel Zaki
 */
public class StaffTetap extends Staff{
    int gajiPokok=0, jumlahAnak;
    
    public StaffTetap(String username, String password, String nama, String alamat, String idStaff, int tahunMulaiKontrak, int gajiPokok, int jumlahAnak){
        super(username, password, nama, alamat, idStaff, tahunMulaiKontrak);
        this.gajiPokok = gajiPokok;
        this.jumlahAnak = jumlahAnak;
    }
    
    public int getGaji(){
        return gajiPokok+(jumlahAnak*100000);
    }
    
    public String toString(){
        return "Staff Tetap\n" + "------\n" +
               "Username       : " + username + "\n" +
               "Password       : " + password + "\n" +
               "Nama           : " + nama + "\n" +
               "Alamat         : " + alamat + "\n" +
               "Id Staff       : " + idStaff + "\n" +
               "Tahun Kontrak  : " + tahunMulaiKontrak + "\n" +
               "Gaji Pokok     : " + gajiPokok + "\n" +
               "Jumlah Anak    : " + jumlahAnak + "\n" +
               "Gaji per Bulan : " + getGaji() + "\n";
    }
}
