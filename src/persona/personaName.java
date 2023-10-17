package persona;

public class personaName {
    public static void main(String[] args){
      Animale animale1 = new Animale("alfredo", "gatto");
        Persona persona1 = new Persona("alice", 30, animale1);

        persona1.saluta();

        System.out.println(persona1.calcolaAnno(2023));
        System.out.println("il gatto di "+ persona1.nome.toUpperCase() + " si chiama "+ persona1.animale.nome);
    }
}


