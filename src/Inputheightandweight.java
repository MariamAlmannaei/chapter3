import java.util.Scanner;
public class Inputheightandweight {
    public static void main(String[]args)
    {
        double Height,ideaWeight;
        Scanner input=new Scanner(System.in);


        System.out.println("Enter the height:");
        //input place
        Height=input.nextDouble();
        //process
        if (Height>=140 && Height<=240)
        {
            ideaWeight=Height-100;

            //print result
            System.out.println("your ideal weight is: "+ideaWeight);

        }
        else
        System.out.println("invalid height");

    }



}
