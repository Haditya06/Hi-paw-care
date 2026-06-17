/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataBase;
import java.sql.Connection;
import java.sql.PreparedStatement;
import model.Hewan;
/**
 *
 * @author Dit
 */
public class HewanDAO {
    public boolean insertHewan(Hewan hewan,int idCustomer) {
        String sql = "INSERT INTO hewan " + "(nama,jenis,id_customer)" + " VALUES (?,?,?)";
        try {
            Connection conn = DatabaseConnection.getConnection();
            PreparedStatement ps =conn.prepareStatement(sql);
            ps.setString(1,hewan.getNama());
            ps.setString(2,hewan.getJenis());
            ps.setInt(3,idCustomer);
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
