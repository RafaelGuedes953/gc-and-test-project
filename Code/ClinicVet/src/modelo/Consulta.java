package modelo;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Consulta {
    private Date data;
    private int id;
    private String sintomas, nomeAnimal; //list of symptoms of animal from consult solicited
    private String turno;
    private Veterinario v;
    private Animal a;
    private Secretaria s;

    public Consulta(Animal ani, Secretaria sec, Veterinario vet) {
        v = vet;
        a = ani;
        s = sec;
    }
    
    public Consulta(){}
    
    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
        /*
        1 - Matutino
        2 - Vespertino
        3 - Noturno
        */
    }

    public Veterinario getVeterinario() {
        return v;
    }

    public void setVeterinario(Veterinario v) {
        this.v = v;
    }

    public Animal getAnimal() {
        return a;
    }

    public void setAnimal(Animal a) {
        this.a = a;
    }

    public Secretaria getSec() {
        return s;
    }

    public void setSec(Secretaria s) {
        this.s = s;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
    
    public String convData(){
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        
        return dateFormat.format(getData());
    }
    
    @Override
    public String toString(){
        return this.getAnimal().getNome()+", no dia: "+convData();
    }
}
