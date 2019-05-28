package tugasoop1;

public class Mobil {
    String merk, warna, plat, transmisi, gigi, seri;
    int tahun, jumlahPenumpang;
    
    public Mobil(String merk, int tahun, String warna, String plat, int jumlahPenumpang, String transmisi, String gigi){
        this.merk = merk;
        this.tahun = tahun;
        this.warna = warna;
        this.plat = plat;
        this.jumlahPenumpang = jumlahPenumpang;
        this.transmisi = transmisi;
        this.gigi = gigi;
    }
    
    public String toString(){
        return "Mobil\n" +
        "------------\n" +
        "merk : " + merk + "\n" +
        "tahun : " + tahun + "\n" +
        "warna : " + warna + "\n" +
        "plat : " + plat + "\n" +
        "jumlah penumpang : " + jumlahPenumpang + "\n" +
        "transmisi : " + transmisi + "\n" +
        "gigi : " + gigi + "\n";
    }
}
