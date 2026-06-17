/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Dit
 */
public class Dokter {
    private int idDokter;
    private String nama;
    private String spesialis;
    private String noHp;

    public Dokter() {
    }

    public Dokter(int idDokter,String nama,String spesialis,String noHp) {
        this.idDokter = idDokter;
        this.nama = nama;
        this.spesialis = spesialis;
        this.noHp = noHp;
    }

    public String getNama() {
        return nama;
    }

    public String getSpesialis() {
        return spesialis;
    }
}
