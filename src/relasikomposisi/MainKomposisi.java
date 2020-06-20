/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relasikomposisi;

/**
 *
 * @author ASUS
 */
public class MainKomposisi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        matakuliah mtk1 = new matakuliah("IFA-267 ", "Basis Data ", 4 , "");
        matakuliah mtk2 = new matakuliah("IFA-268 ", "Machine Leaarning ", 2 , "");
        matakuliah mtk3 = new matakuliah("IFA-269 ", "Struktur data ", 3 , "");
        matakuliah[] listMtk = {mtk1, mtk2, mtk3};
        mahasiswa mhs = new mahasiswa ("152018053 ", "Lala ", "Bandung ", 17);
        mhs.setMtk(listMtk);
        System.out.println("profile mhs");
        System.out.println(mhs.toString());
        System.out.println("Mata Kuliah yang diambil");
        mhs.displayMtk();
    }
    
}