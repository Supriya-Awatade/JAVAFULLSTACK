package javaIO;

public class checkEleExist<T>
{

 private T[] arr;

 public checkEleExist(T[] arr) 
 {
     this.arr = arr;
 }

 public boolean characterChecker(T ele1, T ele2)
 {
     boolean found1 = false;
     boolean found2 = false;

     for (int i = 0; i < arr.length; i++)
     {
         if (arr[i].equals(ele1)) 
         {
             found1 = true;
             System.out.println("Index number of ele1 is:"+i);
         }
         if (arr[i].equals(ele2))
         {
             found2 = true;
             System.out.println("Index number of ele2 is:"+i);
         }
     }

     return found1 && found2; 
 }

 public static void main(String[] args) 
 {
     String[] fruits = {"apple", "banana", "cherry"};
     checkEleExist<String> fruitChecker = new checkEleExist<>(fruits);
     System.out.println(fruitChecker.characterChecker("mango", "grapes"));   
     System.out.println(fruitChecker.characterChecker("apple", "banana"));   

     Integer[] numbers = {1, 2, 3, 4, 5};
     checkEleExist<Integer> numberChecker = new checkEleExist<>(numbers);
     System.out.println(numberChecker.characterChecker(8, 7));              
     System.out.println(numberChecker.characterChecker(4,5));               
 }
}
