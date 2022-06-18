import java.util.Scanner;

public class Arraytest {
  public static void main(String[] args) {
    
    System.out.println("Enter Strings:");

    Scanner sc = new Scanner(System.in);
    String  txt = sc.nextLine();
     char[] text = txt.toCharArray();
     int mx = text.length;
     char[] arr = new char[mx + 2];
     char[] newarr = new char[mx + 2];

    for (int x = 0 ; x<mx ;x++){
      arr[x] = text[x];
    }

    for (int y =mx-1, ctr = 0;y >=0; y--, ctr++){
      // if(ctr== text.length){
      //   ctr+=1;
      // }
      newarr[ctr] = arr[y];
    }

    System.out.println(newarr);


   


  }
}
