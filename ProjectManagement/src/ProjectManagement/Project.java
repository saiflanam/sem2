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
public class Project {

    String namaProject;
    String deadline;
    int harga;
    Client client;
    Tahapan tahapan[] = new Tahapan[9];

    public Project(String namaProject, String deadline, int harga, Client client) {
        this.namaProject = namaProject;
        this.deadline = deadline;
        this.harga = harga;
        this.client = client;
    }

    public String toString() {
        return "Bangunan " + namaProject + " direncenakan selesai pada " + deadline + " dengan budget " + harga + " dimiliki oleh client " + client.getNamaClient();
    }
}
