import java.util.Scanner;

public class Inputtempreture {
    public static void main(String[]args){

        Scanner input = new Scanner(System.in);
        double tempreature,result;
        char unit;

        System.out.println("Enter your tempreature followed by 'f' or 'c' ");
        tempreature=input.nextDouble();
        unit=input.next().charAt(0);

        switch (unit){
            case 'F':
            case 'f':
                result=5.0/9.0*(tempreature-32);
                System.out.println("your tempreature is:"+result);
                break;
            case 'C':
            case 'c':
                result=9.0/5*(tempreature-32);
                System.out.println("your tempreature is :"+result);
                break;

            default:
                System.out.println("invalid input");
            System.exit(0);

        }
        
















    }


















}