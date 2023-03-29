import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class percabangan {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int usia=0;
//        System.out.print("Masukkan usia anda : ");
//        usia = Integer.parseInt(br.readLine());
//        if (usia >=17) {
//            System.out.print("sudah memenuhi syarat");
//        }else {
//            System.out.print("belum memenuhi syarat");
//        }


//        if else if
        String nim;
        int nilaiUAS;

        System.out.print("Masukkan nim anda : ");
        nim = br.readLine();
        System.out.print("Masukkan nilai UAS anda : ");
        nilaiUAS = Integer.parseInt(br.readLine());

        if (nim.equalsIgnoreCase("22410100030")
                && nilaiUAS == 80) {
            System.out.print("lulus");
        } else if (nim.equalsIgnoreCase("22410100030")
                && nilaiUAS == 70) {
            System.out.print("lulus");
        } else if (nim.equalsIgnoreCase("22410100030")
                && nilaiUAS == 65) {
            System.out.print("lulus");
        } else if (nim.equalsIgnoreCase("22410100030")
                && nilaiUAS < 65) {
            System.out.print("Tidak lulus");
        } else {
            System.out.println("Nilai tidak ditemukan");
            String menu, jenis;
            System.out.print("Masukkan menu (Makanan/Minuman) : ");
            menu = br.readLine();
            System.out.print("Masukkan jenis menu \n Makanan : Snack, Nasi BUNGKUS \n" +
                    "Minuman: kopi, teh, air mineral. Pilih : ");
            jenis = br.readLine();
            if (menu.equalsIgnoreCase("makanan")) {
                if (jenis.equalsIgnoreCase("snack")) {
                    System.out.print("harga 2000");
                } else {
                    System.out.println("harga 5000");
                }
            } else if (menu.equalsIgnoreCase("minuman")) {
                if (jenis.equalsIgnoreCase("kopi")) {
                    System.out.println("harga 3000");
                }else if (jenis.equalsIgnoreCase("teh")){
                    System.out.println("harga 4000");
                }else if (jenis.equalsIgnoreCase("air mineral")){
                    System.out.println("harga 2000");

            }
        }
    }
    }
}






//            equals : memperhatikan detail besar-kecil hurufnya(case,sensitive)
//            equalsignorecase : non senstitiv



