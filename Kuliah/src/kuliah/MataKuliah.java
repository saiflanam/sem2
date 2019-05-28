package kuliah;

public class MataKuliah {
    String nama;
    String kodeMK;
    String semester;
    
    public MataKuliah(String nama, String kodeMK, String semester){
        this.nama = nama;
        this.kodeMK = kodeMK;
        this.semester = semester;
    }
    
    public String toString(){
        return "Mata Kuliah " + nama + " dengan kode mata kuliah " + kodeMK + " berada di semester " + semester;
    }
}
