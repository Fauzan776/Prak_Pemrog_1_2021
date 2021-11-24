public class Mahasiswa extends Manusia {
    private String nim;
    private String nama;
    private double ipk;
    private int semester;

    public Mahasiswa(String nim, String nama, double ipk, int semester) {
        this.nim = nim;
        this.nama = nama;
        this.ipk = ipk;
        this.semester = semester;
    }

    public void setNIM(String nim) {
        this.nim = nim;
    }

    public String getNIM() {
        return this.nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return this.nama;
    }

    public void setIPK(double ipk) {
        this.ipk = ipk;
    }

    public double getIPK() {
        return this.ipk;
    }

    public void getDetail() {
        System.out.println(this.nim+"\t "+this.nama+"\t "+this.ipk+"\t "+this.tinggiBadan+"\t "+this.beratBadan+"\t Semester "+this.semester);
    }

}