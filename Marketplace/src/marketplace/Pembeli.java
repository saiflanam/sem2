package marketplace;

/**
 *
 * @author Alfarel
 */
public class Pembeli extends User{
    int usia;
    String gender;
    
    public Pembeli(String username, String password, int usia, String gender){
        super(username, password);
        this.usia = usia;
        this.gender = gender;
    }
    
    public void beli(Penjual penjual, DaftarBarang daftarbeli[]){        
        boolean bisa = true;
        int sum=0;
        String indeks="";
        System.out.println("Daftar Belanja");
        for (int i=1; i<=daftarbeli.length; i++){
            System.out.print("(" + i + ")" + daftarbeli[i-1].toString());
            if (daftarbeli[i-1].barang.stock<daftarbeli[i-1].jumlah){
                bisa = false;
                indeks += i + " ";
            }
            sum += daftarbeli[i-1].jumlah*daftarbeli[i-1].barang.harga;
        }
        
        if (bisa){
            new Transaksi(this, penjual, daftarbeli, sum);
            for (int i=0; i<daftarbeli.length; i++){
                daftarbeli[i].barang.stock-=daftarbeli[i].jumlah;
            }
            
            System.out.println("Transaksi berhasil disimpan. Total belanja: " + sum + "\n");
        } else {
            System.out.println("Maaf, stock, barang nomor " + indeks + "tidak mencukupi. transaksi dibatalkan\n");
        }
    }
    
    public String toString(){
        return "Pembeli " + username + " berusia " + usia +
               " tahun, dengan jenis kelamin " + gender + "\n";
    }
}
