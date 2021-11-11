package dao;

import db.Connect;
import java.sql.*;
import javax.swing.JOptionPane;
import modelo.Funcionario;

public class FuncionarioDao {
    Connection con;

    public FuncionarioDao() {
        this.con = Connect.conectar();
    }

    public Funcionario getDados(int idFunc) { //para enviar id para a consulta
        //System.out.println("IdFunc (debug): " + idFunc);
        try {
            //sql de seleção do cliente id=parâmetro
            String sql = ("select * from funcionario where id=" + idFunc);

            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            if (rs != null && rs.next()) {
                Funcionario atual = new Funcionario();

                atual.setCpf(rs.getString("cpf"));
                atual.setId(rs.getInt("id"));
                atual.setEnd(rs.getString("endereco"));
                atual.setNome(rs.getString("nome"));
                
                //debug
                //System.out.println("id func: "+atual.getId());
                return atual;
            }
            //System.out.println("A consulta não retornou resultados  para IdFunc (debug): " + idFunc);
            return null;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro encontrado (Func): " + e, "Erro!!!", 0);
            return null;
        }
    }
}
