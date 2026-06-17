/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Dit
 */
public class Pemeriksaan {
    private int idPemeriksaan;
    private Reservasi reservasi;
    private Dokter dokter;
    private String diagnosa;
    private String tindakan;

    public Pemeriksaan() {
    }

    public Pemeriksaan(int idPemeriksaan,Reservasi reservasi,Dokter dokter,String diagnosa,String tindakan) {
        this.idPemeriksaan = idPemeriksaan;
        this.reservasi = reservasi;
        this.dokter = dokter;
        this.diagnosa = diagnosa;
        this.tindakan = tindakan;
    }
}
