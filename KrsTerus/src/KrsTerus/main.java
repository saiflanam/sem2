/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KrsTerus;

/**
 *
 * @author ASUS
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MataKuliah daftarMataKuliahKomsi [] = new MataKuliah [3];
        daftarMataKuliahKomsi [0] = new MataKuliah ("VMK1111","PTI",1);
        daftarMataKuliahKomsi [1] = new MataKuliah ("VMK3333","PBO",3);
        daftarMataKuliahKomsi [2] = new MataKuliah ("VMK5555","Manpro",5);
        
        for(int i=0;i<3;i++){
            System.out.println("Matakuliah Komsi nomor "+i+daftarMataKuliahKomsi[i]);
        }
        System.out.println("\n");
        //output 1 lakukan perulangan untuk mencetak ketiga mata kuliah

        Mahasiswa daftarMahasiswaKomsi [] = new Mahasiswa [3];
        daftarMahasiswaKomsi [0] = new Mahasiswa (new NIM(15,123456,"SV",98765),"Lala");
        daftarMahasiswaKomsi [1] = new Mahasiswa (new NIM(16,456123,"SV",56789),"Lili");
        daftarMahasiswaKomsi [2] = new Mahasiswa (new NIM(17,654321,"SV",76589),"Lulu");
        
        for(int i=0;i<3;i++){
            System.out.println("Mahasiswa Komsi nomor "+i+daftarMahasiswaKomsi[i]);
        }
        System.out.println("\n");
        //output 2 lakukan perulangan untuk mencetak ketiga mahasiswa
     
        Dosen daftarDosenKomsi [] = new Dosen [3];
        daftarDosenKomsi [0] = new Dosen (123456789, "Nana");
        daftarDosenKomsi [1] = new Dosen (567891234, "Nene");
        daftarDosenKomsi [2] = new Dosen (456123789, "Nono");
        
        for(int i=0;i<3;i++){
            System.out.println("Dosen Komsi nomor "+i+daftarDosenKomsi[i]);
        }
        System.out.println("\n");
        //output 3 lakukan perulangan untuk mencetak ketiga dosen

        Kelas daftarKelasKomsi [] = new Kelas [4];
        daftarKelasKomsi [0] = new Kelas (daftarMataKuliahKomsi [0], "A", "Senin",
                1,"U202",daftarDosenKomsi[1]);
        daftarKelasKomsi [1] = new KelasPraktikum (daftarMataKuliahKomsi [1], 
                "A", "Selasa",3,"Lab3",daftarDosenKomsi[1],daftarMahasiswaKomsi[1]);
        daftarKelasKomsi [2] = new KelasPraktikum (daftarMataKuliahKomsi [2], 
                "A", "Rabu",4,"Lab4",daftarDosenKomsi[2],daftarMahasiswaKomsi[2]);
        daftarKelasKomsi [3] = new Kelas (daftarMataKuliahKomsi [1], 
                "B", "Kamis",2,"U203",daftarDosenKomsi[0]);
  
        for(int i=0;i<4;i++){
            System.out.println("Kelas Komsi nomor "+i+daftarKelasKomsi[i]);
        }
        System.out.println("\n");
        //output 4 lakukan perulangan untuk mencetak ketiga kelas

        
        daftarKelasKomsi[0].mahasiswa[0] = daftarMahasiswaKomsi[1];
        daftarKelasKomsi[0].mahasiswa[1] = daftarMahasiswaKomsi[2];

        //output 5
        daftarKelasKomsi[0].cetakMahasiswa();

        daftarKelasKomsi[1].mahasiswa[0] = daftarMahasiswaKomsi[0];
        daftarKelasKomsi[1].mahasiswa[1] = daftarMahasiswaKomsi[2];

        //output 6
        daftarKelasKomsi[1].cetakMahasiswa();

        daftarKelasKomsi[2].mahasiswa[0] = daftarMahasiswaKomsi[1];
        daftarKelasKomsi[2].mahasiswa[1] = daftarMahasiswaKomsi[0];

        //output 7
        daftarKelasKomsi[2].cetakMahasiswa();

        daftarKelasKomsi[3].mahasiswa[0] = daftarMahasiswaKomsi[1];
        daftarKelasKomsi[3].mahasiswa[1] = daftarMahasiswaKomsi[2];

        //output 8
        daftarKelasKomsi[3].cetakMahasiswa();

     }
    
}
