/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Dit
 */
public class Hewan {
    private int idHewan;
    private String nama;
    private String jenis;
    private Customer customer;

    public Hewan() {
    }

    public Hewan(int idHewan,String nama,String jenis,Customer customer) {
        this.idHewan = idHewan;
        this.nama = nama;
        this.jenis = jenis;
        this.customer = customer;
    }

    public String getNama() {
        return nama;
    }

    public String getJenis() {
        return jenis;
    }
}
