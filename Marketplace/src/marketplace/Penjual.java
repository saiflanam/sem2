package marketplace;

/**
 *
 * @author Alfarel
 */
public class Penjual extends User{
    String namaToko;
    
    public Penjual(String username, String password, String namaToko){
        super(username, password);
        this.namaToko = namaToko;
    }
    
    public String toString(){
        return "Penjual " + username + " memiliki " + namaToko + "\n";
    }
}
