package hiduppns;

/**
 *
 * @author Alfarel Zaki
 */
public class Tamu extends User{
    String alamatEmail, asalInstansi;
    
    public Tamu(String username, String password, String nama, String alamat, String alamatEmail, String asalInstansi){
        super(username, password, nama, alamat);
        this.alamatEmail = alamatEmail;
        this.asalInstansi = asalInstansi;
    }
    
    public String toString(){
        return "Tamu\n" + "------\n" +
               "Username       : " + username + "\n" +
               "Password       : " + password + "\n" +
               "Nama           : " + nama + "\n" +
               "Alamat         : " + alamat + "\n" +
               "Email          : " + alamatEmail + "\n" +
               "Institusi      : " + asalInstansi + "\n"; 
    }
}
