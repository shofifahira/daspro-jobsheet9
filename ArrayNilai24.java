import java.util.Scanner;

public class ArrayNilai24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nilaiAkhir = new int[10];

        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiAkhir[i] = sc.nextInt();
        }

        System.out.println("\n--- HASIL KELULUSAN MAHASISWA ---");
        int jumlahLulus = 0;
        int jumlahTidakLulus = 0;

        for (int i = 0; i < nilaiAkhir.length; i++) {
            String status = (nilaiAkhir[i] > 70) ? "LULUS" : "TIDAK LULUS";
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilaiAkhir[i] + "(" + status + ")");
            if (nilaiAkhir[i] > 70) {
                jumlahLulus++;
            } else {
                jumlahTidakLulus++;
            }
        }
        
        System.out.println("\n----------------------------------");
        System.out.println("Jumlah mahasiswa yang lulus: " + jumlahLulus);
        System.out.println("Jumlah mahasiswa yang tidak lulus: " + jumlahTidakLulus);
        System.out.println("----------------------------------");

        sc.close();
    }
}
