import java.util.Scanner;
public class SearchNilai24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array nilai: ");
        int jumlah = input.nextInt();

        int[] nilai = new int[jumlah];

        System.out.println("Masukkan elemen nilai mahasiswa:");
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Nilai ke-" + (i + 1) + ": ");
            nilai[i] = input.nextInt();
        }

        System.out.print("\nMasukkan nilai yang ingin dicari (key): ");
        int key = input.nextInt();

        boolean ditemukan = false;
        int indeksKetemu = -1;

        for (int i = 0; i < nilai.length; i++){
            if (nilai[i] == key) {
                ditemukan = true;
                indeksKetemu = i;
                break;
            }
        }

        System.out.println();
        if (ditemukan) {
            System.out.println("Nilai " + key + " ditemukan pada indeks ke-" + indeksKetemu + " (urutan ke-" + (indeksKetemu + 1) + ").");
        } else {
            System.out.println("Nilai " + key + " tidak ditemukan di dalam array.");
        }
        input.close();
    }
}
