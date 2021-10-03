package com.company;

public class MainBarang {
    public static void main (String[] args) {

        // Membuat 2 objek dengan 2 parameter
        Barang barang1 = new Barang("BRG-001", "Tas Gucci");
        Barang barang2 = new Barang("BRG-002", "Printer Epson L355");
        // Memberikan harga barang
        barang1.setHarga(1200);
        barang2.setHarga(200);

        // Membuat 2 Objek dengan 3 parameter
        Barang barang3 = new Barang("BRG-003", "Koper", 150);
        Barang barang4 = new Barang("BRG-004", "Helm", 20);

        System.out.println("Data Barang :");
        System.out.println(barang1.getIdProduk() + " - " + barang1.getNama() + " - $" + barang1.getHarga());
        System.out.println(barang2.getIdProduk() + " - " + barang2.getNama() + " - $" + barang2.getHarga());
        System.out.println(barang3.getIdProduk() + " - " + barang3.getNama() + " - $" + barang3.getHarga());
        System.out.println(barang4.getIdProduk() + " - " + barang4.getNama() + " - $" + barang4.getHarga());

        double totalHarga = barang1.getHarga() + barang2.getHarga() + barang3.getHarga() + barang4.getHarga();

        System.out.println("Total harga barang BRG-001, BRG-003, dan BRG-004 : $" + totalHarga);



    }


}
