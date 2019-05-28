package ojekonline;

/**
 *
 * @author Saiful Anam
 */
public class Motor extends Kendaraan{
    int tarif=4000;
    public Motor (String merk, String warna, String plat, Driver driver){
        super(merk, warna, plat, driver);
    }
     
    public String toString(){
        return "Motor" + "\n" + super.toString();
    }
}
