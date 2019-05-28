package ojekonline;
/**
 *
 * @author Saiful Anam
 */
public class User {
    String username, password;
    int saldo;
    
    public User(String username, String password, int saldo){
        this.username = username;
        this.password = password;
        this.saldo = saldo;
    }
    
    void tambahSaldo(int tambah){
        saldo += tambah;
    }
    
    public String toString(){
        return "Username : " + username + "\n" +
               "Password : " + password + "\n" +
               "Saldo    : " + saldo + "\n";
    }
}
