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
public class Staff {

    private String idStaff, namaStaff, alamatStaff;

    String getNamaStaff() {
        return namaStaff;
    }

    public Staff(String idStaff, String namaStaff, String alamatStaff) {
        this.idStaff = idStaff;
        this.namaStaff = namaStaff;
        this.alamatStaff = alamatStaff;
    }

    public String toString() {
        return "Staff " + namaStaff + " dengan nomor " + idStaff + " beralamatkan di " + alamatStaff;
    }
}
