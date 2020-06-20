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
public class mainagregasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        matakuliah mtk1 = new matakuliah("IFA-267 "," Basis Data ", 4 , " A ");
        matakuliah mtk2 = new matakuliah("IFA-268 "," Pemrograman Berorientasi Objek ", 5 , " B ");
        matakuliah mtk3 = new matakuliah("IFA-269 "," Pengolahan Citra Digital ", 6 , " C ");
        matakuliah [] lisMtk = {mtk1, mtk2, mtk3};
        mahasiswa mhs = new mahasiswa ("Asep ", " 78998 ", " Bandung ", 20);
        mhs.setMtk(lisMtk);
        System.out.println("Profile mhs ");
        System.out.println(mhs.toString());
        System.out.println("matakuliah yang di ambil ");
        mhs.displayMtk();
        
    }
    
}
