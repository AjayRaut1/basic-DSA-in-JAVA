// Java program to remove elements from an ArrayLis
import java.util.*;
class Demo
{
  public static void main(String[] args)
  {   
    // Creating an ArrayList
    ArrayList< String> fruits = new ArrayList< String>();
    // Adding elements to ArrayList
    fruits.add("Mango");
    fruits.add("Apple");
    fruits.add("Berry");
    fruits.add("Orange");
    // Displaying ArrayList
    System.out.println(fruits);
    // Removing Elements
    fruits.remove("Apple");
    System.out.println("After Deleting Elements: \n"+fruits);
    // Removing Second Element
    fruits.remove(1);
    System.out.println("After Deleting Elements: \n"+fruits);
    
  }
}
  
