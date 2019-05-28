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
public class Tahapan {

    String namaTahapan, start, end;
    Staff staff;

    public Tahapan(String namaTahapan, String start, String end, Staff staff) {
        this.namaTahapan = namaTahapan;
        this.start = start;
        this.end = end;
        this.staff = staff;
    }

    public String toString() {
        return "Tahapan " + namaTahapan + " diawali pada tanggal " + start + " dan diakhiri pada " + end + " dengan penanggungjawab " + staff.getNamaStaff();
    }
}
