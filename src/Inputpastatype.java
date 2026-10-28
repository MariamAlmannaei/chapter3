import java.util.Scanner;
public class Inputpastatype {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        {
            char pastatype;
            double price=0,app,total;
            System.out.println("enter pasta type: C= chiken, M=meat, V= vegetable");
            pastatype=input.next().charAt(0);

            System.out.println("enter appetizer number:");
            app=input.nextDouble();

//if type ;
            //if (pastatype=='C'||pastatype=='c'||pastatype=='M'||pastatype=='m')
           // {
               // price=2.5;

           // }
            //else if (pastatype=='V'||pastatype=='v')
            //{
              //  price=1.5;


           // }
            //total=price+app*1.2;
            //System.out.println("the price is :"+total+" BH");


            // switch type
            switch (pastatype) {
                case 'C':
                case 'c':
                case 'M':
                case 'm': price = 2.5;
                    break;
                case 'V':
                case 'v': price = 2.1;
                    break;
                default:
                    System.out.println("Invalid pasta type");
                    break;
            }
            total=price+app*1.2;
            System.out.println("The price :"+total+" BH ");
            }
        }






    }









