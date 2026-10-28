import java.util.Scanner;
public class Inputfloatnumberandchar {
    public static void main(String[]args){
         Scanner input=new Scanner(System.in);

         double number1 ,number2;
         char char1;

        System.out.println("Enter a float number1:");
         number1=input.nextDouble();
         
        System.out.println("Enter a float number2:");
                number2=input.nextDouble();
        System.out.println("Enter a charecter :A,a/S,s/M,m/D,d");
        char1=input.next().charAt(0);

         switch (char1){
             case 'A':
             case 'a':
                 System.out.print("+"+(number1+number2));
                 break;
             case 'S':
             case 's':
                 System.out.print("-"+(number1+number2));
                 break;
             case 'M':
             case'm':
                 System.out.print("*"+(number1+number2));
                 break;
             case 'D':
             case'd':
                 System.out.print("/"+(number1+number2));
                 break;
             default:
                 System.out.println("invalid code  ");
                 System.exit(0);

         }








    }


}
