package com.company;

public class Barang {

    private String idProduk, nama;
    private double harga;

    // Konstrukter dengan 3 parameter
    public Barang(String idProduk, String nama, double harga) {
        this.idProduk = idProduk;
        this.nama = nama;
        this.harga = harga;
    }

    // Konstruktor dengan 2 parameter
    public Barang(String idProduk, String nama) {
        this.idProduk = idProduk;
        this.nama = nama;
    }

    public void setNama(){
        this.nama = nama;
    }

    public String getNama(){
        return nama;
    }

    public void setHarga(double harga){
        this.harga = harga;
    }

    public double getHarga(){
        return harga;
    }

    public String getIdProduk(){
        return idProduk;
    }
}

