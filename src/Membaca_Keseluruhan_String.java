import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Membaca_Keseluruhan_String {
    public Membaca_Keseluruhan_String() {

    }

    public static void main(String[] args) throws IOException {
        System.out.println("Hai, siapakah namamu?");

        String Nama;
        BufferedReader Br;

        Br = new BufferedReader(new InputStreamReader(System.in));
        Nama = Br.readLine();

        System.out.println("Nama Kamu Adalah: " + Nama + "!");

    }
}
