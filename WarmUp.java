public class WarmUp
{
  public static void main(String[] args)
  {
    System.out.println(isEven(4));
    System.out.println(isEven(5));
    System.out.println(isDivisible(3,3));
  }

  public static boolean isEven(int n)
  {
    return (n % 2 == 0);
  }
  
  public static boolean isDivisible(int a, int b)
  {
    return (a % b == 0);
  }
}
