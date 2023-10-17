package persona;

import java.sql.Struct;

public class Persona {

    String nome;
    int  eta;
    public Animale animale;

    //costruttore

    public Persona(String nome, int eta, Animale animale){
        this.nome = nome;
        this.eta= eta;
        this.animale = animale;
    }

    public void saluta(){
        System.out.println("Ciao, mi chiamo " + nome + " e ho " + eta +  " anni");
    }

    public int calcolaAnno(int annoCorrente){
        return annoCorrente - eta;
    }
}
