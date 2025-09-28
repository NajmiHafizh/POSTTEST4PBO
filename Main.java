package com.mycompany.kantorpos.main;

import com.mycompany.kantorpos.Service.PaketService;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        PaketService service = new PaketService();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== Data Pengiriman Paket (Kantor Pos) =====");
            System.out.println("1. Tambah Data Paket");
            System.out.println("2. Tampilkan Data Paket");
            System.out.println("3. Update Data Paket");
            System.out.println("4. Hapus Data Paket");
            System.out.println("5. Cari Data Paket");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu: ");

            int pilih = input.nextInt();
            input.nextLine();

            switch (pilih) {
                case 1 -> service.tambahPaket();
                case 2 -> service.tampilkanPaket();
                case 3 -> service.updatePaket();
                case 4 -> service.hapusPaket();
                case 5 -> {
                    // 🔹 Submenu search
                    System.out.println("\nCari Data Berdasarkan:");
                    System.out.println("1. Nomor Resi");
                    System.out.println("2. Nama Penerima");
                    System.out.print("Pilih: ");
                    int opsiCari = input.nextInt();
                    input.nextLine();

                    if (opsiCari == 1) {
                        service.searchPaket(); // pakai versi resi
                    } else if (opsiCari == 2) {
                        System.out.print("Masukkan nama penerima: ");
                        String namaPenerima = input.nextLine();
                        service.searchPaket(namaPenerima); // pakai versi overloading
                    } else {
                        System.out.println("⚠️ Pilihan tidak valid.");
                    }
                }
                case 6 -> {
                    System.out.println("Terima kasih sudah menggunakan program ini!");
                    return;
                }
                default -> System.out.println("Menu tidak valid!");
            }
        }
    }
}
