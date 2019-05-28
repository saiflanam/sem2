package tugasoop1;

public class MotorSport {
    String merk, warna, plat, transmisi, gigi, seri;
    int tahun, jumlahPenumpang;
    
    public MotorSport(String merk, String seri, int tahun, String warna, String plat, String transmisi, String gigi){
        this.merk = merk;
        this.seri = seri;
        this.tahun = tahun;
        this.warna = warna;
        this.plat = plat;
        this.transmisi = transmisi;
        this.gigi = gigi;
    }
    
    public String toString(){
        return "Motor Sport\n" +
        "------------\n" +
        "merk : " + this.merk + "\n" +
        "seri : " + this.seri + "\n" +
        "tahun : " + this.tahun + "\n" +
        "warna : " + this.warna + "\n" +
        "plat : " + this.plat + "\n" +
        "transmisi : " + this.transmisi + "\n" +
        "gigi : " + this.gigi + "\n";
    }
}
