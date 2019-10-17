/**
 * Created by JANVI on 10/08/2019.
 * 4.	Write a Java program that takes three numbers as input to calculate and print the average of the numbers
 */
import java.util.Scanner;
public class ForthHw {

    public static void main(String [] args) {

        average();
    }

    public static void average(){

    Scanner sn=new Scanner(System.in);

        System.out.println("enter first number");
        float b=sn.nextInt();


        System.out.println("ente second number");
        float c=sn.nextInt();


        System.out.println("enter third number");
        float d=sn.nextInt();


        System.out.println("Average value is : "+ (b+c+d)/3 );

    }
}
