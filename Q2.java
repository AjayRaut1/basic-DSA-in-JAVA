//Write a Java program to calculate Fibonacci Series up to n numbers
import java.util.*;
public class Main
{
    public static void main(String[] args) 
    {
        //Take input from the user
        //Create instance of the Scanner class
        Scanner sc=new Scanner(System.in);
        int t1 = 0, t2 = 1;
        System.out.print("Enter the number: ");
        int n=sc.nextInt();   //Declare and Initialize the number
        System.out.println("Fibonnaci series upto "+n+": ");
        //Print the fibonacci series
        while (t1 <= n)
        {
            System.out.print(t1 + " ");
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }
}
