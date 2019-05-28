package ojekonline;

/**
 *
 * @author Saiful Anam
 */
public class Makanan {
    String nama;
    int harga;
    
    public Makanan(String nama, int harga){
        this.nama = nama;
        this.harga = harga;
    }
    
    public String toString(){
        return "Makananan\n" +
        "------------------" + "\n" +
        "Nama      : " + nama + "\n" +
        "Harga     : " + harga + "\n";
    }
}
