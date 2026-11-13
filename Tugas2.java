import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        int[] harga = {15000, 13000, 10000, 12000, 8000, 18000, 20000};

        System.out.println("=======================================");
        System.out.println("        DAFTAR MENU KAFE KAMPUS        ");
        System.out.println("=======================================");
        for (int i = 0; i < menu.length; i++) {
            System.out.printf("%2d. %-18s ; Rp %,d\n", (i + 1), menu[i], harga[i]);
        }
        System.out.println("=======================================\n");

        System.out.print("Ingin mencari ketersediaan menu? (y/t): ");
        String cariLagi = input.nextLine();

        while (cariLagi.equalsIgnoreCase("y")) {
            System.out.print("Masukkan nama menu yang dicari: ");
            String keyword = input.nextLine();

            int indeksDitemukan = -1;
            for (int i = 0; i < menu.length; i++) {
                if (menu[i].equalsIgnoreCase(keyword)) {
                    indeksDitemukan = i;
                    break;
                }
            }

            if (indeksDitemukan != -1) {
                System.out.printf("-> Menu '%s' TERSEDIA dengan harga Rp %,d\n", menu[indeksDitemukan], harga[indeksDitemukan]);
            } else {
                System.out.println("-> Maaf, menu '" + keyword + "' tidak tersedia.");
            }

            System.out.print("\nCari menu lain (y/t): ");
            cariLagi = input.nextLine();
        }

        System.out.print("\nMasukkan jumlah item yang ingin dipesan: ");
        int jumlahPesanan = input.nextInt();
        input.nextLine();

        String[] daftarPesanan = new String[jumlahPesanan];
        int[] hargaPesanan = new int[jumlahPesanan];
        int totalBiaya = 0;

        for (int i = 0; i < jumlahPesanan; i ++) {
            boolean valid = false;

            while (!valid) {
                System.out.print("Masukkan nama menu pesanan ke-" + (i + 1) + ": ");
                String namaMenu = input.nextLine();

                for (int j = 0; j < menu.length; j++) {
                    if (menu[j].equalsIgnoreCase(namaMenu)) {
                        daftarPesanan[i] = menu[j];
                        hargaPesanan[i] = harga[j];
                        totalBiaya += harga[j];
                        valid = true;
                        break;
                    }
                }

                if (!valid) {
                    System.out.println(" [!] Menu tidak ditemukan! Silakan masukkan nama menu yang sesuai daftar.");
                }
            }
        }

        System.out.println("\n=======================================");
        System.out.println("         STRUK PEMESANAN ANDA          ");
        System.out.println("=======================================");
        for (int i = 0; i < daftarPesanan.length; i++) {
            System.out.printf("%-2d. %-18s : Rp %,d\n", (i + 1), daftarPesanan[i], hargaPesanan[i]);
        }
        System.out.println("---------------------------------------");
        System.out.printf("TOTAL BIAYA        : Rp %,d\n", totalBiaya);
        System.out.println("=======================================");

        input.close();
    }
}
