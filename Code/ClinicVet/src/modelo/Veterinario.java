package modelo;

import java.util.ArrayList;

public class Veterinario extends Funcionario {

    private String crmv;
    private int idVet;
    ArrayList<String> exame = new ArrayList<>();
    Exame e;

    public Veterinario(String nome, String cpf, String crmv, int id) {
        super(nome, cpf, id);
        setCrmv(crmv);
    }

    public Veterinario() {}

    public void setCrmv(String crmv) {
        this.crmv = crmv;
    }

    public String getCrmv() {
        return crmv;
    }

    public int getIdVet() {
        return idVet;
    }

    public void setIdVet(int idVet) {
        this.idVet = idVet;
    }
    
}
