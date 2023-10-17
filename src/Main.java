
public class Main {
    public static void main(String[] args) {
/*
      System.out.println("the program is starting");
      //FizzBuzz
      for(int i = 1; i<=100;i++) {
        if(i % 15 ==0) {
          System.out.println("FizzBuzz");
        }
       else if(i % 3 == 0){
          System.out.println("Fizz");
        }else if(i % 5 == 0){
          System.out.println("Buzz");
        }else{
          System.out.println(i);
        }
      }

*/
        int altezza = 5; // Modifica l'altezza del rettangolo
        int larghezza = 10; // Modifica la larghezza del rettangolo

        for (int i = 0; i < altezza; i++) {
            for (int j = 0; j < larghezza; j++) {
                if (i == 0 || i == altezza - 1 || j == 0 || j == larghezza - 1) {
                    System.out.print("*"); // Stampa un asterisco per i bordi
                } else {
                    System.out.print(" "); // Stampa uno spazio per l'interno
                }
            }
            System.out.println(); // Vai a capo dopo ogni riga
        }


     /* int amount = 47;

      int cost = -56;

      long amountLong = 9223;

      System.out.println("cost " + amount);
      System.out.println("cost " + cost);
      System.out.println("cost " + amountLong);

      float littleDecimalNumber = 4.5f;
      double bigDecimalNumber = 4.5;

      boolean myBoolean= false; // o true

      char myChar = 'l';

      //Basic operation

      int a = 5;
      int b = 3;
      int c = a+b;


      System.out.println("the integet A is " + a);
      System.out.println("the integet A is " + b);

      System.out.println("the sum is "+ c);

      int d = a-b;
      System.out.println("the difference is "+ d);


      int e = a*b;
      System.out.println("the difference is "+ e);


      double f = (float)a / (float)b;
      System.out.println("the difference is "+ f);


    */



    }
}