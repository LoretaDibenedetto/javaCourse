
public class Main {
    public static void main(String[] args) {

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