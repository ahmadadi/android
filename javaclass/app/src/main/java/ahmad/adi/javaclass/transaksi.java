package ahmad.adi.javaclass;

import java.util.ArrayList;

/**
 * Created by D2J-00 on 31/01/2017.
 */
public class transaksi {
    private ArrayList<barang> Listbarang = new ArrayList<>();

    public void addBarang (barang barang){
        this.Listbarang.add(barang);
    }

    public int totalTransaksi(){
        int hasil = 0;
        for (int i=0; i< Listbarang.size(); i++){
            hasil += Listbarang.get(i).getHarga();
        }
        return hasil;
    }

    public String printTransaksi(){
        String text = "Barang yang di beli di transaksi ini adalah : \n";
        text +="-------------------------------------------\n";
        for (int i = 0; i< Listbarang.size(); i++){
            text += Listbarang.get(i).toString();
        }
        text += "-----------------------------------------------\n";
        text += "total pembelian" +totalTransaksi()+"\n";
        text += "-----------------------------------------------\n";
        return text;
    }

    public double averageTransaksi() {
        double hasil = 0;
        for (int i=0; i<Listbarang.size(); i++){
            hasil += Listbarang.get(i).getHarga();
        }
        hasil = hasil / Listbarang.size();
        return hasil;
    }

    public String maxBarang(){
      barang max;
            max = Listbarang.get(0);
        for (int i=0; i < Listbarang.size(); i++) {
            if (Listbarang.get(i).getHarga() > max.getHarga()) {
                max = Listbarang.get(i);
            }
        }
       String namaBarang=max.getNama();
       String text = "barang termahal pada transaksi adalah"+namaBarang;
       return text;

    }
}
