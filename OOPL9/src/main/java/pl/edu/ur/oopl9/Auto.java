/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl9;

/**
 *
 * @author student
 
 */
 public class Auto {
     private String marka;
     private String nazwa;
     private int vmax;
     private int cena;

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getVmax() {
        return vmax;
    }

    public void setVmax(int vmax) {
        this.vmax = vmax;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public Auto(String marka, String nazwa, int vmax, int cena) {
        this.marka = marka;
        this.nazwa = nazwa;
        this.vmax = vmax;
        this.cena = cena;
    }

    @Override
    public String toString() {
        return "Auto{" + "marka=" + marka + ", nazwa=" + nazwa + ", vmax=" + vmax + ", cena=" + cena + '}';
    }
     
 
 }