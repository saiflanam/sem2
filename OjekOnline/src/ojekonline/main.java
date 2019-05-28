package ojekonline;

/**
 *
 * @author Saiful Anam
 */
public class main {
    public static void main(String[] args) {
        int SV = 3;
        int Preksu = 5;
        Makanan ayam = new Makanan("ayam geprek", 14000);
        Customer bintang = new Customer("bintang","pointermyself", 25000);
        Customer asya = new Customer("asya", "gimanajal", 130000);
        Driver rifan = new Driver("rifan", "lemescuk", 60000);
        Driver albab = new Driver("albab", "bastian", 110000);
        Mobil toyota1 = new Mobil("Toyota", "Kuning", "AB 7757 XA", albab, 4);
        Motor honda1 = new Motor("Honda", "Hitam", "AA 1924 CA", rifan);
        
        bintang.tambahSaldo(100000);
        albab.tambahSaldo(25000);
        bintang.pesanGoJek(honda1, SV);
        asya.pesanGoCar(toyota1, SV);
        asya.pesanGoFood(honda1, Preksu, ayam, 2);
        System.out.println(bintang);
        System.out.println(rifan);
        System.out.println(toyota1);
        System.out.println(honda1);
        System.out.println(asya);
        System.out.println(albab);
    }
}
