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
public class Mobil extends Kendaraan{
    int jumlahPenumpang;
//    super.tarif = 6000;
    
    public Mobil(Driver driver, int jumlahPenumpang){
        super(driver);
        tarif = 6000;
        this.jumlahPenumpang = jumlahPenumpang;
    }
}
