import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sks {

        public static void main(String[] args) throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Masukkan ipk : ");
            double ipk = Double.parseDouble(br.readLine());


            int sks = 0;


            if (ipk >= 3.5) {
                sks = 24;
            } else if (ipk >= 3.0) {
                sks = 22;
            } else if (ipk >= 2.5) {
                sks = 20;
            } else if (ipk >= 2.0) {
                sks = 18;

                System.out.println("Jumlah SKS yang bisa diambil: " + sks);

            }
        }
    }

