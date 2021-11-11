package modelo;

import java.util.Scanner;
import java.util.ArrayList;

public class Secretaria extends Funcionario {

    Scanner scan = new Scanner(System.in);
    ArrayList<Animal> a = new ArrayList<>(); //stay here
    ArrayList<Secretaria> s = new ArrayList<>(); //no sense
    //ArrayList<Consulta> cons = new ArrayList<>();
    private int idSec;

    public Secretaria(String nome, String cpf, int id) {
        super(nome, cpf, id);
    }

    public Secretaria() {}

    public int getIdSec() {
        return idSec;
    }

    public void setIdSec(int idSec) {
        this.idSec = idSec;
    }

    /*public void marcarConsulta(Animal ani, Veterinario vet) {
        //client, secretary and veterinarian comes from interface
        Consulta con = new Consulta(ani, this, vet);
        a.add(ani);
        cons.add(con);
    }

    public void editarConsulta(Animal ani, Veterinario vet, int id) {
        //id comes from interface
        Consulta con = new Consulta(ani, this, vet);
        cons.add(id, con); // add change to selected index
    }

    public void mostrarConsulta(Cliente cli, int id) {
        //id comes from interface
        cons.get(id).mostrarConsultaCliente(cli);
    }*/

}
