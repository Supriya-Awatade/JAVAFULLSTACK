package javaIO;

public class middleEle
{
	public static <T>void search(T[]arr)
	{
		int l=arr.length;
		if(l%2==0)
		{
			int m1=l/2;
			int m2=l/2-1;
			
			System.out.println(arr[m1]);
			System.out.println(arr[m2]);
			
		}
		else
		{
			int mid=l/2;
			System.out.println(arr[mid]);
		}
	}

	public static void main(String[] args)
	{
		Integer []numbers= {11,22,33,44,55,66};
		System.out.println("middle element is:");
		 middleEle.search(numbers);

		 String[]fruits= {"apple","mango","grapes"};
		 middleEle.search(fruits);
	}

}
