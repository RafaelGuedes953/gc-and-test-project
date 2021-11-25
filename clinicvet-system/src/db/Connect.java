/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.sql.*;
import javax.swing.JOptionPane;

public class Connect {
    
    public static Connection conectar() {
        String server = "jdbc:mysql://localhost:3306/clinicvet";
        String user = "root";
        String senha = "";
        String driver = "com.mysql.jdbc.Driver";
        Connection con = null;

        try {
            Class.forName(driver);
            con = DriverManager.getConnection(server, user, senha);
            return con;
        } catch (Exception e) {
            System.out.println("Erro!!! " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro encontrado", "Error!!!", 0);
            return null;
        }
    }
}
