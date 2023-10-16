package apk_laundry_ukk;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class koneksi {
    private String url="jdbc:mysql://localhost:3306/laundry";
    private String username_xampp="root";
    private String password_xampp="";
    private Connection con;
    public void connect(){
        try{
            con = DriverManager.getConnection(url, username_xampp, password_xampp);
            System.out.println("Koneksi Berhasil");
        } catch (SQLException e){
        JOptionPane.showMessageDialog(null, "ERROR KONEKSI KE DATABASE:\n" + e);
    }
}

public Connection getCon() {
    return con;
}
}
