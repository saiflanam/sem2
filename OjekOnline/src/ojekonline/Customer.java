package ojekonline;

/**
 *
 * @author Saiful Anam
 */
public class Customer extends User{
    public Customer(String username, String password, int saldo){
        super(username, password, saldo);
    }
    
    void pesanGoFood(Motor motor, int jarak, Makanan makanan, int banyak){
        saldo -= motor.tarif*jarak;
        saldo -= makanan.harga*banyak;
        motor.driverDuitMasuk(jarak);
    }
    
    void pesanGoJek(Motor motor, int jarak){
        saldo -= motor.tarif*jarak;
        motor.driverDuitMasuk(jarak);
    }
    
    void pesanGoCar(Mobil mobil, int jarak){
        saldo-= mobil.tarif*jarak;
        mobil.driverDuitMasuk(jarak);
    }
    
    void transaksi(Kendaraan kendaraan, int jarak){
        saldo -= kendaraan.tarif*jarak;
        kendaraan.driver.saldo+=(kendaraan.tarif*jarak)*0.8;
    }
    
    public String toString(){
        return "Customer" + "\n" +
               "--------------------" + "\n" + super.toString();
    }
}
