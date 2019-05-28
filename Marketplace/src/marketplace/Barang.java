package marketplace;

/**
 *
 * @author Alfarel
 */
public class Barang {
    String nama;
    int harga, stock;
    Penjual penjual;
    
    public Barang(String nama, Penjual penjual, int harga, int stock){
        this.nama = nama;
        this.penjual = penjual;
        this.harga = harga;
        this.stock = stock;
    }
    
    public String toString(){
        return "Barang " + nama + " dijual oleh " + penjual.username +
               " seharga " + harga + ", dengan stock " + stock + "\n";
    }
}
