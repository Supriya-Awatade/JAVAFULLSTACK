package javaIO;

public class middleEle<T>
{
	private T[]arr;
	
	public middleEle(T[]arr)
	{
		this.arr=arr;
	}
	public <T>void search()
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
		middleEle<Integer> m1=new middleEle(numbers);
		System.out.println("middle element is:");
		 m1.search();

		 String[]fruits= {"apple","mango","grapes"};
		 middleEle<Integer> m2=new middleEle(fruits);
		 m2.search();
	}

}
