package ojekonline;

/**
 *
 * @author Saiful Anam
 */
public class Driver extends User {
    public Driver (String username, String password, int saldo){
        super(username, password, saldo);
    }
      
    public String toString(){
        return "Driver" + "\n" +
               "--------------------" + "\n" + super.toString() + "\n";
    }
}
