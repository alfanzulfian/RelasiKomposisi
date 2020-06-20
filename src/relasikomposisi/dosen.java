/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relasikomposisi;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class dosen {
    private String nip;
    private String nama;
    private String kompetensi;
    private matakuliah[] listMtk;

    public dosen(String nip, String nama, String kompetensi) {
        this.nip = nip;
        this.nama = nama;
        this.kompetensi = kompetensi;
        setMataKuliah();
    }
    public dosen(String nip, String nama, String kompetensi, matakuliah[] listMtk) {
        this.nip = nip;
        this.nama = nama;
        this.kompetensi = kompetensi;
        this.listMtk = listMtk;
    }

    @Override
    public String toString() {
        return "Dosen{" + "nip=" + nip + ", nama=" + nama + ", kompetensi=" + kompetensi + '}';
    }
    
    private void setMataKuliah(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan jumlah mata kuliah:");
        int jumlah = scan.nextInt();
        this.listMtk = new matakuliah[jumlah];
            for(int i=0; i<jumlah; i++){
                String kode = JOptionPane.showInputDialog("Masukkan kode Mtk");
                String nama = JOptionPane.showInputDialog("Masukkan nama Mtk");
                int sks = Integer.parseInt(JOptionPane.showInputDialog("Masukkan sks Mtk"));
                matakuliah mtk = new matakuliah(kode, nama, sks, "");
                this.listMtk[i] = mtk;
    }
    }
        
        public void displayMtk(){
            System.out.println("MataKuliah yang diajarkan:");
                for(matakuliah mtk : this.listMtk){
                    System.out.println(mtk.toString());
            }
        }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKompetensi() {
        return kompetensi;
    }

    public void setKompetensi(String kompetensi) {
        this.kompetensi = kompetensi;
    }

    public matakuliah[] getListMtk() {
        return listMtk;
    }

    public void setListMtk(matakuliah[] listMtk) {
        this.listMtk = listMtk;
    }
    
}