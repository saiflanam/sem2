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
public class Client {

    /**
     *Nama perusahaan yang dimiliki oleh Client 
     */
    String namaClient;
    private String idClient, alamatClient, noTelp;
    
    
    /**
     * 
     * @return method ini sebagai pengambil data nama klien 
     */
    String getNamaClient() {
        return namaClient;
    }
    
    /**
     * 
     * @param alamatBaru 
     */
    void setAlamatClient(String alamatBaru) {
        alamatClient = alamatBaru;
    }
    
    /**
     * 
     * @param idClient nomor identitas client
     * @param namaClient nama lengkap perusahaam client
     * @param alamatClient alamat tempat client bekerja
     * @param noTelp tulis kode area + nomor
     */
    public Client(String idClient, String namaClient, String alamatClient, String noTelp) {
        this.idClient = idClient;
        this.namaClient = namaClient;
        this.alamatClient = alamatClient;
        this.noTelp = noTelp;
    }

    public String toString() {
        return "Client " + namaClient + " dengan nomor " + idClient + ", berlamatkan di "
                + alamatClient + ", no HP " + noTelp;
    }
}
