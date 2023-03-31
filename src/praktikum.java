import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class praktikum {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int bus, minibus, mobil;
        int jumlahbus = 1;
        int jumlahminibus = 2;
        int jumlahmobil = 2;
        int penumpang = 91;

        System.out.print("Masukkan jumlah penumpang = ");
        penumpang = Integer.parseInt(br.readLine());

        bus = penumpang / 50;
        minibus = penumpang / 15;
        mobil = penumpang / 7;

        System.out.println("jumlah penumpangbus = penumpanng/ 50 ");
        System.out.println("jumlah penumpang minibus = penumpang/ 15 ");
        System.out.println("jumlah penumpang mobil = penumpang / 7 ");


        System.out.println("jumlah penumpang mobil = >80");


    }
}
