public class Funcreturn {
  public static void main(String[] args) {
      Funcreturn fun = new Funcreturn();
      int answer = fun.add(10, 20);
      System.out.println(answer);
      swaper(10, 20);
  }

  public int add(int a, int b) {
    return a + b;
  }

  public static void swaper(int a, int b) {
    System.out.println("Before swapping, a="+a+ " b= "+b);
    int c = a;
    a = b;
    b = c;
    System.out.println("After swapping, a=" +a + "b = "+ b);
  } 
  //commnet
}
