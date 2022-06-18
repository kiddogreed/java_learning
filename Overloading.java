public class Overloading {
   public static void main(String[] args) {

    // int x = 10;
    // int y = 20;
    // int r = 5;

    // Overloading overloading = new Overloading();
    // int area = overloading.area(x, y);
    // float radius = overloading.area(r);

    // System.out.println("Area of rectangle:"+area );
    // System.out.println("Area of cirle:"+radius);
    int max = val1 >= val2 ? val1 : val2;

    System.out.println(max);
     
   }
   public int area(int n1, int n2) {
     int res = n1 * n2;
     return res;
   }

   public float area(int n) {
     float res = 3.14f *n *n;
     return res;
   }
}
