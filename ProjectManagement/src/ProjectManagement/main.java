/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectManagement;

/**
 *
 * @author praktikan
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Client client1 = new Client("cl001", "PT ABC", "Sleman", "+62811");
        System.out.println(client1);

        Staff staff1 = new Staff("st005", "Budi", "Jakal");
        Staff staff2 = new Staff("st007", "Nana", "Bantul");
        System.out.println(staff1);
        System.out.println(staff2);

        Project bangunanA = new Project("Gedung Megah", "9 Desember 2019", 1000000000, client1);
        System.out.println(bangunanA);

        Tahapan tahap_A_1 = new Tahapan("Beli bahan baku", "10 Maret 2019", "20 Maret 2019", staff1);

        Tahapan tahap_A_2 = new Tahapan("Peletakan batu pertama", "21 Maret 2019", "22 Maret 2019", staff2);

        System.out.println(tahap_A_1);
        System.out.println(tahap_A_2);

        bangunanA.tahapan[0] = tahap_A_1;
        bangunanA.tahapan[1] = tahap_A_2;

        System.out.println(bangunanA.tahapan[0]);
        System.out.println(bangunanA.tahapan[1]);

    }

}
