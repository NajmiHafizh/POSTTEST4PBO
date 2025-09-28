package com.mycompany.kantorpos.Service;

import com.mycompany.kantorpos.Model.Paket;
import com.mycompany.kantorpos.Model.PaketKilat;
import com.mycompany.kantorpos.Model.PaketReguler;
import java.util.ArrayList;
import java.util.Scanner;

public class PaketService {
    private final ArrayList<Paket> dataPaket = new ArrayList<>();
    private final Scanner input = new Scanner(System.in);

// Constructor
public PaketService() {
    dataPaket.add(new PaketReguler("RESI001", "Andi", "Budi", "08123456789",
            "Dokumen", "2kg", "Jl. Merdeka No.1", 
            "2025-09-10", "2025-09-12", "Dikirim", "25000", 3));

    dataPaket.add(new PaketReguler("RESI002", "Siti", "Rina", "08234567890",
            "Pakaian", "1.2kg", "Jl. Mawar No.5", 
            "2025-09-11", "2025-09-13", "Transit", "20000", 3));

    dataPaket.add(new PaketKilat("RESI003", "Andi", "Dewi", "08345678901",
            "Elektronik", "5kg", "Jl. Melati No.7", 
            "2025-09-12", "2025-09-15", "Sampai", "50000", true));

    dataPaket.add(new PaketKilat("RESI004", "Joko", "Tina", "08456789012",
            "Makanan", "3kg", "Jl. Anggrek No.9", 
            "2025-09-13", "2025-09-14", "Dikirim", "60000", false));

    dataPaket.add(new PaketReguler("RESI005", "Rudi", "Maya", "08567890123",
            "Aksesoris", "0.8kg", "Jl. Kenanga No.11", 
            "2025-09-14", "2025-09-16", "Transit", "15000", 2));
}


    // Tambah Data
    public void tambahPaket() {
        System.out.print("Masukkan Nomor Resi: ");
        String resi = input.nextLine().trim();
        if (resi.isEmpty()) {
            System.out.println("Resi tidak boleh kosong!");
            return;
        }

        System.out.print("Masukkan Nama Pengirim: ");
        String pengirim = input.nextLine();

        System.out.print("Masukkan Nama Penerima: ");
        String penerima = input.nextLine();

        System.out.print("Masukkan Nomor Telepon Penerima: ");
        String telepon = input.nextLine();

        System.out.print("Masukkan Deskripsi Isi Paket (contoh: Makanan, Elektronik, Dokumen): ");
        String deskripsi = input.nextLine();

        System.out.print("Masukkan Berat Paket: ");
        String beratPaket = input.nextLine();

        System.out.print("Masukkan Alamat Tujuan: ");
        String alamat = input.nextLine();

        System.out.print("Masukkan Tanggal Pengiriman: ");
        String pengiriman = input.nextLine();

        System.out.print("Masukkan Tanggal Perkiraan Sampai: ");
        String sampai = input.nextLine();

        System.out.print("Masukkan Status Paket: ");
        String status = input.nextLine();

        System.out.print("Masukkan Biaya Paket: ");
        String biayaPaket = input.nextLine();

        System.out.print("Pilih Tipe Paket (1. Reguler / 2. Kilat): ");
        int tipe = Integer.parseInt(input.nextLine());

        Paket p;
        if (tipe == 1) { // Reguler
            System.out.print("Estimasi hari (angka): ");
            int estimasi = Integer.parseInt(input.nextLine());
            p = new PaketReguler(resi, pengirim, penerima, telepon, deskripsi,
                    beratPaket, alamat, pengiriman, sampai, status, biayaPaket, estimasi);
        } else { // Kilat
            System.out.print("Asuransi (y/n): ");
            String as = input.nextLine().trim();
            boolean asuransi = as.equalsIgnoreCase("y") || as.equalsIgnoreCase("yes");
            p = new PaketKilat(resi, pengirim, penerima, telepon, deskripsi,
                beratPaket, alamat, pengiriman, sampai, status, biayaPaket, asuransi);
        }

        dataPaket.add(p);
        System.out.println("Paket berhasil ditambahkan!");
    }


    // Tampilkan Data
    public void tampilkanPaket() {
        System.out.println("\n=== Daftar Paket ===");
        if (dataPaket.isEmpty()) {
            System.out.println("Belum ada data paket.");
            return;
        }
        for (int i = 0; i < dataPaket.size(); i++) {
            Paket p = dataPaket.get(i);
            System.out.printf("%d) %s%n", i + 1, p.infoPaket()); 
        }
    }
    
        // (opsional) contoh: menampilkan detail subclass-specific via instanceof
    public void tampilkanDetail(int index) {
        if (index < 0 || index >= dataPaket.size()) { System.out.println("Index tidak valid."); return; }
        Paket p = dataPaket.get(index);
        System.out.println(p.infoPaket());
        switch (p) {
            case PaketReguler r -> System.out.println("Estimasi hari: " + r.getEstimasiHari());
            case PaketKilat k -> System.out.println("Asuransi: " + (k.isAsuransi() ? "Ya" : "Tidak"));
            default -> {
            }
        }
    }

