package javaIO;

public class algo3
{
	//generic method
	public static <T>boolean characterChecker(T[]arr,T ele)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].equals(ele))
			{
				return true;
			}
		}
		return false;
	}

	
	
	public static void main(String[] args) 
	{
		
		 String[] fruits = {"apple", "banana", "cherry"};
		 System.out.println(algo3.characterChecker(fruits,"mango"));
		 System.out.println(algo3.characterChecker(fruits,"apple"));
		 
		 
		 Integer []numbers= {1,2,3,4,5};
		 System.out.println(algo3.characterChecker(numbers,8));
		 System.out.println(algo3.characterChecker(numbers,2));
		 
		 

	}




}





