package dao;

import java.sql.*;
import db.Connect;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Cliente;

public class ClienteDao {

    Connection con;

    public ClienteDao() {
        this.con = Connect.conectar();
    }
    
    public void cadastrar(Cliente novo) {
        try {
            String sql = "insert into cliente (nome,cpf,tel,endereco) values (?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, novo.getNome());
            ps.setString(2, novo.getCpf());
            ps.setString(3, novo.getTel());
            ps.setString(4, novo.getEnd());

            ps.execute();
            ps.close();

            JOptionPane.showMessageDialog(null, "Clente cadastrado com sucesso!!!", "Confirmação de cadastro!", 1);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Oops, cliente não cadastrado!!!\n" + e.getMessage(), "Erro!!!", 0);
        }
    }

    public List<Cliente> listarClientes() {
        try {
            List<Cliente> lista = new ArrayList<>();

            //sql de seleção
            String sql = "select * from cliente";

            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Cliente atual = new Cliente();

                atual.setCpf(rs.getString("cpf"));
                atual.setId(rs.getInt("id"));
                atual.setEnd(rs.getString("endereco"));
                atual.setTel(rs.getString("tel"));
                atual.setNome(rs.getString("nome"));

                lista.add(atual);
                
                //debug
                //System.out.println("id cliente: "+atual.getId());
            }

            return lista;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro encontrado na conexão do banco de dados (Cliente): " + e, "Erro!!!", 0);
            return null;
        }
    }

    public Cliente getCliente(int idCliente) { //para enviar id para a consulta
        try {
            //sql de seleção do cliente id=parâmetro
            String sql = "select * from cliente where id=" + idCliente;

            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            if (rs != null && rs.next()) {
                Cliente atual = new Cliente();

                atual.setCpf(rs.getString("cpf"));
                atual.setId(rs.getInt("id"));
                atual.setEnd(rs.getString("endereco"));
                atual.setTel(rs.getString("tel"));
                atual.setNome(rs.getString("nome"));
                
                //debug
                //System.out.println("id cliente: "+atual.getId());

                return atual;
            }
            return null;
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro encontrado (Cliente): " + e, "Erro!!!", 0);
            return null;
        }
    }
}
