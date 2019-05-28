package marketplace;

/**
 *
 * @author Alfarel
 */
public class Transaksi {
    Pembeli pembeli;
    Penjual penjual;
    DaftarBarang[] daftarbarang = new DaftarBarang[3];
    int totalHarga;
    
    public Transaksi(Pembeli pembeli, Penjual penjual, DaftarBarang[] daftarbarang, int totalHarga){
        this.pembeli = pembeli;
        this.penjual = penjual;
        this.daftarbarang = daftarbarang;
        this.totalHarga = totalHarga;
    }
}
