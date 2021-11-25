package dao;

import db.Connect;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Animal;

public class AnimalDao {

    Connection con;

    public AnimalDao() {
        this.con = Connect.conectar();
    }

    public void cadastrar(Animal novo) {
        try {
            String sql = "insert into animal (nome,descricao,raca,peso,altura,id_cliente) values (?,?,?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, novo.getNome());
            ps.setString(2, novo.getDescricao());
            ps.setString(3, novo.getRaca());
            ps.setDouble(4, novo.getPeso());
            ps.setDouble(5, novo.getAltura());
            ps.setInt(6, novo.getDono().getId());

            ps.execute();
            ps.close();

            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!!!", "Confirmação de cadastro!", 1);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Pet não cadastrado!!!\n" + e.getMessage(), "Erro!!!", 0);
        }
    }

    public List<Animal> listarAnimais() {
        try {
            List<Animal> lista = new ArrayList<>();

            //sql de seleção
            String sql = "select * from animal";

            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Animal atual = new Animal();
                atual.setId(rs.getInt("id"));
                atual.setNome(rs.getString("nome"));
                atual.setRaca(rs.getString("raca"));
                atual.setDescricao(rs.getString("descricao"));
                atual.setPeso(rs.getDouble("peso"));
                atual.setAltura(rs.getDouble("altura"));
                atual.setDono(new ClienteDao().getCliente(rs.getInt("id_cliente")));

                lista.add(atual);
            }

            return lista;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro encontrado: " + e, "Erro!!!", 0);
            return null;
        }
    }

    public Animal getAnimal(int idAnimal) { //para enviar id para a consulta
        try {
            //sql de seleção do animal com id=parâmetro
            String sql = "select * from animal where id=" + idAnimal;

            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                Animal atual = new Animal();
                ClienteDao cli = new ClienteDao();

                atual.setId(rs.getInt("id"));
                atual.setNome(rs.getString("nome"));
                atual.setRaca(rs.getString("raca"));
                atual.setDescricao(rs.getString("descricao"));
                atual.setPeso(rs.getDouble("peso"));
                atual.setAltura(rs.getDouble("altura"));
                atual.setDono(cli.getCliente(rs.getInt("id_cliente")));

                //System.out.println("nome animal: "+rs.getString("nome")); //debug
                return atual;
            }

            return null;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro encontrado (Animal): " + e, "Erro!!!", 0);
            return null;
        }
    }
}
