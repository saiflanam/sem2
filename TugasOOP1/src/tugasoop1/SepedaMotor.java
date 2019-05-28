package tugasoop1;

public class SepedaMotor {

	String merk;
	int tahun;
	String warna;
	String plat;

	public SepedaMotor(String merk, int tahun, String warna, String plat){
		this.merk = merk;
		this.tahun = tahun;
		this.warna = warna;
		this.plat = plat;
	}
	
	public SepedaMotor(String merk, String warna){
		this.merk = merk;
		this.warna = warna;
	}
}