import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DataMahasiswa {
    public static void main(String[] args) throws IOException {


//        step 3 deklarasi class buferedreader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//        step 4 deklrasi variabel
        String nim, nama, prodi;
        int semester, sksAmbil;

//        step 2 error handling
//        try catch
        try {
//        step 5 pengerjaan logika program (didalam try)
            System.out.print("NIM : ");
            nim = br.readLine();
            System.out.print("Nama : ");
            nama = br.readLine();
            System.out.print("prodi : ");
            prodi = br.readLine();
            System.out.print("semester : ");
            semester = Integer.parseInt(br.readLine());
            System.out.print("Jumlah sks yang diambil : ");
            sksAmbil = Integer.parseInt(br.readLine());

//        Output disini
            System.out.println("NIM : " + nim);
            System.out.println("Nama : " + nama);
            System.out.println("prodi : " + prodi);
            System.out.println("semester : " + semester);
            System.out.println("jumlah sks yang diambil : " + sksAmbil);

        }catch (Exception ex){
            System.out.println(ex.getMessage());
            System.out.println("Semester dan SKS harus angka !");
        }
    }
}

