package ahmad.adi.javaclass;

import java.util.ArrayList;

/**
 * Created by D2J-00 on 31/01/2017.
 */
public class transaksi {
    private ArrayList<barang> Listbarang = new ArrayList<>();

    public void addbarang (barang barang){
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
}
