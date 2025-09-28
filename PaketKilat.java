package com.mycompany.kantorpos.Model;

public class PaketKilat extends Paket implements Trackable{
    private boolean asuransi;

    public PaketKilat(String resi, String pengirim, String penerima, String telepon, 
                      String jenis, String beratPaket, String alamat, 
                      String tanggalPengiriman, String tanggalSampai, 
                      String status, String biayaPaket, boolean asuransi) {
        super(resi, pengirim, penerima, telepon, jenis, beratPaket, alamat, 
              tanggalPengiriman, tanggalSampai, status, biayaPaket);
        this.asuransi = asuransi;
    }

    public boolean isAsuransi() { return asuransi; }
    public void setAsuransi(boolean asuransi) { this.asuransi = asuransi; }

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
               ", Asuransi: " + (asuransi ? "Ya" : "Tidak");
    }
    
    @Override
    public void updateStatus(String status) {
        setStatus(status); 
        System.out.println("Status Paket Kilat diperbarui menjadi: " + status);
    }
}
