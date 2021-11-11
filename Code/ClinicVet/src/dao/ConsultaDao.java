package dao;

import db.Connect;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Consulta;

public class ConsultaDao {
    Connection con;

    public ConsultaDao() {
        this.con = Connect.conectar();
    }

    public void cadastrar(Consulta novo) {
        
        try {
            String sql = "insert into consulta (sintomas,data,turno,id_animal,id_animal_cliente,id_veterinario,id_secretaria) values (?,?,?,?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, novo.getSintomas());
            //cadastrar data tipo Date
            ps.setDate(2, new java.sql.Date(novo.getData().getTime()));
            ps.setString(3, novo.getTurno());
            ps.setInt(4, novo.getAnimal().getId());
            ps.setInt(5, novo.getAnimal().getDono().getId());
            ps.setInt(6, novo.getVeterinario().getIdVet());
            ps.setInt(7, novo.getSec().getIdSec());

            ps.execute();
            ps.close();

            JOptionPane.showMessageDialog(null, "Consulta marcada!!!", "Confirmação de consulta!", 1);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao marcar consulta!!!\n" + e.getMessage(), "Erro!!!", 0);
        }
    }

    public List<Consulta> listarConsultas() {
        try {
            List<Consulta> lista = new ArrayList<>();

            //sql de seleção
            String sql = "select * from consulta";

            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Consulta atual = new Consulta();
                AnimalDao ani = new AnimalDao();
                VeterinarioDao vet = new VeterinarioDao();
                SecretariaDao sec = new SecretariaDao();
                
                atual.setId(rs.getInt("id"));
                atual.setSintomas(rs.getString("sintomas"));
                atual.setData(rs.getDate("data")); //o problema pode ser aqui
                atual.setTurno(rs.getString("turno"));
                atual.setAnimal(ani.getAnimal(rs.getInt("id_animal")));
                atual.setVeterinario(vet.getVeterinario(rs.getInt("id_veterinario")));
                atual.setSec(sec.getSecretaria(rs.getInt("id_secretaria")));
                
                lista.add(atual);
            }
            return lista;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro encontrado na conexão do banco de dados (Consulta): " + e, "Erro!!!", 0);
            return null;
        }
    }
    
    public void alterarDiagnostico(int idCons, String diag){
        try {
            String sql = "update consulta set diagnostico = '"+diag+"' WHERE id = "+idCons;

            PreparedStatement ps = con.prepareStatement(sql);

            ps.execute();
            ps.close();

            JOptionPane.showMessageDialog(null, "Diagnóstico gravado!!!", "Confirmação de diagnóstico!", 1);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao gravar diagnóstico!!!\n" + e.getMessage(), "Erro!!!", 0);
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Erro encontrado!!!\n" + e.getMessage(), "Erro!!!", 0);
        }
    }
}
