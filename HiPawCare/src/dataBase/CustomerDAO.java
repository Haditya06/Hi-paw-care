/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataBase;
import java.sql.Connection;
import java.sql.PreparedStatement;
import model.Customer;
/**
 *
 * @author Dit
 */
public class CustomerDAO {
    public boolean insertCustomer(Customer customer,int idUser){
        String sql = "INSERT INTO customer " + "(nama,alamat,no_hp,id_user)" + " VALUES (?,?,?,?)";

        try {
            Connection conn =DatabaseConnection.getConnection();
            PreparedStatement ps =conn.prepareStatement(sql);
            ps.setString(1,customer.getNama());
            ps.setString(2,customer.getAlamat());
            ps.setString(3,customer.getNoHp());
            ps.setInt(4,idUser);
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
