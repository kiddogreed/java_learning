import java.util.Scanner;
//if else checker
public class NegativeCheck {

  public static void main(String[] args) {
    
    System.out.println("Enter Number:");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();

    System.out.println(num);
    String value = " ";
    if(num >0){
      value =" (+)Positive Number";
    } else if(num < 0){
      value = " (-)Negative Number";
    }else{
      value = " (0)Zero Number";
    }

    System.out.println("Your Number is :"+num+value);

  }
  
}
