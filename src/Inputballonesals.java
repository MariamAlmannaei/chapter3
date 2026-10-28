// استدعاء دالة
import java.util.Scanner;

public class Inputballonesals {
    public static void main(String[]args ){
        Scanner input=new Scanner(System.in);
        double sales , price ;

System.out.print("Enter the namber of sales : ");
sales= input.nextDouble();
//if
    if (sales>=500 && sales<=1000) {
        price = sales * 8;
        System.out.println("the price is :" + price + "fills");
    }
 else if (sales>1000) {
     price = sales * 6;
     System.out.println("the prce is:" + price + "fills");
 }
  else {
        price = sales * 10;
        System.out.println("the price is :" + price + "fills");
    }






    }







}
