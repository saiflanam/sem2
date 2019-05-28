/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OjekRevisi;

/**
 *
 * @author ASUS
 */
public class Customer extends User {
    public Customer(String username, String password, int saldo){
        super(username, password, saldo);
    }
    
    void transaksi(Kendaraan kendaraan, int jarak){
        saldo -= kendaraan.tarif*jarak;
        kendaraan.driver.saldo+=(kendaraan.tarif*jarak)*0.8;
    }
    
    public String toString(){
        return "\n Customer \n" + 
               "-----------------" + super.toString();
    }
}
