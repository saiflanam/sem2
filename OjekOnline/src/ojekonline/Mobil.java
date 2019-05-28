package ojekonline;

/**
 *
 * @author Saiful Anam
 */
public class Mobil extends Kendaraan{
    int tarif=7000;
    int jumlahPenumpang;
    
    public Mobil(String merk, String warna, String plat, Driver driver, int jumlahPenumpang){
        super(merk, warna, plat, driver);
        this.jumlahPenumpang = jumlahPenumpang;
    }
    
    public String toString(){
        return "Mobil" + "\n" + super.toString() + "Jumlah penumpang : " + jumlahPenumpang + "\n";
    }
}
