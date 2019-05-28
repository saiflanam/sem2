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
public class Motor extends Kendaraan{
    boolean antarMakanan;
//    super.tarif = 6000;
    
    public Motor(Driver driver, boolean antarMakanan){
        super(driver);
        tarif = 3000;
        this.antarMakanan = antarMakanan;
    }
}
