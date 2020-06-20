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
public class matakuliah {
    private String kodemtk;
    private String namamtk;
    private int sks;
    private String grade;
    
    public matakuliah(){
        
    }

    public matakuliah(String kodemtk ,String namamtk ,int sks ,String grade) {
        this.kodemtk = kodemtk;
        this.namamtk = namamtk;
        this.sks = sks;
        this.grade = grade;
    }
    
    public String getKodemtk() {
        return kodemtk;
    }

    public void setKodemtk(String kodemtk) {
        this.kodemtk = kodemtk;
    }

    public String getNamamtk() {
        return namamtk;
    }

    public void setNamamtk(String namamtk) {
        this.namamtk = namamtk;
    }

    public int getSks() {
        return sks;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "matakuliah{" + "kodemtk=" + kodemtk + ", namamtk=" + namamtk + ", sks=" + sks + ", grade=" + grade + '}';
    }
    
}
