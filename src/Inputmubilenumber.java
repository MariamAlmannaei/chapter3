import java.util.Scanner;
public class Inputmubilenumber {
    public static void main(String[]args){

        Scanner input=new Scanner(System.in);

        int phonenumber,type;
        String num ="";

        System.out.println("Enter your phone number:");
phonenumber=input.nextInt();

   if(phonenumber>=10000000 && phonenumber<=99999999) {
  System.out.println("Your phone number is 8 digets ");

    type=phonenumber/1000000;

    switch(type){
        case 36:
            num="zain";
        break;
        case 34:
        case 39:
            num="batelco";
        break;
        case 33:
            num="viva";
        break;
        default:
            System.out.print("invalid");
            break;
    }
System.out.println("the poiver is :"+num);
}

else
{
    System.out.println("Invalid phone number ");
}










    }










}
