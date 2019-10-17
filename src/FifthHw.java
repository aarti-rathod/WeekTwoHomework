
 /*
 5.	Write a Java program to print the area and perimeter of a rectangle.
Test Data:
Width = 5.6 Height = 8.5

Expected Output
Area is 5.6 * 8.5 = 47.60
Perimeter is 2 * (5.6 + 8.5) = 28.20

area = w * h // area of rectangle
P=2(l+h)   // perimeter

*/


 public class FifthHw{

     public static void main(String [] args ){


         double w=5.6;                 // variable
         double h=8.5;              //variable


         System.out.println("Area is:" + w +"*" + h + "=" + w*h);

         System.out.println("Perimeter is: "+  2 + "*" + "(" + w + "+" + h+")" + "=" +  2*(w+h)  );
     }


 }