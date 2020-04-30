import java.io.*;

public class MembacaFile {
    public MembacaFile() {

    }

    public static void main(String[] args) throws IOException {
        System.out.println("Apa nama file yang dibaca dari disk?");

        String NamaFile;
        BufferedReader Br;

        Br = new BufferedReader(new InputStreamReader(System.in));
        NamaFile = Br.readLine();

        System.out.println("Membaca File: " + NamaFile + "...");

        FileInputStream F;
        F = null;

        try {
            F = new FileInputStream(NamaFile);
        } catch (FileNotFoundException PesanError) {
            System.out.println("File Tidak Ditemukan");
        }

        try {
            char D;
            int T;

            do {
                T = F.read();
                D = (char) T;

                if (T != -1) {
                    System.out.print(D);
                }
            } while (T != -1);

        } catch (IOException Ex) {
            System.out.println("Terjadi Masalah Saat Membaca File!");
        }
    }
}
