package modelo;

public class Animal {
    private String nome;
    private String descricao;
    private String raca;
    private double peso;
    private double altura;
    private int id;

    Cliente dono; //remover get e set

    public Animal (String nome, String descricao, String raca, double peso, double altura, Cliente dono){
        setNome(nome);
        setDescricao(descricao);
        setRaca(raca);
        setPeso(peso);
        setAltura(altura);
        setDono(dono);
    }

    public Animal() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return this.descricao;
    }

    public void setRaca(String raca){
        this.raca = raca;
    }

    public String getRaca(){
        return this.raca;
    }

    public void setPeso(double peso){
        this.peso = peso;
    }

    public double getPeso(){
        return this.peso;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public double getAltura(){
        return this.altura;
    }

    public Cliente getDono() {
        return dono;
    }

    public void setDono(Cliente dono) {
        this.dono = dono;
    }
    
    @Override
    public String toString(){
        return this.getNome();
    }
}
