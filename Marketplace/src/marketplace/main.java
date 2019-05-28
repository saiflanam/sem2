package marketplace;

/**
 *
 * @author Alfarel
 */
public class main {
    public static void main(String[] args) {
        Penjual a1 = new Penjual("user1", "password1", "toko Hape");
        System.out.println(a1);
        
        Pembeli a2 = new Pembeli("user2", "password2", 19, "perempuan");
        System.out.println(a2);
        
        Barang b1 = new Barang("Samsung J6", a1, 2500000, 5);
        System.out.println(b1);
        
        Barang b2 = new Barang("clear case samsung J6", a1, 15000, 2);
        System.out.println(b2);
        
        Barang b3 = new Barang("dompet HP Hello Kitty", a1, 36000, 1);
        System.out.println(b3);
        
        DaftarBarang daftarBeliUser1[] = new DaftarBarang[3];
        daftarBeliUser1[0] = new DaftarBarang(b1,5);
        daftarBeliUser1[1] = new DaftarBarang(b2,1);
        daftarBeliUser1[2] = new DaftarBarang(b3,2);
        
        a2.beli(a1, daftarBeliUser1);
        
        daftarBeliUser1[2].jumlah = 1;
        a2.beli(a1, daftarBeliUser1);
        
//        System.out.println(b3);
    }
    
}
