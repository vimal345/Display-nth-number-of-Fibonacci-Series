import java.util.Scanner;
public class Fibonacci {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter position of number in fibonacci series that you want to print : ");
    int n = scan.nextInt();
    int fib = Fib(n-1);
    System.out.println(fib);
  }

  public static int Fib(int n) {
    if (n == 0 || n == 1) {
      return n;
    }
    int fibn1 = Fib(n - 1);
    int fibn2 = Fib(n - 2);
    int fibn = fibn1 + fibn2;
    return fibn;
  }
}