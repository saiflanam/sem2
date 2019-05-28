package marketplace;

/**
 *
 * @author Alfarel
 */
public class DaftarBarang {
    Barang barang;
    int jumlah;
    
    public DaftarBarang(Barang barang, int jumlah){
        this.barang = barang;
        this.jumlah = jumlah;
    }
    
    public String toString(){
        return barang.nama + ", harga satuan: " + barang.harga + ", jumlah: " +
               jumlah + ", subtotal " + jumlah*barang.harga + "\n";
    }
}
