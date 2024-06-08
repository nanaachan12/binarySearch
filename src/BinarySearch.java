import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static int cariindeks2(int[] angka, int data, int i, int j) {
        int tengah;

        while (i <= j) {
            tengah = (i + j) / 2;
            if (data == angka[tengah]) {
                return tengah;
            } else if (data < angka[tengah]) {
                j = tengah - 1;
            } else {
                i = tengah + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println("====================================");
        System.out.println("             PROGRAM JAVA           ");
        System.out.println("             Mencari Angka          ");
        System.out.println("====================================");

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen dalam array: ");
        int n = input.nextInt();  // Membaca jumlah elemen dalam array
        
        int[] angka = new int[n];  // Membuat array dengan ukuran n

        System.out.print("Masukkan elemen-elemen array: ");
        for (int i = 0; i < n; i++) {
            angka[i] = input.nextInt();  // Membaca setiap elemen dan menyimpannya dalam array
        }

        Arrays.sort(angka);  // Mengurutkan array

        System.out.print("Array setelah diurutkan: ");
        for (int num : angka) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("Masukkan angka yang akan dicari: ");
        int data = input.nextInt();

        int hasil = cariindeks2(angka, data, 0, angka.length - 1);

        if (hasil != -1) {
            System.out.print("Data ada di indeks: " + hasil);
        } else {
            System.out.print("Data tidak ditemukan dalam array.");
        }
     
        input.close();

        System.out.println();
        System.out.println("====================================");

    }
}

