package hiduppns;

/**
 *
 * @author Alfarel Zaki
 */
public class Staff extends User{
    String idStaff;
    int tahunMulaiKontrak;
    
    public Staff(String username, String password, String nama, String alamat, String idStaff, int tahunMulaiKontrak){
        super(username, password, nama, alamat);
        this.idStaff = idStaff;
        this.tahunMulaiKontrak = tahunMulaiKontrak;
    }
    
    public int getGaji(){
        return 0;
    }
    
    public String toString(){
        return "Staff\n" + "------\n" +
               "Username       : " + username + "\n" +
               "Password       : " + password + "\n" +
               "Nama           : " + nama + "\n" +
               "Alamat         : " + alamat + "\n" +
               "Id Staff       : " + idStaff + "\n" +
               "Tahun Kontrak  : " + tahunMulaiKontrak + "\n" +
               "Gaji per Bulan : " + getGaji() + "\n";
    }
}
