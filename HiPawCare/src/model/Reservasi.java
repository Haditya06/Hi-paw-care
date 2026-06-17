/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.time.LocalDateTime;
/**
 *
 * @author Dit
 */
public class Reservasi {
    private int idReservasi;
    private Customer customer;
    private Hewan hewan;
    private LocalDateTime tanggal;
    private String status;

    public Reservasi() {
    }
    public Reservasi(int idReservasi,Customer customer,Hewan hewan,LocalDateTime tanggal,String status) {
        this.idReservasi = idReservasi;
        this.customer = customer;
        this.hewan = hewan;
        this.tanggal = tanggal;
        this.status = status;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Hewan getHewan() {
        return hewan;
    }
}
