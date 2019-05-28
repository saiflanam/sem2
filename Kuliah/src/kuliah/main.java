package kuliah;

public class main {

    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa("Nana", 123456, 98765, "SV", 15);
        System.out.println(mhs1);
        
        Mahasiswa mhs2 = new Mahasiswa("Lala", 654321, 56789, "SV", 16);
        System.out.println(mhs2);
        
        Mahasiswa mhs3 = new Mahasiswa("Rara", 321654, 76598, "SV", 17);
        System.out.println(mhs3 + "\n");
        
        Mahasiswa arrayMhsPBO[] = new Mahasiswa[3];
        arrayMhsPBO[0] = mhs1;
        arrayMhsPBO[1] = mhs2;
        arrayMhsPBO[2] = mhs3;
        
        /*
        arrayMhsPBO[0] = new Mahasiswa("Farel", 432178, 16114, "SV", 18);
        System.out.println(arrayMhsPBO[0]);
        */
        
        MataKuliah mk1 = new MataKuliah("PBO", "VMK11", "genap1819");
        System.out.println(mk1 + "\n");
        
        Ruang r1 = new Ruang("Lab RPL 1", "RPL1", 1, "HY", 25);
        System.out.println(r1 + "\n");
        
        Kelas k1 = new Kelas("PBO A1", "VMK11-A1", mk1, r1, "Selasa", 2, arrayMhsPBO);
        System.out.println(k1 + "\n");
        
    }
    
}
