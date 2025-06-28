package javaIO;

public class SortedOrNot<T extends Comparable<T>> 
{
    private T[] arr;

    public SortedOrNot(T[] arr) 
    {
        this.arr = arr;
    }

    public boolean check()
    {
        for (int i = 1; i < arr.length; i++)
        {
            if (arr[i].compareTo(arr[i - 1]) < 0) 
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) 
    {
        Integer[] num = {5,4,3,2,1};
        SortedOrNot<Integer> s1 = new SortedOrNot(num);
        System.out.println("Is sorted? " + s1.check());  

        String[] fruits = {"apple", "banana", "banana", "cherry"};
        SortedOrNot<String> s2 = new SortedOrNot(fruits);
        System.out.println("Is sorted? " + s2.check());  
    }
}
