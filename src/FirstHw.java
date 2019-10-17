/**
 * Created by JANVI on 10/08/2019.
 * <p>
 * 1.	Write a Java program that takes a number as input and prints its multiplication table upto 10.
 * Test Data:
 * Input a number: 8
 * <p>
 * Expected Output :
 * 8 x 1 = 8
 * 8 x 2 = 16
 * 8 x 3 = 24
 * ...
 * 8 x 10 = 80
 */


import java.util.Scanner;

public class FirstHw {



    public static void main(String[] args) {

        System.out.println(" Enter The number:");               //user will enter the number
        Scanner call = new Scanner(System.in);                      //cretaed object of scanner
        int a = call.nextInt();                                    //entered value store in a

        int i;


        for(i = 1 ; i <= 10 ; i++ ){

            //8 * 1 = 8
            //8 * 2 = 16

            System.out.println(a + "*" + i + "=" + (a*i));

        }



    }
}


