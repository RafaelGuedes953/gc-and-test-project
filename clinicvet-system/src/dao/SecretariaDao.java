package dao;

import db.Connect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Funcionario;
import modelo.Secretaria;

public class SecretariaDao {

    Connection con;

    public SecretariaDao() {
        this.con = Connect.conectar();
    }

    public List<Secretaria> listarSecretarias() {
        try {
            List<Secretaria> lista = new ArrayList<>();

            //sql de seleção
            String sql = "select * from secretaria";

            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Secretaria atual = new Secretaria();
                FuncionarioDao fun = new FuncionarioDao();
                Funcionario f = new Funcionario();

                atual.setIdSec(rs.getInt("id"));
                //selecionando dados da tabela funcionario
                f = fun.getDados(rs.getInt("id_funcionario"));
                //System.out.println("Nome do func (debug): " + f.getNome());
                atual.setNome(f.getNome());
                atual.setEnd(f.getEnd());
                atual.setCpf(f.getCpf());
                atual.setId(f.getId());

                //debug
                //System.out.println("id func (sec): " + atual.getId());
                //System.out.println("id sec: " + atual.getIdSec());

                lista.add(atual);
            }

            return lista;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro encontrado (Sec): " + e, "Erro!!!", 0);
            return null;
        }
    }

    public Secretaria getSecretaria(int idSec) { //para enviar id para a consulta
        try {
            //sql de seleção do animal com id=parâmetro
            String sql = "select * from secretaria where id=" + idSec;

            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                Secretaria atual = new Secretaria();
                FuncionarioDao fun = new FuncionarioDao();
                Funcionario f = new Funcionario();
                f = fun.getDados(rs.getInt("id_funcionario"));

                atual.setIdSec(rs.getInt("id"));
                atual.setCpf(f.getCpf());
                atual.setEnd(f.getEnd());
                atual.setNome(f.getNome());
                atual.setId(f.getId());

                return atual;
            }
            return null;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro encontrado (Sec): " + e, "Erro!!!", 0);
            return null;
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Erro encontrado: " + e, "Erro!!!", 0);
            return null;
        }
    }
}
