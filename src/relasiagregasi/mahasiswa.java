/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relasiagregasi;

/**
 *
 * @author ASUS
 */
public class mahasiswa {
    private String nama;
    private String nrp;
    private String alamat;
    private int umur;
    
    private matakuliah[] lismtk;
    
    public mahasiswa(){
        
    }

    public mahasiswa(String nama, String nrp, String alamat, int umur) {
        this.nama = nama;
        this.nrp = nrp;
        this.alamat = alamat;
        this.umur = umur;
    }
    public void setMtk(matakuliah[] lisMtk){
        this.lismtk = lisMtk;
    }
    public void displayMtk(){
        for (matakuliah mtk:this.lismtk){
            System.out.println(mtk.toString());
        }
    }
    //Relasi Agregasi
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNrp() {
        return nrp;
    }

    public void setNrp(String nrp) {
        this.nrp = nrp;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    @Override
    public String toString() {
        return "mahasiswa{" + "nama=" + nama + ", nrp=" + nrp + ", alamat=" + alamat + ", umur=" + umur + '}';
    }
    
}
