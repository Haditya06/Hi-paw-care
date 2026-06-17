/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Dit
 */
public class Customer extends User {
    private int idCustomer;
    private String nama;
    private String alamat;
    private String noHp;

    public Customer() {
    }

    public Customer(int idCustomer,String nama,String alamat,String noHp,String username,String password) {

        super(username,password);
        this.idCustomer = idCustomer;
        this.nama = nama;
        this.alamat = alamat;
        this.noHp = noHp;
    }

    @Override
    public String getRole() {
        return "CUSTOMER";
    }

    public String getNama() {
        return nama;
    }
}