    // Update Data
    public void updatePaket() {
    tampilkanPaket();
    if (dataPaket.isEmpty()) return;

    System.out.print("Masukkan nomor data paket yang ingin diupdate: ");
    int index = input.nextInt() - 1;
    input.nextLine();

    if (index >= 0 && index < dataPaket.size()) {
        Paket p = dataPaket.get(index);

        boolean ulang = true;
        while (ulang) {
            System.out.println("\nPilih data yang ingin diubah:");
            System.out.println("1. Nomor Resi");
            System.out.println("2. Nama Pengirim");
            System.out.println("3. Nama Penerima");
            System.out.println("4. Nomor Telepon Penerima");
            System.out.println("5. Jenis Paket");
            System.out.println("6. Berat Paket");
            System.out.println("7. Alamat Tujuan");
            System.out.println("8. Tanggal Pengiriman");
            System.out.println("9. Tanggal Perkiraan Sampai");
            System.out.println("10. Status Paket");
            System.out.println("11. Biaya Paket");
            System.out.println("12. Selesai");
            System.out.print("Pilih: ");
            int pilih = input.nextInt();
            input.nextLine();

            switch (pilih) {
                case 1 -> {
                    System.out.print("Nomor Resi baru: ");
                    p.setResi(input.nextLine());
                }
                case 2 -> {
                    System.out.print("Nama Pengirim baru: ");
                    p.setPengirim(input.nextLine());
                }
                case 3 -> {
                    System.out.print("Nama Penerima baru: ");
                    p.setPenerima(input.nextLine());
                }
                case 4 -> {
                    System.out.print("Nomor Telepon baru: ");
                    p.setTelepon(input.nextLine());
                }
                case 5 -> {
                    System.out.print("Jenis Paket baru: ");
                    p.setJenis(input.nextLine());
                }
                case 6 -> {
                    System.out.print("Berat Paket baru: ");
                    p.setBeratPaket(input.nextLine());
                }
                case 7 -> {
                    System.out.print("Alamat Tujuan baru: ");
                    p.setAlamat(input.nextLine());
                }
                case 8 -> {
                    System.out.print("Tanggal Pengiriman baru: ");
                    p.setTanggalPengiriman(input.nextLine());
                }
                case 9 -> {
                    System.out.print("Tanggal Perkiraan Sampai baru: ");
                    p.setTanggalSampai(input.nextLine());
                }
                case 10 -> {
                    System.out.print("Status Paket baru: ");
                    p.setStatus(input.nextLine());
                }
                case 11 -> {
                    System.out.print("Biaya Paket baru: ");
                    p.setBiayaPaket(input.nextLine());
                }
                case 12 -> {
                    ulang = false;
                    System.out.println("✅ Selesai update data.");
                }
                default -> System.out.println("⚠️ Pilihan tidak valid.");
            }
        }

    } else {
        System.out.println("⚠️ Nomor data tidak valid.");
    }
}


    // Hapus Data
    public void hapusPaket() {
        tampilkanPaket();
        if (dataPaket.isEmpty()) return;

        System.out.print("Masukkan nomor data paket yang ingin dihapus: ");
        int index = input.nextInt() - 1; input.nextLine();

        if (index >= 0 && index < dataPaket.size()) {
            dataPaket.remove(index);
            System.out.println("Data berhasil dihapus!");
        } else {
            System.out.println("Nomor tidak valid.");
        }
    }

    // Cari paket berdasarkan nomor resi 
    public void searchPaket() {
        System.out.print("Masukkan nomor resi yang ingin dicari: ");
        String cari = input.nextLine();
        boolean ketemu = false;

        for (Paket p : dataPaket) {
            if (p.getResi().equalsIgnoreCase(cari)) {
                tampilkanDetailPaket(p);
                ketemu = true;
                break;
            }
        }
        if (!ketemu) {
            System.out.println("Data tidak ditemukan.");
        }
    }

    //Cari paket berdasarkan nama penerima
    public void searchPaket(String penerima) {
        boolean ketemu = false;
        for (Paket p : dataPaket) {
            if (p.getPenerima().equalsIgnoreCase(penerima)) {
                tampilkanDetailPaket(p);
                ketemu = true;
            }
        }
        if (!ketemu) {
            System.out.println("Data dengan penerima \"" + penerima + "\" tidak ditemukan.");
        }
    }

    private void tampilkanDetailPaket(Paket p) {
        System.out.println("=======================================");
        System.out.println("*DATA PAKET DITEMUKAN*");
        System.out.println("Nomor Resi          : " + p.getResi());
        System.out.println("Nama Pengirim       : " + p.getPengirim());
        System.out.println("Nama Penerima       : " + p.getPenerima());
        System.out.println("Nomor Telepon       : " + p.getTelepon());
        System.out.println("Jenis Paket         : " + p.getJenis());
        System.out.println("Berat Paket         : " + p.getBeratPaket());
        System.out.println("Alamat Tujuan       : " + p.getAlamat());
        System.out.println("Tanggal Pengiriman  : " + p.getTanggalPengiriman());
        System.out.println("Tanggal Sampai      : " + p.getTanggalSampai());
        System.out.println("Status              : " + p.getStatus());
        System.out.println("Biaya Paket         : " + p.getBiayaPaket());
        System.out.println("=======================================");
    }
}

