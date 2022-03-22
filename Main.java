import java.util.Scanner;
import java.lang.Math;

class Main {
  public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
    System.out.println("Podaj numer działania: ");
     System.out.println("1) potęga liczb");
     System.out.println("2) suma pierwiastków");
     System.out.println("3) wartość maksymalna");
     System.out.println("4) dzielenie");
    int s = scan.nextInt();
    
    switch(s){
      case 1:
        System.out.println("Podaj pierwszą liczbę: ");
        double a = scan.nextInt();
         System.out.println("Podaj drugą liczbę: ");
        double b = scan.nextInt();
        double wynik = Math.pow( a, b);
        System.out.println("Wynik działania to:"+ wynik);
        break;
     case 2:
        System.out.println("Podaj pierwszą liczbę: ");
        double c = scan.nextInt();
         System.out.println("Podaj drugą liczbę: ");
        double d = scan.nextInt();
        double e = Math.sqrt(c);
        double f = Math.sqrt(e);
        double wynik1 = e+f;
       System.out.println("Wynik działania to:"+ wynik1);
        break;
    case 3:
     System.out.println("Podaj pierwszą liczbę: ");
        double g = scan.nextInt();
         System.out.println("Podaj drugą liczbę: ");
        double h = scan.nextInt();
    double wynik2 = Math.max(g,h);
       System.out.println("Wynik działania to:"+ wynik2);
      break;
    
  case 4:
    System.out.println("Podaj pierwszą liczbę: ");
        double i = scan.nextInt();
         System.out.println("Podaj drugą liczbę: ");
        double j = scan.nextInt();
    double wynik3 = i/j;
       System.out.println("Wynik działania to:"+ wynik3);
      break;
    }
    }
}