package dao;

import db.Connect;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Funcionario;
import modelo.Veterinario;

public class VeterinarioDao {

    Connection con;

    public VeterinarioDao() {
        this.con = Connect.conectar();
    }

    public List<Veterinario> listarVeterionarios() {
        try {
            List<Veterinario> lista = new ArrayList<>();

            //sql de seleção
            String sql = "select * from veterinario";

            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Veterinario atual = new Veterinario();
                FuncionarioDao fun = new FuncionarioDao();
                Funcionario f = new Funcionario();

                atual.setIdVet(rs.getInt("id"));
                atual.setCrmv(rs.getString("crmv"));
                //selecionando dados da tabela funcionario
                f = fun.getDados(rs.getInt("id_funcionario"));
                //System.out.println("Nome do func (debug): " + f.getNome());
                atual.setId(f.getId());
                atual.setNome(f.getNome());
                atual.setEnd(f.getEnd());
                atual.setCpf(f.getCpf());
                lista.add(atual);
            }

            return lista;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro encontrado (Vet): " + e, "Erro!!!", 0);
            return null;
        }
    }

    public Veterinario getVeterinario(int idVet) { //para enviar id para a consulta
        try {
            //sql de seleção do animal com id=parâmetro
            String sql = "select * from veterinario where id=" + idVet;

            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                Veterinario atual = new Veterinario();
                FuncionarioDao fun = new FuncionarioDao();
                Funcionario f = new Funcionario();
                f = fun.getDados(rs.getInt("id_funcionario"));

                atual.setIdVet(rs.getInt("id"));
                atual.setCrmv(rs.getString("crmv"));
                atual.setCpf(f.getCpf());
                atual.setEnd(f.getEnd());
                atual.setNome(f.getNome());
                atual.setId(f.getId());

                return atual;
            }
            return null;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro encontrado (Vet): " + e, "Erro!!!", 0);
            return null;
        }
    }
}
