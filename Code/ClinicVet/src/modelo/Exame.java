package modelo;

import java.util.ArrayList;

public class Exame {

    private Veterinario v;
    private Consulta c;
    private String nome;
    private int id;

    public Exame() {}

    public Veterinario getVet() {
        return v;
    }

    public void setVet(Veterinario v) {
        this.v = v;
    }

    public Consulta getCons() {
        return c;
    }

    public void setCons(Consulta c) {
        this.c = c;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getId(){
        return this.id;
    }
    
    public void setId(int id){
        this.id = id;
    }
}
