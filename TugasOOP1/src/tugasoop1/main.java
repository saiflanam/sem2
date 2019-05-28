package tugasoop1;

public class main {

    public static void main (String[] args){
        SepedaMotor sm2 = new SepedaMotor("Yamaha", 2019, "Biru", "AB 1 TT");
        SepedaMotor sm3 = new SepedaMotor("Suzuki", "Kuning");
        
        Mobil m1 = new Mobil("Toyota", 2015, "hitam", "AB 1111 SS", 4, "manual", "N");
        MotorSport ms1 = new MotorSport("Honda", "CBR", 2015, "pink", "AB 1111 SS", "manual", "N");
        
        m1.gigi = "1";
        
        /*
        System.out.println("Mobil");
        System.out.println("------------");
        System.out.println("merk : " + m1.merk);
        System.out.println("tahun : " + Integer.toString(m1.tahun));
        System.out.println("warna : " + m1.warna);
        System.out.println("plat : " + m1.plat);
        System.out.println("jumlah penumpang : " + m1.jumlahPenumpang);
        System.out.println("transmisi : " + m1.transmisi);
        System.out.println("gigi : " + m1.gigi);
        */
        
        System.out.println(m1);
        
        ms1.gigi = "2";
        
        /*
        System.out.println();
        System.out.println("Motor Sport");
        System.out.println("------------");
        System.out.println("merk : " + ms1.merk);
        System.out.println("seri : " + ms1.seri);
        System.out.println("tahun : " + ms1.tahun);
        System.out.println("warna : " + ms1.warna);
        System.out.println("plat : " + ms1.plat);
        System.out.println("transmisi : " + ms1.transmisi);
        System.out.println("gigi : " + ms1.gigi);
        */
        
        System.out.println(ms1.toString());
    }
}
