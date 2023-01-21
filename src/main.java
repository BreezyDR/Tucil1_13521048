import java.util.Scanner;

public class main extends operation {
    public static void main(String[] args) throws Exception {
        boolean notRunning = false;
        printlnstr("==============================================================================");
        printlnstr("Selamat Datang Pada Permainan Kartu 24!");
        printlnstr("==============================================================================");
        while (!notRunning) {
            int[] newArray = new int[4];
            println();
            printlnstr("Apakah Anda ingin meng-input angka secara manual atau diacak secara random?");
            printlnstr("Ketik 1 untuk metode manual, ketik 2 untuk metode auto");
            int pilihan = pilihanMenu(1, 2);
            switch (pilihan) {
                case 1:
                    newArray = manualInput();
                    break;
                case 2:
                    newArray = RandomNumbers();
                    break;
            }
            String a = intToString(newArray[0]);
            String b = intToString(newArray[1]);
            String c = intToString(newArray[2]);
            String d = intToString(newArray[3]);
            int e = newArray[0];
            int f = newArray[1];
            int g = newArray[2];
            int h = newArray[3];
            println();
            printf("Kartu yang Anda punya adalah: %s %s %s %s", a, b, c, d);
            println();
            println();

            long startTime = System.nanoTime();

            String[] finalResults = final24(e, f, g, h);

            long endTime = System.nanoTime();

            if (finalResults.length != 0) {
                printf("Banyak solusi adalah: %d", finalResults.length);
                println();
                printlnstr("Berikut daftar solusinya:");
                printstrarray(finalResults);
            } else {
                printlnstr("Tidak ada solusi.");
            }
            println();

            printlnstr("Apakah Anda ingin menyimpan file di .txt?");
            printlnstr("Ketik 1 jika iya, ketik 2 jika tidak");
            int pilihanfile = pilihanMenu(1, 2);
            boolean finishedWriting = false;
            if (pilihanfile == 1) {
                while (!finishedWriting) {
                    printlnstr("Masukkan directory file yang ingin dituliskan hasilnya:");
                    print("> ");
                    Scanner sc = new Scanner(System.in);
                    String directory = sc.next();
                    finishedWriting = writeSolutionToFile("test/" + directory, finalResults, a, b, c, d);
                }
            }

            println();

            printlnstr("Apakah Anda ingin tetap bermain atau keluar?");
            printlnstr("Ketik 1 untuk tetap bermain, ketik 2 untuk keluar");
            int pilihanlagi = pilihanMenu(1, 2);
            if (pilihanlagi == 2) {
                printlnstr("==============================================================================");
                printlnstr("Terima kasih sudah bermain, sampai jumpa lagi!");
                printlnstr("==============================================================================");
                println();
                long duration = (endTime - startTime);
                println();
                printlnstr("Waktu eksekusi program terbaru: " + duration + " nanosecond" );
                println();
                notRunning = true;
            }

        }


    }
}
