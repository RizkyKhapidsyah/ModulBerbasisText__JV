import com.sun.xml.internal.ws.util.xml.CDATA;

import java.io.*;

public class MenulisFile {
    public MenulisFile() {

    }

    public static void main(String[] args) throws IOException {
        System.out.println("Apa nama file yang ingin kamu tulis ?");

        String NamaFile;
        BufferedReader Br;

        Br = new BufferedReader(new InputStreamReader(System.in));
        NamaFile = Br.readLine();

        System.out.println("Masukkan data yang ingin ditulis ke " + NamaFile + "...");
        System.out.println("Ketikkan q$ sampai akhir");

        FileOutputStream F;
        F = null;

        try {
            F = new FileOutputStream(NamaFile);
        } catch (FileNotFoundException E) {
            System.out.println("File tidak dapat dibuka untuk ditulis.");
        }

        try {
            boolean Selesai = false;
            int Data;

            do {
                Data = Br.read();

                if ((char) Data == 'q') {
                    Data = Br.read();

                    if ((char) Data == '$') {
                        Selesai = true;
                    } else {
                        F.write('q');
                        F.write(Data);
                    }
                } else {
                    F.write(Data);
                }
            } while (!Selesai);
        } catch (IOException EE) {
            System.out.println("Terjadi Masalah saat membaca dari file!");
        }

    }
}
