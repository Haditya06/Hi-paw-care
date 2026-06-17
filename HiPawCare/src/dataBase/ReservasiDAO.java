/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataBase;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Timestamp;
import model.Reservasi;
/**
 *
 * @author Dit
 */
public class ReservasiDAO {
    public boolean insertReservasi(Reservasi reservasi,int idCustomer,int idHewan) {
        String sql = "INSERT INTO reservasi " + "(id_customer,id_hewan," + "tanggal,status)" + " VALUES (?,?,?,?)";

        try {
            Connection conn = DatabaseConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1,idCustomer);
            ps.setInt(2,idHewan);
            ps.setTimestamp(3,Timestamp.valueOf(reservasi.getTanggal()));
            ps.setString(4,reservasi.getStatus());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
