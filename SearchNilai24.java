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

        System.out.println("\n-------------------------------");
        System.out.println("     HASIL PENCARIAN NILAI     ");
        System.out.println("-------------------------------");

        if (ditemukan) {
            System.out.println(" Sukses! Nilai " + key + " ditemukan.");
            System.out.println(" Posisi indeks: " + indeksKetemu);
            System.out.println(" Urutan data: Ke-" + (indeksKetemu + 1));
        } else {
            System.out.println(" Maaf, nilai yang dicari (" + key + ") tidak ditemukan di dalam array.");
            System.out.println(" Silakan periksa kembali nilai yang Anda masukkan.");
        }
        System.out.println("-------------------------------");
        input.close();
    }
}
