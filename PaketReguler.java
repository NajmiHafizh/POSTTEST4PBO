package com.mycompany.kantorpos.Model;

public class PaketReguler extends Paket implements Trackable {
    private int estimasiHari;

    public PaketReguler(String resi, String pengirim, String penerima, String telepon, 
                        String jenis, String beratPaket, String alamat, 
                        String tanggalPengiriman, String tanggalSampai, 
                        String status, String biayaPaket, int estimasiHari) {
        super(resi, pengirim, penerima, telepon, jenis, beratPaket, alamat, 
              tanggalPengiriman, tanggalSampai, status, biayaPaket);
        this.estimasiHari = estimasiHari;
    }

    public int getEstimasiHari() { return estimasiHari; }
    public void setEstimasiHari(int estimasiHari) { this.estimasiHari = estimasiHari; }

    @Override
    public String infoPaket() {
        return "Resi: " + getResi() +
               ", Pengirim: " + getPengirim() +
               ", Penerima: " + getPenerima() +
               ", Telepon: " + getTelepon() +
               ", Jenis: " + getJenis() +
               ", Berat: " + getBeratPaket() +
               ", Alamat: " + getAlamat() +
               ", Tgl Kirim: " + getTanggalPengiriman() +
               ", Tgl Sampai: " + getTanggalSampai() +
               ", Status: " + getStatus() +
               ", Biaya: " + getBiayaPaket() +
               ", Estimasi Hari: " + estimasiHari;
    }
    
    @Override
    public void updateStatus(String status) {
        setStatus(status); 
        System.out.println("Status Paket Reguler diperbarui menjadi: " + status);
    }
}

