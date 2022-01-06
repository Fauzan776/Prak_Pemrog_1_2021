import java.util.Scanner;
public class Siakad {
    Mahasiswa[] mahasiswa = new Mahasiswa[1000];
    private int jumlahData = 0;

    public static void main(String[] args) {
        
        Siakad siakad = new Siakad();
        int menu = 0;
        while (menu!=9) {
            menu = tampilanMenu();
            if (menu==1) {
                siakad.lihatData();
            } else if (menu==2) {
                siakad.tambahData();
            } else if (menu==3) {
                siakad.cariData();
            } else if (menu==4) {
                siakad.rerataIPK();
            } else if (menu==5) {
                siakad.editData();
            } else if (menu==6) {
                siakad.hapusData();
            }
        }
    }

    private static int tampilanMenu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("..Menu..");
        System.out.println("1. Lihat Data");
        System.out.println("2. Tambah Data");
        System.out.println("3. Cari Data");
        System.out.println("4. Rerata IPK");
        System.out.println("5. Edit Data");
        System.out.println("6. Hapus Data");
        System.out.println("9. Keluar");
        System.out.print("Pilih menu = ");
        int menu = scan.nextInt();
        return menu;
        
    }

    private void lihatData() {
        if (jumlahData==0) {
            System.out.println("Belum ada data");
        } else {
            System.out.println("Berikut data mahasiswa");
            System.out.printf("%1s %20s %20s %10s %10s %10s", "NIM", "NAMA", "IPK", "TINGGI BADAN", "BERAT BADAN", "SEMESTER");
            System.out.println();
            System.out.println("-----------------------------------------------------------------------------");
            for (int i=0; i<jumlahData; i++) {
                mahasiswa[i].getDetail();
            }
        }
        
    }

    private void tambahData() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan NIM mahasiswa = ");
        String nim = scan.nextLine();
        System.out.print("Masukan Nama mahasiswa = ");
        String nama = scan.nextLine();
        double ipk = 0;
        double semester = 0;
        double tinggi = 0;
        double berat = 0;
        try {
            System.out.print("Masukan IPK mahasiswa = ");
            ipk = scan.nextDouble();
            System.out.print("Masukan Semester mahasiswa = ");
            semester = scan.nextDouble();
            System.out.print("Masukan Tinggi Badan mahasiswa = ");
            tinggi = scan.nextDouble();
            System.out.print("Masukan Berat Badan mahasiswa = ");
            berat = scan.nextDouble();
        } catch (Exception e) {
            System.out.println("Anda harus memasukan bilangan desimal dengan menggunakan tanda titik. Silahkan edit IPK atau tinggi anda setelah input data");
        }
        Mahasiswa inputMahasiswa = new Mahasiswa(nim, nama, ipk, (int) semester);
        inputMahasiswa.setTinggiBadan(tinggi);
        inputMahasiswa.setBeratBadan(berat);
        mahasiswa[jumlahData] = inputMahasiswa;
        jumlahData++;
    }

    public int getIndexByNIMDanNama(String data) {
        for (int i=0; i<jumlahData; i++) {
            if (mahasiswa[i].getNIM().equals(data) || mahasiswa[i].getNama().equals(data)) {
                return i;
            }
        }
        return -1;
    }

    public void cariData() {
        Scanner scan = new Scanner(System.in);
        System.out.println("-Cari Data-");
        System.out.println("1. Cari data dengan NIM");
        System.out.println("2. Cari data dengan Nama");
        System.out.print("Pilih Menu = ");
        int menu = scan.nextInt();
        if (menu==1) {
            cariDatabyNIM();
        } else if (menu==2) {
            cariDatabyNama();
        } else {
            System.out.println("Menu tidak ada");
        }
    }

    public void cariDatabyNIM() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan NIM mahasiswa yang akan dicari = ");
        String nim = scan.nextLine();
        int index = getIndexByNIMDanNama(nim);
        if (index==-1) {
            System.out.println("NIM yang anda cari tidak ketemu");
        } else {
            System.out.println("Berikut data mahasiswa");
            mahasiswa[index].getDetail();
        }
    }
    
    public void cariDatabyNama() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan Nama mahasiswa yang akan dicari = ");
        String nama = scan.nextLine();
        int index = getIndexByNIMDanNama(nama);
        if (index==-1) {
            System.out.println("Nama yang anda cari tidak ketemu");
        } else {
            System.out.println("Berikut data mahasiswa");
            mahasiswa[index].getDetail();
        }
    }

    public void editData() {
        Scanner scan = new Scanner(System.in);
        System.out.println("-Edit Data-");
        System.out.println("1. Edit NIM");
        System.out.println("2. Edit Nama");
        System.out.print("Pilih Menu = ");
        int menu = scan.nextInt();
        if (menu==1) {
            editNIM();
        } else if (menu==2) {
           editNama();
        } else {
            System.out.println("Menu tidak ada");
        }
    }

    public void editNIM() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan NIM mahasiswa yang akan diedit = ");
        String nim = scan.nextLine();
        int index = getIndexByNIMDanNama(nim);
        if (index==-1) {
            System.out.println("NIM yang anda akan edit tidak ketemu");
        } else {
            System.out.println("Berikut data mahasiswa");
            mahasiswa[index].getDetail();
            System.out.print("Masukan NIM mahasiswa yang baru = ");
            String nimBaru = scan.nextLine();
            mahasiswa[index].setNIM(nimBaru);
            mahasiswa[index].getDetail();
        } 
    }

    public void editNama() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan NIM mahasiswa yang akan diedit = ");
        String nim = scan.nextLine();
        int index = getIndexByNIMDanNama(nim);
        if (index==-1) {
            System.out.println("NIM yang anda akan edit tidak ketemu");
        } else {
            System.out.println("Berikut data mahasiswa");
            mahasiswa[index].getDetail();
            System.out.print("Masukan Nama mahasiswa yang baru = ");
            String nama = scan.nextLine();
            mahasiswa[index].setNama(nama);
            mahasiswa[index].getDetail();
        }
    }

    public void hapusData() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan NIM mahasiswa dari data yang akan dihapus = ");
        String nim = scan.nextLine();
        int index = getIndexByNIMDanNama(nim);
        if (index==-1) {
            System.out.println("Data yang anda akan hapus tidak ketemu");
        } else {
            System.out.println("Berikut data mahasiswa");
            mahasiswa[index].getDetail();
            System.out.println("----------");
            System.out.println("Apakah anda yakin akan menghapus data?");
            System.out.println("1. Ya");
            System.out.println("2. Tidak");
            System.out.print("Pilih Menu = ");
            int menu = scan.nextInt();
            if (menu==1) {
                for (int i = index; i<jumlahData; i++) {
                    mahasiswa[i] = mahasiswa[i+1];
                }
                jumlahData--;
                lihatData();
            } else if (menu==2) {
                lihatData();
            } else {
                System.out.println("Menu tidak ada");
            }
            
        }
    }

    public void rerataIPK() {
        double total = 0.0;
        for(int i=0; i<jumlahData; i++) {
            total += mahasiswa[i].getIPK();
        }
        double rerata = total/jumlahData;
        System.out.println("Rerata IPK Mahasiswa = "+ rerata);
    }
    
}