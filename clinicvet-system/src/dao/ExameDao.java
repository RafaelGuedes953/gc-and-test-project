package dao;

import db.Connect;
import java.sql.*;
import javax.swing.JOptionPane;

public class ExameDao {
    Connection con;
    
    public ExameDao(){
        this.con = Connect.conectar();
    }
    
    public void addExame(String ex, int idVet, int idCon){
        try {
            String sql = "insert into exames (nome,id_veterinario,id_consulta) values (?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, ex);
            ps.setInt(2, idVet);
            ps.setInt(3, idCon);

            ps.execute();
            ps.close();

            JOptionPane.showMessageDialog(null, "Exame registrado!!!", "Confirmação de exame!", 1);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao registrar exame!!!\n" + e.getMessage(), "Erro!!!", 0);
        }
    }
    
}
