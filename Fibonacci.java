import java.util.Scanner;
public class Fibonacci {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter position of number in fibonacci series you want to display : ");
    int n = scan.nextInt();
    int[] QB = new int[n+1];
    int FibM = MemoizedFib(n-1, QB);
    System.out.println(FibM);
  }

  public static int MemoizedFib(int n, int []QB) {
    if (n == 0 || n == 1) {
      return n;
    }
    if(QB[n] != 0) {
      return QB[n];
    }
    int fibn1 = MemoizedFib(n - 1, QB);
    int fibn2 = MemoizedFib(n - 2, QB);
    int fibn = fibn1 + fibn2;
    return fibn;
  }
}
