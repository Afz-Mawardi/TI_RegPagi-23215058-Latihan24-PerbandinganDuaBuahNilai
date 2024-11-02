package Tugas_Latihan;
/**
 *
 * @author user
 * NAMA     : Afsani Wahyu Mawardi
 * KELAS    : TI RegPagi
 * NIM      : 23215058
 * Dekskipsi 
 * Progam   : Progam ini untuk menampilkan Do-while, If-Else
 *          Perbandingan Dua Buah Nilai 
 */
import java.util.Scanner;

public class Latihan_24 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ulangi;

        System.out.println("========Program Perbandingan Nilai========");

        do {
            System.out.print("Masukkan nilai pertama : ");
            int nilaiPertama = scanner.nextInt();

            System.out.print("Masukkan nilai kedua : ");
            int nilaiKedua = scanner.nextInt();

            if (nilaiPertama > nilaiKedua) {
                System.out.println("Hasil : " + nilaiPertama + " Lebih besar dari " + nilaiKedua);
            } else if (nilaiPertama < nilaiKedua) {
                System.out.println("Hasil : " + nilaiPertama + " Lebih kecil dari " + nilaiKedua);
            } else {
                System.out.println("Hasil : " + nilaiPertama + " Sama dengan " + nilaiKedua);
            }

            System.out.println("");
            System.out.print("Ulangi Aktifitas? (Ya/Tidak): ");
            System.out.println("");
            scanner.nextLine(); // Membersihkan buffer
            ulangi = scanner.nextLine();

        } while (ulangi.equalsIgnoreCase("Ya"));

        scanner.close();
    }
}