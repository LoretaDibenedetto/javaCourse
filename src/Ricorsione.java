public class Ricorsione {
    public static void main(String[] args){

        int numero = 20;
        int somma = moltiplicaSomma(numero);
    System.out.println("Stampa: " + numero + "\n" + somma);
    }

    /*calcoloSomma(5) restituira' 5+ calcoloSomma(4)
    * calcoloSomma(4) restituira' 5+ calcoloSomma(3)
    * calcoloSomma(3) restituira' 5+ calcoloSomma(2)
    * calcoloSomma(2) restituira' 5+ calcoloSomma(1)
    * calcoloSomma(1) restituira' 1
    *
    * risale perche' non richiama
    * somma i valori parziali
    * 2+ calcolosomma(2) = 2+ calcoloSomma(1) = 2+1 = 3 = x
    * calcoloSomma(3) = 3+ calcoloSomma(2) = 3+ x = 3+3 = 6
    * calcoloSomma(4) = 4+6 = 10
    * calcoloSomma(5) = 5+10 =15
    * int somma =15
    * */
    public static int calcoloSomma(int num){
        //se num e' uguale a 1
        if(num == 1){
            //ritorna 1
            return 1;
            //altrimenti
        }else{
            //ritorna 5 + calcolosomma (5-1 =4)
            return num+calcoloSomma(num-1);
        }
    }
    /*Chiama un metodo/ una funzione in se stesso, parzialmente o totalmente */

    public  static int moltiplicaSomma(int num){

        if (num == 1 ){
            return 1;
        }else{
            return num+ moltiplicaSomma(num /2);
        }
    }
}




